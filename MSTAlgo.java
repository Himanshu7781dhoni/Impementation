class Pair implements Comparable<Pair>{
  int u, v, w;
  Pair(int _u, int _v, int _w){
    u = _u;
    v = _v;
    w = _w;
  }
  Pair(){}
  int getU(){return u;}
  int getV(){return v;}
  int getW(){return w;}
  publiv int compareTo(Pair o){
    return this.w - o.w;
  }
};
class kruskal'sAlgorithm{
  private int find(int x, int parent[]){
  if(parent[x] != x){
    parent[x] = find(parent[x],parent);
  }
  return parent[x];
}
void union(int x, int y, int parent[], int rank[]){
  int xRoot = find(x, parent);
  int yRoot = find(y, parent);
  
  if(xRoot == yRoot){
    return;
  }
  if(rank[xRoot] < rank[yRoot]){
    parent[xRoot] = yRoot;
  }
  else if(rank[xRoot] > rank[yRoot]){
    parent[yRoot] = xRoot;
  }
  else{
    parent[yRoot] = xRoot;
    rank[xRoot] += 1;
  }
}
void kruskalMst(ArrayList<Pair> adj, int N){
  //step 1
  Array.sort(Pair);// this is used to sort the edges in increasing order of there weight
  int parent [] = new int[N];
  int rank [] = new int[N];
  for(int i = 0; i< N; i++){
    parent[i] = i;
    rank[i] = 0;
  }
  int CostMst = 0;
  ArrayList<Pair> mst = new ArrayList<Pair>();
  for(Pair it :  adj){
    // step 2 pick the smallest edges first and check 
    //wheather there are belong to the same parent or not
    if(find(it.getU(), parent) != find(it.getV(), parent)){
      CostMst += it.getW();
      //step 3
      //if it is not form any cycle then add it to mst 
      mst.add(it);
      // and finally after adding it to mst make union of it
      union(it.getU, it.getV, parent, rank);
    }
  }
}
// implementation of prims Algorithm
class Node implements Comparator<Node>{
  int v, weight;
  Node(int _v, int wt){v = _v; weight = wt}
  Node(){}
  int getV(){return v;}
  int getWT(){return weight;}
  public int compareTo(Node n1, Node n2){
   if(n1.weight < n2.weight){
     return -1;
   }else if (n1.weight > n2.weight){
     return 1;
   }else{
     return 0;
   }
  }
}
  class primsAlgo{
    void primMst(ArrayList<ArrayList<Node>> adj, int N){
      int key[] = new int[N];
      int parent[] = new int[N];
      Boolean mstSet[] = new Boolean[N]; 
      for(int i = 0; i < N; i++){
        key[i] = Interger.MAX_VALUE:
        parent[i] = -1;
        mstSet[i] = false;
      }
      key[0] = 0;
      PriorityQueue<Node> pq = new PriorityQueue<>();
      pq.add(new Node(0, key[0]));
      for(int i = 0; i < N - 1; i++){
        int u = pq.poll.getV();
        mstSet[u] = true;
        for(Node it : adj.get(u)){
          if(mstSet[it.getV()] == false){
            if(it.getWT() < key[it.getV()]){
              parent[it.getV()] = u;
              key[it.getV()] = it.getWT();
              pq.add(it.getV(), key[it.getV()]);
            }
          }
        }
      }
    }
    
      
    
                       

     

  
