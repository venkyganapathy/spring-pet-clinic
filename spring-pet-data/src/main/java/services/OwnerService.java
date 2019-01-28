package services;

import models.Owner;

import java.util.Set;

public interface OwnerService {

    public Owner findById(Long id);
    public Owner save(Owner owner);
    public Set<Owner> findAll();

}
