package strings;

public class check {
    public static void main(String args[]){
        String str="AdarshPoloji";
        String str1="polojiadarsh";
        String str2="AdarshPoloji";

        System.out.println(str.equals(str1)+" "+str.equals(str2));

        String st="ApnaCollege".replace("l","");
        System.out.println(st);
    }
}
