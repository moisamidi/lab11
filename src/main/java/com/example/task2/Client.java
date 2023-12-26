package com.example.task2;

class Client {
    private static int nextId = 0;
    private int id;
    private String name;
    private int age;
    private String sex;

    public Client(String name, int age, String sex) {
        this.id = nextId++;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    // Getters for Client attributes
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
}