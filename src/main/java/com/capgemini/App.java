package com.capgemini;


import com.capgemini.model.Booking;
import com.capgemini.model.ERoomType;
import com.capgemini.model.Guest;
import com.capgemini.model.Room;
import com.capgemini.model.trips.CGTime;
import com.capgemini.model.trips.Letter;

import java.time.LocalDate;

/**
 * Entry point for the application
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        Room room = new Room(1, ERoomType.LUXERY);

        System.out.println("New room created: " + room.toString());

        Guest guest = new Guest(1,
                "Kerst",
                "man",
                "Noordpool 10",
                "0000KK",
                "Koude Noorden",
                "kerstman@noordpool.nl",
                "+001122334455", LocalDate.of(1000, 12, 24));

        System.out.println("New guest created: " + guest.toString());

        Booking booking = new Booking(1, guest,
                room, LocalDate.of(2017, 11, 20),
                LocalDate.of(2017, 11, 22),
                "Please arrange a king-size bed");

        System.out.println("New booking created: " + booking.toString());

        Letter company = new Letter();

        int lBoatNr = company.startLakeTrip();
        System.out.println("Lake trip started with boat nr " + lBoatNr);

        int rBoatNr = company.startRiverTrip();
        System.out.println("Lake trip started with boat nr " + rBoatNr);

        Thread.sleep(10000);

        company.endTrip(lBoatNr);

        Thread.sleep(1000);

        company.endTrip(rBoatNr);

        CGTime averageDuration = company.getAverageDuration();

        System.out.println("Average duration: " + averageDuration.toString());

        int endedTrips = company.getNumberOfEndedTrips();

        System.out.println("Nr of ended trips: " + endedTrips);
    }
}
