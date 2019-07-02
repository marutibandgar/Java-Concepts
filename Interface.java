# Why use Java interface?
# There are mainly three reasons to use interface..
# It is used to achieve abstraction.
# By interface, we can support the functionality of multiple inheritance.
# It can be used to achieve loose coupling.
# Java Interface also represents the IS-A relationship.
# It cannot be instantiated just like the abstract class
Syntax:-
interface <interface_name>{  
      
    // declare constant fields  
    // declare methods that abstract   
    // by default.  
}  
Example
iterface Printble
{
    void print();
  class A implements Printble
  {
    public void print()
    {
      System.out.println("Hii");
      
     }
   }
  public static void main(String args[])
  {
    A obj = new A();
    obj.print();
  }
 }
