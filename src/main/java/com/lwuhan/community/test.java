package com.lwuhan.community;




import java.util.*;
import java.util.Map.Entry;

/**
 * @Auther: wuhan
 * @Date: 2019/8/17 11:20
 * @Description:
 */
public class test {


    public static void main(String[] args) {
        HashMap<Integer, User> users = new HashMap<>();
        users.put(1, new User("张三",25));
        users.put(3, new User("李四",22));
        users.put(2, new User("王五",28));

        HashMap<Integer, User> sortHashMap = sortHashMap(users);
        System.out.println(sortHashMap);
    }

    private static HashMap<Integer, User> sortHashMap(HashMap<Integer, User> map) {
        //拿到Map的键值对的集合
        Set<Entry<Integer, User>> entrySet = map.entrySet();

        //把集合转换为list
        List<Entry<Integer, User>> list = new ArrayList<Entry<Integer, User>>(entrySet);

        // 使用 Collections 集合工具类对 list 进行排序,排序规则使用匿名内部类来实现
        Collections.sort(list, (o1, o2) -> {
            //按照要求根据 User 的 age 的倒序进行排
            return o2.getValue().getAge()-o1.getValue().getAge();
        });

        //创建一个新的有序的 HashMap 子类的集合
        LinkedHashMap<Integer, User> linkedHashMap = new LinkedHashMap<Integer, User>();

        //将 List 中的数据存储在 LinkedHashMap 中
        for(Entry<Integer, User> entry : list){
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }
}
