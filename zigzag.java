

public class zigzag {
    public  int height(Node root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        return 1+Math.max(height(root.left), height(root.right));
     }
     public  void nthlevel(Node root, int n,  ArrayList<Integer> arr){
    if(root==null) return;
    if(n==1) {arr.add(root.data);
    return;
    }
    nthlevel(root.left, n-1, arr);
    nthlevel(root.right, n-1, arr);
    }
     public void nthlevel2(Node root, int n,  ArrayList<Integer> arr){
    if(root==null) return;
    if(n==1) {arr.add(root.data);
    return;
    }
    nthlevel2(root.right, n-1, arr);
    nthlevel2(root.left, n-1, arr);
    
    }
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    //Add your code here.
	     int level=height(root)+1;
	      ArrayList<Integer> arr=new ArrayList<>();
        if(root==null) return arr;
        for(int i=1;i<=level;i++){
            if(i%2!=0) nthlevel(root, i, arr);
            else nthlevel2(root, i, arr);
        }
        return arr;
	}
}

