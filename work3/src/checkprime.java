public class checkprime {
    public static void main(String[] args) {
        int count=0;
        for (int i = 2; i < 20000; i++) {
            boolean Prime=true;
            for (int j = 2; j < i; j++) {
                if (i%j==0){
                    Prime=false;
                    break;
                }
            }
            if (Prime){
                count++;
                System.out.print(i+" ");
                if (count%5==0){
                    System.out.println();
                }
            }
        }
    }
}
