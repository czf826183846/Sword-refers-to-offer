//先遍历二叉树，直至A子树当前遍历到的节点与B子树根节点值相同
//判断结构是否相同
//考虑边界条件：输入子树A或B为空
import java.util.Stack;
public class Solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if((root1==null)||(root2==null)) return false;//边界条件1
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root1);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node != null){
                if(node.val == root2.val){
                    if(function(node,root2)) return true;
                }
                if(node.right!=null) stack.push(node.right);
                if(node.left!=null)stack.push(node.left);
            }
        }
        return false;
    }
    public boolean function(TreeNode node,TreeNode root2){
        if(root2 == null) return true;//边界条件
        if(node == null) return false;//边界条件，有可能根值相同，但A子树左子树或右子树为空，而B子树均不为空，则空指针。
        if(node.val != root2.val) return false;
        return function(node.left,root2.left)&&function(node.right,root2.right);
    } 
}

//别人家的方法
public class Solution {
    public boolean HasSubtree(TreeNode pRootA,TreeNode pRootB) {
        if (pRootA == null || pRootB == null) return false;
        return isSubtree(pRootA, pRootB) || HasSubtree(pRootA.left, pRootB) || HasSubtree(pRootA.right, pRootB);
    }
    public boolean isSubtree(TreeNode pRootA,TreeNode pRootB){
        if (pRootB == null) return true;
        if (pRootA == null) return false;
        if (pRootB.val == pRootA.val) {
            return isSubtree(pRootA.left, pRootB.left) && isSubtree(pRootA.right, pRootB.right);
        } else return false;
    } 
}
