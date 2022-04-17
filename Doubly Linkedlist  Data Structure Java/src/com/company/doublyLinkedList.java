package com.company;


import javax.swing.plaf.synth.SynthOptionPaneUI;

public class doublyLinkedList {
    Node head;
    Node tail;

    doublyLinkedList()
    {
        this.head=null;
        this.tail=null;
    }
    public void AddNode(int data)
    {
        Node newNode=new Node();
        newNode.data=data;
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            head.prev=null;
            tail.next=null;
        }
        else
        {
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
            tail.next=null;

        }

    }
    public void AddStart(int data)
    {
        Node newNode=new Node();
        newNode.data=data;
        if(head==null)
        {
            head=newNode;
           // newNode.next=newNode.prev=newNode;
            newNode.data=data;

        }
        else
        {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }


    }
        public void AnyLOC(int index,int data)
        {
            Node newNode=new Node();
            newNode.data=data;
            Node current=head;
            Node temp=null;
            for(int i=0;i<index;i++)
            {

                current=current.next;

            }
           temp=current.next;
            temp.prev=current;

            current.next=newNode;
            newNode.prev=current;
            newNode.next=temp;
            temp.prev=newNode;


        }

        public void delete(int index) {
            if (index == 0) {
                head = head.next;

            }
            Node current = head;
            Node n1 = null;
            for (int i = 0; i < index-1; ++i) {

                current = current.next;

            }
            n1 = current.next;
            current.next=n1.next;
            n1.prev=current;

        }
            public void show ()
            {
                Node current = head;
                if(head==null)
                {
                    System.out.println("LIST IS EMPTY ");
                }
                else
                {
                while (current.next != null) {

                    System.out.println(current.data);
                    current = current.next;
                }
                }
                System.out.println(current.data);
            }

        }


