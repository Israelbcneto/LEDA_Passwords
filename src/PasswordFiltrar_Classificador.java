import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PasswordFiltrar_Classificador {

    public void filtrarPasswords(String inputFile, String outputFile) {
        String line;
        String csvSplitBy = ",";
        String csvQuotedBy = "\"";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             FileWriter escreve = new FileWriter(outputFile)) {

            escreve.append(",password,length,date,class\n");

            int lineNumber = -1;
            while ((line = br.readLine()) != null) {
                lineNumber++;
                if (lineNumber == 0) continue;
                String[] data = parseCSVLine(line, csvSplitBy, csvQuotedBy);
                if (data.length >= 5 && (data[4].equals("Boa") || data[4].equals("Muito Boa"))) {

                    escreve.append(String.valueOf(lineNumber - 1)).append(",").append(String.join(",", csvQuotedBy + data[1] + csvQuotedBy, data[2], data[3], data[4]));
                    escreve.append("\n");
                }
            }

            System.out.println("Filtragem concluída. Novo arquivo gerado: " + outputFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String[] parseCSVLine(String line, String csvSplitBy, String csvQuotedBy) {
        boolean inQuotes = false;
        StringBuilder field = new StringBuilder();
        String[] fields = new String[5];
        int fieldIndex = 0;

        for (char c : line.toCharArray()) {
            if (c == '"') {
                inQuotes = !inQuotes;
            } else if (c == ',' && !inQuotes) {
                fields[fieldIndex++] = field.toString();
                field = new StringBuilder();
            } else {
                field.append(c);
            }
        }
        fields[fieldIndex] = field.toString();
        return fields;
    }
}
