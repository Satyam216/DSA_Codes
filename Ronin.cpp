#include <bits/stdc++.h>
using namespace std;

class Tree {
    public:
        int n;
        vector<vector<pair<int, int>>> adj;
        vector<int> parent; 
        vector<int> min_power; 
    
        Tree(int n) {
            this->n = n;
            adj.resize(n + 1);
            parent.resize(n + 1, -1);
            min_power.resize(n + 1, 0);
        }
    
        void addEdge(int u, int v, int p) {
            adj[u].push_back({v, p});
            adj[v].push_back({u, p});
        }
    
        void preprocess(int root = 1) {
            queue<int> q;
            q.push(root);
            parent[root] = 0;
    
            while (!q.empty()) {
                int node = q.front();
                q.pop();
    
                for (auto [child, power] : adj[node]) {
                    if (child != parent[node]) {
                        parent[child] = node;
                        min_power[child] = power;
                        q.push(child);
                    }
                }
            }
        }
    
        int getHighestNode(int u, long long H) {
            while (u != 1 && H >= min_power[u]) {
                H -= min_power[u];
                u = parent[u];
    
                if (H == 0) break;
            }
            return u;
        }
    };
    
    vector<int> solve(int n, vector<vector<int>> edges, int q, vector<vector<long long>> queries) {
        Tree tree(n);
    
        for (auto &edge : edges) {
            int u = edge[0], v = edge[1], p = edge[2];
            tree.addEdge(u, v, p);
        }
    
        tree.preprocess();
    
        vector<int> result;
        for (auto &query : queries) {
            int startNode = query[0];
            long long health = query[1];
            result.push_back(tree.getHighestNode(startNode, health));
        }
    
        return result;
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;
    vector<vector<int>> edges(n - 1, vector<int>(3));
    for (int i = 0; i < n - 1; i++)
        cin >> edges[i][0] >> edges[i][1] >> edges[i][2];

    int q;
    cin >> q;
    vector<vector<long long>> queries(q, vector<long long>(2));
    for (int i = 0; i < q; i++)
        cin >> queries[i][0] >> queries[i][1];

    vector<int> result = solve(n, edges, q, queries);

    for (int ans : result)
        cout << ans << " ";

    return 0;
}
