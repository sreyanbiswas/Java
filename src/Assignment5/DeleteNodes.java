void delLesserNodes() 
    { 
        /* 1.Reverse the linked list */
        reverseList(); 

        /* 2) In the reversed list, delete nodes which 
           have a node with greater value node on left 
           side. Note that head node is never deleted 
           because it is the leftmost node.*/
        _delLesserNodes(); 

        /* 3) Reverse the linked list again to retain 
           the original order */
        reverseList(); 
    } 

    /* Deletes nodes which have greater value node(s) 
       on left side */
    void _delLesserNodes() 
    { 
        Node current = head; 

        /* Initialise max */
        Node maxnode = head; 
        Node temp; 

        while (current != null && current.next != null) { 
            /* If current is smaller than max, then delete 
               current */
            if (current.next.data < maxnode.data) { 
                temp = current.next; 
                current.next = temp.next; 
                temp = null; 
            } 

            /* If current is greater than max, then update 
               max and move current */
            else { 
                current = current.next; 
                maxnode = current; 
            } 
        } 
    } 
