package bai2;

import java.util.*;
public class may_tinh {

    private static float num1,num2;

    public float cong(float num1,float num2){
        return num1+num2;
    }
    public float tru(float num1,float num2 ){
        return num1-num2;
    }
    public float nhan (float num1,float num2 ){
        return num1*num2;
    }

    public float chia(float num1,float num2){
        return num1/num2;
    }
public static void main(String []args){
        Scanner r = new Scanner(System.in);
    System.out.println("a= ");
    num1= r.nextFloat();
    System.out.println("b= ");
    num2= r.nextFloat();
       may_tinh main = new may_tinh();
    System.out.println("Hieu hai so la: " +main.tru(num1,num2));
    System.out.println("Tong hai so la:"+main.cong(num1,num2));
    System.out.println("Tich hai so la:"+main.nhan(num1,num2));
    System.out.println("Thuong hai so la:"+main.chia(num1,num2));

}

}
