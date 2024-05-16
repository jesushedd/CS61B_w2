public class IntList {
    public int first;
    public IntList rest;
    
    public IntList(int f, IntList r){
        first = f;
        rest = r; 
    }

    /*Non recursive size method */
    public int sizeLoop(){
        int size = 0;
        IntList cursor = this;
        while (cursor != null) {
            size++;
            cursor = cursor.rest;

        }
        return size;
    }

    public int sizeRec(){
        if (rest == null) {
            return 1;
        } else{
        return 1 + this.rest.sizeRec();
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

        IntList L = new IntList(10, null);
        L = new IntList(10, L);
        L = new IntList(5, L);
        System.out.println(L.sizeLoop());
        System.out.println(L.sizeRec());

    }
}
