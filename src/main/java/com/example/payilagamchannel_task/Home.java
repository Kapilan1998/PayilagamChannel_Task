package com.example.payilagamchannel_task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@component is by default singleton (only 1 time constructor will called eventhough we created multiple objects)
@Component          // object creation of this class without creating manually  (spring bean will create automatically for this class), by this spring container will know object is created autiomatically
//@Scope(value = "prototype")         // for calling constructor 2 or more times
public class Home {


            // POJO class ( all are private type)
    private String owner;
    private int doorNo;
    @Autowired          // establlish connection between these 2 classes (Home & InternetConnection)  // search by type (InternetConnection)
    @Qualifier("abc")           // search by name (@Qualifier("<name>")   // specifying that the bean with the name "abc" should be injected
    private InternetConnection modem;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }

    public void connect(){
        System.out.println("system is connecting to internet");
        modem.switchOn();
    }
}
