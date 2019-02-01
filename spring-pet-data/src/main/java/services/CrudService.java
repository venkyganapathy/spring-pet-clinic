package services;

import java.util.Set;

public interface CrudService<T, IdType> {

    Set<T> findAll();

    T findById(IdType id);

    T save(T object);

    void delete(T object);

    void deleteById(IdType id);
}
