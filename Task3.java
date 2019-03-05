public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 9, 100500, 34, 23, 90, 100500, -30, 50};
        int max = arr[0];
        int count = 0;
        int j = 0;
        while(true){
            if(arr[j] == 10050){
                continue;
            }
            else {
                max = arr[j];
                break;
            }
        }
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

