//The following code demonstrates using the ArrayList. It adds several items to the list, shows the list, removes some
// items, and displays the list again. Or at least it should. This code doesn't work. It won't compile. Find the errors and fix it:

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        // Create an arraylist
        ArrayList aList = new ArrayList();
        System.out.println("Initial size of aList: " + aList.size());

        // Add elements to the arraylist
        aList.add("C");
        aList.add("A");
        aList.add("E");
        aList.add("B");
        aList.add("D");
        aList.add("F");
        aList.add(1, "A2");
        System.out.println("Size of aList after additions: " + aList.size());

        // Display the arraylist
        System.out.println("Contents of aList: " + aList);

        // Removes elements from the arraylist
        aList.remove("F");
        aList.remove("G");
        aList.remove(2);

        System.out.println("Size of aList after deletions: " + aList.size());
        System.out.println("Contents of aList: " + aList);
    }
}