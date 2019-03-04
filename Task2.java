public class Task2 {
    public static void main(String[] args){
        int[]arr=new int[] {5,6,9,1090,34,23,90,10900};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = arr[i] + sum;
        }
        for(int j = 0; j < arr.length; j++){
            if(arr[j] > 1000) {
                System.out.println("Массив массивный");
                break;
            }
        }
        System.out.println("Сумма всех эллементов равна" + " " + sum);
    }
}
