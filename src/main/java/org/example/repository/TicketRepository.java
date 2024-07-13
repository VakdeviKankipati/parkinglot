package org.example.repository;

import org.example.models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    private Map<Long, Ticket> ticketMap = new HashMap<>();
    private Long previousTicketId = 0L;

    public TicketRepository(){
        this.ticketMap=new HashMap<>();
    }

    public  Ticket save(Ticket ticket){
        if(ticket.getId()==0){
            ticket.setId(previousTicketId++);
        }
        this.ticketMap.put(ticket.getId(),ticket);
        return  ticket;
    }
}
