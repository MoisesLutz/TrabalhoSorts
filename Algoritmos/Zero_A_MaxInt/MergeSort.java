package Algoritmos.Zero_A_MaxInt;

import utils.IO;

public class MergeSort {

   public static void algoritmos(){
    cem();
    mil();
    dezMil();
    cemMil();
    umMilhao();
    dezMilhoes();
    

}

    public static void cem() {
        int[] vetor = IO.gerarValoresAleatorios(100, 0, Integer.MAX_VALUE-1);
        long tempo_inicio = IO.medirTempoIniciar();
        IO.mergeSort(vetor);
        double tempoTotal = IO.medirTempoFinalizarSegundos(tempo_inicio);
        IO.imprimirTempo(100, tempoTotal);
    }

       public static void mil() {
        int[] vetor = IO.gerarValoresAleatorios(1000, 0, Integer.MAX_VALUE-1);
        long tempo_inicio = IO.medirTempoIniciar();
        IO.mergeSort(vetor);
        double tempoTotal = IO.medirTempoFinalizarSegundos(tempo_inicio);
        IO.imprimirTempo(1000, tempoTotal);
    }

       public static void dezMil() {
        int[] vetor = IO.gerarValoresAleatorios(Integer.MAX_VALUE-1, 0, Integer.MAX_VALUE-1);
        long tempo_inicio = IO.medirTempoIniciar();
        IO.mergeSort(vetor);
        double tempoTotal = IO.medirTempoFinalizarSegundos(tempo_inicio);
        IO.imprimirTempo(Integer.MAX_VALUE-1, tempoTotal);
    }

       public static void cemMil() {
        int[] vetor = IO.gerarValoresAleatorios(Integer.MAX_VALUE-10, 0, Integer.MAX_VALUE-1);
        long tempo_inicio = IO.medirTempoIniciar();
        IO.mergeSort(vetor);
        double tempoTotal = IO.medirTempoFinalizarSegundos(tempo_inicio);
        IO.imprimirTempo(Integer.MAX_VALUE-10, tempoTotal);
    }

       public static void umMilhao() {
        int[] vetor = IO.gerarValoresAleatorios(Integer.MAX_VALUE-100, 0, Integer.MAX_VALUE-1);
        long tempo_inicio = IO.medirTempoIniciar();
        IO.mergeSort(vetor);
        double tempoTotal = IO.medirTempoFinalizarSegundos(tempo_inicio);
        IO.imprimirTempo(Integer.MAX_VALUE-100, tempoTotal);
    }

       public static void dezMilhoes() {
        int[] vetor = IO.gerarValoresAleatorios(Integer.MAX_VALUE-1000, 0, Integer.MAX_VALUE-1);
        long tempo_inicio = IO.medirTempoIniciar();
        IO.mergeSort(vetor);
        double tempoTotal = IO.medirTempoFinalizarSegundos(tempo_inicio);
        IO.imprimirTempo(Integer.MAX_VALUE-1000, tempoTotal);
    }
}
