package maskify;

import java.util.stream.IntStream;

public class Maskifier {
    public String maskify(String str) {
        return new Masked(str).toString();
    }

    static class Masked {

        private final String text;

        public Masked(String text) {
            this.text = text;
        }

        public String characterAt(int index) {
            return shouldMaskAt(index) ? "#" : unmaskedCharacterAt(index);
        }

        private boolean shouldMaskAt(int index) {
            return index < firstUnmaskedIndex();
        }

        private int firstUnmaskedIndex() {
            return length() - 4;
        }

        private String unmaskedCharacterAt(int index) {
            return String.valueOf(text.charAt(index));
        }

        @Override
        public String toString() {
            return IntStream.range(0, length()).mapToObj(i -> characterAt(i)).reduce("", String::concat);
        }

        private int length() {
            return text.length();
        }

    }
}
