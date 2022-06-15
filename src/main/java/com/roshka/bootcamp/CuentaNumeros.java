package com.roshka.bootcamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CuentaNumeros {

    public static List<Long> findAll(final int sumDigits, final int numDigits) {
        int[] nros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String maximo="";
        String minimo="";
        int fin;
        int inicio;
        int suma;
        for (int i = 0; i < numDigits; i++) {
            maximo += "9";
            minimo += "1";
        }
        fin = Integer.parseInt(maximo);
        inicio = Integer.parseInt(minimo);
        long nroMin = fin;
        long nroMax = inicio;
        String nroDig;
        long nroPosibles =0;
        int [] vectorDig = new int[numDigits];
        for (int i=inicio; i<=fin; i++){
            for(int j = 0; j<numDigits; j++){
                nroDig = String.valueOf(String.valueOf(i).charAt(j));
                vectorDig[j]=Integer.parseInt(nroDig);
            }
            suma = 0;
            for(int k = 0; k<numDigits-1;k++){
                if(vectorDig[k]<=vectorDig[k+1]){
                    suma+=vectorDig[k];
                    if((k+1)==numDigits-1){
                        suma+=vectorDig[k+1];
                    }
                }else {
                    suma = 0;
                    break;
                }
            }
            if(suma==sumDigits){
                nroPosibles++;
                if(nroMin>i){
                    nroMin=i;
                }
                if(nroMax<i){
                    nroMax=i;
                }
            }
        }
        /*System.out.println("Posibles: "+nroPosibles);
        System.out.println("Mayor: "+nroMax);
        System.out.println("Menor: "+nroMin);*/
        if(nroPosibles == 0) {
            return new ArrayList<Long>();
        }


        return Arrays.asList(nroPosibles,nroMin , nroMax);
    }

    /*public static void main(String[] args) {
        findAll(84,4);
    }*/
}
