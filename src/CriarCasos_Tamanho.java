import java.util.Arrays;
import java.util.Comparator;

public class CriarCasos_Tamanho {
    GetInput csvToArray = new GetInput();
    String[] data = csvToArray.converteParaArray();

    Comparator<String> comparatorLengthPasswordCrescent = Comparator.comparingInt((String str) -> {
        if (str == null) {
            return 0;
        }
        String[] pieces = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
        if (pieces.length < 3) {
            return 0;
        }
        return Integer.parseInt(pieces[2]);
    });
    Comparator<String> comparatorLengthPasswordDecreasing = Comparator.comparingInt((String str) -> {
        if (str == null) {
            return 0;
        }
        String[] pieces = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
        if (pieces.length < 3) {
            return 0;
        }
        return Integer.parseInt(pieces[2]);
    }).reversed();

    public String[] melhorCaso() {
        String[] dataTransforming = Arrays.copyOf(data, data.length);
        Arrays.sort(dataTransforming, comparatorLengthPasswordDecreasing);
        return dataTransforming;
    }
    public String[] medioCaso() {
        return data;
    }
    public String[] piorCaso() {
        String[] dataTransforming = Arrays.copyOf(data, data.length);
        Arrays.sort(dataTransforming, comparatorLengthPasswordCrescent);
        return dataTransforming;
    }

}
