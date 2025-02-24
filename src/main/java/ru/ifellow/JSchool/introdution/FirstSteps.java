package ru.ifellow.JSchool.introdution;

public class FirstSteps {

    public int sum (int x, int y){
        if ((x > 0 && y > Integer.MAX_VALUE - x) || (x < 0 && y < Integer.MIN_VALUE - x)) {
            throw new IllegalArgumentException("Переполнение типа int при выполнении операции");
        }
        return x + y;
    }

    public int mul (int x, int y){
        if ((x > 0 && y > 0 && x > Integer.MAX_VALUE / y)
                || (x < 0 && y < 0 && x < Integer.MAX_VALUE / y)
                || (x > 0 && y < 0 && y < Integer.MIN_VALUE / x)
                || (x < 0 && y > 0 && x < Integer.MIN_VALUE / y)) {
            throw new IllegalArgumentException("Переполнение типа int при выполнении операции");
        }
        return x * y;
    }

    public int div (int x, int y){
        return x / y;
    }

    public int mod (int x, int y){
        return x % y;
    }

    public boolean isEqual (int x, int y){
        return x == y;
    }

    public boolean isGreater (int x, int y){
        return x > y;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y){
        return (x >= xLeft) && (x <= xRight) && (y >= yTop) && (y <= yBottom);
    }

    public int sum(int[] array){
        if (array == null) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum(sum, array[i]);
        }
        return sum;
    }

    public int mul(int[] array){
        if (array == null || array.length == 0) {
            return 0;
        }
        int sum = 1;
        for (int i = 0; i < array.length; i++) {
            sum = mul(array[i], sum);
        }
        return sum;
    }

    public int min(int[] array){
        int min = Integer.MAX_VALUE;
        if (array == null) {
            return min;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int max(int[] array){
        int max = Integer.MIN_VALUE;
        if (array == null) {
            return max;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public double average(int[] array){
        return (double) sum(array) / array.length;
    }

    public boolean isSortedDescendant(int[] array){
        if (array == null) {
            return false;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public void cube(int[]array){
        if (array != null && array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                array[i] = mul(array[i], mul(array[i], array[i]));
            }
        }
    }

    public boolean find(int[]array, int value){
        if (array == null) {
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public void reverse(int[]array){
        if (array == null || array.length == 0) {
            return;
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public boolean isPalindrome(int[]array){
        if (array == null) {
            return false;
        }
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public int sum(int[][] matrix){
        if (matrix == null) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += sum(matrix[i]);
        }
        return sum;
    }

    public int max(int[][] matrix){
        int max = Integer.MIN_VALUE;
        if (matrix == null) {
            return max;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (max(matrix[i]) > max) {
                max = max(matrix[i]);
            }
        }
        return max;
    }

    public int diagonalMax(int[][] matrix){
        int max = Integer.MIN_VALUE;
        if (matrix == null) {
            return max;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > max) {
                max = matrix[i][i];
            }
        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix){
        if (matrix == null) {
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (!isSortedDescendant(matrix[i])) {
                return false;
            }
        }
        return true;
    }

}
