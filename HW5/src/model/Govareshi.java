package model;

import java.util.List;

public class Govareshi implements DrugsServ {
    @Override
    public void save(String name) throws Exception {
        try (DrugsRepo drugsRepo = new DrugsRepo ()) {
            DrugsEntity drugsEntity=new DrugsEntity();
            drugsEntity.setName(name).setGroup("govareshi");
            drugsRepo.insert (drugsEntity);
            drugsRepo.commit ();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
