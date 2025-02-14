package ru.ifellow.introdution;

public class FirstStep {

    public int sum (int x, int y){
        return x + y;
    }

    public int mul (int x, int y){
        return x * y;
    }

    public int div (int x, int y){
        if (y == 0) {
            throw new IllegalArgumentException("Добавил проверку, что y != 0");
        }
        return x / y;
    }

    public int mod (int x, int y){
        if (y == 0) {
            throw new IllegalArgumentException("Добавил проверку, что y != 0");
        }
        return x % y;
    }

    public boolean isEqual (int x, int y){
        return x == y;
    }

    public boolean isGreater (int x, int y){
        if (x > y) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y){
        return x >= xLeft && x <= xRight && y >= yTop && y <= yBottom;
    }

    public int sum(int[] array){
        if (array == null || array.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int s : array) {
            sum += s;
        }
        return sum;
    }

    public int mul(int[] array){
        if (array == null || array.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int s : array) {
            sum += s;
        }
        return sum;
    }

    public int min(int[] array){
        if (array == null || array.length == 0) {
            return Integer.MAX_VALUE;
        }

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int max(int[] array){
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public double average(int[] array){
        if (array == null || array.length == 0) {
            return 0;
        }

        double sum = 0;
        for (int num : array) {
            sum += num;
        }

        return sum / array.length;
    }

    public boolean isSortedDescendant(int[] array){
        if (array == null || array.length <= 1) {
            return true;
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public void cube(int[]array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(array[i], 3);
        }
    }

    public boolean find(int[]array, int value){
        for (int s : array) {
            if (s == value) {
                return true;
            }
        }
        return false;
    }

    public void reverse(int[]array){
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int rev = array[i];
            array[i] = array[j];
            array[j] = rev;
        }
    }

    public boolean isPalindrome(int[]array){
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            if (array[i] != array[j]) return false;
        }
        return true;
    }

    public int sum(int[][] matrix){
        int s = 0;

        for (int[] val : matrix) {
            for (int num : val) {
                s += num;
            }
        }
        return s;
    }

    public int max(int[][] matrix){
        if (matrix == null || matrix.length == 0 || (matrix.length > 0 && matrix[0].length == 0)) {
            return Integer.MIN_VALUE;
        }

        int min = Integer.MIN_VALUE;

        for (int[] val : matrix) {
            for (int num : val) {
                min = Math.max(min, num);
            }
        }
        return min;
    }

    public int diagonalMax(int[][] matrix){
        if (matrix == null || matrix.length == 0) return Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE, n = matrix.length;
        for (int i = 0; i < n; i++)
            if (matrix[i].length > i) max = Math.max(max, matrix[i][i]);
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix){
        if (matrix == null) {
            return true;
        }

        for (int[] row : matrix) {
            if (row != null && row.length > 1) {
                for (int i = 1; i < row.length; i++) {
                    if (row[i] >= row[i - 1]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
