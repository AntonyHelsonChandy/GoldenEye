package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        /*
        List<Persion> obj=new ArrayList<>() ;
        obj.add(new Persion("antony",56));
        obj.add(new Persion("helson",23));

       obj.stream().filter(persion -> persion.age>30).collect(Collectors.toList()).forEach((x->System.out.println(x.name)));
obj.stream()
        // write your code here




 */
      List<String> obj=new ArrayList<>();


      obj.add("AIB_SIM_500_001_002");
      obj.add("AIB_SIM_500_002_002");

obj.stream().filter(x->fun(x)).collect(Collectors.toList());



    }
    public static boolean xfun(String x){
        return"f";
    }
}
class Persion{
    String name;
    int age;

    public Persion(String name, int i) {
        this.name=name;
        this.age=i;
    }
}