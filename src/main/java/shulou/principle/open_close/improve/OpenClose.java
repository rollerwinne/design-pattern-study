package shulou.principle.open_close.improve;

public class OpenClose {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherGraphic());
    }

}

class GraphicEditor {
    public void drawShape(Shape s) {
        s.draw();
    }
}

abstract class Shape {
    public abstract void draw();//抽象方法
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println(" 绘制矩形 ");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println(" 绘制圆形 ");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println(" 绘制三角形 ");
    }
}

class OtherGraphic extends Shape {
    @Override
    public void draw() {
        System.out.println(" 绘制其它图形 ");
    }
}
