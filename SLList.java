public class SLList {
    //public int item;
    // made it private to no mess with implementation from other classes
    private IntNode first;

    public SLList(int x){
        first = new IntNode(x, null);
    }

    public void addFirst(int num){
        IntNode toAdd = new IntNode(num, first);
        first = toAdd; 
    }

    public int getFirst(){
        return first.item;
    }

    public static void main(String[] args) {
        /*Crates a list of one integer, 10 */
        SLList L = new SLList(10);
        L.addFirst(35);
        L.addFirst(55);
        System.out.println(L.getFirst());

    }


}
