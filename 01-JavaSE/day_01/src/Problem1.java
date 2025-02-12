/**
 * 问题1：乱码问题
 * @author Liu Awen
 * @create 2018-05-06 21:02
 */
/*
问题1：乱码问题

1、原因
计算机的世界中只有0和1，
人类世界中字符是很丰富的。
计算机很笨的  他只会计算  算天算底算自己
最早人类使用计算机时，硬件机器语言，00000011100001111
后来，为了使用计算机的人方便，开始引入了助记符等，可以表示更丰富的字符等信息
		ASCII码：数字十进制的65表示字符A，计算机底层把65十进制再转为二进制
		最早ASCII码只能表示128字符
		97a  数字0呢 48   数字9呢 57
		一位  七位  8位 一个字节
后来计算机不仅仅在美国了，会流传到其他国家。
		各个国家在ASCII码基础上扩展了128个，变成256个了，但是后面扩展的128个不具有通用性。
甚至计算机传入亚洲，就开始出现多字节编码，
		例如：中国GB2312，后来的GBK，台湾等地区Big5等
		多字节编码
越来越多的字符编码出现，但是各国之间的文档交流出现问题。

计算机希望在全世界范围能够无障碍的交流，开始引入万国码，Unicode编码表，
这个编码表，可以用它的规则表示全世界所有的字符，每一个字符都有自己唯一的编码。
规则 1xxx 11xxx 111xxx 1111xxx   编码解码
Unicode编码表只说了，字符用什么数字表示，但是这个数字范围跨度很大，有
1个字节的，2个字节的，3个字节的，4个字节等，在网络传输中出现问题，
例如，我收到4个字节的数据时，该表示为4个字符呢还是1个字符呢，
后面为了解决传输的问题，出现了UTF-8等编码方式，规定了，
到底几个字节是一个字符。

不同的编码方式对同一组数据解析出来的字符是不同的
编码
2、如何解决
统一编码

修改当前源文件的字符编码：
方式一：【编码】菜单--》转为ANSI（与当前操作系统一致）编码
我的操作系统 中文、英文

如果希望之后建立的源文件，都是与ANSI编码一致的，那么可以这样做：
方式：【设置】菜单-->【首选项】--》【新建】--》[ANSI]编码
原来我打开老师的文件 是乱码的   notepad++ 设置了编码
我用utf-8 去解析GBK  乱码
*/
class Problem1{
    public static void main(String[] args){
        System.out.println("柴林燕是大美女！");
    }
}