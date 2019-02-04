package learner.venky.springpetclinic.maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, IDType> {

    protected Map<IDType,T> map = new HashMap<IDType, T>();

    Set<T> findAll(){
        return new HashSet<T>(map.values());
    }

    T findById(IDType id){
        return map.get(id);
    }

    T save(IDType id, T object){
        map.put(id,object);
        return object;
    }

    void deleteById(IDType id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }
}
