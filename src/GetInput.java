import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GetInput {

    public int getTamanhoSenha(String str) {
        int startIndex = str.lastIndexOf('"') + 2;
        int endIndex = str.indexOf(',', startIndex);
        if (startIndex > 0 && endIndex > startIndex) {
            return Integer.parseInt(str.substring(startIndex, endIndex));
        }
        return 0;
    }

    public int getMesData(String str) {
        String[] partesData = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1)[3].split(" ")[0].split("/");
        if (partesData.length >= 2) {
            return Integer.parseInt(partesData[1]);
        }
        return 0;
    }

    public int getDataCompleta(String str) {
        String[] partesData = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1)[3].split(" ")[0].split("/");
        return Integer.parseInt(partesData[2]) * 10000 + Integer.parseInt(partesData[1]) * 100 + Integer.parseInt(partesData[0]);
    }

    public String[] converteParaArray() {
    	//Mude o parâmetro para "dataset/passwords_formated_data.csv" onde está "dataset/passwords_formated_9k.csv"
        try (BufferedReader br = new BufferedReader(new FileReader("dataset/passwords_formated_9k.csv"))) {
            br.readLine();

            int numLines = 0;
            String line;
            while ((line = br.readLine()) != null) {
                numLines++;
            }

            String[] dataArray = new String[numLines];

            br.close();
        //Mude o parâmetro para "dataset/passwords_formated_data.csv" onde está "dataset/passwords_formated_9k.csv"
            BufferedReader br2 = new BufferedReader(new FileReader("dataset/passwords_formated_9k.csv"));

            br2.readLine();

            int index = 0;
            while ((line = br2.readLine()) != null) {
                dataArray[index++] = line;
            }

            return dataArray;
        } catch (IOException e) {
            e.printStackTrace();
            return new String[0];
        }
    }
}
