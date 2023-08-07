/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia5parte2extras4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author wbasa
 */
public class Ciudades {

    Integer codPostal;
    String ciudad;
    Map<Integer, String> ciudadCodPostal;
    Scanner leer = new Scanner(System.in);

    public Ciudades() {
        this.ciudadCodPostal = new HashMap<>();

    }

    public void agregarCiudad() {

        System.out.println("Ingresar el Codigo Postal");
        Integer cPostal = leer.nextInt();
        leer.nextLine(); // Consumir el carácter de nueva línea
        System.out.println("Ingresar la ciudad");
        String newCiudad = leer.nextLine();

        ciudadCodPostal.put(cPostal, newCiudad);

    }

    public void agregar10Ciudades() {
        System.out.println("Ingresar 10 ciudades");
//        int contador = 0;
//        //char sigue = 's';
//        //int contador=0;
//        while (contador < 10) {
//            contador++;
//            System.out.println("Ciuda N:" + contador);
//            agregarCiudad();
//            //System.out.println("Desea seguir (s/n)");
//            //sigue = leer.next().toLowerCase().charAt(0);
//        }
//        
        ciudadCodPostal.put(1000, "Mexico");
        ciudadCodPostal.put(1001, "Buenos Aires");
        ciudadCodPostal.put(28001, "Madrid");
        ciudadCodPostal.put(10001, "New York");
        ciudadCodPostal.put(45, "Londres");
        ciudadCodPostal.put(100, "Paris");
        ciudadCodPostal.put(10115, "Berlin");
        ciudadCodPostal.put(20000, "Rio de Jainero");
        ciudadCodPostal.put(2000, "Sidney");

    }

    public void buscarCodigoPostal(Integer codPostal) {

        if (ciudadCodPostal.containsKey(codPostal)) {
            System.out.println("Codigo Postal encontrado");
            System.out.println("------------------------");
            System.out.println("Codigo Postal" + ciudadCodPostal.get(codPostal));
            //System.out.println("");

        }

    }

    public void agregarYEliminar3Ciudad() {

//        if (ciudadCodPostal.containsValue(ciudad)) {
        //ciudadCodPostal.remove(ciudad);
//        }
        System.out.println("Agregue una ciudad");
        agregarCiudad();
        mostraCiudades();
        System.out.println("----------------------------------------");
        System.out.println("Elimine 3 ciudades");
        int contador = 0;
        while (contador < 3) {

            System.out.println("Elimine " + (contador + 1) + " ciudades");
            //leer.nextLine(); 
            String ciudad = leer.nextLine();
            Integer key = 0;
            for (Map.Entry<Integer, String> entry : ciudadCodPostal.entrySet()) {
                //key = entry.getKey();
                //String val = entry.getValue();

                if (entry.getValue().equals(ciudad)) {
                    System.out.println("Ciudad encontrada para Borrar");
                    key = entry.getKey();
                    break;
                }

            }
            eliminarCiudad(key);
            mostraCiudades();
            contador++;
        }

    }

    public void eliminarCiudad(Integer CodPostal) {
        if (ciudadCodPostal.containsKey(CodPostal)) {
            ciudadCodPostal.remove(CodPostal);
        }

    }

    public void mostraCiudades() {
        TreeMap<Integer, String> ordenCodPostal = new TreeMap(ciudadCodPostal);
        for (Map.Entry<Integer, String> entry : ciudadCodPostal.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println("Codigo Postal " + key);
            System.out.println("La ciudad " + val);
        }
        System.out.println("------------------------------------------");
        for (Map.Entry<Integer, String> entry : ordenCodPostal.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println("Codigo Postal " + key);
            System.out.println("La ciudad " + val);
        }
    }
}
