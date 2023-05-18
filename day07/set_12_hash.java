package day07;

import java.util.HashSet;

public class set_12_hash {
    public static void main(String[] args) {

        // hashset底层数据结构时链表加数组
        // hashset 保存重复数据
        HashSet<User11> set = new HashSet<>();
        User11 user1 = new User11();
        user1.id = 1222;
        user1.name = "zhangsan";
        System.out.println(user1.hashCode());
        User11 user2 = new User11();
        user2.id = 1222;
        user2.name = "zhangsan";
        System.out.println(user2.hashCode());
        User11 user3 = new User11();
        user3.id = 1222;
        user3.name = "zhangsan";
        System.out.println(user3.hashCode());
        set.add(user1);
        set.add(user2);
        set.add(user3);
    }
}

class User11 {
    public int id;
    public String name;

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    // 判断两个类的属性是否完全相等
    public boolean equals(Object obj) {
        if (obj instanceof User11) {
            User11 otheruser = (User11) obj;
            if (otheruser.id == this.id) {
                if (otheruser.name.equals(this.name)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    public String toString() {
        return "User[" + id + "," + name + "]";
    }
}