class Main{
    
    public static void main(final String[] args) {
        System.out.println("Hola mundo");
        Uberx uberx=new Uberx("AMQ123",new Account("pepito perez", "1234567890"),"12343","1224334");
        uberx.setPasseenger(3);
        //uberx.passegenger=4;
        uberx.printDataCar();
        

        Car car2=new Car("ZXC346",new Account("sutanejo alvarez","2234567890"));
        //car2.passegenger=4;
        car2.printDataCar();

    }
}