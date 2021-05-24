package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 * @author gengke
 */
public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
