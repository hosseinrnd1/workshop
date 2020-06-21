import model.DrugsEntity;
import model.DrugsFactory;
import model.DrugsServ;
import model.DrugsServ1;

import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        DrugsServ drugsServ= DrugsFactory.getgroup(DrugsServ.GhalbVaOrough);
        try {
            drugsServ.save("darooye1");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        DrugsServ drugsServ1= DrugsFactory.getgroup(DrugsServ.AasabVaRavan);
        try {
            drugsServ1.save("darooye2");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        DrugsServ drugsServ2= DrugsFactory.getgroup(DrugsServ.Govareshi);
        try {
            drugsServ2.save("darooye3");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


        DrugsServ drugsServ3= DrugsFactory.getgroup(DrugsServ.GhalbVaOrough);
        try {
            drugsServ3.save("darooye4");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        DrugsServ drugsServ4= DrugsFactory.getgroup(DrugsServ.AasabVaRavan);
        try {
            drugsServ4.save("darooye5");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        DrugsServ drugsServ5= DrugsFactory.getgroup(DrugsServ.Govareshi);
        try {
            drugsServ5.save("darooye6");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


        DrugsServ drugsServ6= DrugsFactory.getgroup(DrugsServ.GhalbVaOrough);
        try {
            drugsServ6.save("darooye7");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        DrugsServ drugsServ7= DrugsFactory.getgroup(DrugsServ.AasabVaRavan);
        try {
            drugsServ7.save("darooye8");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        DrugsServ drugsServ8=DrugsFactory.getgroup(DrugsServ.Govareshi);
        try {
            drugsServ8.save("darooye9");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


        System.out.println("enter group for display its drugs");
        Scanner scanner= new Scanner(System.in);
        String group=scanner.next();
        try {
            List<DrugsEntity> drugsEntityList = DrugsServ1.getInstance().report(group);
            for (DrugsEntity drugsEntity : drugsEntityList) {
                System.out.println(drugsEntity.getGroup());
                System.out.println(drugsEntity.getName());

            }
        }

        catch (Exception e){
            System.out.println ("Fail to report!"+e.getMessage ());
        }









    }
}
