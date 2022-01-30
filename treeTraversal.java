public class TreeNode{
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(){}
  TreeNode(int val){this.val = val;}
  TreeNode(int val, TreeNode left, TreeNode right);
  {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}
class TreeTraversal{
  public List<Integer> Traversal(TreeNode root){
    List<Integer> result = new Arraylist<>();
    inOrder(result, root);
    preOrder(result, root);
    postOrder(result, root);
    return root;
  }
  public void inOrder(List<Integer> result, TreeNode curNode){
    if(curNode == null){
      return;
    }
    inOrder(result, curNode.left);
    result.add(curNode.val);
    inOrder(result, curNode.right);
  }
  public void preOrder(List<Integer> result, TreeNode curNode){
    if(curNode == null){
      return;
    }
    result.add(curNode.val);
    preOrder(result, curNode.left);
    preOrder(result, curNode.right);
  }
  public void postOrder(List<Integer> result, TreeNode curNode){
    if(curNode == null){
      return;
    }
    postOrder(result, curNode.left);
    postOrder(result, curNode.right);
    result.add(curNode.val);
  }
  
  /*level order traversal*/
  public List<List> LevelOrder(TreeNode root){
    List<List<Integer>> result = new ArrayList<>();
    Queue<Integer> q = new LinkedList<>();
    if(root == null) return result;
    q.add(root);
    while(!q.isEmpty()){
      int size = q.size();
      List<Integer> ans = new ArrayList<>();
      for(int i = 0; i < size; i++){
        TreeNode tempNode = q.poll();
        ans.add(tempNode.val);
        if(tempNode.left != null) q.add(tempNode.left);
        if(tempNode.right != null) q.add(tempNode.right);
      }
      result.add(ans);
    }
    return result;
  }
