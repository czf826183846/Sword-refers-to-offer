//中序遍历至最左子树也即最小值，二叉搜索树的中序遍历结果即为已排好序的序列
import java.util.Stack;
public class Solution {
    public TreeNode Convert(TreeNode root) {
        if(root ==  null) return null;
        TreeNode curr = root;
        TreeNode prev = null;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        boolean flag = true;
        while(curr!=null||!stack.isEmpty()){
            while(curr!=null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            if(flag){
                root = curr;
                prev = curr;
                flag = false;
            }
            else{
                prev.right = curr;
                curr.left = prev;
                prev = curr;
            }
            curr = curr.right;
        }
        return root;
    }
}
