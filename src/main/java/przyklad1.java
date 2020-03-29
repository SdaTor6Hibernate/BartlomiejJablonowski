import model.Address;
import model.Country;
import model.Order;
import model.User;
import org.hibernate.Session;
import util.HibernateUtil;

public class przyklad1 {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
//        Country country = session.find(Country.class, 1);
//        session.close();

//        Address address = session.find(Address.class, 3);
//        session.close();

//        Order order = session.find(Order.class, 1);
//        session.close();

        User user = session.find(User.class, 3);
        session.close();

        System.out.println(user.toString());

    }
}
