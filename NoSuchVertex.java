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
public class NoSuchVertex extends RuntimeException {
    public NoSuchVertex(int v) {
        super("0 vertice " + v + " nao existe");
    }        
}
