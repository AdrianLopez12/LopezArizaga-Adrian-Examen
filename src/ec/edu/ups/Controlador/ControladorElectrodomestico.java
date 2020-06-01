package ec.edu.ups.Controlador;

import ec.edu.ups.Dao.ElectrodomesticoDao;
import ec.edu.ups.Vista.VistaElectrodomestico;
import ec.edu.ups.Modelo.Electrodomestico;
import ec.edu.ups.Dao.IElectrodomesticoDao;
import ec.edu.ups.Modelo.*;
import java.util.List;

public class ControladorElectrodomestico {

    private VistaElectrodomestico vista=new VistaElectrodomestico();
    private Electrodomestico modelo;
    private ElectrodomesticoDao dao=new ElectrodomesticoDao();
    Television tele=new Television();
    Lavadora lava=new Lavadora();

    public ControladorElectrodomestico() {
    }

    public ControladorElectrodomestico(VistaElectrodomestico vista, Electrodomestico modelo, ElectrodomesticoDao dao) {
        this.vista = vista;
        this.modelo = modelo;
        this.dao = dao;
    }

    public void registrarTelevision() {

       tele= vista.ingresarTelevision();
        dao.crearTelevision(tele);
        
        

    }

    public void RegistrarLavadora() {
        lava= vista.ingresarLavadora();
        dao.crearLavador(lava);
    
    }

    public List<Lavadora> verLavadoras() {
        return dao.listarlavadora();

    }

    public List<Television> verTelevision() {
        return dao.listarTelevision();
    }

}
