package com.company;

public class Main {
    public static void main(String[] args) {
        one();
        System.out.println("--");
        two();
        System.out.println("--");
        three();
        five();
        test test1 = new test();
        test.ee();
    }
    public static void one(){
        int lol []= new int[10];
        for(int i=0;i< lol.length;i++){
            lol[i]=i;
        }
        for(int i=0;i< lol.length;i++){
            System.out.println(lol[i]);
        }
    }
    public static void two(){
        int lol2[][]=new int[10][10];
        for(int i=0;i<lol2.length;i++){
            for(int j=0;j<lol2.length;j++){
                lol2[i][j]=i*j;
            }
        }
        for(int i=0;i<lol2.length;i++){
            for(int j=0;j<lol2.length;j++){
                System.out.println(lol2[i][j]);
            }
        }
    }
    public static void three(){
        int a=10;
        int b=47;
        System.out.println(~a);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(~a));
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(a>>b);
        System.out.println(a>>>b);
        System.out.println(a<<b);

    }
    public static void four(){
        if(true||false){
            System.out.println("lol");
        }
        if(true&&false){
            System.out.println("lol");
        }

        int test= 1>2 ? 3 : 5;
    }
    public static void five(){
        int w = 0;
        while(w<9){
            System.out.println("00==00");
            w++;
        }
        do{
            System.out.println("-----");
        }while(w<1);
        int g=5;
        switch (g){
            case 4: System.out.println("lololo");break;
            case 5:System.out.println("lolo6666666");break;
            default:System.out.println(" ttt");break;
        }

    }
}


