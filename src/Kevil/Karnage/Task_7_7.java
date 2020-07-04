package Kevil.Karnage;

import ru.vsu.cs.course1.graph.AdjMatrixDigraph;
import ru.vsu.cs.course1.graph.AdjMatrixGraph;

import java.util.ArrayList;

public class Task_7_7 {
    public static void main(int start, int finish, AdjMatrixDigraph graph) {


        /*AdjMatrixDigraph graph = new AdjMatrixDigraph();
        graph.addAdge(0, 1);
//        graph.addAdge(0, 7);
        graph.addAdge(1, 2);
//        graph.addAdge(1, 7);
        graph.addAdge(2, 3);
        graph.addAdge(3, 4);
        graph.addAdge(3, 6);
//        graph.addAdge(4, 5);
        graph.addAdge(6, 5);
//        graph.addAdge(7, 3);
        String graphInDot = graph.toDot();
        System.out.println(graphInDot);

        ArrayList<Integer> count = graph.searchCountGraphPaths(0, 5);
        String countInString = intListToString(count);
        System.out.println(countInString);

         */
    }

    public static String intListToString (ArrayList<Integer> list) {
        String string = "";
        for (int i = 0; i < list.size(); i++) {
            string+= list.get(i) + " ";
        }
        return string;
    }


}