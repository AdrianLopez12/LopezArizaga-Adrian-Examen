package ec.edu.ups.Dao;

import ec.edu.ups.Modelo.*;
import java.util.List;

public interface IElectrodomesticoDao {

    public void crearTelevision(Television television);

    public void crearLavador(Lavadora lavadora);

    public List<Lavadora> listarlavadora();

    public List<Television> listarTelevision();
}
