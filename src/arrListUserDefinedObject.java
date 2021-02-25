import java.io.*;
import java.util.*;
public class arrListUserDefinedObject {
    //arraylist of user defined objects
    public static void main(String args[]){
        //creating an arraylist of type of the above class
       ArrayList<myLib> library1 = new ArrayList<myLib>();

       //adding (custom/user-defined) objects of type of the above class as each element of this arraylist
        library1.add(new myLib("Outliers", "Malcolm Gladwell"));
        library1.add(new myLib("Bourne Ultimatum", "Robert Ludlum"));
        library1.add(new myLib("Mein Kampf", "Adolf Hitler"));
        library1.add(new myLib("Shiva Triology","Amish"));

        //now printing my library library1
        System.out.println(library1);

        library1.forEach(entry ->{
            System.out.print("Name:"+ entry.getName() + " Author:"+ entry.getAuthor());
            System.out.println();
        });
        

    }
}
