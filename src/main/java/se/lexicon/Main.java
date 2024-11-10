package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Person creator = new Person(4, "Nisse" , "Olsson" ,  "nisse@gmail.com");
        System.out.println(creator.getSummary());



    }
}