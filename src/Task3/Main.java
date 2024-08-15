package Task3;

public class Main {

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(10, "Hello");
        System.out.println(pair.getFirst()); // Вывод: 1
        System.out.println(pair.getSecond()); // Вывод: 2
        System.out.println(pair); // Вывод: Pair{first=1, second=Hello}
    }

    public static class Pair<F, S> {
        private final F first;
        private final S second;

        public Pair(F first, S second) {
            this.first = first;
            this.second = second;
        }

        public F getFirst() {
            return first;
        }

        public S getSecond() {
            return second;
        }

        @Override
        public String toString() {
            return "Pair(" + first + ", " + second + ")";
        }
    }
}
