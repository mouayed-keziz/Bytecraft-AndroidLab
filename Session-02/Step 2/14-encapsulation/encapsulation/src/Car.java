public class Car {
    
    private String make;
    private String model;
    private int year;

    Car(String aMake, String aModel, int aYear) {
        //this.make = aMake;
        //this.model = aModel;
        //this.year = aYear;
        this.setMake(aMake);
        this.setModel(aModel);
        this.setYear(aYear);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String newMake){
        this.make = newMake;
    }

    public void setModel(String newModel){
        this.model = newModel;
    }

    public void setYear(int newYear){
        this.year = newYear;
    }
}
