
public class Rectangle{
    private double height;
    private double width;
    public void setheight(double height){
        this.height=height;}
    public void setwidth(double width){
        this.width=width;}
    public double getheight(){
        return height;}
    public double getwidth(){
        return width;}

    public double area(double height, double width){
        this.height=height;
        this.width=width;
        return height*width;}

    public double perimeter(double height, double width){
        this.height=height;
        this.width=width;
        return 2*(height+width);}
}