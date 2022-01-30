private boolean dfsUtil(int source, int destination, boolean vis[]){
  if(source == destination) return true;
  for(int neighbour : adj[source]){
    if(!vis[neighbour]){
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
      if(!vis[neighbour]){
        vis[neighbour] = true;
        st.push(neighbour);
      }
    }
  }
  return false;
}
      
  
