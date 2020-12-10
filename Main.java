package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Construct total distance array
        ArrayList<Double> distancesSi = new ArrayList<>();

        //Set up destination points
        Point A = new Point(12,14);
        Point B = new Point(14,1);
        Point C = new Point(10,6);
        Point D = new Point(7,11);
        Point E = new Point(5,4);
        //Store the destination points
        ArrayList<Point> destinations= new ArrayList<>();
        destinations.add(A);
        destinations.add(B);
        destinations.add(C);
        destinations.add(D);
        destinations.add(E);

        //Get coordinates and create our wanted source point
        Scanner cons = new Scanner(System.in);
        System.out.print("X coordinate of S_i: ");
        Integer ex = cons.nextInt();
        System.out.print("Y coordinate of S_i: ");
        Integer why = cons.nextInt();
        Point sourceI = new Point(ex,why);

        //Print out it's distance relative to each demand node
        System.out.println("________________________________________________");
        for (int i = 0; i<destinations.size(); i++){
            Double distSiDi = distance(sourceI,destinations.get(i));
            System.out.println(distSiDi);
            distancesSi.add(distSiDi);
        }

        cons.close();

    }

    //Returns distance between 2 points
    public static Double distance(Point A, Point B){
        return B.distance(A); // (A.getY() - B.getY())/ (A.getX() - B.getX());
    }
}
