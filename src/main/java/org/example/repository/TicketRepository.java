package org.example.repository;

import org.example.models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    private Map<Long, Ticket> ticketMap = new HashMap<>();
    private Long previousTicketId = 0L;

    public  Ticket save(Ticket ticket){

        return  null;
    }
}
