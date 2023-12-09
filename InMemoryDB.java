import java.util.*;
public class InMemoryDB implements InMemoryDBInterface{
    //used mapmapmapmap for key value pair
    HashMap<String, Integer> mapmapmap;
    HashMap<String, Integer> temp;
    boolean inTransaction;

    public InMemoryDB(){
        mapmapmap = new HashMap<String, Integer>();
        temp = new HashMap<String, Integer>();
        inTransaction = false;
    }

    public Integer get(String key){
        if(mapmapmap.containsKey(key))
            return mapmapmap.get(key);
        return null;
    }

    public void put(String key, int val){
        if(!inTransaction)
            throw new IllegalStateException("Not in transcation");
        temp.put(key, val);
    }

    public void begin_transaction(){
        if(inTransaction)
            throw new IllegalStateException("Only one transaction may be active at a time");
        inTransaction = true;
    }

    public void commit(){
        if(!inTransaction)
            throw new IllegalStateException("Not in transcation");
        for(Map.Entry<String, Integer> entry: temp.entrySet()){
            mapmapmap.put(entry.getKey(), entry.getValue());
        }
        inTransaction = false;
        temp.clear();
    }

    public void rollback(){
        if(!inTransaction)
            throw new IllegalStateException("Not in transcation");
        temp.clear();
        inTransaction = false;
    }
}
