public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 9, 100500, 34, 23, 90, 100500, -30, 50};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i] && arr[i] != 100500)
                max = arr[i];
        }
        System.out.println("Максимальное число" + " " + max);
    }
}
