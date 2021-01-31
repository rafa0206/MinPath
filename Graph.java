/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula14_mario_minpath;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author JFernandes
 */
public class Graph {
    private Map<Integer, List<Integer>> repr = new HashMap<>();
    
    private Graph() {}
    
    private void addVertex(int v) {
        repr.put(v, new ArrayList<>());
    }
    
    private void addEdge(int x, int y){
        repr.get(x).add(y);
        repr.get(y).add(x);
    }
    
    public List<Integer> neighbors(int v) {
        if (!repr.containsKey(v)) throw new NoSuchVertex(v);
        return new ArrayList<>(repr.get(v));
    }
    
    public Map<Integer, Integer> breadthFirstTree(int s) {
        if (!repr.containsKey(s)) throw new NoSuchVertex(s);
        Map<Integer, Integer> pred = new HashMap<>();
        pred.put(s, s);
        Deque<Integer> queue = new ArrayDeque<>();
        queue.addLast(s);
        while (!queue.isEmpty()) {
            int x = queue.removeFirst();
            for (int y: repr.get(x)) {
                if (!pred.containsKey(y)) {
                    pred.put(y, x);
                    queue.addLast(y);
                }
            }
        }
        return pred;
    }
                
    public Map<Integer, Integer> distances(int s) {
        if (!repr.containsKey(s)) throw new NoSuchVertex(s);
        Map<Integer, Integer> dist = new HashMap<>();
        dist.put(s ,0);
        Deque<Integer> queue = new ArrayDeque<>();
        queue.addLast(s);        
        while (!queue.isEmpty()) {
            int x = queue.removeFirst();
            for (int y: neighbors(x)) {
                if (!dist.containsKey(y)) {
                    dist.put(y, dist.get(x) + 1);
                    queue.addLast(y);
                }
            }            
        }
        return dist;
    }
    
    public static Graph build(String str) {
        Graph graph = new Graph();
        Scanner s = new Scanner(str);        
        int n = s.nextInt();
        for (int i = 0; i < n; ++i) {
          graph.addVertex(i);
        }
        while (s.hasNext()) {
            int x = s.nextInt();
            int y = s.nextInt();
            graph.addEdge(x, y);            
        }
        s.close();
        return graph;
    }
    
    @Override
    public String toString() {
        return "Graph{" + "repr=" + repr + '}';        
    }
    
}
