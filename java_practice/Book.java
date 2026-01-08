public class Book {
    String title;
    String Author;
    int NoOfpages;
    int currentpage;
   public void displaybookinfo(String title,String Author){
     System.out.println("The title of the book:"+title);
       System.out.println("The Author of the book:"+Author);
   }
    public int calculatepage(int NoOfpages, int  currentpage ){
        return NoOfpages-currentpage;
    }
}
