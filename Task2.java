public class Task2 {
    public static void main(String[] args){
        int[]arr=new int[] {5,6,9,1090,34,23,90,10900};
        int sum = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            sum = arr[i] + sum;
            if(arr[i] > 1000 && count == 0) {
                System.out.println("Массив массивный");
                count++;
            }
        }
        System.out.println("Сумма всех эллементов равна" + " " + sum);
    }
}
