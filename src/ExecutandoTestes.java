public class ExecutandoTestes {

    CriarCasos_Tamanho byLength = new CriarCasos_Tamanho();
    CriarCasos_Data byDate= new CriarCasos_Data();
    CriarCasos_Mes byMonth = new CriarCasos_Mes();

    SelectionSort selectionSort = new SelectionSort();
    InsertionSort insertionSort = new InsertionSort();
    QuickSort quickSort = new QuickSort();
    MergeSort mergeSort = new MergeSort();
    CountingSort countingSort = new CountingSort();
    HeapSort heapSort = new HeapSort();
    QuickSortMedianaTres quickSortMedianaTres = new QuickSortMedianaTres();


    public void toLength() {
        String[] bestCaseByLength = byLength.melhorCaso();
        String[] mediumCaseByLength = byLength.medioCaso();
        String[] worstCaseByLength = byLength.piorCaso();

        System.out.println("\nOs arrays para melhor, pior e medio caso foram criados...");

        System.out.println("\nSelectionSort P/ Tamanho da Senha:");
        selectionSort.length(bestCaseByLength, "melhor caso");
        selectionSort.length(mediumCaseByLength, "médio caso");
        selectionSort.length(worstCaseByLength, "pior caso");

        System.out.println("\nInsertionSort P/ Tamanho da Senha:");
        insertionSort.length(bestCaseByLength, "melhor caso");
        insertionSort.length(mediumCaseByLength, "médio caso");
        insertionSort.length(worstCaseByLength, "pior caso");

        System.out.println("\nQuickSort P/ Tamanho da Senha:");
        quickSort.length(bestCaseByLength, "melhor caso");
        quickSort.length(mediumCaseByLength, "médio caso");
        quickSort.length(worstCaseByLength, "pior caso");

        System.out.println("\nMergeSort P/ Tamanho da Senha:");
        mergeSort.length(bestCaseByLength, "melhor caso");
        mergeSort.length(mediumCaseByLength, "médio caso");
        mergeSort.length(worstCaseByLength, "pior caso");

        System.out.println("\nCountingSort P/ Tamanho da Senha:");
        countingSort.length(bestCaseByLength, "melhor caso");
        countingSort.length(mediumCaseByLength, "médio caso");
        countingSort.length(worstCaseByLength, "pior caso");

        System.out.println("\nHeapSort P/ Tamanho da Senha:");
        heapSort.length(bestCaseByLength, "melhor caso");
        heapSort.length(mediumCaseByLength, "médio caso");
        heapSort.length(worstCaseByLength, "pior caso");

        System.out.println("\nQuickSort com Mediana 3 P/ Tamanho da Senha:");
        quickSortMedianaTres.length(bestCaseByLength, "melhor caso");
        quickSortMedianaTres.length(mediumCaseByLength, "médio caso");
        quickSortMedianaTres.length(worstCaseByLength, "pior caso");
    }

    public void toMonth() {
        String[] bestCaseByMonth = byMonth.melhorCaso();
        String[] mediumCaseByMonth = byMonth.medioCaso();
        String[] worstCaseByMonth = byMonth.piorCaso();

        System.out.println("\nOs arrays para melhor, pior e medio caso foram criados...");

        System.out.println("\nSelectionSort P/ Mês:");
        selectionSort.mes(bestCaseByMonth, "melhor caso");
        selectionSort.mes(mediumCaseByMonth, "médio caso");
        selectionSort.mes(worstCaseByMonth, "pior caso");

        System.out.println("\nInsertionSort P/ Mês:");
        insertionSort.mes(bestCaseByMonth, "melhor caso");
        insertionSort.mes(mediumCaseByMonth, "médio caso");
        insertionSort.mes(worstCaseByMonth, "pior caso");

        System.out.println("\nQuickSort P/ Mês:");
        quickSort.mes(bestCaseByMonth, "melhor caso");
        quickSort.mes(mediumCaseByMonth, "médio caso");
        quickSort.mes(worstCaseByMonth, "pior caso");

        System.out.println("\nMergeSort P/ Mês:");
        mergeSort.mes(bestCaseByMonth, "melhor caso");
        mergeSort.mes(mediumCaseByMonth, "médio caso");
        mergeSort.mes(worstCaseByMonth, "pior caso");

        System.out.println("\nCountingSort P/ Mês:");
        countingSort.mes(bestCaseByMonth, "melhor caso");
        countingSort.mes(mediumCaseByMonth, "médio caso");
        countingSort.mes(worstCaseByMonth, "pior caso");

        System.out.println("\nHeapSort P/ Mês:");
        heapSort.mes(bestCaseByMonth, "melhor caso");
        heapSort.mes(mediumCaseByMonth, "médio caso");
        heapSort.mes(worstCaseByMonth, "pior caso");

        System.out.println("\nQuickSort com Mediana 3 P/ Mês:");
        quickSortMedianaTres.mes(bestCaseByMonth, "melhor caso");
        quickSortMedianaTres.mes(mediumCaseByMonth, "médio caso");
        quickSortMedianaTres.mes(worstCaseByMonth, "pior caso");
    }

    public void toDate() {
        String[] bestCaseByDate = byDate.melhorCaso();
        String[] mediumCaseByDate = byDate.medioCaso();
        String[] worstCaseByDate = byDate.piorCaso();

        System.out.println("\nOs arrays para melhor, pior e medio caso foram criados...");

        System.out.println("\nSelectionSort P/ Data:");
        selectionSort.data(bestCaseByDate, "melhor caso");
        selectionSort.data(mediumCaseByDate, "médio caso");
        selectionSort.data(worstCaseByDate, "pior caso");

        System.out.println("\nInsertionSort P/ Data:");
        insertionSort.data(bestCaseByDate, "melhor caso");
        insertionSort.data(mediumCaseByDate, "médio caso");
        insertionSort.data(worstCaseByDate, "pior caso");

        System.out.println("\nQuickSort P/ Data:");
        quickSort.data(bestCaseByDate, "melhor caso");
        quickSort.data(mediumCaseByDate, "médio caso");
        quickSort.data(worstCaseByDate, "pior caso");

        System.out.println("\nMergeSort P/ Data:");
        mergeSort.data(bestCaseByDate, "melhor caso");
        mergeSort.data(mediumCaseByDate, "médio caso");
        mergeSort.data(worstCaseByDate, "pior caso");

        System.out.println("\nCountingSort P/ Data:");
        countingSort.data(bestCaseByDate, "melhor caso");
        countingSort.data(mediumCaseByDate, "médio caso");
        countingSort.data(worstCaseByDate, "pior caso");

        System.out.println("\nHeapSort P/ Data:");
        heapSort.data(bestCaseByDate, "melhor caso");
        heapSort.data(mediumCaseByDate, "médio caso");
        heapSort.data(worstCaseByDate, "pior caso");

        System.out.println("\nQuickSort com Mediana 3 P/ Data:");
        quickSortMedianaTres.data(bestCaseByDate, "melhor caso");
        quickSortMedianaTres.data(mediumCaseByDate, "médio caso");
        quickSortMedianaTres.data(worstCaseByDate, "pior caso");
    }

}
