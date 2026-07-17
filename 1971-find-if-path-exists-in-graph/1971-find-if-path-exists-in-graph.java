class Solution {

    static class DSU {
        int[] p;
        int[] sz;
        DSU(int n) {
            p = new int[n];
            sz = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = i;
                sz[i] = 1;
            }
        }
        int find(int x) {
            if (p[x] == x)
                return x;
            return p[x] = find(p[x]);
        }
        void union(int u, int v) {
            u = find(u);
            v = find(v);
            if (u == v)
                return;
            if (sz[u] < sz[v]) {
                int temp = u;
                u = v;
                v = temp;
            }

            p[v] = u;
            sz[u] += sz[v];
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        DSU dsu = new DSU(n);
        for (int[] edge : edges) {
            dsu.union(edge[0], edge[1]);
        }
        return dsu.find(source) == dsu.find(destination);
    }
}