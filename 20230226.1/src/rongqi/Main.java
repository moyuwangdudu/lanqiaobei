package rongqi;

import java.util.*;

@SuppressWarnings({"all"})
public class Main {
    //自定义比较器，降序排列
    static Comparator<Integer> cmp = new Comparator<Integer>() {
        public int compare(Integer e1, Integer e2) {
            return e2 - e1;
        }
    };
    public static void main(String[] args) {
        //不用比较器，默认升序排列
        Queue<Integer> q = new PriorityQueue<>();
        q.add(3);
        q.add(2);
        q.add(4);
        while(!q.isEmpty())
        {
            System.out.print(q.poll()+" ");
        }
        /**
         * 输出结果
         * 2 3 4
         */
        //使用自定义比较器，降序排列
        Queue<Integer> qq = new PriorityQueue<>(cmp);
        qq.add(3);
        qq.add(2);
        qq.add(4);
        while(!qq.isEmpty())
        {
            System.out.print(qq.poll()+" ");
        }
        /**
         * 输出结果
         * 4 3 2
         */
    }


    public static void main4(String[] args) {
        Queue<String > queue = new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        queue.offer("E");
        for (String q : queue) {
            System.out.println(q);
        }
        System.out.println("====");
        System.out.println("poll=" + queue.poll());
        for (String q : queue) {
            System.out.println(q);
        }
        System.out.println("====");
        System.out.println("peek=" + queue.peek());
        for (String q : queue) {
            System.out.println(q);
        }
    }

    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> vs = new Vector<>();
        vs.add("aaaaaaaa");
        vs.add("bbbbbbbb");
        vs.add("ccc");
        vs.add("14654");
        System.out.println("元素总共有：" + vs.size());
        System.out.println("for遍历输出:");
        for (int i = 0; i < vs.size(); i++) {
            System.out.println(vs.get(i));
        }
        System.out.println("====================");
        System.out.println("迭代器遍历输出：");
        Iterator<String> it = vs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("====================");
        System.out.println("Enumeration遍历输出:");
        Enumeration<String> es = vs.elements();
        while (es.hasMoreElements()) {
            System.out.println(es.nextElement());
        }

        System.out.println("删除元素");
        vs.remove("ccc");
        System.out.println(vs.remove(0));
        System.out.println("删除后元素总共有：" + vs.size());
    }

    public static void main2(String[] args) {
        // empty()测试此堆栈是否为空。
        // peek()查看栈顶元素。
        // pop()删除栈顶元素，并将该元素作为返回值返回。
        // push(E item)添加元素到堆栈的顶部。与addElement(item)效果完全相同。
        // search(Object o)返回一个对象在此堆栈上的基于1的位置。
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        System.out.println(s.empty() ? "是空的" : "不是空的");
        System.out.println("现在Stack的大小：" + s.size());
        System.out.println("输入第一个元素：");
        int a = sc.nextInt();
        s.push(a);
        System.out.println(s.empty() ? "是空的" : "不是空的");
        System.out.println("现在Stack的大小：" + s.size());
        System.out.println("输入第二个元素：");
        int b = sc.nextInt();
        s.push(b);
        System.out.println(s.empty() ? "是空的" : "不是空的");
        System.out.println("现在Stack的大小：" + s.size());
        System.out.println("输入第三个元素：");
        int c = sc.nextInt();
        s.push(c);
        System.out.println(s.empty() ? "是空的" : "不是空的");
        System.out.println("现在Stack的大小：" + s.size());

        System.out.println("Stack中的元素有：");
        while (!s.empty()) {
            System.out.println(s.peek());
            System.out.println("删除了： " + s.pop());
        }
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Map.Entry
        // getKey()
        // getValue()
        // setValue(V value)

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("c", 3);
        linkedHashMap.put("a", 1);
        linkedHashMap.put("b", 2);
        linkedHashMap.put("d", 4);
        Set<Map.Entry<String, Integer>> ent = linkedHashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> it = ent.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> mid = it.next();
            System.out.println(mid.getKey());
            System.out.println(mid.getValue());
            mid.setValue(23);
        }
        System.out.println("修改后:");
        Iterator<Map.Entry<String, Integer>> it2 = ent.iterator();
        while (it2.hasNext()) {
            Map.Entry<String, Integer> mid = it2.next();
            System.out.println(mid.getKey());
            System.out.println(mid.getValue());
        }
    }
}
