public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[]{100500, 100500, 100500, 100500, 100500, 100500, 100500, 100500, 100500, 100500};
        int max = arr[0];
        int count = 0;
        int j = 0;
        while(j < arr.length){
            if(arr[j] == 100500){
                j++;
                continue;
            }
            else {
                max = arr[j];
                break;
            }
        }
        for (int i = j; i < arr.length; i++)
        System.out.println("Максимальное число" + " " + max);
    }
}

