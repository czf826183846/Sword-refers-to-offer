//采用队列，非递归
public static TreeNode Mirror(TreeNode root) {
		if(root==null||(root.left==null&&root.right==null)) return root;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			TreeNode cur = queue.poll();
			if(cur.left!=null&&(cur.left.left!=null||cur.left.right!=null)) queue.offer(cur.left);
			if(cur.right!=null&&(cur.right.left!=null||cur.right.right!=null)) queue.offer(cur.right);
			TreeNode temp = cur.left;
			cur.left = cur.right;
			cur.right = temp;
		}
		return root;
	}
  
  
//递归方法
public void Mirror(TreeNode root) {
		TreeNode temp;
        if(root!=null)
        {
        temp=root.left;
        root.left=root.right;
        root.right=temp;
        if(root.left!=null)
            Mirror(root.left);
        if(root.right!=null)
            Mirror(root.right);
        }
    }
