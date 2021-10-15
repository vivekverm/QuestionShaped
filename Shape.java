public class Shape {
    public void Draw()
    {
        System.out.println("Drawing Shape");
    }
    public void Erase()
    {
        System.out.println("Erasing Shape");
    }
}
class Circle extends Shape
{
   public void Draw()
   {
       System.out.println("Drawing Circle");
   }
   public void Erase()
   {
       System.out.println("Erasing Circle");
   }
}
class Triangle extends Shape
{
    public void Draw()
    {
        System.out.println("Drawing Triangle");
    }
    public void Erase()
    {
        System.out.println("Erasing Triangle");
    }
}
class Square extends Shape
{
    public void Draw()
    {
        System.out.println("Drawing Square");
    }
    public void Erase()
    {
        System.out.println("Erasing Square");
    }
}
class Test
{
    public static void main(String[] args) {

        Shape obj=new Circle();
        obj.Draw();
        obj.Erase();
        System.out.println();
        Shape obj1=new Triangle();
        obj1.Draw();
        obj1.Erase();
        System.out.println();
        Shape obj2=new Square();
        obj2.Draw();
        obj2.Erase();
    }
}
