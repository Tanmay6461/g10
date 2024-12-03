package Db;

import Business.Model.Canteen;
import Business.Model.Lab;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.config.TypeAlias;
import Business.Model.SystemAdmin;

import Business.Model.Pharmacy;

/**
 *
 * @author Tanmay Paawar
 */
public class Dbutils {
    
    private static Dbutils dbUtils;

    private Dbutils() {
    }

    public static Dbutils getInstance() {
        if (dbUtils == null) {
            dbUtils = new Dbutils();
        }
        return dbUtils;
    }

    private ObjectContainer createConnection() {
        EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
        config.common().activationDepth(Integer.MAX_VALUE);
        config.common().updateDepth(Integer.MAX_VALUE);

        // Add cascading for the relevant classes
        config.common().objectClass(Canteen.class).cascadeOnUpdate(true);
        config.common().objectClass(Lab.class).cascadeOnUpdate(true);
        config.common().objectClass(Pharmacy.class).cascadeOnUpdate(true);

        // Define aliases if needed
        // Example for adding an alias
         config.common().addAlias(new TypeAlias("Business.Model.Hotel", "Business.Model.Canteen"));
        config.common().addAlias(new TypeAlias("Business.Model.BusinessEvent", "Business.Model.Lab"));
        config.common().addAlias(new TypeAlias("Business.Model.Restaurant", "Business.Model.Pharmacy"));

        // Create or open a new database file
        ObjectContainer db = Db4oEmbedded.openFile(config, "database/NewFeelHome.db4o");
        return db;
    }

    public synchronized void storeSystem(SystemAdmin system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }

    public SystemAdmin retrieveSystem() {
        try {
            ObjectContainer conn = createConnection();
            ObjectSet<SystemAdmin> systems = conn.query(SystemAdmin.class); // Change to the object you want to save
            SystemAdmin system;
            if (systems.isEmpty()) {
                system = SystemAdmin.createSystemAdmin();
            } else {
                system = systems.get(systems.size() - 1);
            }
            conn.close();
            return system;
        } catch (Exception ex) {
            System.out.print(ex);
        }
        return null;
    }
}
