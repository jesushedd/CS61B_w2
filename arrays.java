public class arrays {
    public static void main(String[] args) {
        int arr1[] = {4,6} ;
        for (int i : arr1) {
            System.out.println(i);
        }

        int[] z = null;
        int[] x,y;

        x = new int[]{1,2,3,4,5,6};
        y = x;
        y[0] = 99;
        x = new int[]{99,98,76,56};
        y = new int[6];
        z = new int[0];
        int xL = x.length;
        System.out.println(xL);

        String[] str = new String[7];
        str[0] = "yqweasdadfsgdfgsdfghsdhsfghfghfghfghfghfghfghfghfdghdfgnvbnfhnvcbndfhfgnfgnfgn";
        str[4] = "ketchuñp";
        System.out.println(str[4]);
        System.out.println("\n\n");

        int[][]xx = {{1,2,3}, {4,5,6}, {7,8,9}};

        int[][]zz = new int[3][];
        zz[0] = xx[0];
        zz[1] = xx[1];
        zz[2] = xx[2];
        zz[0][0] = -zz[0][0];
        //z[0][0] --> -1 = xx[0][0]

        int[][] w = new int[3][3];

        System.arraycopy(xx[0], 0, w[0], 0, 3);
                        //w[0] = {-1,2,3}
        System.arraycopy(xx[1], 0, w[1], 0, 3);
                        //w[1] = {4,5,6}
        System.arraycopy(xx[2], 0, w[2], 0, 3);
                        //w[2] = {7,8,9}
        w[0][0] = - w[0][0];
        //w[0][0] = 1


        System.out.println("x: " + xx[0][0] + "\tw: " + w[0][0] );



                


    }
}
