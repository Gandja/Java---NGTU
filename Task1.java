public class Task1{


    public static void main(String[] args){
        float a = 42;
        float b = 46;
        checkNumber(a,b);
    }
    public static int checkNumber(float a, float b){
        float c = a / b;
        if(a < 0 || b < 0) {
            System.out.println("Есть отрицательное число");
        }
        if (b != 0 ) {
            System.out.printf("Результат деления первого числа на второе" + " " + "%f\n",c);
        }
        if (a > b){
            System.out.println("Первое больше второго");
        }
        if (b > a) {
            System.out.println("Второе число больше первого");
        }
        if (a % 2 == 0 ){
            System.out.println("Первое число четное");
        }
        return 0;
    }
}
