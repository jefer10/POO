import java.util.ArrayList;
import java.util.Map;

class Ubervan extends Car{
    String brand;
    String model;
    private Integer passegenger;
    Map<String,Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public Ubervan(String license,Account driver,Map<String,Map<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typeCarAccepted=typeCarAccepted;
        this.seatsMaterial=seatsMaterial;
    }

    @Override
    public void setPasseenger(Integer passenger) {
        if(passenger>=6){
            this.passegenger=passenger;
        }else{
            System.out.println("**Alerta:lo minimo son 4 pasajeros");
        }
    }
}