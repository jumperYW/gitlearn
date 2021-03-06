package com.wayne.proxy.staticproxy;

import com.wayne.proxy.Person;

public class StaticProxy implements Person{

    private Person person;

    public StaticProxy(Person person) {
        this.person = person;
    }

    @Override
    public void doWork() {
        System.out.println("before ...");
        person.doWork();
        System.out.println("after ...");
    }
}
