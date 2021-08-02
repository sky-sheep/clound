package com.nacos.client7001.method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ylx
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(sss());
    }
    public static String sss(){
        String s = "a";
        char[] chars = s.toCharArray();
        int d = 0;
        String r = "";
        int i =0;
        for (char aChar : chars) {
            int i1 = s.indexOf(aChar, i + 1);
            int f =i1-i;
            if (f>d){
                d = f;
                r = s.substring(i,s.indexOf(aChar,i+1)+1);
            }
            i++;
        }
        if(r == ""){
            r = s;
        }
        return r;
    }

    private void findString(String s,char[] chars,Integer i,Integer d ,String r){
        int i1 = s.indexOf(chars[i], i + 1);
        int f =i1-i;
        if (f>d){
            d = f;
            r = s.substring(i,s.indexOf(chars[i],i+1)+1);
        }
        i++;
    }
}
