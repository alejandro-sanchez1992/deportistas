/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import entity.Athlete;

/**
 *
 * @author User_1
 */
public class Node {
    private Athlete athlete;
    private Node prev;
    private Node next;
    
    public Node(Athlete athlete) {
        this.athlete = athlete;
    }
    
    public Node(Athlete athlete, Node next) {
        this.athlete = athlete;
        this.next = next;
    }
    
    public Athlete getAthlete() {
        return athlete;
    }
    
    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
