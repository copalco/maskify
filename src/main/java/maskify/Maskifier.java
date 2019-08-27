package maskify;

public class Maskifier {
    public String maskify(String str) {
        if (str.length() <= 4) {
            return str;
        }
        int charactersToMask = str.length() - 4;
        return "#".repeat(charactersToMask) + str.substring(charactersToMask);
    }
}
