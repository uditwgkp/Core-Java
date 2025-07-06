public class Pattern {
    public static void main(String[] args) {

        /*-------- RECTANGLE PATTERN ----------*/
        System.out.println("Rectangle pattern");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print("*");
            }
           System.out.println();
        }

        /*-------- HOLLOW RECTANGLE PATTERN --------*/
        System.out.println("\n Hollow Rectangle pattern");
        int n=6;
        int m=7;

        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop;
            for (int j = 1; j <= m; j++) {
                //cell->(i,j)
                if (i==1 || j==1 || i==n || j==m ) {
                    System.out.print("X");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }

        /*-------- HALF PYRAMID --------*/
        System.out.println("\n Half Pyramid");
        int pyramidHeight=5;
        for (int i = 1; i <= pyramidHeight; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("^");
            }
            System.out.println();
        }

        /*-------- INVERTED HALF PYRAMID -------*/
        System.out.println("\n Inverted Half pyramid");
        for (int i = 1; i <= pyramidHeight; i++) {
            for (int j = 1; j <= pyramidHeight-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
               System.out.print("*"); 
            }
            System.out.println();
        }

        for (int i = 1; i <= pyramidHeight; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = pyramidHeight; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        /*------FLOYD's TRIANGLE------ */
        System.out.println("Floyd's Triangle");
        int number=1;
        for (int i = 1; i <=pyramidHeight; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number+ " ");
                number++;
            }
            System.out.println();
        }

        /*------ 0-1 TRIANGLE */
        System.out.println("O-1 Traiangle");

        for (int i = 1; i <= pyramidHeight; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j)%2==0) {
                    System.out.print(1 + " ");
                }else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }

        /*---- SOLID ROMBUS */
        System.out.println("Solid Rombus");
        for (int i = pyramidHeight; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = i; j <i+pyramidHeight; j++) {
                System.out.print('R'+ " ");
            }
            System.out.println();
        }
    }
}
