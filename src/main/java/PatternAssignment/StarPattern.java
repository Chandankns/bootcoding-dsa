package PatternAssignment;

public class StarPattern {
    public static void main(String[] args) {
        int p=6;
        for(int i=0;i<p;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
