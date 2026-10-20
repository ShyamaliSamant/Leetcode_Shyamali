class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet<>();
        for (String d : deadends) {
            dead.add(d);
        }
        if (dead.contains("0000")) {
            return -1;
        }
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer("0000");
        visited.add("0000");
        int turns = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String curr = queue.poll();
                if (curr.equals(target)) {
                    return turns;
                }
                char[] arr = curr.toCharArray();
                for (int j = 0; j < 4; j++) {
                    char original = arr[j];
                    arr[j] = (char) ('0' + (original - '0' + 1) % 10);
                    String next = new String(arr);
                    if (!dead.contains(next) && !visited.contains(next)) {
                        visited.add(next);
                        queue.offer(next);
                    }
                    arr[j] = (char) ('0' + (original - '0' + 9) % 10);
                    next = new String(arr);
                    if (!dead.contains(next) && !visited.contains(next)) {
                        visited.add(next);
                        queue.offer(next);
                    }
                    arr[j] = original;
                }
            }
            turns++;
        }
        return -1;
    }
}
