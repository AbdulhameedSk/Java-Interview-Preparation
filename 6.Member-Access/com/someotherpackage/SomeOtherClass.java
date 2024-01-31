package com.someotherpackage;

import com.mypackage.MyClass;

public class SomeOtherClass {
    public void hasAccessToMyClass() {
        System.out.println(new MyClass().sayHello());
    }
}