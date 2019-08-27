package maskify;

import java.util.stream.Stream;

public class Maskifier {
    public String maskify(String str) {
        if (str.length() <= 4) {
            return str;
        }
        int charactersToMask = str.length() - 4;
        Stream<Character> charStream = str.chars().mapToObj(c -> (char) c);
        return "#".repeat(charactersToMask) + str.substring(charactersToMask);
    }
}
