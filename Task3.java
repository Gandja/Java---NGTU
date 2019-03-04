public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 9, 100500, 34, 23, 90, 100500, -30, 50};
        int intSize = -2147483648;
        int max = intSize;
        for (int i = 0; i < arr.length; i++) {

            if(max < arr[i]) {
                if (arr[i] == 100500) {
                    continue;
                }
                max = arr[i];
            }
        }
        System.out.println("Максимальное число" + " " + max);
    }
}

