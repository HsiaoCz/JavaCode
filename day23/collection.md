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

### 3、queue

Queue，也就是队列，通常遵循先进先出（FIFO）的原则，新元素插入到队列的尾部，访问元素返回队列的头部。

**ArrayDeque**

从名字上可以看得出，ArrayDeque 是一个基于数组实现的双端队列，为了满足可以同时在数组两端插入或删除元素的需求，数组必须是循环的，也就是说数组的任何一点都可以被看作是起点或者终点

**LinkedList**

LinkedList 一般应该归在 List 下，只不过，它也实现了 Deque 接口，可以作为队列来使用。等于说，LinkedList 同时实现了 Stack、Queue、PriorityQueue 的所有功能。

换句话说，LinkedList 和 ArrayDeque 都是 Java 集合框架中的双向队列（deque），它们都支持在队列的两端进行元素的插入和删除操作。不过，LinkedList 和 ArrayDeque 在实现上有一些不同：

- 底层实现方式不同：LinkedList 是基于链表实现的，而 ArrayDeque 是基于数组实现的。
- 随机访问的效率不同：由于底层实现方式的不同，LinkedList 对于随机访问的效率较低，时间复杂度为 O(n)，而 ArrayDeque 可以通过下标随机访问元素，时间复杂度为 O(1)。
- 迭代器的效率不同：LinkedList 对于迭代器的效率比较低，因为需要通过链表进行遍历，时间复杂度为 O(n)，而 ArrayDeque 的迭代器效率比较高，因为可以直接访问数组中的元素，时间复杂度为 O(1)。
- 内存占用不同：由于 LinkedList 是基于链表实现的，它在存储元素时需要额外的空间来存储链表节点，因此内存占用相对较高，而 ArrayDeque 是基于数组实现的，内存占用相对较低。

因此，在选择使用 LinkedList 还是 ArrayDeque 时，需要根据具体的业务场景和需求来选择。如果需要在双向队列的两端进行频繁的插入和删除操作，并且需要随机访问元素，可以考虑使用 ArrayDeque；如果需要在队列中间进行频繁的插入和删除操作，可以考虑使用 LinkedList

LinkedList

```java
// 创建一个 LinkedList 对象
LinkedList<String> queue = new LinkedList<>();

// 添加元素
queue.offer("沉默");
queue.offer("王二");
queue.offer("陈清扬");
System.out.println(queue); // 输出 [沉默, 王二, 陈清扬]

// 删除元素
queue.poll();
System.out.println(queue); // 输出 [王二, 陈清扬]

// 修改元素：LinkedList 中的元素不支持直接修改，需要先删除再添加
String first = queue.poll();
queue.offer("王大二");
System.out.println(queue); // 输出 [陈清扬, 王大二]

// 查找元素：LinkedList 中的元素可以使用 get() 方法进行查找
System.out.println(queue.get(0)); // 输出 陈清扬
System.out.println(queue.contains("沉默")); // 输出 false

// 查找元素：使用迭代器的方式查找陈清扬
// 使用迭代器依次遍历元素并查找
Iterator<String> iterator = queue.iterator();
while (iterator.hasNext()) {
    String element = iterator.next();
    if (element.equals("陈清扬")) {
        System.out.println("找到了：" + element);
        break;
    }
}

```

在使用 LinkedList 作为队列时，可以使用 offer() 方法将元素添加到队列的末尾，使用 poll() 方法从队列的头部删除元素。另外，由于 LinkedList 是链表结构，不支持随机访问元素，因此不能使用下标访问元素，需要使用迭代器或者 poll() 方法依次遍历元素。

**PriorityQueue**

PriorityQueue 是一种优先级队列，它的出队顺序与元素的优先级有关，执行 remove 或者 poll 方法，返回的总是优先级最高的元素

```java
// 创建一个 PriorityQueue 对象
PriorityQueue<String> queue = new PriorityQueue<>();

// 添加元素
queue.offer("沉默");
queue.offer("王二");
queue.offer("陈清扬");
System.out.println(queue); // 输出 [沉默, 王二, 陈清扬]

// 删除元素
queue.poll();
System.out.println(queue); // 输出 [王二, 陈清扬]

// 修改元素：PriorityQueue 不支持直接修改元素，需要先删除再添加
String first = queue.poll();
queue.offer("张三");
System.out.println(queue); // 输出 [张三, 陈清扬]

// 查找元素：PriorityQueue 不支持随机访问元素，只能访问队首元素
System.out.println(queue.peek()); // 输出 张三
System.out.println(queue.contains("陈清扬")); // 输出 true

// 通过 for 循环的方式查找陈清扬
for (String element : queue) {
    if (element.equals("陈清扬")) {
        System.out.println("找到了：" + element);
        break;
    }
}
```

