package Day2;


import java.util.ArrayList;
import java.util.List;

/**
 * Date 02/07/2020
 * @author Aman Shivhare
 *
 * Source: https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 *
 */

public class Solution1 {

    private static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    private static void givenLevel(TreeNode node, int level, List<Integer> levelNodes){
        if(node == null){
            return;
        }
        if(level == 1){
            levelNodes.add(node.val);
            return;
        }

        givenLevel(node.left, level-1, levelNodes);
        givenLevel(node.right, level-1, levelNodes);
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        int height = height(root);
        List<List<Integer>> allLevels = new ArrayList<>();

        for(int i = height; i>0; i--){
            List<Integer> currentLevelNodes = new ArrayList<>();
            givenLevel(root, i, currentLevelNodes);
            allLevels.add(currentLevelNodes);
        }
        return  allLevels;
    }
}
