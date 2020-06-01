package ec.edu.ups.Modelo;

public class Electrodomestico {

    private int codigo;
    private String descripccion;
    private double precioBase;
    private String color;
    private String consumoEnergetico;
    private int peso;

    public Electrodomestico(int codigo) {
        this.codigo = codigo;
    }

    public Electrodomestico() {
    }

//    public double obtenerPrecioFinal(){
//        
//    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripccion() {
        return descripccion;
    }

    public void setDescripccion(String descripccion) {
        this.descripccion = descripccion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return ", codigo=" + codigo + ", descripccion=" + descripccion + ", precioFinal=" + precioBase + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso;
    }

    public void Compareto() {
        if (consumoEnergetico.equalsIgnoreCase("A")) {
            precioBase = precioBase + 100;
        }
        if (consumoEnergetico.equalsIgnoreCase("B")) {
            precioBase = precioBase + 80;
        }
        if (consumoEnergetico.equalsIgnoreCase("C")) {
            precioBase = precioBase + 60;
        }
        if (consumoEnergetico.equalsIgnoreCase("D")) {
            precioBase = precioBase + 50;
        }
        if (consumoEnergetico.equalsIgnoreCase("E")) {
            precioBase = precioBase + 30;
        }
        if (consumoEnergetico.equalsIgnoreCase("F")) {
            precioBase = precioBase + 10;
        }

        if (peso > 0 && peso < 19) {

            precioBase = precioBase + 10;
        }
        if (peso > 00 && peso < 49) {

            precioBase = precioBase + 50;
        }
        if (peso > 50 && peso < 79) {
            precioBase = precioBase + 80;

        }
        if (peso > 80) {
            precioBase = precioBase + 100;

        }
    }

}
