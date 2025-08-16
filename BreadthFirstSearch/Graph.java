package BreadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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

    public void bfs(int v){
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[list.size()];
        q.add(v);
        visited[v]=true;
        System.out.println("BFS Traversal starting from vertex " + v + ":");
        while(!q.isEmpty()){
            int vertex=q.remove();
            System.out.print(vertex+" ");
            for(int i=0;i<list.get(vertex).size();i++){
                int av=list.get(vertex).get(i);
                if(!visited[av]){
                    q.add(av);
                    visited[av]=true;
                }
            }
        }
    }
}
