// Time Complexity :O(n)
// Space Complexity : O(h) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    TreeNode parent_x;
    TreeNode parent_y;
    int depth_x;
    int depth_y;
    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root,null,x,y,0);
      return parent_x != parent_y  && depth_x == depth_y;
    }
    
    private void dfs(TreeNode root,TreeNode parent, int x, int y, int depth){
        //base condition
        if(root ==null) return;
        
        //logic
        
        if(root.val == x)  { 
            parent_x = parent;
            depth_x = depth;
        }
        
         if(root.val == y)   { 
            parent_y = parent;
            depth_y = depth;
        }
    
    dfs(root.left,root,x,y,depth+1);
    dfs(root.right,root,x,y,depth+1);

    }
    
    
}