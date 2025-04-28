//Getter and Setter
public class Car {

    private String make= "Tesla";
    private String model= "ModelX";
    private String color="Gray";
    private int doors=2;
    private boolean convertible=true;

    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getDoor(){
        return doors;

    }
    public boolean isCovertible(){
        return convertible;
    }

    public void setMake(String make){
        if(make==null)make= "unknown";
        String lowercaseMake= make.toLowerCase();
        switch (lowercaseMake) {
            case "holden","posrche","tesla"-> this.make =make;
            default ->{
                this.make="Unsupported";
            }
               
        }

    }

    public void setModel(String model){
        this.model=model;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setDoor(int doors){
        this.doors=doors;
    }
    public void setConvertible(boolean convertible){
        this.convertible=convertible;
    }

    public void describeCar(){
        System.out.println(doors + "-Door "+ color+ " "+make+" "+ model+ " "+(convertible? "Covertible": " "));
    }
    
 
}
