package Java.code_with_Deepak;

public class Star_Patterns {
    public static void main(String[] args) {
//        System.out.println("First Star Pattern");//right-angled triangle
//        starPattern1();
//        System.out.println("Second Star Pattern");//inverted right-angled triangle
//        starPattern2();
//        System.out.println("Third Star Pattern"); //arrow
//        starPattern3();
//        System.out.println("Fourth star Pattern");//inverted right-angled triangle
//        starPattern4();
//        System.out.println("Fifth star Pattern");//inverted right-angled triangle
//        starPattern5();
//        System.out.println("Sixth Star Pattern"); //arrow
//        starPattern6();
//        System.out.println(("Seventh Star Pattern"));
//        starPattern7();
    }

    static void starPattern1(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void starPattern2(){
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void starPattern3(){
        for (int i=1 ; i<5 ; i++){
            for(int j=1; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int x=1 ; x<=5 ; x++){
            for (int y=5; y>=x ;y--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void starPattern4(){
        for(int i=5 ; i>0; i--){
            for(int j=4; j>=i;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void starPattern5(){
        for(int i=1 ; i<=5; i++){
            for(int j=4; j>=i;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void starPattern6(){
        for(int i=1 ; i<=6; i++){
            for(int j=5; j>=i;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=6 ; i>0; i--){
            for(int j=6; j>=i;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void starPattern7(){
        for(int i=1;i<=3;i++){
            for(int j=3; j>=i;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("+ ");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void starPattern8(){

    }
}
