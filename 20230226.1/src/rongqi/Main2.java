package rongqi;

import java.util.*;

@SuppressWarnings({"all"})
public class Main2 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> two = new HashMap<>();
        //增加
        map.put("key", 123);
        map.putAll(two); //将指定map复制到此map（可选操作）。
        //删除
        map.clear(); //删除所有的映射（可选操作）。
        map.remove("key"); //如果存在，从该地图中删除一个键的映射。
        map.remove("key", 159); //删除符合的键值对
        //查找
        map.containsKey("key"); //如果此映射包含指定键的映射，则返回 true 。
        map.containsValue("value"); //如果此地图将一个或多个键映射到指定的值，则返回 true 。
        map.entrySet(); //返回包含映射的Set集合,返回类型 Set<Map.Entry<K,V>>
        map.get("key"); //返回指定键所映射的值，如果没有此键则返回null
        map.getOrDefault("key", 456);
        // 返回指定键所映射的值，如果没有则返回设置的默认值。
        map.keySet(); //返回包含的键的Set集合。Set<K>
        map.values(); //返回包含的值的Collection集合。 Collection<V>
        //替换
        map.replace("key", 456); //找到指定的键，修改并返回原来的值。
        map.replace("key", 123, 789); //找到key为key，值为123的，才将123修改为789。否则不修改。
        //其他
        map.isEmpty(); //如果不包含键值映射，则返回 true 。
        map.equals("156"); //将指定的对象与此映射进行比较
        map.putIfAbsent("key", 789); //如果指定的键尚未与某个值相关联（或映射到 null ）,则将其与给定值相关联并返回 null ，如果已经有关联的值，则返回。
        map.size(); //键值对的数量
    }

    public static void main2(String[] args) {
        Set<Integer> ttf = new TreeSet<>();
        Set<Integer> two = new TreeSet<>();
        //增加
        ttf.add(5); //单个增加
        ttf.addAll(two); //将集合two中的元素全部添加到ttf中
        //删除
        ttf.clear(); //删除所有元素
        ttf.remove(2); //删除指定元素
        ttf.removeAll(two); //删除ttf中存在于指定集合two中的元素

        //查找
        ttf.contains(2); //判断元素是否存在
        ttf.retainAll(two); //保留ttf中在指定集合two中也存在的那些元素
        ttf.containsAll(two);  //查看ttf是否包含指定集合two中的所有元素

        //其他操作
        ttf.isEmpty(); //判断ttf是否为空
        ttf.size(); //返回ttf里元素数量
        ttf.equals(two); //将指定的对象与此列表进行比较以获得相等性,当大小、内容全部相同返回true，否则返回false
        ttf.toArray(); //以正确的顺序（从第一个到最后一个元素）返回一个包含此列表中所有元素的数组,也可以指定返回数组的类型
    }


    public static void main1(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> two = new ArrayList<>();

        //增加
        list.add(5); //单个增加
        list.add(2, 9); //在指定位置2插入元素9
        list.addAll(two); //将集合two中的元素全部添加到list中
        list.addAll(3, two); //在指定位置将集合two中的元素全部添加到list中
        //删除
        list.clear(); //删除所有元素
        list.remove(2); //删除指定索引下标元素
        list.removeAll(two); //删除list中存在于指定集合two中的元素

        //查找
        list.lastIndexOf(5); //返回指定元素在 arraylist 中最后一次出现的位置
        list.contains(2); //判断元素是否存在
        list.retainAll(two); //保留list中在指定集合two中也存在的那些元素
        list.containsAll(two);  //查看list是否包含指定集合two中的所有元素
        list.indexOf(6); //返回list中元素的索引值
        list.get(6); //通过索引获取元素

        //替换
        list.set(2, 5); //替换list中指定索引为2的元素为5

        //其他操作
        list.isEmpty(); //判断list是否为空
        list.size(); //返回list里元素数量
        list.subList(2, 6); //通过索引截取部分list中的元素
        list.equals(two); //将指定的对象与此列表进行比较以获得相等性,当大小、内容全部相同返回true，否则返回false
        list.toArray(); //以正确的顺序（从第一个到最后一个元素）返回一个包含此列表中所有元素的数组,也可以指定返回数组的类型
    }
}
