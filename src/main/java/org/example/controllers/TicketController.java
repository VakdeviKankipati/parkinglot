package org.example.controllers;

import org.example.dtos.IssueTicketRequestDto;
import org.example.dtos.IssueTicketResponseDto;
import org.example.dtos.ResponseStatus;
import org.example.exception.GateNotFoundException;
import org.example.models.Ticket;
import org.example.services.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto requestDto){
        IssueTicketResponseDto responseDto = new IssueTicketResponseDto();
        try{
            Ticket ticket = ticketService.issueTicket(
                    requestDto.getGateId(),
                    requestDto.getVehicleNo(),
                    requestDto.getVehicleOwnerName(),
                    requestDto.getVehicleType()
            );
            responseDto.getTicket();
            responseDto.getResponseStatus();

        }catch(GateNotFoundException gateNotFoundException){
            gateNotFoundException.getMessage();
            responseDto.setResponseStatus(ResponseStatus.FAILURE);

        }
        return responseDto;
    }
}
