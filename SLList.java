public class SLList {
    private static class IntNode {
    
        /*Instance variables */
        public int item;
        public IntNode next;
        
        
        /*Constructor for IntNode */
        private IntNode(int i, IntNode r){
            item = i;
            next = r; 
        }
    }   
    //public int item;
    // made it private to no mess with implementation from other classes
    private IntNode first;

    public SLList(int x){
        first = new IntNode(x, null);
    }

    /*Adds an item to start of the list */
    public void addFirst(int num){
        IntNode toAdd = new IntNode(num, first);
        first = toAdd; 
    }

    /*Gets the first item in the list */
    public int getFirst(){
        return first.item;
    }

    /*Gets las item in the list */
    public void addLast(int num){
        IntNode cursor = this.first;
        //Reach the last element of the list
        while (cursor.next != null) {
            cursor = cursor.next;
        }

        //Add the item to that found.next end of the list
        cursor.next = new IntNode(num, null);
    }

    /*Print all items in list */
    public void printList(){
        IntNode cursor = this.first;
        while (cursor != null) {
            System.out.println(cursor.item);
            cursor = cursor.next ;
        }
    }

    /*Get size of the list */
    public int size(){
        IntNode cursor = this.first;
        int s = 0;
        /*Look for end of list */
        while (cursor != null) {
            s++;
            cursor = cursor.next;
        }
        return s;

    }


    public static void main(String[] args) {
        /*Crates a list of one integer, 10 */
        SLList L = new SLList(70);
        L.addFirst(60);
        L.addFirst(40);
        L.addLast(80);
        //System.out.println(L.getFirst());
        L.printList();
        System.out.println("size of shis list is: " + L.size());



    }


}
