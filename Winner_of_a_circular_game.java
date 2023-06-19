public class Winner_of_a_circular_game {
    public static int findTheWinner(int n, int k) {
        if(n==1){
            return 1;
        }else
        {
            return(findTheWinner(n-1,k)+ k-1)% n+1;
        }
    }
    public static void main(String[] args) {
        System.out.println(findTheWinner(5,2));
    }
}
