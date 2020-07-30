public class LinkedList {

    Node head; // head of list
    int length = 0;
    // Linked list Node.
   
    private static class Node {
        //static class so it can be accessed by main method
        int data;
        Node next;

        // Constructor
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

 
    // Method to insert a new node at start
    public void insertBeg(int data)
    {
        length++;
        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;

       
        //new node when list is empty
        if (head == null) {
            head = new_node;
        }
        else {
            new_node.next = head;
            head = new_node;   
        }

    }   
       // Method to insert a new node
    public void insertEnd( int data)
    {
        length++;
        // Creates a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;

        //makes node as head when list is empty
        if (head == null) {
            head = new_node;
        }
        else {
            
            //else instert new node at end
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }

            //  new_node at last node
            last.next = new_node;
        }

    }
    // Method to print the LinkedList.
    public void printList()
    {
        Node currNode = head;

        System.out.print("LinkedList: ");

        // Goes through the list
        while (currNode != null) {
            // out puts current nodes data
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }

        System.out.println();
    }

    

    // Method to delete a node in the LinkedList by KEY
    public void deleteByKey(LinkedList list, int key)
    {

        Node p = null;
        if(list.head != null)
            p = list.head;
        if(p.data == key) {
            length--;
            list.head = list.head.next;
            System.out.println(key +" found deleted");
        }else {
            while (p.next != null && p.next.data != key)
                p = p.next;// search previous element from the element to be deleted

            if (p.next == null) return;
            //resolves "element not found"
            else{
                if (p.next.data == key){
                    length--;
                    p.next = p.next.next;
                    System.out.println(key +" found deleted");
                }
            }

        }

    }

    public void search(int num){
        Node p = head;
        boolean flag = false;
        while(p!=null){
            if(p.data == num){
                flag = true;
                break;
            }
            p = p.next;
        }
        if(flag){
            System.out.println("Found "+num);
        }else{
            System.out.println("Not Found "+num);
        }
    }

    public int getLength() {
        return length;
    }

}