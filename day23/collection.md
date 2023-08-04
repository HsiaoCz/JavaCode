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

### 2、set

Set 的特点是存取无序，不可以存放重复的元素，不可以用下标对元素进行操作，和 List 有很多不同

**HashSet**

HashSet 其实是由 HashMap 实现的，只不过值由一个固定的 Object 对象填充，而键用于操作

实际开发中，HashSet 并不常用，比如，如果我们需要按照顺序存储一组元素，那么 ArrayList 和 LinkedList 可能更适合；如果我们需要存储键值对并根据键进行查找，那么 HashMap 可能更适合。

当然，在某些情况下，HashSet 仍然是最好的选择。例如，当我们需要快速查找一个元素是否存在于某个集合中，并且我们不需要对元素进行排序时，HashSet 可以提供高效的性能。

**LinkedHashSet**

LinkedHashSet 虽然继承自 HashSet，其实是由 LinkedHashMap 实现的
LinkedHashSet 是一种基于哈希表实现的 Set 接口，它继承自 HashSet，并且使用链表维护了元素的插入顺序。因此，它既具有 HashSet 的快速查找、插入和删除操作的优点，又可以维护元素的插入顺序

**TreeSet**

TreeSet 是由 TreeMap（后面会讲） 实现的，只不过同样操作的键位，值由一个固定的 Object 对象填充

TreeSet 是一种基于红黑树实现的有序集合，它实现了 SortedSet 接口，可以自动对集合中的元素进行排序。按照键的自然顺序或指定的比较器顺序进行排序

```java
// 创建一个 TreeSet 对象
TreeSet<String> set = new TreeSet<>();

// 添加元素
set.add("沉默");
set.add("王二");
set.add("陈清扬");
System.out.println(set); // 输出 [沉默, 王二, 陈清扬]

// 删除元素
set.remove("王二");
System.out.println(set); // 输出 [沉默, 陈清扬]

// 修改元素：TreeSet 中的元素不支持直接修改，需要先删除再添加
set.remove("陈清扬");
set.add("陈青阳");
System.out.println(set); // 输出 [沉默, 陈青阳]

// 查找元素
System.out.println(set.contains("沉默")); // 输出 true
System.out.println(set.contains("王二")); // 输出 false
```

需要注意的是，TreeSet 不允许插入 null 元素，否则会抛出 NullPointerException 异常

集合的底层都是由 Map 实现的，为什么要用 map 呢?
因为 map 的键不允许重复，且无序
