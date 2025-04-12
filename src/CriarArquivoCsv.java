import java.io.FileWriter;
import java.io.IOException;

public class CriarArquivoCsv {

    public void createCsv(String[] data, String filename) {
        try (FileWriter escreve = new FileWriter(filename)) {
            escreve.append(",password,length,date,class\n");

            for (String dado : data) {
                escreve.append(parseLinhaParaCSV(dado)).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao gerar o arquivo CSV");
            e.printStackTrace();
        }
    }

    public static String parseLinhaParaCSV(String linha) {
        String[] particionar = linha.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
        return String.join(",", particionar);
    }
}
