import java.util.Comparator;

public class idComparator implements Comparator<String> {
    @Override
    public int compare(String line1, String line2) {
        int id1 = Integer.parseInt(line1.split("\t")[0]);
        int id2 = Integer.parseInt(line2.split("\t")[0]);
        return Integer.compare(id1, id2);
    }
}