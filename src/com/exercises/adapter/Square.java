package com.exercises.adapter;

class Square
{
    public int side;

    public Square(int side)
    {
        this.side = side;
    }
}

interface Rectangle
{
    int getWidth();
    int getHeight();

    default int getArea()
    {
        return getWidth() * getHeight();
    }
}

class SquareToRectangleAdapter implements Rectangle
{
    private int side;

    public SquareToRectangleAdapter(Square square)
    {
        // todo
        this.side = square.side;

    }

    public int getWidth(){
        return side;
    }

    public int getHeight(){
        return side;
    }
}