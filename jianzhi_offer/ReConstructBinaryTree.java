package jianzhi_offer;

import java.util.Arrays;

/**
 * 2018/8/5 22:15
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }
public class ReConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre.length == 0 || in.length == 0){
            return null;
        }
        int val = pre[0];
        TreeNode node = new TreeNode(val);
        int i;
        for ( i = 0; i < in.length; i++){
            if (val == in[i]){
                break;
            }
        }
        node.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1, i+1), Arrays.copyOfRange(in, 0, i));
        node.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i + 1,in.length));
        return node;
    }
}
