package Algoritimo;

import java.util.Arrays;

/**
 * @author fsdney
 */


public class Troco {

    
    void darTroco(int quantia, int[] moedas) {
        
        Arrays.sort(moedas);
        reverseArray(moedas); 

        
        int contadorMoedas = 0;

        
        for (int i = 0; i < moedas.length; i++) {
            
            while (quantia >= moedas[i]) {
                quantia -= moedas[i]; 
                contadorMoedas++; 
            }
        }

        
        if (quantia > 0) {
            System.out.println("Não é possível dar troco para a quantia " + quantia);
        } else {
           
            System.out.println("Número total de moedas: " + contadorMoedas);
        }
    }

    
    void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

   
    public static void main(String[] args) {
        Troco obj = new Troco();
        int quantia = 18; 
        int[] moedas = {5, 2, 1}; 
        obj.darTroco(quantia, moedas);
    }
}

