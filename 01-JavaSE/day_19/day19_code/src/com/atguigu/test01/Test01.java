package com.atguigu.test01;

/*
 * 数据结构  物理结构与逻辑结构
 * 1、数据的存储：
 * （1）变量
 * 简单类型的变量：
 * int a = 10;
 * String str = "hello";
 * char c = 'a';
 * 复杂类型的变量：
 * int[] arr = {1,2,3,4};
 * 变量 数组 复杂类型的变量
 * （2）数组
 * 存储一组数据
 * 这组数据可以是基本数据类型，也可以是对象。
 * int[] arr = {1,2,3,4};
 * Student[] arr = new Student[3];
 * arr[0] = new Student("张三",23);
 * 一组对象 好几个
 * 数组的特点：
 * ①长度是固定的
 * ②需要额外的变量来记录数组的有效元的个数，例如：total
 * 实际存储了多少个
 * 对于程序员来说：
 * 如果要扩容等，或者要维护元素的个数，都需要大量的工作。移动、复制
 *
 * （3）其他容器：集合
 * 每一种集合都有自己的特点，适用于特定的类型
 *
 * 2、数据存储的物理结构
 * （1）连续的存储空间：数组
 * 元素是相邻的，在内存中需要开辟的连续的存储空间
 * 缺点：内存比较吃紧时，找一整块空间不好找
 * 优点：访问速度比较快，因为有了首地址，然后根据下标，直接就可以找到对应的元素
 * （2）非连续的存储空间：链式
 * 元素不一定是相邻的，在内存中不需要开辟的连续的存储空间
 * 缺点：访问速度相对数组比较慢，要从头，挨个遍历
 * 优点：不要求空间连续，可以插空
 *
 * 链式中：
 * 线性：链表
 * 非线性：树
 *
 * 分为线性和非线性：
 * 线性：数组、链表、队列（数组或链表）、栈（数组或链表）
 * 非线性：树（二叉树等）、图...
 * 树、图
 * 数据结构：
 * 数组、单向链表、双向链表、二叉树、队列、栈、图....
 *
 * 数据的存储结构会影响程序的性能。
 * 数据结构也是算法的基础。
 *
 * 单链表节点：
 * class Node{
 * 	 Object data;
 * 	 Node next;//下一个节点
 * }
 *
 * 双链表节点：
 * class Node{
 * 	 Node pre;//前节点
 * 	 Object data;
 * 	 Node next;//后节点
 * }
 * 查找快 节点两个分支
 * 二叉树节点：
 * class TreeNode{
 * 	 TreeNode parent;父节点
 * 	 Object data;
 * 	 TreeNode left;//左节点
 * 	 TreeNode right;//右节点
 * }
 * 链式结构  地址
 * 数组  只管数据  首地址 计算
 */
public class Test01 {
    public static void main(String[] args) {

    }
}
