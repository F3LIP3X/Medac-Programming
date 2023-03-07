package Clases;

public class contadorseg {

    public static void main(String[] args) {

        Contador c= new Contador(3); //Le he puesto nombre "c", se le puede poner el nombre que quieras
        System.out.println(c.getNumero());
        c.incrementar();
        System.out.println(c.getNumero());
    }

}