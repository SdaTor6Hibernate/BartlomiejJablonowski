package DAO;

//Utwórz klasę OrderDao, niech ta klasa dziedziczy po klasie GenericDao - stwórz odpowiedni kontruktor aby klasa mogła działać.
//napisz metody
// 1. findByDate()
// 2. findBeforeDate()
// 3. findAfterDate() - zastosuj NativeQuery dla odmiany
// 4. findAllContainingProduct()
// 5. findByUser()
// 6. findByPriceLowerThan()
// Zastosuj TypedQuery następnie zaprezentuj wyniki działania query w klasie main za pomocą System.out.println )

import model.Order;
import org.hibernate.Session;
import util.HibernateUtil;

import javax.persistence.TypedQuery;
import java.time.LocalDateTime;

public class OrderDao extends GenericDaO<Order> {
    public OrderDao(Class<Order> classParameter) {
        super(classParameter);
    }

    public Order findByDate(LocalDateTime dateTime){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Order order =  session.find(Order.class, dateTime);
//        session.close();
//        return order;
        TypedQuery<Order> orderTypedQuery = order.getOrderDate()
    }
}
