public class Determine_the_winner_of_a_bowling_game {
    public static int isWinner(int[] player1, int[] player2)
    {
        int s1 = 0;
        int s2 = 0;
        int ans = 0;
        int n = player1.length;
        for (int i = 0; i<n; i++)
        {
            s1 += player1[i];
            s2 += player2[i];
        }
        if(n>1) {
            for(int i=1;i<n;i++){
                if(player1[i-1]==10 ||((i>=2) && player1[i-2]==10))s1+=player1[i];
                if(player2[i-1]==10 ||((i>=2)&& player2[i-2]==10))s2+=player2[i];
            }
        }
        if(s1==s2) ans= 0;
        else if(s1>s2) ans= 1;
        else ans= 2;
        return ans;

    }
    public static void main(String[] args) {
        int[]player1 = {4,10,7,9};
        int[] player2 = {6,5,2,3};
        System.out.println(isWinner(player1, player2));

    }
}
