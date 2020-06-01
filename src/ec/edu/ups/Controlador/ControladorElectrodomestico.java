package ec.edu.ups.Controlador;

import ec.edu.ups.Vista.VistaElectrodomestico;
import ec.edu.ups.Modelo.Electrodomestico;
import ec.edu.ups.Dao.IElectrodomesticoDao;
import ec.edu.ups.Modelo.*;
import java.util.List;

public class ControladorElectrodomestico {

    private VistaElectrodomestico vista;
    private Electrodomestico modelo;
    private IElectrodomesticoDao dao;

    public ControladorElectrodomestico() {
    }

    public ControladorElectrodomestico(VistaElectrodomestico vista, Electrodomestico modelo, IElectrodomesticoDao dao) {
        this.vista = vista;
        this.modelo = modelo;
        this.dao = dao;
    }

    public void registrarTelevision(Television television) {

        dao.crearTelevision(television);

    }

    public void RegistrarLavadora(Lavadora lavadora) {
        dao.crearLavador(lavadora);
    }

    public List<Lavadora> verLavadoras() {
        return dao.listarlavadora();

    }

    public List<Television> verTelevision() {
        return dao.listarTelevision();
    }

}
