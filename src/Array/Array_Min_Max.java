package Array;

public class Array_Min_Max {


    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        int max = 0;
        int min = 0;

        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] > max) {
                array[i] = max;
            }
        }
        if (array[i] < min) {
            array[i] = min;
        }
        System.out.println("min =" + min);
        System.out.println("man =" + max);
    }
}
