class Car{
    private Integer id;
    private String license;
    private Account driver;
    private Integer passegenger;

    public Car(String license,Account driver){
        this.license=license;
        this.driver=driver;
        

    }

    void printDataCar(){
        if(passegenger!=null){
            System.out.println("licencia: "+this.license+" "+"conductor: "+driver.name+" "+"pasajeros: "+this.passegenger);
        }
        

    }

    public Integer getPassenger(){
        return passegenger;
    }

    public void setPasseenger(Integer passenger){
        if(passenger>=4){
            this.passegenger=passenger;
        }else{
            System.out.println("**Alerta:lo minimo son 4 pasajeros");
        }
        
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public Account getDriver() {
		return driver;
	}

	public void setDriver(Account driver) {
		this.driver = driver;
	}

    
}