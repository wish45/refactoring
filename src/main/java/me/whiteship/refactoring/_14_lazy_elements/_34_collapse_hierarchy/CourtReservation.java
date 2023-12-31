package me.whiteship.refactoring._14_lazy_elements._34_collapse_hierarchy;

import java.time.LocalDateTime;
import java.util.List;

public class CourtReservation extends Reservation {

    private String courtNumber;

    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private List<String> members;
    private String owner;
    private boolean paid;
}
