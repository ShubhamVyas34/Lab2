package sample;

import java.util.ArrayList;
import java.util.Collections;

public class StringExample {
    public static void main(String[] args) {
        String str= new String("I love java");
        String str2= new String("I love java");
        System.out.println(" 1. Using == and equals method");
        //Comparing as objects
        /*
        * == is used to compare string objects not their content
        * */
        if(str==str2){
            System.out.println("They arte same");
        }
        else{
            System.out.println("They are not same");
        }

        /*
        * Equals method is used to compare the content of the string object
        * */
        //Comparing using String data
        if(str.equals(str2)){
            System.out.println("They are same");
        }

        else{
            System.out.println("They are not same");
        }

        //Comparing using string with manually inputted string
        if(str=="I love java"){
            System.out.println("They are same");
        }
        else{
            System.out.println("They are not same");
        }
        System.out.println("");
        System.out.println(" 2. Using compareTo method ");
        String str3="I love the espresso machine";
        System.out.printf("str.compareTo(str3): %d%n",str3.compareTo(str));

        ArrayList<String> strings=new ArrayList<>();
        strings.add(str);
        strings.add(str2);
        strings.add(str3);

        System.out.println(strings);
        Collections.sort(strings);
        System.out.println("After Sort : "+strings);
        System.out.println(String.format("%f -> %.1f%n",0.234534343,0.0234534343));
        for(int i=0;i<=10;i++){
            for(int j=1;j<=10;j++){
                System.out.printf("%4d",i*j);
            }
            System.out.println("");
        }

    }

}
