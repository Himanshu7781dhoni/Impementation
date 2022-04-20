class bfs{
public int bfs(int source, int destination){
  boolean vis[] = new boolean[adj.length];
  int parent[] = new int[adj.length];
  Queue<Integer> q = new LinkedList<>();
  q.add(source);
  vis[source] = true;
  parent[source] = -1;
  while(!q.isEmpty()){
    int cur = q.poll();
    if(cur == destination) break;
    for(int neighbour : adj[cur]){
      if(!vis[neighbour]){
        vis[neighbour] = true;
        q.add(neighbour);
        parent[neighbour] = cur;
      
      }
     }
   }
  int cur = destination;
  int distance = 0;
  while(parent[cur] != -1){
    system.out.println(cur + "->");
    cur = parent[cur];
    distance++;
   }
 }

}

//best sol
class Solution{
  public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>>adj){
    
    ArrayList<Integer> bfs = new ArrayList<>();
    boolean vis[] = new boolean[V + 1];
    
    for(int i = 1; i <= V; i++){
      if(vis[i] == false){
        
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        vis[i] = true;
         
        while(!q.isEmpty()){
          
          
          Integer node = q.poll();
          bfs.add(node);
          
          for(Integer it : adj.get(node)){
            if(vis[it] == false){
              q.add(it);
              vis[it] = true;
            }
          }
        }
      }
    }
    return bfs;
  }
}
