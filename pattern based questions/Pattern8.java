
/*

1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

*/



public class Pattern8 {

    public static void pattern(int num){
        for (int i = 1; i <= num ; i++) {
            int count=1;
            for (int j = i; j <= num; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(7);
    }
}
