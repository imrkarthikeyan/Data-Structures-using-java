package Graph;

import java.util.ArrayList;

public class Graph {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public Graph(int v) {
        for (int i = 0; i < v; i++) {
            list.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int u, int v) {
        list.get(u).add(v);
        list.get(v).add(u);
    }

    public void display() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Elements in list " + i);
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.println(list.get(i).get(j));
            }
        }
    }
}
