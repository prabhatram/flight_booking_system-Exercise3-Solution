package exercise3.flight.booking.system;

import java.time.LocalDate;


public class FlightBooking {
    private String flightID;
    private String passengerFullName;

    public static final String TRIP_SOURCE = "Nanjing";
    public static final String SOURCE_AIRPORT = "Nanjing Lukou International Airport";
    public static final String TRIP_DESTINATION = "Oulu";
    public static final String DESTINATION_AIRPORT = "Oulu Airport";
    public static final String FLIGHT_COMPANY = "Flights-Of-Fancy";
    
    
    private LocalDate departingDate;
    private LocalDate returningDate;
    private int childPassengers;
    private int adultPassengers;
    private int totalPassengers;

    private double departingTicketPrice;
    private double returnTicketPrice;
    private double totalTicketPrice;

    private String ticketNumber;

    
    public FlightBooking(String fullName, LocalDate departureDate, LocalDate returnDate, int children, int adults) {
        passengerFullName = fullName;
        this.departingDate = departureDate;
        this.returningDate = returnDate;
        childPassengers = children;
        adultPassengers = adults;
    }

    public String getTripSource (){
        return TRIP_SOURCE;
    }

    public String getTripDestination(){
        return TRIP_DESTINATION;
    }

    public String getFlightCompany (){
        return FLIGHT_COMPANY;
    }
    
    public void setPassengerFullName(String name){
        this.passengerFullName = name;
    }

    public String getPassengerFullName(){
        return passengerFullName;
    }

    public int getChildrenPassengers(){
        return childPassengers;
    }

    public int getAdultPassengers(){
        return adultPassengers;
    }

    public String setFlightID(String fullName) {
        return "FOF" + fullName.substring(1,4) + "IN";
    }

    public void setTicketNumber(String fullName) {
        this.ticketNumber = "FOFT" + fullName.substring(1,4).toUpperCase() + TRIP_SOURCE.substring(1,3).toUpperCase() 
        + TRIP_DESTINATION.substring(1,3).toUpperCase() 
        + "IN";
    }

    public String getTicketNumber(){
        return ticketNumber;
    }

    public void setTotalPassengers(int children, int adults) {
        totalPassengers = children + adults;
    }

    public int getTotalPassengers(){
        return totalPassengers;
    }

    public void setDepartingTicketPrice(int child, int adults){
        departingTicketPrice = (child * 300) + (adults * 550);
    }

    public double getDepartingTicketPrice(){
        return departingTicketPrice;
    }

    public void setReturnTicketPrice(int child, int adults){
        returnTicketPrice = (child * 250) + (adults * 450);
    }

    public double getReturnTicketPrice(){
        return returnTicketPrice;
    }

    public void setTotalTicketPrice() {
        totalTicketPrice = departingTicketPrice + returnTicketPrice;
    }

    public double getTotalTicketPrice() {
        return totalTicketPrice;
    }

    public void setDepartingDate(LocalDate departure) {
        this.departingDate = departure;
    }

    public LocalDate getDepartingDate(){
        return departingDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returningDate = returnDate;
    }

    public LocalDate getReturnDate(){
        return returningDate;
    }

    public String toString() {
        return "Dear " + passengerFullName + ". Thank you for booking your flight with " + 
        FLIGHT_COMPANY + ". Following are the details of your booking and the trip:" + "\n" + 
        "Ticket Number: " + ticketNumber + "\n" + 
        "From " + TRIP_SOURCE + " to " + TRIP_DESTINATION + "\n" +
        "Date of departure: " + departingDate + "\n" +
        "Date of return: " + returningDate + "\n" +
        "Total passengers: " + totalPassengers + "\n" +
        "Total ticket price in Euros: " + totalTicketPrice;

    }

}
