import java.util.Arrays;
import java.util.Comparator;

public class CriarCasos_Mes {
    GetInput csvToArray = new GetInput();
    String[] data = csvToArray.converteParaArray();

    Comparator<String> comparadorMesCrescente = Comparator.comparingInt((String str) -> {
        String[] piecesDate = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1)[3].split("/");
        return Integer.parseInt(piecesDate[1]);
    });
    Comparator<String> comparadorMesDecrescente = Comparator.comparingInt((String str) -> {
        String[] piecesDate = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1)[3].split("/");
        return Integer.parseInt(piecesDate[1]);
    }).reversed();

    public String[] melhorCaso() {
        String[] dataTransforming = Arrays.copyOf(data, data.length);
        Arrays.sort(dataTransforming, comparadorMesCrescente);
        return dataTransforming;
    }
    public String[] medioCaso() {
        return data;
    }
    public String[] piorCaso() {
        String[] dataTransforming = Arrays.copyOf(data, data.length);
        Arrays.sort(dataTransforming, comparadorMesDecrescente);
        return dataTransforming;
    }

}
