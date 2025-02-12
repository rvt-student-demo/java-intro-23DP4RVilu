package lv.rvt;


public class Box {
  double width;
  double height;
  double length;
  
    
    public Box (double width, double height, double length) {
    this.width = width;
    this.height = height;
    this.length = length;
    }

    public Box (double side) {
    this.width = side;
    this.height = side;
    this.length = side;
    }

    public double volume() {
    return width * height * length;
    }

  public double area() {
  return 2 * (length * width + length * height + width * height);
  }
}
