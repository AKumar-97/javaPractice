import java.util.*;
public class arrListOp {
    public static void main(String args[]){
        ArrayList<String> books= new ArrayList<String>();
        books.add("Agatha Christie");
        books.add("Hercule Poirot");
        books.add("Jason Bourne");
        books.add("Angels and Demons");

        /*for(int i=0;i<books.size();i++){
            System.out.println(books.get(i)+ " ");
        }*/
        //creating arraylist from another collection
        ArrayList<String> library = new ArrayList<String>(books);
        library.add("New Book entry from another arraylist");

        /*for (int i = 0; i< library.size();i++){
            System.out.println(library.get(i)+" ");
        }*/

        //instead of doing the above, you can just do
        System.out.println(library);

        //modifying 3rd book in the list to new book 'outlier'
        library.set(4,"Outlier");
        library.add(5,"Dummy");

        System.out.println(library);

        //removing the last record using index
        library.remove(5);

        //sorting the library
        Collections.sort(library);

        //printing the library
        System.out.println(library);

    }
}
