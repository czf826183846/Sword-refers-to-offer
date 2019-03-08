//分为递归法和非递归法
//递归法
	public static int maxDepth(TreeNode root){
        if(root==null) return 0;
        return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
    }
//非递归法，对二叉树做层级遍历，记录层数即可
