# an array is a collection of similar type of elements that have a contiguous memory location.
# It is a data structure where we store similar elements
# We can store only a fixed set of elements in a Java array.

# Advantages
-Code Optimization
-Random Access

# Syntax to Declare an Array in Java

dataType[] array_name;   
dataType []array_name; 
dataType array_name[]; 

class Testarray{  
public static void main(String args[]){  
int a[]=new int[5]; 
a[0]=10;  
a[1]=20;  
a[2]=70;  
a[3]=40;  
a[4]=50;  
  
for(int i=0;i<a.length;i++)  
System.out.println(a[i]);  
}
}  

# Syntax to Declare Multidimensional Array in Java

dataType[][] array_name;   
dataType [][]array_name;   
dataType array_name[][];   
dataType []array_name[];  

# Example 
class Testarray3{  
public static void main(String args[]){  
  
int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
  
for(int i=0;i<3;i++){  
 for(int j=0;j<3;j++){  
   System.out.print(arr[i][j]+" ");  
 }  
 System.out.println();  
}  
}
} 
