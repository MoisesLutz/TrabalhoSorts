package utils;

import java.util.Random;
import java.util.Scanner;

public class IO {

    private static Scanner tecladoScanner = new Scanner(System.in);

    /**
     * Função de teste de acesso à biblioteca.
     */
    public static void hello() {
        System.out.println("Hello");
    }
    
    /**
     * Gera um novo método Scanner.
     * NÃO REMOVA este método. É necessário durante os testes automatizados, para redirecionamento da entrada padrão.
     */
    public static void reiniciarScanner() {
        tecladoScanner = new Scanner(System.in);
    }

    /**
     * Mostra uma mensagem na tela.
     *
     * @param texto Mensagem a ser mostrada na tela
     */
    public static void imprimirln(String texto) {
        System.out.println(texto);
    }

    public static void imprimir(String texto) {
        System.out.print(texto);
    }

    public static void imprimirErro(String texto) {
        System.err.print(texto);
    }

    /**
     * Leitura de um valor inteiro a partir da entrada padrão
     *
     * @return Valor inteiro obtido da entrada padrão
     */
    public static int lerValorInteiro() {
        int valor = tecladoScanner.nextInt();

        return valor;
    }

    /**
     * Mostra na tela um valor inteiro
     *
     * @param valor Valor a ser mostrado na tela
     */
    public static void imprimirValorInteiro(int valor) {
        imprimir("" + valor);
    }

    public static double lerValorDouble() {
        return tecladoScanner.nextDouble();
    }

    public static void imprimirValorDouble(double valor) {
        imprimir(String.valueOf(valor));
    }

    /**
     * Leitura de uma String a partir da entrada padrão. Obtém a primeira
     * palavra digitada.
     *
     * @return String obtida da entrada padrão
     */
    public static String lerPalavra() {
        String valor = tecladoScanner.next();
        return valor;
    }

    /**
     * Leitura de uma String a partir da entrada padrão. Obtém toda a linha
     * digitada.
     *
     * @return String obtida da entrada padrão
     */
    public static String lerFrase() {
        String valor = tecladoScanner.nextLine();
        return valor;
    }



    public static int buscaBinaria(int[] vetor, int valorBusca) {
        int inicio, fim, meio;

        inicio = 0;
        fim = vetor.length - 1;
        int contador = 0;

        while (inicio <= fim) {
            meio = (int) (inicio + fim) / 2;

            if (valorBusca == vetor[meio]) {
                System.out.println("O programa encontrou de primeira!");
                return meio;
            } else {
                if (valorBusca > vetor[meio]) {
                    inicio = vetor[meio] + 1;
                } else {
                    fim = meio - 1;
                }
            }

            contador++;
        }

        System.out.println("O programa rodou " + contador + " vezes.");

        System.out.println("Nenhum valor encontrado");
        return -1;
    }

    public static int buscaBinariaRecursiva(int[] vetor, int valor, int inicio, int fim) {
        if (inicio > fim) {
            System.out.println("Nenhum valor encontrado");
            return -1;
        }

        int meio = (inicio + fim) / 2;

        if (vetor[meio] == valor) {
            return meio;
        }

        if (valor < vetor[meio]) {
            return buscaBinariaRecursiva(vetor, valor, inicio, meio - 1);
        }

        return buscaBinariaRecursiva(vetor, valor, meio + 1, fim);
    }


        public static int[] gerarValoresAleatorios(int n, int valor_min, int valor_max) {
        Random random = new Random();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = random.nextInt(valor_max - valor_min + 1) + valor_min;
        }

        return vetor;
    }


        public static long medirTempoIniciar() {
        long tempo_inicio = System.currentTimeMillis();

        return tempo_inicio;
    }

    public static double medirTempoFinalizarSegundos(long tempo_inicio) {
        long tempo_fim = System.currentTimeMillis();

        double duracao_segundos = (tempo_fim - tempo_inicio) / 1000.0;

        return duracao_segundos;
    }


     public static void imprimirTempo(int qtdElementos, double tempo) {
        System.out.println("Elementos " + qtdElementos + ": " + tempo + " segundos");
    }
    
}