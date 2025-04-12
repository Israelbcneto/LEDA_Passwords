import java.util.Arrays;
import java.util.Comparator;

public class CriarCasos_Data {
    GetInput csvToArray = new GetInput();
    String[] data = csvToArray.converteParaArray();

    Comparator<String> comparatorDateCrescent = Comparator.comparing((String str) -> {
        String[] piecesDate = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1)[3].split(" ")[0].split("/");
        return Integer.parseInt(piecesDate[2]) * 10000 + Integer.parseInt(piecesDate[1]) * 100 + Integer.parseInt(piecesDate[0]);
    });
    Comparator<String> comparatorDateDecreasing = Comparator.comparing((String str) -> {
        String[] piecesDate = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1)[3].split(" ")[0].split("/");
        return Integer.parseInt(piecesDate[2]) * 10000 + Integer.parseInt(piecesDate[1]) * 100 + Integer.parseInt(piecesDate[0]);
    }).reversed();

    public String[] melhorCaso() {
        String[] dataTransforming = Arrays.copyOf(data, data.length);
        Arrays.sort(dataTransforming, comparatorDateCrescent);
        return dataTransforming;
    }
    public String[] medioCaso() {
        return data;
    }
    public String[] piorCaso() {
        String[] dataTransforming = Arrays.copyOf(data, data.length);
        Arrays.sort(dataTransforming, comparatorDateDecreasing);
        return dataTransforming;
    }
}
