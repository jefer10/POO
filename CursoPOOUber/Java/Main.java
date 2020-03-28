class Main{
    
    public static void main(final String[] args) {
        System.out.println("Hola mundo");
        Car car=new Car("AMQ123",new Account("pepito perez", "1234567890"));
        car.passegenger=4;
        car.printDataCar();
        

        Car car2=new Car("ZXC346",new Account("sutanejo alvarez","2234567890"));
        car2.passegenger=4;
        car2.printDataCar();

    }
}