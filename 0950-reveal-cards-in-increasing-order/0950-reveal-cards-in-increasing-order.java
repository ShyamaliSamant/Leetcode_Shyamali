class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n = deck.length;
        int[] ans = new int[n];
        Deque<Integer> dq = new LinkedList<>();

        for(int i=0; i<n; i++){
            dq.offer(i);
        }
        for(int card : deck){
            int i = dq.pollFirst();
            ans[i] = card;
            if(dq.isEmpty() == false){
                dq.offer(dq.pollFirst());
            }
        }
        return ans;
    }
}