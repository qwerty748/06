package com.guigu.java;

import java.util.ArrayList;

/**
 * @author shkstart
 * @create 2021-08-01 19:22
 */
public class TemplatesTest {


    /**
     * 1.idea中模板的位置
     * 2.常用的模板
     *   psvm
     *   sout
     *   soutp  soutm soutv xxx.out
     * 3.fori
     *   变形iter增强

     *      itar
     * 4.list.for
     * 5.
     *
     *
     */
    public static final int a=1;
    public static void main(String[] args) {
        //模板6 prsf         private static final  psf  psfi  psfs

        System.out.println();
        System.out.println("args = [" + args + "]");//参数的打印
        System.out.println("TemplatesTest.main");//函数名字的打印
        int number=10;
        int v2=12;
        System.out.println("v2 = " + v2);//就近选择变量


        System.out.println(number);
        System.out.println(v2);
        String[] arr=new String[]{"nihao ","jdgfh","jdfousahfya"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }
        ArrayList list=new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        list.add(101112);
        //list.for
        //list.fori
        //list.forr
        for (Object o : list) {

        }
        for (int i = 0; i < list.size(); i++) {

        }
        for (int i = list.size() - 1; i >= 0; i--) {

        }
        //模板5   ifinn  ifn  inn xxx.nn   xxx.null
        if (list == null) {
        }
        if (list != null) {

        }
        if (list == null) {

        }
        if (list != null) {

        }

    }




}
