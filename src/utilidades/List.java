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
public class List {
    private Node head;
    private Node last;
    
    List() {}
    
    public boolean IsEmpty() {
        return head==null;
    }
    
    public void InsertHead(Athlete athlete) {
        if(IsEmpty()) {
            head = new Node(athlete);
            last = head;
        } else {
            Node node = new Node(athlete, head);
            head.setPrev(node);
            head = node;
        }
    }
    
    public void InsertLast(Athlete athlete) {
        if(IsEmpty()) {
            InsertHead(athlete);
        } else {
            Node node = new Node(athlete);
            node.setPrev(last);
            last.setNext(node);
            last = node;
        }
    }
    
    public Athlete DeleteHead()
    {
        Athlete athlete = null;
        if(IsEmpty()) {
            return athlete;
        } else {
            athlete = head.getAthlete();
            if(head == last) {
                head = null;
                last = null;
            } else {
                head = head.getNext();
                head.setPrev(null);
            }
            return athlete;
        }
    }
    
    public Athlete DeleteLast()
    {
        Athlete athlete = null;
        if(!IsEmpty()) {
            athlete = last.getAthlete();
            if(head == last) {
                head = null;
                last = null;
            } else {
                last = last.getPrev();
                last.setNext(null);
            }
        }
        return athlete;
    }
    
    @Override
    public String toString()
    {
        String info = "";
        Node aux = head;
        while(aux != null)
        {
            info = info + aux.getAthlete().toString() + "\n";
            aux = aux.getNext();
        }
        return info;
    }
}
