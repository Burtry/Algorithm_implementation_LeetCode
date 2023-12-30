package LeetCode.src.main.java.Text_algorithm.Node;

import JavaAlgo.src.main.java.Queue.QueueImpl.LinkListQueue;

public class LinkNode {

    /**
     * 链表节点类节点类
     * @param <E> 元素类型
     */
    private static class Node<E> {
        //保存值的属性
        E value;
        //指向下一节点
        Node<E> next;

        //有参构造
        public Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
    }
}
