/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula14_mario_minpath;

/**
 *
 * @author JFernandes
 */

public class Main {    
    
  //aula 14
  /*public static List<List<Integer>> build(String str) {
    Scanner s = new Scanner(str);
    List<List<Integer>> graph = new ArrayList<>();
    int n = s.nextInt();
    for (int i = 0; i < n; ++i) {
      graph.add(new ArrayList<>());
    }
    //graph é a lista [[], [], [], ..., []] (n listas vazias)
    while (s.hasNext()) {
    int x = s.nextInt();
    int y = s.nextInt();
    graph.get(x).add(y);
    graph.get(y).add(x);
    }
    s.close();
    return graph;
  }
  public static void main(String[] args) {
    List<List<Integer>> graph = build ("4 0 2 0 2 1 2 2 3");
    System.out.println(graph);
  }*/   
    
  //aula 15
    /*public static Map<Integer, List<Integer>> build(String str) {
        Scanner s = new Scanner(str);
        Map<Integer, List<Integer>> graph = new HashMap<>();
        int n = s.nextInt();
        for (int i = 0; i < n; ++i) {
          graph.put(i, new ArrayList<>());
        }
        while (s.hasNext()) {
            int x = s.nextInt();
            int y = s.nextInt();
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        s.close();
        return graph;
    }
    
    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = build ("4 0 2 0 2 1 2 2 3");
        System.out.println(graph);
    }*/
    
    
    public static void main(String[] args) {
        Graph graph = Graph.build("8 0 1 0 2 0 3 1 2 1 3 2 4 3 4 3 7 4 5 4 6 5 6 6 7");
        System.out.println(graph.breadthFirstTree(0));
    }
}
