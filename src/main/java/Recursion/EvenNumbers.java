package Recursion;

public class EvenNumbers {
    public void print(int n) {
        if (n == 0) {
            return;
        }
        print(n - 1);

        if (n % 2 == 0) {
            System.out.println(n);
        }


    }

    public static void main(String[] args) {
        EvenNumbers re = new EvenNumbers();
        re.print(10);

    }
}


