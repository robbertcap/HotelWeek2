package com.capgemini.model;

import java.time.LocalDate;

/**
 * Booking class contains the booking of a room
 */
public class Booking {

    public Booking(long id, Guest guest, Room room, LocalDate start, LocalDate end, String comments) {
        this.id = id;
        this.guest = guest;
        this.room = room;
        this.start = start;
        this.end = end;
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", guest=" + guest +
                ", room=" + room +
                ", start=" + start +
                ", end=" + end +
                ", comments='" + comments + '\'' +
                '}';
    }

    private long id;

    private Guest guest;

    private Room room;

    private LocalDate start;

    private LocalDate end;

    private String comments;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
