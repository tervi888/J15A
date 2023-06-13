package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class TicketTest {
    @Test
    public void testTicket() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 3000, 2, 4);
        Ticket ticket2 = new Ticket("EKB", "MSK", 5000, 6, 10);
        Ticket ticket3 = new Ticket("MSK", "SPB", 1500, 3, 6);
        Ticket ticket4 = new Ticket("SPB", "UFA", 6000, 5, 10);
        Ticket ticket5 = new Ticket("MSK", "SPB", 9000, 8, 9);
        Ticket ticket6 = new Ticket("MSK", "SPB", 2500, 8, 10);
        Ticket ticket7 = new Ticket("SPB", "MSK", 4000, 11, 12);
        Ticket ticket8 = new Ticket("MSK", "SPB", 5500, 12, 14);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Ticket[] expected = {ticket3, ticket6, ticket1, ticket8, ticket5};
        Ticket[] actual = manager.search("MSK", "SPB");
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testTicket1() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 3000, 2, 8);//6
        Ticket ticket2 = new Ticket("EKB", "MSK", 5000, 6, 10);
        Ticket ticket3 = new Ticket("MSK", "SPB", 1500, 3, 12);//9
        Ticket ticket4 = new Ticket("SPB", "UFA", 6000, 5, 10);
        Ticket ticket5 = new Ticket("MSK", "SPB", 9000, 8, 9); //1
        Ticket ticket6 = new Ticket("MSK", "SPB", 2500, 8, 11); //3
        Ticket ticket7 = new Ticket("SPB", "MSK", 4000, 11, 12);
        Ticket ticket8 = new Ticket("MSK", "SPB", 5500, 12, 17); //5
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket5, ticket6, ticket8, ticket1, ticket3};
        Ticket[] actual = manager.search1("MSK", "SPB", comparator);
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testTicket2() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 3000, 2, 4);
        Ticket ticket2 = new Ticket("EKB", "MSK", 5000, 6, 10);
        Ticket ticket3 = new Ticket("MSK", "SPB", 1500, 3, 6);
        Ticket ticket4 = new Ticket("SPB", "UFA", 6000, 5, 10);
        Ticket ticket5 = new Ticket("MSK", "SPB", 9000, 8, 9);
        Ticket ticket6 = new Ticket("MSK", "SPB", 2500, 8, 10);
        Ticket ticket7 = new Ticket("SPB", "MSK", 4000, 11, 12);
        Ticket ticket8 = new Ticket("MSK", "SPB", 5500, 12, 14);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Ticket[] expected = {ticket7};
        Ticket[] actual = manager.search("SPB", "MSK");
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testTicket3() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 3000, 2, 4);
        Ticket ticket2 = new Ticket("EKB", "MSK", 5000, 6, 10);
        Ticket ticket3 = new Ticket("MSK", "SPB", 1500, 3, 6);
        Ticket ticket4 = new Ticket("SPB", "UFA", 6000, 5, 10);
        Ticket ticket5 = new Ticket("MSK", "SPB", 9000, 8, 9);
        Ticket ticket6 = new Ticket("MSK", "SPB", 2500, 8, 10);
        Ticket ticket7 = new Ticket("SPB", "MSK", 4000, 11, 12);
        Ticket ticket8 = new Ticket("MSK", "SPB", 5500, 12, 14);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Ticket[] expected = {};
        Ticket[] actual = manager.search("UFA", "SPB");
        Assertions.assertArrayEquals(expected, actual);
    }

}






