// c) find number of prime numbers?
class Questiona11c {
    public static void main(String args[]) {
        int c = 0, count= 0;
        for (int i = 23; i <= 249; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) c++;
            }
            if (c == 2) {
                System.out.print(i + ",");
                count=  count+ 1;
            }
            c=0;
        }
        System.out.println("num;" + count);
    }
}