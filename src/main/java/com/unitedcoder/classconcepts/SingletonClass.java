package com.unitedcoder.classconcepts;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.json.JsonOutput;

import java.io.FilterOutputStream;

public class SingletonClass {
    private static SingletonClass singletonClass = null;
    public String str;

    //make constructor private
    private SingletonClass(){
        str = "hello";
    }
    //static getInstance   called Lazy initialization
    public static SingletonClass getInstance(){
        if (singletonClass==null){
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }

    public static void main(String[] args) {
        SingletonClass x = SingletonClass.getInstance();
        SingletonClass y = SingletonClass.getInstance();
        SingletonClass z = SingletonClass.getInstance();

        x.str =(x.str.toUpperCase());
        System.out.println(x.str);

    }
}
