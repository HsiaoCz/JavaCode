## java 集合框架

java 的集合框架主要分为两大支线

- Collection，主要由 List、Set、Queue 组成，List 代表有序、可重复的集合，典型代表就是封装了动态数组的 ArrayList 和封装了链表的 LinkedList；Set 代表无序、不可重复的集合，典型代表就是 HashSet 和 TreeSet；Queue 代表队列，典型代表就是双端队列 ArrayDeque，以及优先级队列 PriorityQueue。

- Map，代表键值对的集合，典型代表就是 HashMap。

### 1、list

list 的特点是存取有序，可以存放重复的元素，可以用下标对元素进行操作

**arrayList**

基于数组的 list

- ArrayList 是由数组实现的，支持随机存取，也就是可以通过下标直接存取元素
- 从尾部插入和删除元素会比较快捷，从中间插入和删除元素会比较低效，因为涉及到数组元素的复制和移动
- 如果内部数组的容量不足时会自动扩容，因此当元素非常庞大的时候，效率会比较低。

  **linkedList**

基于链表的 list

- LinkedList 是由双向链表实现的，不支持随机存取，只能从一端开始遍历，直到找到需要的元素后返回；
- 任意位置插入和删除元素都很方便，因为只需要改变前一个节点和后一个节点的引用即可，不像 ArrayList 那样需要复制和移动数组元素
- 因为每个元素都存储了前一个和后一个节点的引用，所以相对来说，占用的内存空间会比 ArrayList 多一些。

**Vector**

Vector 是线程安全的，像 get、set、add 这些方法都加了 synchronized 关键字，就导致执行执行效率会比较低

**Stack**

Stack 是 Vector 的一个子类，本质上也是由动态数组实现的，只不过还实现了先进后出的功能（在 get、set、add 方法的基础上追加了 pop「返回并移除栈顶的元素」、peek「只返回栈顶元素」等方法），所以叫栈。