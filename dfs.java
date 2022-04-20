private boolean dfsUtil(int source, int destination, boolean vis[]){
  if(source == destination) return true;
  for(int neighbour : adj[source]){
    if(vis[neighbour] == false){
      vis[neighbour] = true;
      boolean isConnected = dfsUtil(neighbour, destination, vis);
      if(isConnected) return true;
    }
  }
  return false;
}
public boolean DFS(int source, int destination){
  boolean vis[] = new boolean[adj.length];
  vis[source] = true;
  return dfsUtil(source, destination, vis);
}
/*
dfs implementation using stack*/
public boolean dfs(int source, int destination){
  boolean vis[] = new boolean[adj.length];
  Stack<Integer> st = new stack<>();
  st.push(source);
  vis[source] = true;
  while(!st.isEmpty()){
    int cur = st.pop();
    if(cur == destination) return true;
    for(int neighbour : adj[cur]){
      if(vis[neighbour] == false){
        vis[neighbour] = true;
        st.push(neighbour);
      }
    }
  }
  return false;
}




class Solution{
  public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){
    ArrayList<Integer> storeDFS = new ArrayList<>();
    boolean vis[] = new boolean[V + 1];
    for(int i = 1; i <= V; i++){
      if(vis[i] == false){
        dfs(i, vis, adj, storeDFS);
      }
    }
    return storeDFS;
  }
  public void dfs(int i, boolean vis[], ArrayList<ArrayList<Integer>>adj, ArrayList<Integer>storeDFS){
    //no base case
    storeDFS.add(i);
    
    vis[i] = true;
    for(Integer it : adj.get(i)){
      if(vis[it] == false){
        dfs(it, vis, adj, storeDFS);
      }
    }
  }
}
      
  
