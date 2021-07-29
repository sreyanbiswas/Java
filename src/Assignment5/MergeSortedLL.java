public LinkedList merge_sorted_list(LinkedList other) throws Exception {

        LinkedList ll = new LinkedList();         // Tostore the final Linked List

        Node temp1 = this.head;                  // Start from the first list
        Node temp2 = other.head;                // Start from the second list

        while(temp1 != null && temp2 != null){    // Iterate on both simultaneously

        if(temp1.data < temp2.data){      // If data of first list is less
        ll.addLast(temp1.data);             // add into the list
        temp1 = temp1.next;                 // Update the iterator
        }else{

        ll.addLast(temp2.data);          // otherwise add data of list2
        temp2 = temp2.next;              // Update the iterator 

        }


    }

    while(temp1 != null){   // Till list1 is not empty

    ll.addLast(temp1.data);  
    temp1 = temp1.next;

    }

    while(temp2 != null){   // Till list2 is not empty 
    ll.addLast(temp2.data);
    temp2 = temp2.next;
    }

       return ll;                  // return the list
}

