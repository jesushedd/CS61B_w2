public class IntList {
    
    /*Instance variables */
    public int first;
    public IntList rest;
    
    
    /*Constructor for intlist */
    public IntList(int f, IntList r){
        first = f;
        rest = r; 
    }


    /*Non recursive size method */
    public int iterativeSize(){
        int size = 0;
        IntList cursor = this;
        while (cursor != null) {
            size++;
            cursor = cursor.rest;

        }
        return size;
    }


    /*Recrusive size method */
    public int size(){
        if (rest == null) {
            return 1;
        } else{
        return 1 + this.rest.size();
        }
    }


    /*get the element in nth position */
    public int get(int n){
        if (n == 0) {
            return first;
        } else {
            return this.rest.get(n -1);
        }
    }


    /*Print all elements in list */
    public void printList(){
        IntList cursor = this;
        while (cursor != null) {
          System.out.println(cursor.first);
          cursor = cursor.rest;
        }
    }


    public static void main(String[] args) {
        /*crear nodo  head "L" y rellenarlo de adelante hacia atras
        IntList L = new IntList();
        L.first = 5;
        L.rest = null;

        L.rest = new IntList();
        L.rest.first = 10;

        L.rest.rest = new IntList();
        L.rest.rest.first = 15;*/

        IntList L = new IntList(25, null);
        L = new IntList(10, L);
        L = new IntList(5, L);
        System.out.println(L.iterativeSize());
        //System.out.println(L.size());
        System.out.println("El elemento 0 de la lista es: " + L.get(0));
        System.out.println("El elemento 1 de la lista es: " + L.get(1));
        System.out.println("El elemento 2 de la lista es: " + L.get(2));
    }
}
