
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        Book B1=new Book();
        int x = p1.calculateAge(1995, 2016);
       // System.out.println("Current person age:"+p1.calculateAge(1995, 2016));
        System.out.println("display information of person");
        p1.displaypersoninfo("nigist", "female", x);
        int totalpage=B1.calculatepage(500,120);
        System.out.println("display information of the book");
        B1.displaybookinfo("fikir eske mekabr","hadis alemayehu");
        System.out.println("The number of the page that remaining to read:"+totalpage);
    }
}