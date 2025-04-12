public class Main {

    public static void main(String[] args) {
    	ExecutandoTestes testes = new ExecutandoTestes();
        Password_Classificador classificador = new Password_Classificador();
        classificador.classificarPasswords("dataset/passwords.csv", "dataset/password_classifier.csv");

        PasswordFormatador_Data formatacao = new PasswordFormatador_Data();
        formatacao.formataDatas("dataset/password_classifier.csv", "dataset/passwords_formated_data.csv");

        PasswordFiltrar_Classificador filtrarClassifier = new PasswordFiltrar_Classificador();
        filtrarClassifier.filtrarPasswords("dataset/password_classifier.csv", "dataset/passwords_classifier.csv");


        System.out.println("\nInicializar ordenações\n\n");

        System.out.println("ANALISANDO TAMANHO P/ SENHA");
        testes.toLength();

        System.out.println("\nANALISANDO P/ MÊS");
        testes.toMonth();

        System.out.println("\nANALISANDO P/ DATA");
        testes.toDate();

    }
}
