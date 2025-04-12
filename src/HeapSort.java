public class HeapSort {
    CriarArquivoCsv create = new CriarArquivoCsv();

    public void length(String[] data, String nameCase) {
        GetInput v = new GetInput();
        String[] copiaDados = data.clone();

        long tempoInicial = System.nanoTime();

        heapSortLength(copiaDados, v);

        long tempoFinal = System.nanoTime();
        long duracao = (tempoFinal - tempoInicial) / 1000000;

        System.out.println("Tempo de execução Heap Sort p/ o " + nameCase + ": " + duracao + " milissegundos");
        String filename = "";

        if (nameCase.equals("melhor caso")) {
            filename = "dataset/passwords_length_heapSort_melhorCaso.csv";
        } else if (nameCase.equals("médio caso")) {
            filename = "dataset/passwords_length_heapSort_medioCaso.csv";
        } else {
            filename = "dataset/passwords_length_heapSort_piorCaso.csv";
        }

        create.createCsv(copiaDados, filename);
    }

    private void heapSortLength(String[] array, GetInput v) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapifyLength(array, n, i, v);

        for (int i = n - 1; i > 0; i--) {
            String temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapifyLength(array, i, 0, v);
        }
    }

    private void heapifyLength(String[] array, int n, int i, GetInput v) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && v.getTamanhoSenha(array[left]) < v.getTamanhoSenha(array[largest]))
            largest = left;

        if (right < n && v.getTamanhoSenha(array[right]) < v.getTamanhoSenha(array[largest]))
            largest = right;

        if (largest != i) {
            String swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            heapifyLength(array, n, largest, v);
        }
    }

    // ------------------------------------------------------

    public void mes(String[] data, String nameCase) {
        GetInput v = new GetInput();
        String[] copiaDados = data.clone();

        long tempoInicial = System.nanoTime();

        heapSortMonth(copiaDados, v);

        long tempoFinal = System.nanoTime();
        long duracao = (tempoFinal - tempoInicial) / 1000000;

        System.out.println("Tempo de execução Heap Sort p/ o " + nameCase + ": " + duracao + " milissegundos");
        String filename = "";

        if (nameCase.equals("melhor caso")) {
            filename = "dataset/passwords_data_month_heapSort_melhorCaso.csv";
        } else if (nameCase.equals("médio caso")) {
            filename = "dataset/passwords_data_month_heapSort_medioCaso.csv";
        } else {
            filename = "dataset/passwords_data_month_heapSort_piorCaso.csv";
        }

        create.createCsv(copiaDados, filename);
    }

    private void heapSortMonth(String[] array, GetInput v) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapifyMonth(array, n, i, v);

        for (int i = n - 1; i > 0; i--) {
            String temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapifyMonth(array, i, 0, v);
        }
    }

    private void heapifyMonth(String[] array, int n, int i, GetInput v) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && v.getMesData(array[left]) > v.getMesData(array[largest]))
            largest = left;

        if (right < n && v.getMesData(array[right]) > v.getMesData(array[largest]))
            largest = right;

        if (largest != i) {
            String swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            heapifyMonth(array, n, largest, v);
        }
    }

    //--------------------------------------------------------------------------

    public void data(String[] data, String nameCase) {
        GetInput v = new GetInput();
        String[] copiaDados = data.clone();

        long tempoInicial = System.nanoTime();

        heapSortDate(copiaDados, v);

        long tempoFinal = System.nanoTime();
        long duracao = (tempoFinal - tempoInicial) / 1000000;

        System.out.println("Tempo de execução Heap Sort p/ o " + nameCase + ": " + duracao + " milissegundos");
        String filename = "";

        if (nameCase.equals("melhor caso")) {
            filename = "dataset/passwords_data_heapSort_melhorCaso.csv";
        } else if (nameCase.equals("médio caso")) {
            filename = "dataset/passwords_data_heapSort_medioCaso.csv";
        } else {
            filename = "dataset/passwords_data_heapSort_piorCaso.csv";
        }

        create.createCsv(copiaDados, filename);
    }

    private void heapSortDate(String[] array, GetInput v) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapifyDate(array, n, i, v);

        for (int i = n - 1; i > 0; i--) {
            String temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapifyDate(array, i, 0, v);
        }
    }

    private void heapifyDate(String[] array, int n, int i, GetInput v) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && v.getDataCompleta(array[left]) > v.getDataCompleta(array[largest]))
            largest = left;

        if (right < n && v.getDataCompleta(array[right]) > v.getDataCompleta(array[largest]))
            largest = right;

        if (largest != i) {
            String swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            heapifyDate(array, n, largest, v);
        }
    }



}
