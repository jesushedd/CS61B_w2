public class Lists1Exercises {
    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static IntList incrList(IntList L, int x) {
      /* Recusrsive Increase */
      int num = L.first; // num = copy of L.first so original first isn't creased
      if (L.rest == null) {
        num += x;
        return new IntList(num, null);//each interation returns a node, base case last node
      }
      num += x; 
      return new IntList(num, incrList(L.rest, x));//non last nodes waits for new nodes until lastone        
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
      /* Your code here. */
      if (L.rest == null) {
        L.first -=x;
        return L;
      }
      L.first -=x;
      return dincrList(L.rest, x);
    }

    public static void main(String[] args) {
        IntList L = new IntList(25, null);
        L = new IntList(10, L);
        L = new IntList(5, L);

        System.out.println(L.size());
        System.out.println(L.iterativeSize());
        System.out.println("exercises outputs");

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
        // System.out.println(L.get(1));
        // System.out.println(incrList(L, 3));
        // System.out.println(dincrList(L, 3));   
        int toIncrease = 10;
        int toDecrease = 3; 
        System.out.println("Printing L before increasing...");
        L.printList();
        IntList copyOfL = Lists1Exercises.incrList(L, toIncrease);
        System.out.println("printing L after increasing....");
        L.printList();
        System.out.println("printing copyOfL... should be increased by " + toIncrease);
        copyOfL.printList();
        System.out.println("Printing L after decreasing... it is the same object.... so i'll print it twice\nShould be decreased by " + toDecrease);
        L.printList();
        dincrList(L, toDecrease);
        System.out.println("Decreased...");
        L.printList();
        
            
    }
}