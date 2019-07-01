package com.haiqiang.algorithm.LinkedList;

/**
 * @author haiqiang
 * @date 2019/7/1 20:58
 * 单向链表
 */
public class SingleLinkedList {
    private Object data;
    private SingleLinkedList node;

    public SingleLinkedList(Object data,SingleLinkedList node){
        this.data=data;
        this.node=node;
    }

    /**
     * 添加节点
     * @param linkedList 完整的父链表
     * @param node 需要添加的额、链表
     */
    public static void addNode(SingleLinkedList linkedList,SingleLinkedList node){
        if(linkedList==null){
           return;
        }
        if(linkedList.node==null){
            linkedList.node=node;
        }else {
            addNode(linkedList.node,node);
        }
    }

    /**
     * 删除节点
     * @param linkedList 完整的父链表
     * @param node 选择要删除的节点
     */
    public static void deleteNode(SingleLinkedList linkedList,SingleLinkedList node){
        if(linkedList==null){
           return;
        }
        if(linkedList.node==node){
            SingleLinkedList wrapNode=linkedList.node.node;
            linkedList.node=wrapNode;
        }else {
            deleteNode(linkedList.node,node);
        }
    }

    /**
     * 遍历节点
     * @param linkedList
     */
    public static void printAllNode(SingleLinkedList linkedList){
        if(linkedList!=null){
            System.out.println(linkedList.data);
            printAllNode(linkedList.node);
        }
    }

    public static void main(String[] args){
        SingleLinkedList linkedList=new SingleLinkedList("hello",null);
        SingleLinkedList node=new SingleLinkedList("world",null);
        addNode(linkedList,node);
        printAllNode(linkedList);
        deleteNode(linkedList,node);
        printAllNode(linkedList);
    }
}
