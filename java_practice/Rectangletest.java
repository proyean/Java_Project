
import java.util.Scanner;

public class Rectangletest{

    public static void main(String[] args ){
        Scanner input=new Scanner(System.in);
        Rectangle mayrec1=new Rectangle();
        Rectangle mayrec2=new Rectangle();

        System.out.println(mayrec1.getheight());
        System.out.println("Area of rectangle one:"+mayrec1.area(4,8));
        System.out.println("Perimeter of rectangle one:"+mayrec1.perimeter(4,8));
        System.out.println("Area of rectangle two:"+mayrec2.area(6,10));
        System.out.println("Perimeter of rectangle two:"+mayrec2.perimeter(6,10));


    }
}