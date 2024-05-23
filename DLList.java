public class DLList {
    private static class IntNode {
    
        /*Instance variables */
        public int item;
        public IntNode next;
        public IntNode prev;
        
        
        /*Constructor for IntNode */
        private IntNode(int i, IntNode p, IntNode n){
            item = i;
            prev = p;
            next = n; 
        }
    }   
    //public int item;
    // made it private to no mess with implementation from other classes
    /*tHE FIRST ITEM IS AT sentFront.next */
    private IntNode first;
    public int size = 0;
    private IntNode sentFront;

    public DLList(int x){
        sentFront = new IntNode(-1, null, null );
        sentFront.next = new IntNode(x, sentFront, null);
        size = 1;
    }

    public DLList(){
        size = 0;
        sentFront = new IntNode(-1, null);
    }

    /*Adds an item to start of the list */
    public void addFirst(int num){
        sentFront.next = new IntNode(num, sentFront.next);
        size++;
    }

    /*Gets the first item in the list */
    public int getFirst(){
        return sentFront.next.item;
    }

    /*Gets las item in the list */
    public void addLast(int num){
        IntNode cursor = sentFront;
        //Reach the last element of the list
        while (cursor.next != null) {
            cursor = cursor.next;
        }
        //Add the item to that found.next end of the list
        cursor.next = new IntNode(num, null);
        size++;
    }

    /*Print all items in list */
    public void printList(){
        IntNode cursor = sentFront.next;
        while (cursor != null) {
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
        return size(sentFront.next);
    }


    public static void main(String[] args) {
        /*Crates a list of one integer, 10 */
        SLList A = new SLList();
        A.printList();
        SLList L = new SLList(70);
        L.addFirst(60);
        L.addFirst(40);
        L.addLast(80);
        //System.out.println(L.getFirst());
        L.printList();
        System.out.println("size of shis list is: " + L.size());
        System.out.println("size of shis list is (USING FASTER METHOD): " + L.size);



    }


}
