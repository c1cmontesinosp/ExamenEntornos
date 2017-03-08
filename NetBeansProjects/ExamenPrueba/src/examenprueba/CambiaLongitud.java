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
public class CambiaLongitud {
    private int valor;   


    public void Visualizar(final int longitud, int[] vector) {
        //Mostramos los elementos del array
        System.out.print("v={");
        for (int i=0;i<longitud;i++){
            System.out.print(vector[i]+",");
        }
        System.out.println("}");
    }

//metodo que borra el elemento de la posicion p desplazando a la izquierda todos los elementos
    public void borrar (int[] v, int LongitudActual){
       int p=1,i;	  
        Visualizar(v.length, v);
         //Borramos el elemento
       	 if(p<v.length){ 
             System.out.println("Elemento a borrar=" + v[p]);                                       
            for (i = p; i < v.length - 1; i++) {
                v[i] = v[i + 1];
            }
          }
        //Mostramos los elementos del array
               Visualizar(v.length, v);         
      }
     

//metodo que inserta un  elemento en la posicion p desplazando a la derecha todos los elementos
public void insertar (int[] v, int LongitudActual){
       int p=1, i;	  
      //mostramos su contenido 
        //Mostramos los elementos del array  
        Visualizar(v.length, v);
         //Borramos el elemento
       	 if(p<v.length){ 
             System.out.println("Elemento a insertar=" + this.getValor());
            for (i = v.length - 1; i > p; i--) {
                v[i] = v[i - 1];
            }
            v[p] = this.getValor();
          }
   //Mostramos los elementos del array  
        Visualizar(v.length, v);         
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
        p.modificar(v, 0, 0, this);
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
}
//+++++++++++++++++++++++++++++++++++
