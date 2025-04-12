public class InsertionSort {
    CriarArquivoCsv create = new CriarArquivoCsv();

    public void length(String[] data,String nameCase) {
        GetInput v = new GetInput();
        String[] copiaDados = data.clone();

        long tempoInicial = System.nanoTime();

        for (int i = 1; i < copiaDados.length; i++) {
            String chave = copiaDados[i];
            int j = i - 1;
            while (j >= 0 && v.getTamanhoSenha(copiaDados[j]) < v.getTamanhoSenha(chave)) {
                copiaDados[j + 1] = copiaDados[j];
                j = j - 1;
            }
            copiaDados[j + 1] = chave;
        }

        long tempoFinal = System.nanoTime();
        long duracao = (tempoFinal - tempoInicial) / 1000000;

        System.out.println("Tempo de execução InsertionSort p/ o " + nameCase + ": " + duracao + " milissegundos");
        String filename = "";

        if(nameCase == "melhor caso") {
            filename = "dataset/passwords_length_insertionSort_melhorCaso.csv";
        } else if (nameCase == "médio caso" ){
            filename = "dataset/passwords_length_insertionSort_medioCaso.csv";
        } else {
            filename = "dataset/passwords_length_insertionSort_piorCaso.csv";
        }

        create.createCsv(copiaDados, filename );
    }

    public void mes(String[] data, String nameCase) {
        GetInput v = new GetInput();
        String[] copiaDados = data.clone();

        long tempoInicial = System.nanoTime();

        for (int i = 1; i < copiaDados.length; i++) {
            String chave = copiaDados[i];
            int j = i - 1;
            while (j >= 0 && v.getMesData(copiaDados[j]) > v.getMesData(chave)) {
                copiaDados[j + 1] = copiaDados[j];
                j = j - 1;
            }
            copiaDados[j + 1] = chave;
        }

        long tempoFinal = System.nanoTime();
        long duracao = (tempoFinal - tempoInicial) / 1000000;

        System.out.println("Tempo de execução Insertion Sort p/ o " + nameCase + ": " + duracao + " milissegundos");
        String filename = "";

        if (nameCase.equals("melhor caso")) {
            filename = "dataset/passwords_data_month_insertionSort_melhorCaso.csv";
        } else if (nameCase.equals("médio caso")) {
            filename = "dataset/passwords_data_month_insertionSort_medioCaso.csv";
        } else {
            filename = "dataset/passwords_data_month_insertionSort_piorCaso.csv";
        }

        create.createCsv(copiaDados, filename);
    }

    public void data(String[] data, String nameCase) {
        GetInput v = new GetInput();
        String[] copiaDados = data.clone();

        long tempoInicial = System.nanoTime();

        for (int i = 1; i < copiaDados.length; i++) {
            String chave = copiaDados[i];
            int j = i - 1;
            while (j >= 0 && v.getDataCompleta(copiaDados[j]) > v.getDataCompleta(chave)) {
                copiaDados[j + 1] = copiaDados[j];
                j = j - 1;
            }
            copiaDados[j + 1] = chave;
        }

        long tempoFinal = System.nanoTime();
        long duracao = (tempoFinal - tempoInicial) / 1000000;

        System.out.println("Tempo de execução Insertion Sort p/ o " + nameCase + ": " + duracao + " milissegundos");
        String filename = "";

        if (nameCase.equals("melhor caso")) {
            filename = "dataset/passwords_data_insertionSort_melhorCaso.csv";
        } else if (nameCase.equals("médio caso")) {
            filename = "dataset/passwords_data_insertionSort_medioCaso.csv";
        } else {
            filename = "dataset/passwords_data_insertionSort_piorCaso.csv";
        }

        create.createCsv(copiaDados, filename);
    }

}
