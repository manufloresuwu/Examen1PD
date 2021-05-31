package Examen.Uno;

import singleton.basic.Singleton3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CabinaSingleton {

    private static CabinaSingleton instance = null;
    private Map<String, Vehiculo> matricula = new HashMap<String, Vehiculo>();
    private Map<String, Integer> costo = new HashMap<String, Integer>();
    private List<String> vehiculos = new LinkedList<>();
    private CabinaSingleton(){}

    public static synchronized void makeInstance(){
        if (instance == null)
            instance= new CabinaSingleton();
    }

    public static CabinaSingleton getInstance() {
        if (instance == null)
            makeInstance();
        return instance;
    }

    public synchronized void pagar(Vehiculo v, int costo){
        if (!vehiculos.contains(v.placa)){
            this.costo.put(v.placa, costo);
            vehiculos.add(v.placa);
        } else {
            this.costo.put(v.placa, costo + this.costo.get(v.placa));
        }
        matricula.put(v.placa, v);
    }

    public synchronized void show(){
        for(String s: vehiculos){
            matricula.get(s).show();
            System.out.println("Costo: " + costo.get(s));
        }
    }
}
