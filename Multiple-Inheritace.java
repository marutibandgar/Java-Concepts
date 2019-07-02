# TO achieve multiple inheritance in java we can use Interface.
# Example

interface printable
{
  void print();
}
interface Drawable
{
   void draw();
}
 Class A implements Printble,Drawable
 {
    public void print()
    {
      System.out.println("hello");
    }
    public void draw()
    {
      System.out.println("Welcome");
    }
    
    public static void main(String args[])
    {
        A obj = new A();
        obj.print();
        obj.draw();
    }
    
  }

 
