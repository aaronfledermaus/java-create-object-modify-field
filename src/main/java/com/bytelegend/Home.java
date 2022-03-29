package com.bytelegend;

import com.bytelegend.pet.Cat;

public class Home {
    public static void main(String[] args) {
        System.out.println(newCat("Tom"));
    }

    public static Cat newCat(String name) {
    	Cat cat = new Cat();
    	cat.name = name;
    	return cat;
    }
}
