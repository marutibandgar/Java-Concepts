# Encapsulation in Java is a process of wrapping code and data together into a single unit
# The Java Bean class is the example of a fully encapsulated class
# Advantages of Encapsulation 
1.By providing only a setter or getter method, you can make the class read-only or write-only.
2.It provides you the control over the data
3.It is a way to achieve data hiding in Java because other class will not be able to access the data through the private data members.

# Example
class Account {   
private long acc_no;  
private String name,email;  
private float amount;  
public long getAcc_no() {  
    return acc_no;  
}  
public void setAcc_no(long acc_no) {  
    this.acc_no = acc_no;  
}  
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  
public String getEmail() {  
    return email;  
}  
public void setEmail(String email) {  
    this.email = email;  
}  
public float getAmount() {  
    return amount;  
}  
public void setAmount(float amount) {  
    this.amount = amount;  
}  
  
}  
#File: TestAccount.java


public class TestEncapsulation {  
public static void main(String[] args) {  

    Account acc=new Account();   
    acc.setAcc_no(7560504000L);  
    acc.setName("Sonoo Jaiswal");  
    acc.setEmail("sonoojaiswal@javatpoint.com");  
    acc.setAmount(500000f);  
    
    System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());  
}  
}  
