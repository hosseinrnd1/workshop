import model.PersonEnti;
import model.PersonServ;

public class Main {
    public static void main(String[] args) {


        try{
            PersonServ.getInstance().save(new PersonEnti().setName("dreil").setGender("metal").setCountryname("china").setWeight(420000.0).setPrice(656000.0));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            PersonServ.getInstance().save(new PersonEnti().setName("hacksaw").setGender("stony").setCountryname("china").setWeight(22000.0).setPrice(400000.0));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            PersonServ.getInstance().save(new PersonEnti().setName("grater").setGender("metal").setCountryname("china").setWeight(743000.0).setPrice(543000.0));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            PersonServ.getInstance().edit(new PersonEnti().setName("grater").setGender("metal").setCountryname("USA").setWeight(743000.0).setPrice(543000.0));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            PersonServ.getInstance().delete(new PersonEnti().setName("dreil"));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            PersonServ.getInstance().display();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            PersonServ.getInstance().save1(new PersonEnti().setName("detector").setGender("metal").setCountryname("china").setWeight(23400.0).setPrice(200000.0));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            PersonServ.getInstance().save1(new PersonEnti().setName("meter").setGender("metal").setCountryname("german").setWeight(25000.0).setPrice(286000.0));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            PersonServ.getInstance().save1(new PersonEnti().setName("scissor").setGender("metal").setCountryname("china").setWeight(3020.0).setPrice(563000.0));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            PersonServ.getInstance().edit1(new PersonEnti().setName("scissor").setGender("metal").setCountryname("england").setWeight(3020.0).setPrice(563000.0));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            PersonServ.getInstance().delete1(new PersonEnti().setName("meter"));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            PersonServ.getInstance().display1();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }







    }
}
