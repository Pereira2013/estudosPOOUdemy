package exerciciosOO.application;

import exerciciosOO.entities.Order;
import exerciciosOO.entities.enums.OrderStatus;

import java.util.Date;

public class ProgramOrder {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMET);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DElIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println(os2);



    }
}
