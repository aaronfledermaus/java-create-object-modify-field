package com.bytelegend;

import com.bytelegend.pet.Cat;
使之创建一个新的Cat对象， 并将该对象中的name成员变量（又称为实例字段）修改为方法参数name所指定的名字，
然后返回该对象。
public class Home {
    public static void main(String[] args) {
        System.out.println(newCat("Tom"));
    }

    // Creates a new `Cat` object.
    // Updates the `name` instance field (aka. member variable) of that object to `name` argument of
    // the method.
    // Returns that object.
    public static Cat newCat(String name) {
        Cat cat = new Cat();
        cat.name = name;
        return cat;
    }
}
