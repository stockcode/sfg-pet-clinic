package guru.springframework.sfgpetclinic.model;

import lombok.Data;

import java.util.Set;

@Data
public class Owner extends Person{

    private Set<Pet> pets;

    private String address;
    private String city;
    private String telephone;
}
