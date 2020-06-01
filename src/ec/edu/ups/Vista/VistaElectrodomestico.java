package ec.edu.ups.Vista;

import java.util.Scanner;
import ec.edu.ups.Modelo.*;
import java.util.List;

public class VistaElectrodomestico {

    Scanner leer = new Scanner(System.in);
    boolean HDMI;

    public Television ingresarTelevision() {
        System.out.println("-----Television-----");
        System.out.println("Ingrese codigo");
        int codigo = leer.nextInt();
        System.out.println("ingrese descripccion");
        String descripccion = leer.next();
        System.out.println("Ingrese precio base");
        double precioBase = leer.nextDouble();
        System.out.println("Ingrese color");
        String color = leer.next();
        System.out.println("Ingrese consumo energetico");
        String consumoEnergetico = leer.next();
        System.out.println("Ingrese peso");
        int peso = leer.nextInt();
        System.out.println("Existe puerto HDMI");
        System.out.println("1) si");
        System.out.println("2) no");
        System.out.print("====> ");
        byte op = leer.nextByte();
        if (op == 1) {
            HDMI = true;
        } else {
            HDMI = false;
        }
        System.out.println("Ingrese resolucion de la pantalla");
        int resolucion = leer.nextInt();

        Television tele = new Television();
        tele.setCodigo(codigo);
        tele.setColor(color);
        tele.setConsumoEnergetico(consumoEnergetico);
        tele.setDescripccion(descripccion);
        tele.setPeso(peso);
        tele.setPrecioBase(precioBase);
        tele.setPuertoHDMI(HDMI);
        tele.setResolucion(resolucion);
        return tele;

    }

    public Lavadora ingresarLavadora() {
        System.out.println("-----Lavadora-----");
        System.out.println("Ingrese codigo");
        int codigo = leer.nextInt();
        System.out.println("ingrese descripccion");
        String descripccion = leer.next();
        System.out.println("Ingrese precio base");
        double precioBase = leer.nextDouble();
        System.out.println("Ingrese color");
        String color = leer.next();
        System.out.println("Ingrese consumo energetico");
        String consumoEnergetico = leer.next();
        System.out.println("Ingrese peso");
        int peso = leer.nextInt();
        System.out.println("Ingrese carga");
        int carga = leer.nextInt();

        Lavadora lavadora = new Lavadora();
        lavadora.setCarga(carga);
        lavadora.setCodigo(codigo);
        lavadora.setColor(color);
        lavadora.setConsumoEnergetico(consumoEnergetico);
        lavadora.setDescripccion(descripccion);
        lavadora.setPeso(peso);
        lavadora.setPrecioBase(precioBase);

        return lavadora;

    }

    public void mostrarLavadoras(List<Lavadora> lavadoras) {
        System.out.println(lavadoras);
    }

    public void mostrarTelevisiones(List<Television> television) {

        System.out.println(television);
    }
}
