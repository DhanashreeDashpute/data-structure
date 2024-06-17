import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        
            List<Product> list=new LinkedList<Product>();  
            //Creating Books  
            Product b1=new  Product (101,"Let us C",10,8);  
            Product  b2=new  Product (102,"Data Communications & Networking",25,4);  
            Product  b3=new  Product (103,"Operating System",30,6);  
            //Adding Books to list  
            list.insert(b1);  
            list.insert(b2);  
            list.insert(b3);  
            //Traversing list  
             
        }  


    }

