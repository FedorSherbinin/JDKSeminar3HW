package Task2;

import java.util.Arrays;

public class Main {

    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        // Проверяем, равна ли длина массивов и равны ли элементы
        return Arrays.equals(array1, array2);
    }
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {1, 2, 3, 4, 5};
        String[] array3 = {"a", "b", "c", "d", "e"};
        String[] array4 = {"a", "b", "c", "d", "f"};

        System.out.println("Массивы равны: " + compareArrays(array1, array2));
        System.out.println("Массивы разные: " + compareArrays(array3, array4));
    }
}
