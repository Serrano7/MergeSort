package com.company;
import java.util.Scanner;
public class Main {

public static void main(String[] args) {
Scanner lector = new Scanner(System.in);

        //Ingresamos tamaño de arreglo con elementos al azar

        System.out.println("Ingresar tamaño de arreglo: ");
        int n = lector.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = (int) (Math.random() * 50 + 1);
        }
        //Mostramos en pantalla el arreglo antes del ordenamiento

        System.out.println("Antes del sorting");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + "\t");

        //Llamamos el método MergeSort

        //Generamos un contador de tiempo (iniciando) para ver la eficiencia del código bubble sort.
        long startTime = System.nanoTime();

        new MergeSort().PrepareForSort(arr);

        //Generamos un contador de tiempo (finalizando) para ver la eficiencia del código bubble sort.
        long endTime = System.nanoTime();

        //Mostramos en pantalla el arreglo después del ordenamiento

        System.out.println("\nDespues del sorting");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + "\t");

        long deltaTime = endTime - startTime;

        System.out.println("Tiempo de ejecución en nanosegundos: "+deltaTime);


    }
    }


