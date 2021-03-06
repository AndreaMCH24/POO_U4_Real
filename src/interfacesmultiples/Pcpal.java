/*
fill.- llenar
equal.- igual
sort.- ordenar acendente o lo contrario
binarysirt.- 
 */
package interfacesmultiples;
//Metodo has next(elemento siguiente) y has (si hay elementos)
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Juana García
 */
public class Pcpal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //metodo de arrays :   ArrayList, Iteradoto, lista
    //  INTERFAZ        CLASE                  ARREGLO   OBJETO    
    List <Edificio> listaEdificios = new ArrayList <Edificio> ();
    
        Edificio poli1 = new Polideportivo (180.6, 25.7, "Municipal", "Techado");
        Edificio poli2 = new Polideportivo (205.8, 52, "Central", "Abierto");
        Edificio poli3 = new Polideportivo (190, 32, "Recrearte", "Techado");
        Edificio edi1 = new EdificioDeOficinas (5,4.5,4.5,5);
        Edificio edi2 = new EdificioDeOficinas (5,4.5,4.5,5);
        
        
        listaEdificios.add(poli1); listaEdificios.add(poli2); listaEdificios.add(poli3);
        listaEdificios.add(edi1); listaEdificios.add(edi2);
        
        Iterator <Edificio> it = listaEdificios.iterator ();
       
        while (it.hasNext()) {
            Edificio tmp = it.next();
            System.out.printf (tmp.toString());
        }
    }
    }
    

