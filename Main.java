import utils.IO;

public class Main {
    public static void main(String[] args) {

      System.out.println("Digite 1 para algoritmos zero a dez mil e 2 algoritmos de zero a max int:");
        int opcao = IO.lerValorInteiro();
        if (opcao == 1) {
            System.out.println("Digite um valor de 1 a 7");
            int qualSort = IO.lerValorInteiro();
            switch (qualSort) {
                case 1:
                    System.out.println("Rodando BubbleSort");
                    Algoritmos.Zero_A_DezMil.BubbleSort.algoritmos();

                    break;
                case 2:
                    System.out.println("Rodando CountingSort");
                    Algoritmos.Zero_A_DezMil.CountingSort.algoritmos();

                    break;
                case 3:
                    System.out.println("Rodando Insertionsort");
                    Algoritmos.Zero_A_DezMil.InsertionSort.algoritmos();

                    break;
                case 4:
                    System.out.println("Rodando MergeSort");
                    Algoritmos.Zero_A_DezMil.MergeSort.algoritmos();

                    break;
                case 5:
                    System.out.println("Rodando QuickSort");
                    Algoritmos.Zero_A_DezMil.QuickSort.algoritmos();

                    break;
                case 6:
                    System.out.println("Rodando RadixSort");
                    Algoritmos.Zero_A_DezMil.RadixSort.algoritmos();

                    break;
                case 7:
                    System.out.println("Rodando SelectionSort");
                    Algoritmos.Zero_A_DezMil.SelectionSort.algoritmos();

                    break;

                default:
                    break;
            }
        } else if (opcao == 2) {
            System.out.println("Digite um valor de 1 a 7");
            int qualSort = IO.lerValorInteiro();
            switch (qualSort) {
                case 1:
                    System.out.println("Rodando BubbleSort");
                    Algoritmos.Zero_A_DezMil.BubbleSort.algoritmos();

                    break;
                case 2:
                    System.out.println("Rodando CountingSort");
                    Algoritmos.Zero_A_DezMil.CountingSort.algoritmos();

                    break;
                case 3:
                    System.out.println("Rodando Insertionsort");
                    Algoritmos.Zero_A_DezMil.InsertionSort.algoritmos();

                    break;
                case 4:
                    System.out.println("Rodando MergeSort");
                    Algoritmos.Zero_A_DezMil.MergeSort.algoritmos();

                    break;
                case 5:
                    System.out.println("Rodando QuickSort");
                    Algoritmos.Zero_A_DezMil.QuickSort.algoritmos();

                    break;
                case 6:
                    System.out.println("Rodando RadixSort");
                    Algoritmos.Zero_A_DezMil.RadixSort.algoritmos();

                    break;
                case 7:
                    System.out.println("Rodando SelectionSort");
                    Algoritmos.Zero_A_DezMil.SelectionSort.algoritmos();

                    break;

                default:
                    break;
            }
        } else {
            System.out.println("Digite um valor valido");
        }

    } 
}