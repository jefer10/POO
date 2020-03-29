class User extends Account{
    Integer id;


    public User(Integer id,String name,String document){
        super(name, document);
        this.id=id;

    }
}
