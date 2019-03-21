
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashMap;
import java.util.Map;

public class MyMain {

    public static void main(String[] args) {


        Map<String, String> connectionProperties = new HashMap<>();

        connectionProperties.put("persistenceUnit", ("..."));
        connectionProperties.put("openjpa.jdbc.Schema", ("..."));
        connectionProperties.put("openjpa.ConnectionUserName", "...");
        connectionProperties.put("openjpa.ConnectionURL", "jdbc:postgresql://localhost:15432/surveys?disableColumnSanitiser=true");

        String persistenceUnit = connectionProperties.get("persistenceUnit");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnit, connectionProperties);

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.close();


    }
}
