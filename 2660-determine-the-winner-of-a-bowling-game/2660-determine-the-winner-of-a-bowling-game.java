class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int score1 = calculate(player1);
        int score2 = calculate(player2);

        if(score1 > score2){
            return 1;
        } else if(score2 > score1){
            return 2;
        } else {
            return 0;
        }
    }

    public int calculate(int[] player){
        int score = 0;
        for(int i = 0; i < player.length; i++){
            if((i >= 1 && player[i - 1] == 10) || (i >= 2 && player[i - 2] == 10)){
                score += player[i] * 2;
            } else {
                score += player[i]; 
            }
        }
        return score;
    }
}