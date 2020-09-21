package com.exercises;

import java.util.ArrayList;
import java.util.Collections;

public class FieldParameter {
    public String name, type;
    public ArrayList<FieldParameter> fields = new ArrayList<FieldParameter>();
    private final int indentSize = 2;
    private final String newLine = System.lineSeparator();

    public FieldParameter(){

    }
    public FieldParameter(String name, String type){
        this.name = name;
        this.type = type;
    }

    private String toStringImpl(int indent){
        StringBuilder sb = new StringBuilder();
        if (type.equals("class")){
            sb.append(String.join("", Collections.nCopies(indentSize*(indent), " ")))
                    .append(String.format("public %s %s %s", type, name, newLine))
                    .append(String.format("{%s", newLine));
            for (FieldParameter f : fields) {
                sb.append(f.toStringImpl(indent +1));
            }
            sb.append("}");
        } else {
            sb.append(String.join("", Collections.nCopies(indentSize*(indent), " ")))
                    .append(String.format("public %s %s;%s", type, name, newLine));
        }

//        sb.append("}");
        return sb.toString();
    }

    @Override
    public String toString() {
        return toStringImpl(0);
    }
}
