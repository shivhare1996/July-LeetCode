package Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Date 02/07/2020
 * @author Aman Shivhare
 *
 * Source: https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 *
 */


public class Solution2 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> allLevels = new ArrayList<>();
        Queue<TreeNode> pipe = new LinkedList<>();
        if(root!=null) pipe.add(root);
        while(!pipe.isEmpty()){
            int size = pipe.size();
            List<Integer> level = new ArrayList<>();
            while(size!=0){
                TreeNode node = pipe.poll();
                if(node.left != null) pipe.add(node.left);
                if(node.right != null) pipe.add(node.right);
                level.add(node.val);
                size--;
            }
            allLevels.add(level);
        }
        Collections.reverse(allLevels);
        return allLevels;
    }
}
