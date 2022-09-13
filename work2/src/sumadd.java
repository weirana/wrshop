import java.util.Scanner;

public class sumadd {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }
        int sum =0;
        int x=arr.length;
        for(int i=0;i<x;i++) {
            int Sumadd=0;
            for(int j=i;j<x;j++) {
                Sumadd+=arr[j];
                if(Sumadd>sum) {
                    sum=Sumadd;
                }
            }
        }
        System.out.println(sum);
    }
}
