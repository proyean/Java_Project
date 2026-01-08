public class Person {
    String name;
    String gender;
    int birthyear;
    int currentyear;
    public int calculateAge(int birthyear, int currentyear){
        return currentyear-birthyear;
    }
    public void displaypersoninfo(String name, String gender,int currentage){
        System.out.println("name:"+name);
        System.out.println("gender:"+gender);
        System.out.println("age:"+currentage);
    }
}
