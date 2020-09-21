package com.exercises.Factory;

class Person
{
    public int id;
    public String name;

    public Person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}

class PersonFactory
{
    private int currentID = -1;

    public PersonFactory(){}

    public Person createPerson(String name)
    {
        currentID++;
        Person person =  new Person(currentID, name);
//        System.out.println(person.id);
        return  person;
    }

//    public static void main(String[] args) {
//        PersonFactory pf = new PersonFactory();
//        pf.createPerson("John");
//        pf.createPerson("James");
//    }
}