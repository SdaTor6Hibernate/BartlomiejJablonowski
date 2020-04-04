import model.Country;
import org.hibernate.Session;
import util.HibernateUtil;

public class przyklad2 {
    public static void main(String[] args) {
       // usePersist();
        //useMerge();
        //useUpdate();
        useDelete();
    }


    public static void usePersist(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Country newCountry = new Country();
        newCountry.setName("India");
        newCountry.setAlias("IN");
        session.persist(newCountry);
        session.flush();
        session.close();
    }

    public static void useMerge(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Country newCountry = new Country();
        newCountry.setName("Spain");
        newCountry.setAlias("ES");
        session.merge(newCountry);
        session.flush();
        session.close();
    }

    public static void useUpdate(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Country country = new Country();
        country.setName("Norwey");
        country.setAlias("NR");
        session.update(country);
        session.flush();
        session.close();
    }


    public static void useDelete(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Country countryToBeDeleted = new Country();
        session.delete(countryToBeDeleted);
        session.flush();
        session.close();

    }
}
