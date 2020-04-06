package javatest.collection.hashmap;

public class sixeight {
    /**
     * 16是初始大小
     * 8成长为红黑树
     * 6降级为链表
     *
     * 为什么阈值是8，红黑树转链表阈值为6
     *
     * 在hash函数设计合理的情况下，发生hash碰撞8次的几率为百万分之6，概率说话。。因为8够用了，
     * 至于为什么转回来是6，因为如果hash碰撞次数在8附近徘徊，会一直发生链表和红黑树的互相转化，为了预防这种情况的发生，设置为6。
     */
    /**
     * 初始大小16 （扩容因子，0.75即16*0.75 =12，hashmap就要扩容了，*2）
     * 1 减少hash碰撞
     * 2 提高map查询效率
     * 3 分配过小防止频繁扩容
     * 4 分配过大浪费资源
     * https://blog.csdn.net/zhucegemingzizheng/article/details/81289479 详细论证
     */

}
