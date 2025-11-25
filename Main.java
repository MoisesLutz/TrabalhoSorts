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
                    Zero_A_DezMil.BubbleSort.quantidades();

                    break;
                case 2:
                    System.out.println("Rodando CountingSort");
                    Zero_A_DezMil.CountingSort.quantidades();
                    System.out.println("Rodando CountingSort");
                    Zero_A_DezMil.CountingSort.quantidades();
                    System.out.println("Rodando CountingSort");
                    Zero_A_DezMil.CountingSort.quantidades();

                    break;
                case 3:
                    System.out.println("Rodando Insertionsort");
                    Zero_A_DezMil.InsertionSort.quantidades();

                    break;
                case 4:
                    System.out.println("Rodando MergeSort");
                    Zero_A_DezMil.MergeSort.quantidades();
                    System.out.println("Rodando MergeSort");
                    Zero_A_DezMil.MergeSort.quantidades();
                    System.out.println("Rodando MergeSort");
                    Zero_A_DezMil.MergeSort.quantidades();

                    break;
                case 5:
                    System.out.println("Rodando QuickSort");
                    Zero_A_DezMil.QuickSort.quantidades();
                    System.out.println("Rodando QuickSort");
                    Zero_A_DezMil.QuickSort.quantidades();
                    System.out.println("Rodando QuickSort");
                    Zero_A_DezMil.QuickSort.quantidades();

                    break;
                case 6:
                    System.out.println("Rodando RadixSort");
                    Zero_A_DezMil.RadixSort.quantidades();
                    System.out.println("Rodando RadixSort");
                    Zero_A_DezMil.RadixSort.quantidades();
                    System.out.println("Rodando RadixSort");
                    Zero_A_DezMil.RadixSort.quantidades();

                    break;
                case 7:
                    System.out.println("Rodando SelectionSort");
                    Zero_A_DezMil.SelectionSort.quantidades();
                    System.out.println("Rodando SelectionSort");
                    Zero_A_DezMil.SelectionSort.quantidades();

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
                    Zero_A_MaxInt.BubbleSort.quantidades();
                    

                    break;
                case 2:
                    System.out.println("Rodando CountingSort");
                    Zero_A_MaxInt.CountingSort.quantidades();
                    System.out.println("Rodando CountingSort");
                    Zero_A_MaxInt.CountingSort.quantidades();
                    System.out.println("Rodando CountingSort");
                    Zero_A_MaxInt.CountingSort.quantidades();

                    break;
                case 3:
                    System.out.println("Rodando Insertionsort");
                    Zero_A_MaxInt.InsertionSort.quantidades();

                    break;
                case 4:
                    System.out.println("Rodando MergeSort");
                    Zero_A_MaxInt.MergeSort.quantidades();
                    System.out.println("Rodando MergeSort");
                    Zero_A_MaxInt.MergeSort.quantidades();
                    System.out.println("Rodando MergeSort");
                    Zero_A_MaxInt.MergeSort.quantidades();

                    break;
                case 5:
                    System.out.println("Rodando QuickSort");
                    Zero_A_MaxInt.QuickSort.quantidades();
                    System.out.println("Rodando QuickSort");
                    Zero_A_MaxInt.QuickSort.quantidades();
                    System.out.println("Rodando QuickSort");
                    Zero_A_MaxInt.QuickSort.quantidades();

                    break;
                case 6:
                    System.out.println("Rodando RadixSort");
                    Zero_A_MaxInt.RadixSort.quantidades();
                    System.out.println("Rodando RadixSort");
                    Zero_A_MaxInt.RadixSort.quantidades();
                    System.out.println("Rodando RadixSort");
                    Zero_A_MaxInt.RadixSort.quantidades();

                    break;
                case 7:
                    System.out.println("Rodando SelectionSort");
                    Zero_A_MaxInt.SelectionSort.quantidades();
                    break;

                default:
                    break;
            }
        } else {
            System.out.println("Digite um valor valido");
        }

    }
}