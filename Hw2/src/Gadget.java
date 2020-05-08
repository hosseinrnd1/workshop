public class Gadget<Name,Gender,Type,Countryname,Weight,Price> {
    Name name;
    Gender gender;
    Type type;
    Countryname countryname;
    Weight weight;
    Price price;
    public Gadget( Name name,Gender gender,Type type,Countryname countryname,Weight weight ,Price price){
        this.name=name;
        this.gender=gender;
        this.type=type;
        this.countryname=countryname;
        this.weight=weight;
        this.price=price;
    }

    public double discount(){
         double discount=(0.05)*(Double) price;
        return ((Double)price-discount);

    }
    public double tax(){
        double tax=(0.1)*(Double)price;
        return ((Double)price+tax);
    }
    public double pricewithCustumsduty(){
        double pricewithCustumsduty=(0.1)*(Double)price;
        return (pricewithCustumsduty+(Double)price);
    }
    public double pricewithproducersprofit(){
        double pricewithproducersprofit=(0.5)*(Double)price;
        return ((Double)price+pricewithproducersprofit);
    }
    public double finalprice(){
        double x=2*((0.1)*(Double)price);
        double finalprice=(Double)price+x+((0.5)*(Double)price)-((0.05)*(Double) price);
        return finalprice;
    }

    public String toString(){
        return String.format("name of the gadget is %s%n its gender is %s%n its type is %s%n its country name is %s%n its weight is %.2f gr%n price with discount is %.2f T %n price with tax is %.2f T %n price with Custumsduty is %.2f T %n price with producersprofit is %.2f T%n and finalprice is %.2f T %n ",name,gender,type,countryname,weight,discount(),tax(),pricewithCustumsduty(),pricewithproducersprofit(),finalprice());
    }


}
