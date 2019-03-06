package ac.za.cput;

public class myObj {

    private String name;
    private int age;

    public myObj(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj){
        myObj myobj = (myObj) obj;
        boolean status = false;
        if(this.name.equalsIgnoreCase(myobj.name)
                && this.age == myobj.age){
            status = true;
        }
        return status;
    }
}
