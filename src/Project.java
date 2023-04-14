interface Shape {
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("--- 다시 그립니다.");
		draw();
	}
}

class Circle implements Shape{
	int radius;
		
	public Circle(int radius) {
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.println(" 반지름이 " + radius + "인 원입니다.");
	}
	@Override
	public double getArea() {
		return radius*radius*PI;
	}
}

class Oval implements Shape {
	int x, y;
	
	public Oval(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public void draw() {
		System.out.println(x + "x" + y + "에 내접하는 타원입니다.");
	}
	@Override
	public double getArea() {
		return x*y*PI;
	}
}

class Rect implements Shape {
    int width, height;

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(width + "x" + height + "크기의 사각형 입니다");
    }

    @Override
    public double getArea() {
        return width * height;
    }
}


public class Project {

	public static void main(String[] args) {
		Shape [] list = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Oval(30, 40);
		list[2] = new Rect(20, 50);
		
		for(int i =0;i<list.length; i++) list.clone()[i].redraw();
		for(int i =0;i<list.length; i++) System.out.println("면적은 " + list[i].getArea());
	}
}
