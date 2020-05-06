import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.lang.reflect.Array;
import java.util.*;

public class Library {

    String[] booknames={"ghaleheivanat","raz","4asarazflorans","dastan2shahr","ghoroorvataasob","royayetalarsorkh","afsanehayeanderson","bisthezarfasrang","barbadrafte","drakoola","shazdekocholo"};
    public  List<String> bookname=new ArrayList<>(Arrays.asList(booknames));
    String[] authors={"GeorgeOrwell","RhondaByrne","florans","CharlesDickens","JaneAusten","GaoE","anderson","JulesVerne","MargaretMitchell","BramStoker","AntoinedeSaintExupery"};
     public  List<String> author=new ArrayList<>(Arrays.asList(authors));


    public  void searchbook(String book){
        int result=Collections.binarySearch(bookname,book);
        if(result>=0){
            System.out.println("found book");
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter your name");
            String name=scanner.next();
            System.out.println("enter your family");
            String family=scanner.next();
            System.out.println("enter your fathername");
            String fathername=scanner.next();
            System.out.println("enter your nationalcode");
            String nationalcode=scanner.next();
            Person person=new Person().setname(name).setfamily(family).setfathername(fathername).setnationalcode(nationalcode);
            System.out.println("this book was lent to tou");
        }
        else
            System.out.println("not found");

    }
    public  void searchauthor(String authorname){
        int result=Collections.binarySearch(author,authorname);
        if(result>=0){
            System.out.println("found");
            System.out.println("this author has these books:");
            int i;
            for (i=0;i<12;i++){
                if(authors[i].equalsIgnoreCase(authorname)){
                    System.out.println(booknames[i]);
                    break;
                }
            }
            System.out.println("do you want this book? \n enter yes or no");
            Scanner scanner=new Scanner(System.in);
            String c=scanner.next();
            if (c.equals("yes")){

            System.out.println("enter your name");
            String name=scanner.next();
            System.out.println("enter your family");
            String family=scanner.next();
            System.out.println("enter your fathername");
            String fathername=scanner.next();
            System.out.println("enter your nationalcode");
            String nationalcode=scanner.next();
            Person person=new Person().setname(name).setfamily(family).setfathername(fathername).setnationalcode(nationalcode);
            System.out.println("this book was lent to tou");}
            else
                System.out.println("thanks for watch our library");
        }
        else
            System.out.println("not found");

    }



}
