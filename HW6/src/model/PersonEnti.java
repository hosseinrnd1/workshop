package model;

public class PersonEnti {
    private  String name,family,dateofbirth,fathername;

    public String getName() {
        return name;
    }

    public PersonEnti setName(String name) {
        this.name = name;
        return this;
    }

    public String getFamily() {
        return family;
    }

    public PersonEnti setFamily(String family) {
        this.family = family;
        return this;
    }

    public String getDateoofbirth() {
        return dateofbirth;
    }

    public PersonEnti setDateoofbirth(String dateoofbirth) {
        this.dateofbirth = dateoofbirth;
        return this;
    }

    public String getFathername() {
        return fathername;
    }

    public PersonEnti setFathername(String fathername) {
        this.fathername = fathername;
        return this;
    }
}
