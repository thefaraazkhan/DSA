
public class Main
{
	public List<Integer> inorderTraversal(TreeNode root) {
       List<Integer> traversal = new ArrayList<Integer>(); 
       inOrder(root,traversal);

       return traversal; 
    }
    public void inOrder(TreeNode node, List<Integer> list){
        if(node == null){
            return;
        }
        inOrder(node.left, list);
        list.add(node.val);
        inOrder(node.right, list);
    }
	
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
