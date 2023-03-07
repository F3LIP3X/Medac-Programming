package Empresa;


public class Figura {
    private String codigo;
    private double precio;
    private superheroe superheroe;
    private dimension dimensiones;

    public Figura(String codigo, double precio, superheroe superheroe, dimension dimensiones) {
        this.codigo = codigo;
        this.precio = precio;
        this.superheroe = superheroe;
        this.dimensiones = dimensiones;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public superheroe getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(superheroe superheroe) {
        this.superheroe = superheroe;
    }

    public dimension getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(dimension dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String toString() {
        return "Figura:\n" + "codigo=" + codigo + ", precio=" + precio + "\n" + superheroe + "\n" + dimensiones;
    }
    
    public void subirPrecio(double cantidad) {
        precio += cantidad;
    }
    
}
