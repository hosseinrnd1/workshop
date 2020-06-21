package model;

import java.util.List;

public class DrugsServ1 {
    private static DrugsServ1 ourInstance = new DrugsServ1();

    public static DrugsServ1 getInstance() {
        return ourInstance;
    }

    private DrugsServ1() {
    }
    public List<DrugsEntity> report(String group) throws Exception {
        List<DrugsEntity> drugsEntities;
        try (DrugsRepo drugsRepo=new DrugsRepo ()){
            drugsEntities=drugsRepo.select (group);
        }
        return drugsEntities;
    }
}
