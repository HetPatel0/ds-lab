
// q 77 and 78 both are included here
class Node{
    int data;
    Node left;
    Node right;

    public Node (int data ) {
        this.data = data;
        left = null;
        right = null;
        
    }
}


public class Q77 {
    public static void inorder(Node root ) {
        if (root == null) {
            return;
        }
      
       inorder(root.left);
       System.out.print(root.data +" ");
       inorder(root.right);
      

    }
    public static void preorder(Node root ) {
        if (root == null) {
            return;
        }
        System.out.print(root.data +" ");
       preorder(root.left);
       preorder(root.right);

    }
    public static void postorder(Node root ) {
        if (root == null) {
            return;
        }
      
       postorder(root.left);
       postorder(root.right);
       System.out.print(root.data +" ");

    }

    private static  Node createNodeUtil(Node root, int data ) {

        if(root== null) {
            return new Node(data);
        }
        else if(root.data>data) {
            root.left = createNodeUtil(root.left,data);
        }
        else{   
            root.right = createNodeUtil (root.right,data);
        }
        return root;
    }
    public static  boolean searchNode(Node root,int data) {
        if(root==null) {
            return false;
        }
        else if(data== root.data) {
            return true;
        }
        else if (data>root.data) {
            return searchNode(root.right ,data);

        }
        else{
            return searchNode(root.left,data);
        }

    }
// to be continued

    // public static void deleteNode(Node root,int data) {
        
    // }


    public static  Node createNode(int[] a){
        Node root = new Node(a[0]);
        for(int i=1;i<a.length;i++) {
            createNodeUtil(root,a[i]);
        }
       
        return root;
    }
    public static void main(String[] args) {
        
        int a[] = {55,34,66,33,22,46,89};
       
        Node root = createNode(a);
        inorder(root);  
        // preorder(root);
        // postorder(root);
        System.out.println(searchNode(root,34));
        
       
    }
}
