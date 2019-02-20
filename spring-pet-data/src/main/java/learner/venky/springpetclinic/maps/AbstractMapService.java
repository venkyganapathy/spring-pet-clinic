package learner.venky.springpetclinic.maps;

import learner.venky.springpetclinic.models.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, IDType extends Long> {

    protected Map<IDType,T> map = new HashMap<IDType, T>();

    Set<T> findAll(){
        return new HashSet<T>(map.values());
    }

    T findById(IDType id){
        return map.get(id);
    }

    T save(IDType id, T object){
        if (object != null){
            if (object.getId() == null || object.getId() == 0 ){
                object.setId(getNextId());
                map.put((IDType) object.getId(),object);
            }
        }
        return object;
    }

    void deleteById(IDType id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    Long getNextId(){
        Long maxId;
        if (!map.isEmpty()){
            maxId = (Long) Collections.max(map.keySet());
        } else maxId = 0L;

        return maxId+1;
    }
}
