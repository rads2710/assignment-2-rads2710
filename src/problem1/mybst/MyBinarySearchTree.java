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
    int count;
    public MyBinarySearchTree()
    {
        this.root = null;
        count=0;
    }

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

    private void LeftNode(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        else {
            if(root.getLeft()!=null)
            {
                System.out.println(root.getLeft().getData());
            }
            else {
                count++;
            }
            LeftNode(root.getLeft());
            LeftNode(root.getRight());
        }
    }

    public void printLeftNode()
    {
        LeftNode(root);
    }

    public void countNotLeft()
    {
        System.out.println(count);
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
