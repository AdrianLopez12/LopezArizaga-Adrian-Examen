package ec.edu.ups.Modelo;

public class Television extends Electrodomestico {

    private int resolucion;
    private boolean puertoHDMI;

    public Television(int codigo) {
        super(codigo);
    }

    public Television() {
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }

    @Override
    public String toString() {
        return "Television{" + "resolucion=" + resolucion + ", puertoHDMI=" + puertoHDMI + super.toString() + '}';
    }

    public void precioFinal() {
        if (resolucion > 40) {
            double p = super.getPrecioBase() * 0.30;
            p = p + super.getPrecioBase();
            super.setPrecioBase(p);

        }

        if (puertoHDMI == true) {
            double p = super.getPrecioBase() + 50;
            super.setPrecioBase(p);

        }
        super.Compareto();
    }

}