要想有优先级，元素就需要实现 Comparable 接口或者 Comparator 接口

段通过实现 Comparator 接口按照年龄姓名排序的优先级队列吧

```java
import java.util.Comparator;
import java.util.PriorityQueue;

class Student {
    private String name;
    private int chineseScore;
    private int mathScore;

    public Student(String name, int chineseScore, int mathScore) {
        this.name = name;
        this.chineseScore = chineseScore;
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public int getChineseScore() {
        return chineseScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", 总成绩=" + (chineseScore + mathScore) +
                '}';
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // 比较总成绩
        return Integer.compare(s2.getChineseScore() + s2.getMathScore(),
                s1.getChineseScore() + s1.getMathScore());
    }
}

public class PriorityQueueComparatorExample {

    public static void main(String[] args) {
        // 创建一个按照总成绩排序的优先级队列
        PriorityQueue<Student> queue = new PriorityQueue<>(new StudentComparator());

        // 添加元素
        queue.offer(new Student("王二", 80, 90));
        System.out.println(queue);
        queue.offer(new Student("陈清扬", 95, 95));
        System.out.println(queue);
        queue.offer(new Student("小驼铃", 90, 95));
        System.out.println(queue);
        queue.offer(new Student("沉默", 90, 80));
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}
```

### 4、Map

Map 保存的是键值对，键要求保持唯一性，值可以重复

**HashMap**

HashMap 实现了 Map 接口，可以根据键快速地查找对应的值——通过哈希函数将键映射到哈希表中的一个索引位置，从而实现快速访问。后面会详细聊到。

- HashMap 中的键和值都可以为 null。如果键为 null，则将该键映射到哈希表的第一个位置。
- 可以使用迭代器或者 forEach 方法遍历 HashMap 中的键值对。
- HashMap 有一个初始容量和一个负载因子。初始容量是指哈希表的初始大小，负载因子是指哈希表在扩容之前可以存储的键值对数量与哈希表大小的比率。默认的初始容量是 16，负载因子是 0.75。

**LinkedHashMap**

HashMap 已经非常强大了，但它是无序的。如果我们需要一个有序的 Map，就要用到 LinkedHashMap。LinkedHashMap 是 HashMap 的子类，它使用链表来记录插入/访问元素的顺序。

LinkedHashMap 可以看作是 HashMap + LinkedList 的合体，它使用了哈希表来存储数据，又用了双向链表来维持顺序。

```java
// 创建一个 LinkedHashMap，插入的键值对为 沉默 王二 陈清扬
LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
linkedHashMap.put("沉默", "cenzhong");
linkedHashMap.put("王二", "wanger");
linkedHashMap.put("陈清扬", "chenqingyang");

// 遍历 LinkedHashMap
for (String key : linkedHashMap.keySet()) {
    String value = linkedHashMap.get(key);
    System.out.println(key + " 对应的值为：" + value);
}
```

**TreeMap**

TreeMap 实现了 SortedMap 接口，可以自动将键按照自然顺序或指定的比较器顺序排序，并保证其元素的顺序。内部使用红黑树来实现键的排序和查找。

```java

// 创建一个 TreeMap 对象
Map<String, String> treeMap = new TreeMap<>();

// 向 TreeMap 中添加键值对
treeMap.put("沉默", "cenzhong");
treeMap.put("王二", "wanger");
treeMap.put("陈清扬", "chenqingyang");

// 查找键值对
String name = "沉默";
if (treeMap.containsKey(name)) {
    System.out.println("找到了 " + name + ": " + treeMap.get(name));
} else {
    System.out.println("没有找到 " + name);
}

// 修改键值对
name = "王二";
if (treeMap.containsKey(name)) {
    System.out.println("修改前的 " + name + ": " + treeMap.get(name));
    treeMap.put(name, "newWanger");
    System.out.println("修改后的 " + name + ": " + treeMap.get(name));
} else {
    System.out.println("没有找到 " + name);
}

// 删除键值对
name = "陈清扬";
if (treeMap.containsKey(name)) {
    System.out.println("删除前的 " + name + ": " + treeMap.get(name));
    treeMap.remove(name);
    System.out.println("删除后的 " + name + ": " + treeMap.get(name));
} else {
    System.out.println("没有找到 " + name);
}

// 遍历 TreeMap
for (Map.Entry<String, String> entry : treeMap.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```

与 HashMap 不同的是，TreeMap 会按照键的顺序来进行排序
