public class DLList {
    private static class IntNode {
    
        /*Instance variables */
        public int item;
        public IntNode next;
        public IntNode prev;
        
        
        /*Constructor for IntNode */
        private IntNode(int i, IntNode previousNode, IntNode nextNode){
            item = i;
            prev = previousNode;
            next = nextNode; 
        }
    }   
    //public int item;
    // made it private to no mess with implementation from other classes
    /*tHE FIRST ITEM IS AT sentFront.next */
    /*The last item is at sentBack.prev */
    public int size = 0;
    private IntNode sentFront;
    private IntNode sentBack;

    public DLList(int x){
        sentFront = new IntNode(-1, null, null );
        sentBack = new IntNode(-9, null, null);
        //set first item
        sentFront.next = new IntNode(x, sentFront, sentBack);
        //set last item(it's the same previously created)
        sentBack.prev = sentFront.next;
        size = 1;
    }

    public DLList(){
        size = 0;
        sentFront = new IntNode(-1, null, null);
        sentBack = new IntNode(-9, sentFront, null);
        sentFront.next = sentBack;
    }

    /*Adds an item to start of the list */
    public void addFirst(int num){
        //IntNode newNode = new IntNode(num, null, null)
        IntNode newNode = new IntNode(num, sentFront, sentFront.next);
        //In case it's first item added
        if (size == 0) {
            sentBack.prev = newNode;
        }
        sentFront.next = newNode;
        newNode.next.prev = newNode;
        size++; 
    }

    /*Gets the first item in the list */
    public int getFirst(){
        return sentFront.next.item;
    }

    /*Gets last item in the list */
    public void addLast(int num){
        /*IntNode cursor = sentFront;
        //NOOOO MOREEEEEReach the last element of the list
        //INSTEAD last item saved in sentBack.prev
        while (cursor.next != null) {
            cursor = cursor.next;
        }
        //Add the item to that found.next end of the list
        cursor.next = new IntNode(num, null, null);//*/
        sentBack.prev = new IntNode(num, sentBack.prev, sentBack);
        //in case i'ts first item added
        if (size == 0) {
            sentFront.next = sentBack.prev;
        }
        size++;
    }

    /*get and Remove last item (sentBack.prev)  */
    public void removeLast(){
        IntNode secondToLast = sentBack.prev.prev;
        secondToLast.next = sentBack;
        sentBack.prev = secondToLast;
        size --; 
    }

    public int getLast(){
        return sentBack.prev.item;
    }

    /*Print all items in list */
    public void printList(){
        IntNode cursor = sentFront.next;
        while (cursor.next != null) {
            System.out.println(cursor.item);
            cursor = cursor.next ;
        }
    }


    /*Helper method for recursive size */
    private static int size(IntNode list){
        if (list.next == null) {
            return 1;
        }
        return 1 + size(list.next);
    }

    /*Get size of the list 
    public int size(){
        IntNode cursor = this.first;
        int s = 0;
        //Look for end of list 
        while (cursor != null) {
            s++;
            cursor = cursor.next;
        }
        return s;
    }*/
    // Get size of list using recursive helper method
    public int size(){
        return this.size;
    }


    public static void main(String[] args) {
        /*Crates a list of one integer, 10 */
        DLList A = new DLList(1);
        A.addFirst(25);
        A.addFirst(99);
        A.addFirst(158);
        A.printList();
        System.out.println("Item that was removed (last in list): "+ A.getLast());
        A.removeLast();
        System.out.println("New state of list:");
        A.printList();



    }


}
