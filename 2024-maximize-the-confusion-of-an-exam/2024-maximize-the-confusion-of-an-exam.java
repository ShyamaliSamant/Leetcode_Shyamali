class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int tcount =0;
        int fcount=0;
        int ans =0;
        int n = answerKey.length();
        int left =0;
        if(n <=1) return 1;
        for(int i=0; i<n; i++){
            if(answerKey.charAt(i) == 'T'){
                tcount++;
                // fcount =0;
            }
            else if(answerKey.charAt(i) == 'F'){
                fcount++;
                // tcount=0;
            }
            while (Math.min(tcount, fcount) > k) {
                if (answerKey.charAt(left) == 'T') {
                    tcount--;
                } else {
                    fcount--;
                }
                left++;
            }
            ans = Math.max(ans, i - left + 1);
        }
        return ans;
    }
}