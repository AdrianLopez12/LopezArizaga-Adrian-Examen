package ec.edu.ups.Principal;

import ec.edu.ups.Vista.VistaElectrodomestico;
import ec.edu.ups.Controlador.ControladorElectrodomestico;
import ec.edu.ups.Modelo.*;
import ec.edu.ups.Dao.ElectrodomesticoDao;

public class Principal {

    static VistaElectrodomestico vista = new VistaElectrodomestico();
    static ControladorElectrodomestico controlador = new ControladorElectrodomestico();
    static ElectrodomesticoDao dao = new ElectrodomesticoDao();
    static Television tele;
    static Lavadora lava;
    static Electrodomestico elec;

    public static void main(String[] args) {
        int cont = 0;
        do {
            cont++;
           controlador.registrarTelevision();
        } while (cont < 3);
        cont = 0;
        do {
            cont++;
           controlador.RegistrarLavadora();
        } while (cont < 3);
        vista.mostrarLavadoras(dao.listarlavadora());
        vista.mostrarTelevisiones(dao.listarTelevision());

    }

}
