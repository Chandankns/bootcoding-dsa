package PatternAssignment;

public class Number4 {
    public static void main(String[] args) {
        int n = 6;
        int count=1;
        for (int i = 1; i < n; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print(" ");
            }
            for(int k=1;k<i;k++,count++)
                System.out.print(count+" ");
            System.out.println();
        }
    }
}


