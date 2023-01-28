package Sorting;

public class BubbleSort {
    public int[] bubblesort(int a[]){
        int temp;
        for (int i = 0; i < a.length; i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;

    }

    public static void main(String[] args) {
        int a[] = {50, 17, 19, 5, 13};
        BubbleSort ss =new BubbleSort();
        int b[]=ss.bubblesort(a);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
                }
            }

        }


