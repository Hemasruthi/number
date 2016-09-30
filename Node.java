/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.tree.TreeNode;

/**
 *
 * @author Student
 */
public class Node{

    /**
     * @param args the command line arguments
     */
  


public static void main(String[] args)
{
public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
    ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> nodeValues = new ArrayList<Integer>();
    if(root == null)
        return al;
 
    LinkedList<TreeNode> current = new LinkedList<TreeNode>();
    LinkedList<TreeNode> next = new LinkedList<TreeNode>();
    current.add(root);
 
    while(!current.isEmpty()){
        TreeNode node = current.remove();
 
        if(node.left != null)
            next.add(node.left);
        if(node.right != null)
            next.add(node.right);
 
        nodeValues.add(node.val);
        if(current.isEmpty()){
            current = next;
            next = new LinkedList<TreeNode>();
            al.add(nodeValues);
            nodeValues = new ArrayList();
        }
 
    }
    return al;
}
}
    }

