package com.exercises;

public class CodeBuilder {
    private FieldParameter className;
    public CodeBuilder(String className){
        this.className = new FieldParameter(className, "class");
    }

    public CodeBuilder addField(String name, String type) {
        FieldParameter e = new FieldParameter(name, type);
        className.fields.add(e);
        return this;
    }

    @Override
    public String toString() {
//        todo
        return className.toString();
    }

    public static void main(String[] args) {
        CodeBuilder cb = new CodeBuilder("Person").addField("name", "String").addField("age", "int");
        CodeBuilder cb1 = new CodeBuilder("Person");
        System.out.println(cb1);
    }
}
