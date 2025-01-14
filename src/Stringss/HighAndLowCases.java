package Stringss;

import java.util.ArrayList;
import java.util.List;

public class HighAndLowCases {

    public static void main(String[] args) {
        List<String> arr=new ArrayList<>();
//        Integer
        lowAndHigh("a1b2","",arr);
        System.out.println(arr);
        System.out.println("c"+(char)('a'-32));

    }

    static void lowAndHigh(String og, String up, List<String> arr){
        if(og.isEmpty()){
            arr.add(up);
            return;
        }
        if(og.charAt(0)>=48 && og.charAt(0)<=57){
            lowAndHigh(og.substring(1),up+og.charAt(0),arr);

        }else {if(og.charAt(0)>=48 && og.charAt(0)<=57) {
            char c=(char)(og.charAt(0)-32);
            lowAndHigh(og.substring(1), up + c, arr);
        }else{
            char c=(char)(og.charAt(0)+32);
            lowAndHigh(og.substring(1), up + c, arr);
        }}
    }
}
