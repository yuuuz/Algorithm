package jianzhi_offer.tree;

import java.util.Arrays;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 *
 * 思路：根结点为前序遍历的第一个数，在中序遍历中找到这个数的下标i，
 *       则中序遍历0~i-1的i个元素为左子树的中序遍历，前序遍历的1~i的i个元素为左子树的前序遍历
 *       中序遍历i+1到最后一个元素为右子树的中序遍历，前序遍历的+1到最后一个元素为右子树的前序遍历
 *       递归
 */
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
        //[from,to)
        node.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1, i+1), Arrays.copyOfRange(in, 0, i));
        node.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i + 1,in.length));
        return node;
    }
}
