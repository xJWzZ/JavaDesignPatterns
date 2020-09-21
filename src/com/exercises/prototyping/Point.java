package com.exercises.prototyping;

class Point
{
    public int x, y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public Point(Point other){
        this.x = other.x;
        this.y = other.y;
    }
}

class Line
{
    public Point start, end;

    public Line(Point start, Point end)
    {
        this.start = new Point(start);
        this.end = new Point(end);
    }

    public Line(Line other){
        this(other.start, other.end);
    }

    public Line deepCopy()
    {
        return new Line(this);
    }

    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(2, 3);
        Line line1 = new Line(point1, point2);
        Line line2 = line1.deepCopy();
        line2.start.x = 4;
        System.out.println(line1.start.x); 
    }
}
