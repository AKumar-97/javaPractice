import java.io.*;
import java.util.*;
public class myLib {
    String bookName;
    String authorName;

    myLib(String bookName, String authorName)
    {
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public String getName(){
        return bookName;
    }

    public String getAuthor(){
        return authorName;
    }

    public void setName(String bookName){
        this.bookName = bookName;
    }

    public void setAuthor(String authorName){
        this.authorName = authorName;
    }
}
