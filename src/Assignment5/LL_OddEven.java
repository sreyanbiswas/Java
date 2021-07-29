 public void oddEven()
        {
            LinkedList odd=new LinkedList();
            LinkedList even=new LinkedList();
            LinkedList fl=new LinkedList();
            Node temp=this.head;

            while(temp!=null)
            {
                if(temp.data%2==0)
                {
                    even.addLast(temp.data);
                }
                else
                {
                    odd.addLast(temp.data);
                    fl.addLast(temp.data);

                }
                temp=temp.next;

            }
            temp=even.head;
            while(temp!=null)
            {
                fl.addLast(temp.data);

                temp=temp.next;
            }
        this.head=fl.head;
        this.tail=fl.tail;
        this.tail.next=null;
        this.size=fl.size;
        }

