package model;

import model.PersonRepo;

import java.util.List;


public class PersonServ {
    private PersonServ () {
    }

    private static PersonServ personServ = new PersonServ ();

    public static PersonServ getInstance () {
        return personServ;
    }

    public void save (PersonEnti personEnti) throws Exception {
        try (PersonRepo personRepo = new PersonRepo ()) {
            personRepo.insert (personEnti);
            personRepo.commit ();
        }
    }
    public void edit (PersonEnti personEnti) throws Exception {
        try (PersonRepo personRepo = new PersonRepo ()) {
            personRepo.update (personEnti);
            personRepo.commit ();
        }
    }
    public void display() throws Exception {
        try (PersonRepo personRepo = new PersonRepo ()) {
            personRepo.display ();
            personRepo.commit ();
        }
    }

    public void delete(PersonEnti personEnti) throws Exception {
        try (PersonRepo personRepo = new PersonRepo ()) {
            personRepo.delete(personEnti);
            personRepo.commit ();
        }
    }

    public void save1 (PersonEnti personEnti) throws Exception {
        try (PersonRepo personRepo = new PersonRepo ()) {
            personRepo.insert1 (personEnti);
            personRepo.commit ();
        }
    }
    public void edit1 (PersonEnti personEnti) throws Exception {
        try (PersonRepo personRepo = new PersonRepo ()) {
            personRepo.update1 (personEnti);
            personRepo.commit ();
        }
    }
    public void display1() throws Exception {
        try (PersonRepo personRepo = new PersonRepo ()) {
            personRepo.display1 ();
            personRepo.commit ();
        }
    }

    public void delete1(PersonEnti personEnti) throws Exception {
        try (PersonRepo personRepo = new PersonRepo ()) {
            personRepo.delete1(personEnti);
            personRepo.commit ();
        }
    }







}
