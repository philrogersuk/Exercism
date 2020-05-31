import java.util.Arrays;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        // Assume valid string input

        return Arrays.stream(dnaStrand.split("(?!^)"))
                .filter(s -> !s.isEmpty())
                .map(DnaNucleotide::valueOf)
                .map(DnaNucleotide::getCompliment)
                .collect(joining());

//      Alternate solution

//      return dnaStrand.replace('A', 'U')
//                .replace('T', 'A')
//                .replace('C', 'x')
//                .replace('G', 'C')
//                .replace('x', 'G');
    }

    private enum DnaNucleotide {
        A("U"),
        C("G"),
        G("C"),
        T("A");

        private String rnaCompliment;

        private DnaNucleotide(String rnaCompliment) {
            this.rnaCompliment = rnaCompliment;
        }

        private String getCompliment() {
            return rnaCompliment;
        }
    }

}
