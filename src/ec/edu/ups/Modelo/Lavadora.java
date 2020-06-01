package ec.edu.ups.Modelo;

public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora(int codigo) {
        super(codigo);
    }

    public Lavadora() {
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {

        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + super.toString() + '}';

    }

    public void precioFinal() {
        if (carga > 30) {
            super.setPrecioBase(super.getPrecioBase() + 50);
        }
        super.Compareto();
    }

}
