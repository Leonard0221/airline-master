package edu.curtis.airlinebackend.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.lang.String;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
    String ticketId, airlineName, flightNum;
}
