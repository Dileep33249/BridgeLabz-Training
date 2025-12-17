
class Solution {
    
    public TreeNode balanceBST(TreeNode root) {
       
        int totalNodes = countNodes(root);
        
        
        int[] arr = new int[totalNodes];
        
      
        helper(root, arr, 0);
        

        return helper2(arr, 0, arr.length - 1);
    }
    
    private int countNodes(TreeNode root) {
        if (root == null) return 0;
        
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    
   
    private int helper(TreeNode root, int[] arr, int index) {
        if (root == null) return index;
        
        index = helper(root.left, arr, index);
        arr[index++] = root.val;
        index = helper(root.right, arr, index);
        
        return index;
    }
    
    private TreeNode helper2(int[] arr, int st, int en) {
        if (st > en) {
            return null;
        }
        
        int mid = st + (en - st) / 2;
        TreeNode root = new TreeNode(arr[mid]);
        
        root.left = helper2(arr, st, mid - 1);
        root.right = helper2(arr, mid + 1, en);
        
        return root;
    }
}