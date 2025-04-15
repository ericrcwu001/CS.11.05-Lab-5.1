public class ArrayUtility {

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
//        for (int i : array) {
//            System.out.print(i + " ");
//        }
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
//            sum = sum + array[i];
            sum += array[i];
        }
        return sum;
    }

    public static double average(int[] array) { // round to 2 dp
        double sum = (double) sum(array);
        double average = sum / array.length;
        String tmp = String.format("%.2f", average);
        return Double.parseDouble(tmp);
    }

    public static int minimum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    public static int evenCount(int[] array) {
        int cnt = 0;
        for (int x : array) {
            if (x % 2 == 0) cnt++;
        }
        return cnt;
    }

    public static int[] reverseOne(int[] array) {
        int[] newArr = new int[array.length];
        for (int i = 0; i < array.length; ++i) {
            newArr[i] = array[array.length - i - 1];
        }
        return newArr;
    }

    public static void reverseTwo(int[] array) {
        for (int i = 0; i < array.length / 2; ++i) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int x : array) {
            if (num == x) return true;
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (String tmp : array) {
            if (tmp.equals(str)) return true;
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; ++i) {
//            array[i] = array[i] * 2;
            array[i] *= 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i < array.length; ++i) {
            array[i] *= n;
        }
    }

    public static String toString(int[] array) {
        String ans = "";
//        ans += 1 + "x y" + 2; // "1x y2"
        for (int i = 0; i < array.length; ++i) {
            ans += array[i];
            if (i != array.length - 1) ans += ",";
        }

        return ans;
    }
    // [1,2,3]

    public static boolean twoSum(int[] array, int num) {
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array.length; ++j) {
                if (i != j && array[i] + array[j] == num) return true;
            }
        }
        return false;
    }
    // looking for: 8
    // [2,4,3]

    public static void shiftRight(int[] array) {
        if (array.length < 2) return;

        int tmp = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i-1];
        }
        array[0] = tmp;

//        int tmp = array[0];
//        for (int i = 0; i < array.length - 1; i++) {
//            array[i+1] = array[i];
//        }
//        array[array.length - 1] = tmp;

    } // [1,2,3,4] --> [4,1,2,3]

    public static void shiftLeft(int[] array) {

    }

    public static void shiftRightNTimes(int[] array, int n) {

    }

    public static void shiftLeftNTimes(int[] array, int n) {

    }


}
