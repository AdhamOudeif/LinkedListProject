

import java.io.*;
import java.util.Scanner;


public class SearchList {

    public static void main(String[] args) {
        //creates object of class LinkedList 
        LinkedList obj = new LinkedList();
        int ch,num;
        //Options
        do{
            System.out.println("1. Insert a number at begining");
            System.out.println("2. Insert a number at end");
            System.out.println("3. Display a length of list.");
            System.out.println("4. Search a number");
            System.out.println("5. Delete a node contanning specific number");
            System.out.println("6. Print a list");
            System.out.println("7. Quit");
            System.out.print("Enter Choice: ");
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();
            switch(ch){
                case 1: System.out.println("Enter Number: ");
                num = sc.nextInt();
                obj.insertBeg(num);
                break;
                case 2: System.out.println("Enter Number: ");
                num = sc.nextInt();
                obj.insertEnd(num);
                break;
                case 3: System.out.println("Length of a List is: "+obj.getLength());
                break;
                case 4: System.out.println("Enter number to be searched: ");
                num = sc.nextInt();
                obj.search(num);
                break;
                case 5: System.out.println("Enter key to be deleted: ");
                num = sc.nextInt();
                obj.deleteByKey(obj, num);
                break;
                case 6: obj.printList();
                break;
            }
        }while(ch!=7);
    }

}

/*
 * 1. Insert a number at begining
2. Insert a number at end
3. Display a length of list.
4. Search a number
5. Delete a node contanning specific number
6. Print a list
7. Quit
Enter Choice: 1
Enter Number: 
1
1. Insert a number at begining
2. Insert a number at end
3. Display a length of list.
4. Search a number
5. Delete a node contanning specific number
6. Print a list
7. Quit
Enter Choice: 1
Enter Number: 
2
1. Insert a number at begining
2. Insert a number at end
3. Display a length of list.
4. Search a number
5. Delete a node contanning specific number
6. Print a list
7. Quit
Enter Choice: 1
Enter Number: 
3
1. Insert a number at begining
2. Insert a number at end
3. Display a length of list.
4. Search a number
5. Delete a node contanning specific number
6. Print a list
7. Quit
Enter Choice: 3
Length of a List is: 3
1. Insert a number at begining
2. Insert a number at end
3. Display a length of list.
4. Search a number
5. Delete a node contanning specific number
6. Print a list
7. Quit
Enter Choice: 4
Enter number to be searched: 
2
Found 2
1. Insert a number at begining
2. Insert a number at end
3. Display a length of list.
4. Search a number
5. Delete a node contanning specific number
6. Print a list
7. Quit
Enter Choice: 5
Enter key to be deleted: 
3
3 found deleted
1. Insert a number at begining
2. Insert a number at end
3. Display a length of list.
4. Search a number
5. Delete a node contanning specific number
6. Print a list
7. Quit
Enter Choice: 6
LinkedList: 2 1 
1. Insert a number at begining
2. Insert a number at end
3. Display a length of list.
4. Search a number
5. Delete a node contanning specific number
6. Print a list
7. Quit
Enter Choice: 7
*/
 
