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
    public void addNode(SingleLinkedList linkedList,SingleLinkedList node){
        if(linkedList==null){
            linkedList=node;
        }else {
            addNode(linkedList.node,node);
        }
    }

    /**
     * 删除节点
     * @param linkedList 完整的父链表
     * @param node 选择要删除的节点
     */
    public void deleteNode(SingleLinkedList linkedList,SingleLinkedList node){
        if(linkedList==node){
            linkedList=linkedList.node;
        }else {
            deleteNode(linkedList.node,node);
        }
    }

    /**
     * 遍历节点
     * @param linkedList
     */
    public void printAllNode(SingleLinkedList linkedList){
        if(linkedList!=null){
            System.out.println(linkedList.data);
            printAllNode(linkedList.node);
        }
    }
}
