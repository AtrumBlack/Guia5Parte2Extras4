/*

¡Claro! Aquí tienes una lista de 10 ciudades junto con sus códigos postales:

Ciudad de México, México: 01000-16999
Buenos Aires, Argentina: 1000-1999
Madrid, España: 28001-28055
Nueva York, Estados Unidos: 10001-10292
Londres, Reino Unido: EC1A-EC4Y
Tokio, Japón: 100-163
París, Francia: 75001-75020
Berlín, Alemania: 10115-14199
Río de Janeiro, Brasil: 20000-23799
Sídney, Australia: 2000-2011

*/
package guia5parte2extras4;

/**
 *
 * @author wbasa
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        
      Ciudades ciudades =new Ciudades();
      
      ciudades.agregar10Ciudades();
      ciudades.mostraCiudades();
      ciudades.buscarCodigoPostal(10115);
        ciudades.agregarYEliminar3Ciudad();
        
    }
    
}
