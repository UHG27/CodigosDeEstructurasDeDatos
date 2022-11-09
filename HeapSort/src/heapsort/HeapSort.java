/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heapsort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author herna
 */
public class HeapSort {

   public void sort(int arreglo[]){
        int n = arreglo.length;
        
        for(int i =n/2-1;i>=0;i--)
            heapify(arreglo, n, i);
        
        for(int i=n-1;i>=0;i--){
            int aux = arreglo[0];
            arreglo[0] = arreglo[i];
            arreglo[i] = aux;
            
            heapify(arreglo, i, 0);
        }
    }
    
    void heapify(int arreglo[], int n, int i){
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;
        
        if(l<n && arreglo[l]>arreglo[largest])
            largest = l;
        
        if(r<n && arreglo[r]>arreglo[largest])
            largest = r;
        
        if(largest != i){
            int swap = arreglo[i];
            arreglo[i] = arreglo[largest];
            arreglo[largest] = swap;
            
            heapify(arreglo, n, largest);
    }
    }
    
    static void printArray(int[] arreglo){
        int n = arreglo.length;
        for(int i=0;i<n;i++){
            System.out.print(arreglo[i]+" ");
        }
        System.out.println();
    }
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        
        HeapSort ob = new HeapSort();

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
        
        ob.sort(arreglo);
        System.out.println("Arreglo ordenado");
        printArray(arreglo);

    }
}