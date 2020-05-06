import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to library");
        System.out.println("------------------");
        System.out.println("the books in this library are:");
        System.out.println("ghaleheivanat,raz,4asarazflorans,dastan2shahr,ghoroorvataasob,royayetalarsorkh,afsanehayeanderson,bisthezarfasrang,barbadrafte,drakoola,shazdekocholo");
        System.out.println("and authornames are:");
        System.out.println("GeorgeOrwell,RhondaByrne,florans,CharlesDickens,JaneAusten,GaoEanderson,JulesVerne,MargaretMitchell,BramStoker,AntoinedeSaintExupery");
        System.out.println("what do you want to search? (search with bookname or authorname)" );
        System.out.println("search with bookname:enter 1 and search with authorname enter 2");
        Scanner scanner=new Scanner(System.in);
        Library library=new Library();
        int x=scanner.nextInt();
        if(x==1){
            System.out.println("enter bookname:");
            String bookname=scanner.next();
            Collections.sort(library.bookname);
            library.searchbook(bookname);
        }
        else{
            System.out.println("enter author name");
            String authorname=scanner.next();
            Collections.sort(library.author);
            library.searchauthor(authorname);
        }






    }
}