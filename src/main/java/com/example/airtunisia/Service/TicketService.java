package com.example.airtunisia.Service;

import com.example.airtunisia.Model.Ticket;
import com.example.airtunisia.Repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/Service")

public class TicketService {
    @Autowired
    TicketRepository ticketRepository;

    @GetMapping(value = "/findAllTickets")
    public List findTicket(){
        List ticketList = ticketRepository.findAll();
        return ticketList;
    }

    @PostMapping(value= "/saveTicket")
    public Ticket newTicket(@RequestBody Ticket newTicket) {
        ticketRepository.save(newTicket);
        return newTicket;
    }

}
