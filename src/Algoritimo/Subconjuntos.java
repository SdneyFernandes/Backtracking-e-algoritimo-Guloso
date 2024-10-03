package Algoritimo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fsdney
 */


public class Subconjuntos {

    
    void encontrarSubconjuntos(int[] S, List<Integer> subconjuntoAtual, int indiceAtual, int n, List<List<Integer>> soluções) {
        
        if (subconjuntoAtual.size() == n) {
            soluções.add(new ArrayList<>(subconjuntoAtual)); 
            return; 
        }

       
        for (int i = indiceAtual; i < S.length; i++) {
           
            subconjuntoAtual.add(S[i]);

            
            encontrarSubconjuntos(S, subconjuntoAtual, i + 1, n, soluções);

            
            subconjuntoAtual.remove(subconjuntoAtual.size() - 1);
        }
    }

   
    void calcularSubconjuntos(int[] S, int n) {
        List<Integer> subconjuntoAtual = new ArrayList<>();
        List<List<Integer>> soluções = new ArrayList<>();
        
        encontrarSubconjuntos(S, subconjuntoAtual, 0, n, soluções);
        
        
        for (List<Integer> subconjunto : soluções) {
            System.out.println(subconjunto);
        }
    }

   
    public static void main(String[] args) {
        Subconjuntos obj = new Subconjuntos();
        int[] S = {1, 2, 3}; 
        int n = 2;          
        obj.calcularSubconjuntos(S, n);
    }
}

