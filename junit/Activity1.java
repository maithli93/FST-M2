import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity1 {
    static ArrayList<String> list;

    @BeforeEach
    void setUp(){
        list=new ArrayList<String>();
        list.add("alpha");
        list.add("beta");
    }
 @Test
    public void insertTest(){
     // Assert size of list
     assertEquals(2, list.size(), "Wrong size");
     //Add New Element
     list.add(2,"charlie");
     assertEquals(3, list.size(), "Wrong size");

// Assert individual elements
     // Assert individual elements
     assertEquals("alpha", list.get(0), "Wrong element");
     assertEquals("beta", list.get(1), "Wrong element");
     assertEquals("charlie", list.get(2), "Wrong element");

 }
    @Test

    public void replaceTest() {
        // Replace new element
        list.set(1, "charlie");
        // Assert size of list
        assertEquals(2, list.size(), "Wrong size");
        // Assert individual elements
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("charlie", list.get(1), "Wrong element");
    }
 }

