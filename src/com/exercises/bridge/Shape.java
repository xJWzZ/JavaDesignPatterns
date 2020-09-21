package com.exercises.bridge;

interface Renderer{
    public String whatToRenderAs();
}

abstract class Shape
{
    protected Renderer renderer;

    public Shape(Renderer renderer){
        this.renderer = renderer;
    }

    public abstract String getName();
}

class Triangle extends Shape
{

    public Triangle(Renderer renderer){
        super(renderer);
    }

    @Override
    public String getName()
    {
        return "Triangle";
    }

    @Override
    public String toString() {
        return String.format("Drawing %s as %s", getName(), this.renderer.whatToRenderAs());
    }
}

class VectorRenderer implements Renderer {
    @Override
    public String whatToRenderAs() {
        return "lines";
    }
}

class RasterRenderer implements Renderer {
    @Override
    public String whatToRenderAs() {
        return "pixels";
    }
} 



class Square extends Shape
{

    public Square(Renderer renderer){
        super(renderer);
    }

    @Override
    public String getName()
    {
        return "Square";
    }

    @Override
    public String toString() {
        return String.format("Drawing %s as %s", getName(), this.renderer.whatToRenderAs());
    }
}
