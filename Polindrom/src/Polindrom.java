public class Polindrom {
    public static void main(String[] args) {
        System.out.println(isPolindrom(323));
    }

    public static boolean isPolindrom(Integer number) {
        String reverse = new StringBuffer(number.toString()).reverse().toString();
        return number.toString().equals(reverse);
    }
}
