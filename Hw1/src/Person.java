public class Person {
    private String name;
    private String family;
    private String nationalcode;
    private String fathername;
    public Person setname(String name){
        this.name=name;
        return this;
    }

    public String getname() {
        return name;
    }

    public Person setfamily(String family){
        this.family=family;
        return this;
    }

    public String getfamily() {
        return family;
    }
    public Person setnationalcode(String nationalcode){
        this.nationalcode=nationalcode;
        return this;
    }

    public String getnationalcode() {
        return nationalcode;
    }
    public Person setfathername(String fathername){
        this.fathername=fathername;
        return this;
    }

    public String getfathername() {
        return fathername;
    }




}
