package com.day10.work2;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String,Integer> map=new HashMap();
        while (map.size()<5){
            System.out.println("请输入学生信息，录入格式：（姓名，年龄）");
            String sc=scanner.next();
            String[] strings=sc.split("，");
            Integer integers=Integer.parseInt(strings[1]);
            map.put(strings[0],integers);
        }
        Set<String> keys=map.keySet();
        for (String key:keys){
            System.out.print("键:"+key+",值:"+map.get(key)+"  ");
        }
        System.out.println(map);
//        for (int i = 0; i < map.size(); i++) {
//
//        }
//        Collections.sort(map,( a,b)->{
//            if (b.getV>map.get(b)){
//                return -1;
//            }else {
//                return 1;
//            }
////        });
//        map.entrySet().stream().sorted(Comparator.comparing(e->e.getValue())).forEach(System.out::println);
//        1.对map中的value进行倒序排序
//
//        map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach(System.out::println);
//        2.对map中的value进行正向排序

//        map.entrySet().stream().sorted(Comparator.comparing(e->e.getValue())).forEach(System.out::println);

//        map.entrySet().stream().sorted(Comparator.comparing(e->e.getValue())).forEach(System.out::println);

        Set<Map.Entry<String,Integer>> mapEntries = map.entrySet();
        //使用链表来对集合进行排序，使用LinkedList，利于插入元素
        List<Map.Entry<String, Integer>> result = new LinkedList<>(mapEntries);
        //自定义比较器来比较链表中的元素
        Collections.sort(result,(o1,o2) ->{
                return o1.getValue()-(o2.getValue()) ;
            });
        System.out.println(result);
        System.out.println("最大年龄为："+((LinkedList) result).getLast());
//        for (int i = 0; i < result.size(); i++) {
//            result.get(i);
//        }

//        List<Integer> mapkey = new ArrayList(map.keySet());
//        Set map1=result.keySet();
//        System.out.println("最大年龄为："+map.get(map1.size()-1));
////        平均年龄：
//        for (int i = 0; i < map.size(); i++) {
//            System.out.println(map.get(i));
//        }

    }
}
