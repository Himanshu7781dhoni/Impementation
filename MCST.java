class Himanshu{
  static class Node{
    int vertex, weight;
    Node(int v, int w){
      vertex = v;
      weight = w;
    }
    Node(){};
    int getV(){return v;}
    int getWT(){return w;}
  }
  public static int[] dijkstra(int N, ArrayList<ArrayList<Node>> adj, int source){
    int [] distance = new int[N];
    for(int i = 0; i < N; i++){
      distance[i] = Integer.MAX_VALUE;
    }
    distance [source] = 0;
    PriorityQueue<Node> pq = new PriorityQueue<>((v1, v2) -> v1.getWT() - v2.getWT()):
    pq.add(new Node(source, 0);
    while(pq.size() > 0){
      Node cur = pq.poll().getV();
      for(Node it : adj.get(cur)){
         if(distance[cur.getV()] + it.getWT() < distance[it.getV()]){
           distance[it.getV()] = distance[cur.getV()] + it.getWT();
           pq.add(it.getV(), distance[it.getV()]);
         }
      }
    }
    return distance;
  }
           //BELLMANFORD
           
 class node{
    private int u;
    private int v;
    private int wt;
    node(int _u, int _v, int _w){
        this.u = _u;
        this.v = _v;
        this.wt = _w;

    }
    node(){}
    int getV(){ return v;}
    int getU(){return u;}
    int getW(){return wt;}
}
class bellmanFord{
    void bellmanFordALGO(ArrayList<node> edges, int N, int src){
        int dist[] = new int[N];
        for(int i = 0; i < N; i++){
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;
        for(int i = 1; i <= N - 1; i++){
            for(node n: edges){
                if(dist[n.getU()] +  n.getW() < dist[n.getV()]){
                    dist[n.getV()] = dist[n.getU()] + n.getW();

                }
            }
        }
        //we have to check one more time that is the edge weights are reducing if it
        //is reducing it means that there is a negative edge cycle
        int flag = 0;
        for(node n: edges){
            if(dist[n.getU()] +  n.getW() < dist[n.getV()]){
                flag = 1;
                System.out.println("Negative cycle");
                break;
            }
        }
        if(flag == 0){
            for(int i = 0; i< N; i++){
                System.out.println(i + " " + dist[i]);
            }
        }
    }
}
           
