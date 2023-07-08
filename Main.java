import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
    public static void writeToFile(String filename, Iterable<String> lines) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        ArrayList<String> lines = new ArrayList<String>();
        try  (BufferedReader input = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while ((line = input.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        writeToFile("poemArrayList.txt", lines);
        Collections.sort(lines, new idComparator());
        writeToFile("poemArrayListOrderByID.txt", lines);

        HashSet<String> set = new HashSet<>(lines);
        writeToFile("poemHashSet.txt", set);

        TreeSet<String> treeSet = new TreeSet<>(lines);
        writeToFile("poemTreeSet.txt", treeSet);

        TreeSet<String> treeSetByID = new TreeSet<>(new idComparator());
        treeSetByID.addAll(lines);
        writeToFile("poemTreeSetOrderByID.txt", treeSetByID);

        HashMap<Integer, String> map = new HashMap<>();
        for (String line : lines) {
            String[] parts = line.split("\t");
            int id = Integer.parseInt(parts[0]);
            String verse = parts[1];
            map.put(id, verse);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("poemHashMap.txt"))) {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                int key = entry.getKey();
                String value = entry.getValue();
                writer.write(key + "\t" + value);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
