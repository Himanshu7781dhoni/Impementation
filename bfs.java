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
