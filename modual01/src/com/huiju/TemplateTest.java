package com.huiju;

import java.util.ArrayList;

/**
 * @author shkstart
 * @date 2019/2/6 2:11
 */
public class TemplateTest {

    //prsf
    private static final String yy="yy";

    // psf

    public static final int t=0;

    //psfi
    public static final int t1=2;
    //psfs
    public static final String  str="stt";


    //psvm
    public static void main(String[] args) {

        System.out.printf("heelowrod");
        System.out.println("args = [" + args + "]");
        System.out.println("TemplateTest.main");
        System.out.println("args = " + args);
    }


    public   void main1(String[] args) {

        System.out.printf("heelowrod");
        //soutm
        System.out.println("TemplateTest.main1");
        

        //soutv
        int num1=10,num=20;
        System.out.println("num1 = " + num1);
        System.out.println("num = " + num);
        System.out.println("num = " + num);


        String[] arr=new String[]{"dd","dd1","ee"};

        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println("s = " + s);
        }

        //fori
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

        //list.for

        ArrayList list=new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        //list.for
        for (Object o : list) {
            System.out.println("o = " + o);

        }

        //list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }

        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }



    }

    public   void main2(String[] args) {
        System.out.println("TemplateTest.main2");

        ArrayList list=new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        //ifn
        if (list == null) {

        }


        //inn
        if (list != null) {

        }

        //list.nn
        if (list != null) {

        }

        //list.null
        if (list == null) {

        }

        //prsf

    }
    
}
