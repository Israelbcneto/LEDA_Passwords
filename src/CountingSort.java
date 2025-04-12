public class CountingSort {
    CriarArquivoCsv create = new CriarArquivoCsv();

    public void length(String[] data, String nameCase) {
        GetInput v = new GetInput();
        String[] copiaDados = data.clone();

        long tempoInicial = System.nanoTime();

        countingSortLength(copiaDados, v);

        long tempoFinal = System.nanoTime();
        long duracao= (tempoFinal - tempoInicial) / 1000000;

        System.out.println("Tempo de execução Counting Sort p/ o " + nameCase + ": " + duracao + " milissegundos");
        String filename = "";

        if (nameCase.equals("melhor caso")) {
            filename = "dataset/passwords_length_countingSort_melhorCaso.csv";
        } else if (nameCase.equals("médio caso")) {
            filename = "dataset/passwords_length_countingSort_medioCaso.csv";
        } else {
            filename = "dataset/passwords_length_countingSort_piorCaso.csv";
        }

        create.createCsv(copiaDados, filename);
    }

    private void countingSortLength(String[] array, GetInput v) {
        int tam = array.length;
        String[] result = new String[tam];

        int[] contagem = new int[tam];

        for (int i = 0; i < tam; ++i)
            contagem[i] = 0;

        for (int i = 0; i < tam; ++i)
            contagem[v.getTamanhoSenha(array[i])]++;

        for (int i = 1; i < tam; ++i)
            contagem[i] += contagem[i - 1];

        for (int i = tam - 1; i >= 0; i--) {
            result[tam - contagem[v.getTamanhoSenha(array[i])]] = array[i];
            contagem[v.getTamanhoSenha(array[i])]--;
        }

        for (int i = 0; i < tam; ++i)
            array[i] = result[i];
    }


    // -----------------------------------------------------------

    public void mes(String[] data, String nameCase) {
        GetInput v = new GetInput();
        String[] copiaDados = data.clone();

        long tempoInicial = System.nanoTime();

        countingSortMes(copiaDados, v);

        long tempoFinal = System.nanoTime();
        long duracao = (tempoFinal - tempoInicial) / 1000000;

        System.out.println("Tempo de execução Counting Sort p/ o " + nameCase + ": " + duracao + " milissegundos");
        String filename = "";

        if (nameCase.equals("melhor caso")) {
            filename = "dataset/passwords_data_month_countingSort_melhorCaso.csv";
        } else if (nameCase.equals("médio caso")) {
            filename = "dataset/passwords_data_month_countingSort_medioCaso.csv";
        } else {
            filename = "dataset/passwords_data_month_countingSort_piorCaso.csv";
        }

        create.createCsv(copiaDados, filename);
    }

    private void countingSortMes(String[] array, GetInput v) {
        int tam = array.length;
        String[] result = new String[tam];

        int[] contagem = new int[tam];

        for (int i = 0; i < tam; ++i)
            contagem[i] = 0;

        for (int i = 0; i < tam; ++i)
            contagem[v.getMesData(array[i])]++;

        for (int i = 1; i < tam; ++i)
            contagem[i] += contagem[i - 1];

        for (int i = tam - 1; i >= 0; i--) {
            result[contagem[v.getMesData(array[i])] - 1] = array[i];
            contagem[v.getMesData(array[i])]--;
        }

        for (int i = 0; i < tam; ++i)
            array[i] = result[i];
    }

    //-----------------------------------------------------------------------

    public void data(String[] data, String nameCase) {
        GetInput v = new GetInput();
        String[] copiaDados = data.clone();

        long tempoInicial = System.nanoTime();

        countingSortData(copiaDados, v);

        long tempoFinal = System.nanoTime();
        long duracao = (tempoFinal - tempoInicial) / 1000000;

        System.out.println("Tempo de execução Counting Sort p/ o " + nameCase + ": " + duracao + " milissegundos");
        String filename = "";

        if (nameCase.equals("melhor caso")) {
            filename = "dataset/passwords_data_countingSort_melhorCaso.csv";
        } else if (nameCase.equals("médio caso")) {
            filename = "dataset/passwords_data_countingSort_medioCaso.csv";
        } else {
            filename = "dataset/passwords_data_countingSort_piorCaso.csv";
        }

        create.createCsv(copiaDados, filename);
    }

    private void countingSortData(String[] array, GetInput v) {
        int tam = array.length;
        String[] result = new String[tam];

        int[] contagem = new int[10000000]; 

        for (int i = 0; i < tam; ++i)
            contagem[i] = 0;

        for (int i = 0; i < tam; ++i)
            contagem[v.getDataCompleta(array[i]) - 20150101]++;

        for (int i = 1; i < 10000000; ++i) 
            contagem[i] += contagem[i - 1];

        for (int i = tam - 1; i >= 0; i--) {
            result[contagem[v.getDataCompleta(array[i]) - 20150101] - 1] = array[i];
            contagem[v.getDataCompleta(array[i]) - 20150101]--;
        }

        for (int i = 0; i < tam; ++i)
            array[i] = result[i];
    }





}
