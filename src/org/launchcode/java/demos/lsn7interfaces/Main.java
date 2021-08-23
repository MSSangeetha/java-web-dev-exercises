package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        //Before Sorting
        System.out.println("Before sorting Flavors" + flavors);
        System.out.println("\n");

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        //Creating FlavorComparator Object
        Comparator comparator = new FlavorComparator();

        //Call the sort method in Flavors
        flavors.sort(comparator);
        //OR this can be used, so no need to create an instance for FlavorComparator
//        flavors.sort(new FlavorComparator());

        //After Sorting
        System.out.println("After sorting Flavors" + flavors);
        System.out.println("\n");
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        //Before Sorting Cones with Cost
        System.out.println("Before sorting cones : " + cones);
        System.out.println("\n");
        //Creating FlavorComparator Object
        Comparator coneCompare = new ConeComparator();

        //Call the sort method in Cones
        cones.sort(coneCompare);

        //After Sorting
        System.out.println("After sorting Cones" + cones);
        System.out.println("\n");
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
