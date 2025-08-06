public class timeadd {
    public static void main(String[] args) {
        int h1 = 2, m1 = 45, s1 = 50;
        int h2 = 3, m2 = 20, s2 = 30;
         
        int sec = s1 + s2;
        int min = m1 + m2 + sec / 60;
        int hr = h1 + h2 + min / 60;
        sec = sec % 60;
        min = min % 60;
        System.out.println("Sum of times: " + hr + ":" + min + ":" + sec);
    }
}