package LinkedList;

import java.time.temporal.TemporalAdjusters;

public class EvenNumberLink {
    public static void main(String args[]){
        Node head=createLinkedList();
        print(head);

    }
    public static Node createLinkedList() {


        Node FirstNode = new Node(1);
        Node SecondNode = new Node(2);
        Node ThirdNode = new Node(3);
        Node FourthNode = new Node(4);
        Node FifthNode=new Node(5);

        FirstNode.next = SecondNode;
        SecondNode.next = ThirdNode;
        ThirdNode.next = FourthNode;
        FourthNode.next=FifthNode;
        Node head = FirstNode;
        return head;
    }
    //Print (Traverse)->Head

    public static void print(Node head) {
        Node temp = head;
        while (temp!=null) {
            System.out.println(temp.data);
            if (temp.data%2==0){
                System.out.println(temp.data);
            }
            temp = temp.next;
        }
    }
}

