package com.haiqiang.algorithm.Tree;

/**
 * @author haiqiang
 * @date 2019/6/29 21:34
 * 描述：二叉树实现
 */
public class BinaryTree {

    /**
     * 节点
     */
    private class Node{
        private Object data;
        private Node left;
        private Node right;
        public  Node(Object data,Node left,Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    /**
     * 前序遍历
     */
    public void preorderPrint(Node node){
        if(node!=null){
            System.out.println(node.data);
            preorderPrint(node.left);
            preorderPrint(node.right);
        }
    }

    /**
     * 中序遍历
     */
    public void middleOrder(Node node){
        if(node!=null){
            middleOrder(node.left);
            System.out.println(node.data);
            middleOrder(node.right);
        }
    }

    /**
     * 后序遍历
     */
    public void postOrder(Node node){
        if(node!=null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.data);
        }
    }

    /**
     * 添加节点
     */
    public void addNode(Node binaryTree,Node node){
        if(binaryTree.left==null){
            binaryTree.left=node;
        }else if(binaryTree.right==null){
            binaryTree.right=node;
        }else {
            addNode(binaryTree,node);
        }
    }

    /**
     * 删除节点
     */
    public void deleteNode(Node binaryTree,Node node){
        if(binaryTree.left==node){

        }
    }
}
