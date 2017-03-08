/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenprueba;

/**
 *
 * @author alumno
 */
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
public class NoCambiaLongitud {
    private int valor;   

    //metodo que modifica el contenido de la posicion p de un array con el valor pasado
   

    public void Visualizar(final int longitud, int[] vector) {
        //Mostramos los elementos del array
        System.out.print("v={");
        for (int i=0;i<longitud;i++){
            System.out.print(vector[i]+",");
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int []v= new int[4];
        v[0]=2;
        v[1]=4;
        v[2]=6;
        v[3]=8; 
        NoCambiaLongitud p=new NoCambiaLongitud();
        p.setValor(10);
        p.modificar(v, 0, 1);
        p.borrar(v, 0);
        p.insertar(v, 0);
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    //metodo que modifica el contenido de la posicion p de un array con el valor pasado
    public void modificar(int[] vector, int LongitudActual, int posicion, CambiaLongitud cambiaLongitud) {
        int i;
        //Mostramos los elementos del array
        System.out.print("v={");
        final int longitud = vector.length;
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
        //Modificamos el array
        if (posicion < longitud) {
            //mostramos su contenido
            System.out.println("Elemento a modificar=" + vector[posicion]);
            vector[posicion] = cambiaLongitud.getValor();
        }
        cambiaLongitud.Visualizar(longitud, vector);
    }
}
//+++++++++++++++++++++++++++++++++++
