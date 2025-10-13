class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int hap = brown + yellow;
        int half = 0;
        if(hap % 2 == 0){
            half = hap /2;
        }else{
            half = (hap+1) / 2;
        }
        
        for(int i=1; i<=half; i++){       
            for(int j=half; j>0; j--){
                if (i * j == hap && (j - 2) * (i - 2) == yellow) {
                    answer[0] = j;
                    answer[1] = i;
                    return answer;
                }
            }
        }
        
        
        return new int[2];
    }
}