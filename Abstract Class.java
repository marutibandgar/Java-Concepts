# A class which is declared with the abstract keyword is known as an abstract class in Java.
# Abstraction is a process of hiding the implementation details and showing only functionality to the user.
# for example, sending SMS where you type the text and send the message. You don't know the internal processing about the message delivery.
# An abstract class can have a data member, abstract method, method body (non-abstract method), constructor, and even main() method.



abstract class Bike{  
  abstract void run();  
}  
class Honda4 extends Bike{  
void run(){System.out.println("running safely");}  
public static void main(String args[]){  
 Bike obj = new Honda4();  
 obj.run();  
}  
