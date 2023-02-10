import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordNet {
    private final Map<Integer, String> idToSynsets;
    private final Map<Integer, Integer> idToHypernyms;

    public WordNet(String synsets, String hypernyms) {
        In synsetsReader = new In(synsets);
        In hypernymsReader = new In(hypernyms);

        idToSynsets = new HashMap<>();
        idToHypernyms = new HashMap<>();

        while (synsetsReader.hasNextLine()) {
            String[] line = synsetsReader.readLine().split(",");
            idToSynsets.put(Integer.parseInt(line[0]), line[1]);
        }

        while (hypernymsReader.hasNextLine()) {
            String[] line = hypernymsReader.readLine().split(",");
            if (line.length == 1) {
                idToHypernyms.put(Integer.parseInt(line[0]), null);
                continue;
            }
            idToHypernyms.put(Integer.parseInt(line[0]), Integer.parseInt(line[1]));
        }
    }

    // returns all WordNet nouns
    public Iterable<String> nouns() {
        List<String> nouns = new ArrayList<>();
        return nouns;
    }

    // is the word a WordNet noun?
    public boolean isNoun(String word) {
        return false;
    }

    // distance between nounA and nounB (defined below)
    public int distance(String nounA, String nounB) {
        return 0;
    }

    // a synset (second field of synsets.txt) that is the common ancestor of nounA and nounB
    // in a shortest ancestral path (defined below)
    public String sap(String nounA, String nounB) {
        return "";
    }

    // do unit testing of this class
    public static void main(String[] args) {
        String synsets = "synsets.txt";
        String hypernyms = "hypernyms.txt";
        WordNet wordNet = new WordNet(synsets, hypernyms);
    }
}