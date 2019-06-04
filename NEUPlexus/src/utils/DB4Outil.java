/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.db4o.ObjectSet;
import java.nio.file.Paths;
import neuplexus.NEUPlexus;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import neuplexus.ConfigureSystem;

/**
 *
 * @author Apurva
 */
public class DB4Outil {
    private static final String FILENAME = Paths.get("NeuPlexus.db4o").toAbsolutePath().toString();
    private static DB4Outil db4oUtil; 
    
    public synchronized static DB4Outil getInstance(){
        if(db4oUtil==null){
            db4oUtil = new DB4Outil();
        }
        return db4oUtil;
    }
    
     private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(NEUPlexus.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }
    
    public synchronized void storeSystem(NEUPlexus system){
       ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }
    
    public NEUPlexus retrieveSystem(){
        ObjectContainer conn = createConnection();
        ObjectSet<NEUPlexus> systems = conn.query(NEUPlexus.class); // Change to the object you want to save
        NEUPlexus system;
        if (systems.size() == 0){
           system = ConfigureSystem.configure();  // If there's no System in the record, create a new one
        }
        else{
            system = systems.get(systems.size() - 1);
        }
        conn.close();
        return system;
    }
}
