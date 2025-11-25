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
                    Zero_A_DezMil.BubbleSort.algoritmos();
                    System.out.println("Rodando BubbleSort");
                    Zero_A_DezMil.BubbleSort.algoritmos();
                    System.out.println("Rodando BubbleSort");
                    Zero_A_DezMil.BubbleSort.algoritmos();

                    break;
                case 2:
                    System.out.println("Rodando CountingSort");
                    Zero_A_DezMil.CountingSort.algoritmos();
                    System.out.println("Rodando CountingSort");
                    Zero_A_DezMil.CountingSort.algoritmos();
                    System.out.println("Rodando CountingSort");
                    Zero_A_DezMil.CountingSort.algoritmos();

                    break;
                case 3:
                    System.out.println("Rodando Insertionsort");
                    Zero_A_DezMil.InsertionSort.algoritmos();
                    System.out.println("Rodando Insertionsort");
                    Zero_A_DezMil.InsertionSort.algoritmos();
                    System.out.println("Rodando Insertionsort");
                    Zero_A_DezMil.InsertionSort.algoritmos();

                    break;
                case 4:
                    System.out.println("Rodando MergeSort");
                    Zero_A_DezMil.MergeSort.algoritmos();
                    System.out.println("Rodando MergeSort");
                    Zero_A_DezMil.MergeSort.algoritmos();
                    System.out.println("Rodando MergeSort");
                    Zero_A_DezMil.MergeSort.algoritmos();

                    break;
                case 5:
                    System.out.println("Rodando QuickSort");
                    Zero_A_DezMil.QuickSort.algoritmos();
                    System.out.println("Rodando QuickSort");
                    Zero_A_DezMil.QuickSort.algoritmos();
                    System.out.println("Rodando QuickSort");
                    Zero_A_DezMil.QuickSort.algoritmos();

                    break;
                case 6:
                    System.out.println("Rodando RadixSort");
                    Zero_A_DezMil.RadixSort.algoritmos();
                    System.out.println("Rodando RadixSort");
                    Zero_A_DezMil.RadixSort.algoritmos();
                    System.out.println("Rodando RadixSort");
                    Zero_A_DezMil.RadixSort.algoritmos();

                    break;
                case 7:
                    System.out.println("Rodando SelectionSort");
                    Zero_A_DezMil.SelectionSort.algoritmos();
                    System.out.println("Rodando SelectionSort");
                    Zero_A_DezMil.SelectionSort.algoritmos();

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
                    Zero_A_MaxInt.BubbleSort.algoritmos();
                    System.out.println("Rodando BubbleSort");
                    Zero_A_MaxInt.BubbleSort.algoritmos();
                    System.out.println("Rodando BubbleSort");
                    Zero_A_MaxInt.BubbleSort.algoritmos();

                    break;
                case 2:
                    System.out.println("Rodando CountingSort");
                    Zero_A_MaxInt.CountingSort.algoritmos();
                    System.out.println("Rodando CountingSort");
                    Zero_A_MaxInt.CountingSort.algoritmos();
                    System.out.println("Rodando CountingSort");
                    Zero_A_MaxInt.CountingSort.algoritmos();

                    break;
                case 3:
                    System.out.println("Rodando Insertionsort");
                    Zero_A_MaxInt.InsertionSort.algoritmos();
                    System.out.println("Rodando Insertionsort");
                    Zero_A_MaxInt.InsertionSort.algoritmos();
                    System.out.println("Rodando Insertionsort");
                    Zero_A_MaxInt.InsertionSort.algoritmos();

                    break;
                case 4:
                    System.out.println("Rodando MergeSort");
                    Zero_A_MaxInt.MergeSort.algoritmos();
                    System.out.println("Rodando MergeSort");
                    Zero_A_MaxInt.MergeSort.algoritmos();
                    System.out.println("Rodando MergeSort");
                    Zero_A_MaxInt.MergeSort.algoritmos();

                    break;
                case 5:
                    System.out.println("Rodando QuickSort");
                    Zero_A_MaxInt.QuickSort.algoritmos();
                    System.out.println("Rodando QuickSort");
                    Zero_A_MaxInt.QuickSort.algoritmos();
                    System.out.println("Rodando QuickSort");
                    Zero_A_MaxInt.QuickSort.algoritmos();

                    break;
                case 6:
                    System.out.println("Rodando RadixSort");
                    Zero_A_MaxInt.RadixSort.algoritmos();
                    System.out.println("Rodando RadixSort");
                    Zero_A_MaxInt.RadixSort.algoritmos();
                    System.out.println("Rodando RadixSort");
                    Zero_A_MaxInt.RadixSort.algoritmos();

                    break;
                case 7:
                    System.out.println("Rodando SelectionSort");
                    Zero_A_MaxInt.SelectionSort.algoritmos();
                    System.out.println("Rodando SelectionSort");
                    Zero_A_MaxInt.SelectionSort.algoritmos();
                    System.out.println("Rodando SelectionSort");
                    Zero_A_MaxInt.SelectionSort.algoritmos();

                    break;

                default:
                    break;
            }
        } else {
            System.out.println("Digite um valor valido");
        }

    }
}