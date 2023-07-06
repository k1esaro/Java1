public class Example1 {
    public static void main(String[] args) {
        int n = 9;
        int resultsum = 0;
        for (int i = 0 ; i<=n ; i++) {
            resultsum = resultsum+i ;
        }
        System.out.println(resultsum);
        int resultmulti = 1;
        for (int i = 1 ; i<=n ; i++) {
            resultmulti = resultmulti*i ;
        }
        System.out.println(resultmulti);

    }
}
