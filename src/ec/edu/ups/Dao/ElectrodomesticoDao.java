package ec.edu.ups.Dao;

import ec.edu.ups.Modelo.Lavadora;
import ec.edu.ups.Modelo.Television;
import java.util.ArrayList;
import java.util.List;

public class ElectrodomesticoDao implements IElectrodomesticoDao {

    List<Lavadora> lavadora = new ArrayList<>();
    List<Television> television = new ArrayList<>();

    public ElectrodomesticoDao() {
    }

    
    @Override
    public void crearTelevision(Television television) {

        this.television.add(television);
        
    }

    @Override
    public void crearLavador(Lavadora lavadora) {
        this.lavadora.add(lavadora);
    }

    @Override
    public List<Lavadora> listarlavadora() {
       
        return this.lavadora;
        
    }

    @Override
    public List<Television> listarTelevision() {
        
        return this.television;
    }

}
