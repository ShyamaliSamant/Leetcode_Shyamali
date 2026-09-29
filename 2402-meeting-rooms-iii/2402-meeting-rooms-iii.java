class Solution {
    public int mostBooked(int k, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
        long[] roomEnd = new long[k];
        int[] count = new int[k];

        for (int[] meeting : meetings) {
            int start = meeting[0];
            int end = meeting[1];
            long duration = end - start;
            int freeRoom = -1;
            for (int room = 0; room < k; room++) {
                if (roomEnd[room] <= start) {
                    freeRoom = room;
                    break;
                }
            }
            if (freeRoom != -1) {
                roomEnd[freeRoom] = end;
                count[freeRoom]++;
            } 
            else {
                int earliestRoom = 0;
                for (int room = 1; room < k; room++) {
                    if (roomEnd[room] < roomEnd[earliestRoom]) {
                        earliestRoom = room;
                    }
                }
                roomEnd[earliestRoom] += duration;
                count[earliestRoom]++;
            }
        }
        int answer = 0;
        for (int room = 1; room < k; room++) {
            if (count[room] > count[answer]) {
                answer = room;
            }
        }
        return answer;
    }
}