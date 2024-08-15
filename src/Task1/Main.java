package Task1;

public class Main {

    public static class Calculator {
        //Обобщенный метод для сложения двух чисел
        public static <T extends Number, U extends Number> double sum(T a, U b) {
            return a.doubleValue() + b.doubleValue();
        }

        // Обобщенный метод для умножения двух чисел
        public static <T extends Number, U extends Number> double multiply(T a, U b) {
            return a.doubleValue() * b.doubleValue();
        }

        // Обобщенный метод для деления двух чисел
        public static <T extends Number, U extends Number> double divide(T a, U b) {
            return a.doubleValue() / b.doubleValue();
        }

        // Обобщенный метод для вычитания одного числа из другого
        public static <T extends Number, U extends Number> double subtract(T a, U b) {
            return a.doubleValue() - b.doubleValue();
        }
    }
    public static void main(String[] args) {
        System.out.println("Сложение: " + Calculator.sum(10, 20.5)); // Пример с int и double
        System.out.println("Умножение: " + Calculator.multiply(10.5, 20)); // Пример с double и int
        System.out.println("Деление: " + Calculator.divide(20, 5)); // Пример с int и int
        System.out.println("Вычитание: " + Calculator.subtract(20.5, 10)); // Пример с double и int
    }
}