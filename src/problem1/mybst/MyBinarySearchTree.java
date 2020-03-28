/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree
{
    TreeNode root;

    public TreeNode getRoot()
    {
        return root;
    }

    public void insert(int data)
    {
        TreeNode node= new TreeNode(data);
        if(root == null)
        {
            root=node;
        }
        else
        {
            TreeNode temp=root;
            TreeNode parent=null;
            while( temp != null)
            {
                parent=temp;
                if( data<= temp.getData())
                {
                    temp=temp.getLeft();
                }
                else
                {
                    temp=temp.getRight();
                }
            }
            if(node.getData()<= parent.getData())
            {
                parent.setLeft(node);
            }
            else
            {
                parent.setRight(node);
            }
        }
    }

    public void preOrderTraverse()
    {
        preOrder(root);
    }

    void preOrder(TreeNode node)
    {
        if(node != null)
        {
            System.out.print(node.getData()+" ");
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    public void postOrderTraverse()
    {
        postOrder(root);
    }

    void postOrder(TreeNode node)
    {
        if(node != null)
        {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.print(node.getData()+" ");
        }
    }
}
