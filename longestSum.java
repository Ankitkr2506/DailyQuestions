import org.w3c.dom.Node;

public class longestSum {
     public int[] solve(Node root) {
        if (root == null) {
            return new int[]{0, 0};
        }

        int[] a = solve(root.left);
        int[] b = solve(root.right);

        if (a[0] > b[0]) {
            return new int[]{a[0] + 1, a[1] + root.data};
        } else if (a[0] < b[0]) {
            return new int[]{b[0] + 1, b[1] + root.data};
        } else {
            return new int[]{a[0] + 1, Math.max(a[1], b[1]) + root.data};
        }
    }
    public int sumOfLongRootToLeafPath(Node root)
    {
        //code here
        int[] ans=solve(root);
        return ans[1];
    }
}
