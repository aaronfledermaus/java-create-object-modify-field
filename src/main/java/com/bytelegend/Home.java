package com.bytelegend;

import com.bytelegend.pet.Cat;

public class Home {
    public static void main(String[] args) {
        System.out.println(newCat("Tom"));
    }

    // Creates a new `Cat` object.
    // Updates the `name` instance field (aka. member variable) of that object to `name` argument of
    // the method.
    // Returns that object.
    public static Cat newCat(String name) {
         Cat cat = new Cat("Tom");
        
        return cat;
    }
}
