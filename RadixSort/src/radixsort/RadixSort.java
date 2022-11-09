/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package radixsort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author herna
 */
public class RadixSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        
        RadixSort ord = new RadixSort();

        int arreglo[], nElementos;

        System.out.println("Escribe en numero de elementos");
        entrada = bufer.readLine();
        nElementos = Integer.parseInt(entrada);

        arreglo = new int[nElementos];

        for (int i = 0; i < nElementos; i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            entrada = bufer.readLine();
            arreglo[i] = Integer.parseInt(entrada);
        }
        
        System.out.println("Arreglo original");
        ord.mostrarArreglo(arreglo);
        ord.radix(arreglo);
    }
    
    //Metodo Radix
    public void radix(int[] arreglo){
        int x,i,j;
        for(x=Integer.SIZE-1;x>=0;x--){
            int aux[] = new int[arreglo.length];
            j=0;
            for(i=0;i<arreglo.length;i++){
                boolean mov=arreglo[i]<< x >=0;
                if(x==0 ? !mov:mov){
                    aux[j] = arreglo[i];
                    j++;
                }else{
                    arreglo[i-j] = arreglo[i];
            }
        }
            
            for(i=j;i<aux.length;i++){
                aux[i] = arreglo[i-j];
            }
            arreglo = aux;
    }
        System.out.println("El arreglo ordenado con radix es");
        mostrarArreglo(arreglo);
        
    
}
    
    public void mostrarArreglo(int[] arreglo){
        for(int i=0;i<arreglo.length;i++){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println();
}
}

    

