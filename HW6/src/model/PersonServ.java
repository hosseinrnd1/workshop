package model;

public class PersonServ {
    private static PersonServ instance = new PersonServ();

    private PersonServ() {


    }

    public static PersonServ getInstance() {
        return instance;
    }


    public void save(PersonEnti personEnti)throws  Exception
    {
        try(PersonRepo personRepo=new PersonRepo()) {
          personRepo.insert(personEnti);
         personRepo.commit();

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public void edit(PersonEnti personEnti)throws  Exception
    {
        try(PersonRepo personRepo=new PersonRepo()) {
            personRepo.update(personEnti);
            personRepo.commit();

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public void delete(String family)throws  Exception
    {
        try(PersonRepo personRepo=new PersonRepo()) {
            personRepo.delete(family);
            personRepo.commit();

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
