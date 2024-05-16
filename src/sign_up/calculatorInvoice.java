/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sign_up;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.JLabel;



public class calculatorInvoice {
    private JLabel roomid;
    private JLabel cusNameLabel;
    private JLabel roomDays;
    private JLabel roomFees;
    private JLabel taxAmount;
    private JLabel tTax;
    private JLabel totalAmount;
    private String roomId;
    
    public calculatorInvoice(JLabel roomid, JLabel cusNameLabel, JLabel roomDays, JLabel roomFees, JLabel taxAmount, JLabel tTax, JLabel totalAmount) {
        this.roomid = roomid;
        this.cusNameLabel = cusNameLabel;
        this.roomDays = roomDays;
        this.roomFees = roomFees;
        this.taxAmount = taxAmount;
        this.tTax = tTax;
        this.totalAmount = totalAmount;
    }

    public void display() {
        try (BufferedReader br = new BufferedReader(new FileReader("booking.txt"))) {
            String line;
            LocalDate startDate = null;
            LocalDate endDate = null;
            int latestLine = -1;
            int lineNum = 0;
            String cusName = "";
            roomId = "";
            String room_id = "";
            
            while ((line = br.readLine()) != null) {
                String[] rowData = line.split(", ");
                LocalDate checkInDate = LocalDate.parse(rowData[4], DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
                LocalDate checkOutDate = LocalDate.parse(rowData[5], DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
                lineNum++;
                
                if (startDate == null || endDate == null || lineNum > latestLine) {
                    startDate = checkInDate;
                    endDate = checkOutDate;
                    latestLine = lineNum;
                    cusName = rowData[0];
                    room_id = rowData[6];
                    roomId = rowData[6];
                }
            }
            
            long totalDays = ChronoUnit.DAYS.between(startDate, endDate);
            
            roomid.setText("Room ID:      " + room_id);
            cusNameLabel.setText("Name:      " + cusName);
            roomDays.setText("Days of stays:      " + totalDays);
            calculator_payment calc = new calculator_payment(String.valueOf(totalDays), 0.0, 0.0, 0.0, 0.0);
            double totalCharges = calc.calculateTotalCharges(totalDays);
            double roomFeesValue = calc.calculateRoomFees(totalDays);
            double serviceTaxValue = calc.calculateServiceTax(totalDays);
            double tourismTaxValue = calc.calculateTourismTax(totalDays);
            roomFees.setText("Room Charges:     RM " + String.format("%.2f", roomFeesValue));
            taxAmount.setText("Service Tax (10%):     RM " + String.format("%.2f", serviceTaxValue));
            tTax.setText("*Tourism Tax (Rm10 per night):     RM " + String.format("%.2f", tourismTaxValue));
            totalAmount.setText("RM" + String.format("%.2f", totalCharges)); // Display total charges
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private class calculator_payment{
        private String DaysOfStays;
        private double RoomPrice;
        private double ServicetaxAmount;
        private double TourismTax;
        private double totalAmount;
        
        public calculator_payment(String DaysOfStays, double RoomPrice, double ServicetaxAmount, double TourismTax, double totalAmount){
            this.DaysOfStays = DaysOfStays;
            this.RoomPrice = RoomPrice;
            this.ServicetaxAmount = ServicetaxAmount;
            this.TourismTax = TourismTax; 
            this.totalAmount = totalAmount;
            this.RoomPrice = 0.0;
            this.ServicetaxAmount = 0.0;
        }
        
        public String getDaysOfStays(){
            return DaysOfStays;
        }
        
        public double calculateTotalCharges(long totalDays) {
            calculateRoomFees(totalDays);
            calculateServiceTax(totalDays);
            calculateTourismTax(totalDays);
            totalAmount = RoomPrice + ServicetaxAmount + TourismTax;
            return totalAmount;
        }

        public double calculateTourismTax(long totalDays){
            double taxPerNight = 10.0;
            TourismTax = totalDays * taxPerNight;
            return TourismTax;
        }
        
        public double calculateRoomFees(long totalDays) {
            try (BufferedReader br = new BufferedReader(new FileReader("rooms.txt"))) {
                String line;
                double chargesPerDay = 0.0;
                while ((line = br.readLine()) != null) {
                    String[] rowData = line.split(", ");
                    if (rowData[0].equals(roomId)) {
                        chargesPerDay = Double.parseDouble(rowData[4]);
                        break;
                    }
                }
                RoomPrice = totalDays * chargesPerDay;
                return RoomPrice;
            }catch (IOException e){
                e.printStackTrace();
                return 0.0;
            }
        }
        
        public double calculateServiceTax(long totalDays) {
            ServicetaxAmount = 0.1 * RoomPrice;
            return ServicetaxAmount;
        }
    }
}