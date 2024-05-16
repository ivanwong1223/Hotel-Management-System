/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package sign_up;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;


public class bookingDate extends BookingDetails {
    private String CHKin;
    private String CHKout;
    
    
    public bookingDate(String name, String contact, String email, String ic, String checkinDate, String checkoutDate, String checkinMonth, String checkoutMonth, String year, String CHKin, String CHKout, String roomSelected){
        super(name, contact, email, ic, checkinDate, checkoutDate, checkinMonth, checkoutMonth, year, roomSelected);
        this.CHKin = CHKin;
        this.CHKout = CHKout;
    }
    
    public String getChkin() {
        this.CHKin = getCheckinDate() + "-" + getCheckinMonth() + "-" + getYear();
        return CHKin;
    }

    public String getChkout() {
        this.CHKout = getCheckoutDate() + "-" + getCheckoutMonth() + "-" + getYear();
        return CHKout;
    }
    
    public void setChkIn(String chk_in){
        CHKin = chk_in;
    }
    
    public String obj1(){
        try{
            String cus_name = getName();
            if (cus_name.matches("[a-zA-Z ]+")) {
                setName(cus_name);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Name Format!");
                return "Invalid Name Format!";
            }
            
            String cus_contact = getContact();
            if (cus_contact.matches("\\d+")) {
                setContact(cus_contact);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Contact Number Format!");
                return "Invalid Contact.No Format!";
            }
            
            String cus_email = getEmail();
            if (cus_email.matches("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b")) {
                setEmail(cus_email);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Email Format!");
                return "Invalid Email Format!";
            }
            
            String cus_ic = getIc();
            if (cus_ic.matches("^[0-9]{6}-[0-9]{2}-[0-9]{4}$")) {
                setIC(cus_ic);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid IC Number Format!");
                return "Invalid IC Number Format!";
            }
            
            String chk_in = getChkin();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
            dateFormat.setLenient(false);
            try {
                Date chkIn = dateFormat.parse(chk_in);
                if (CHKout == null || chkIn.before(dateFormat.parse(CHKout))) {
                    setChkIn(chk_in);
                } else {
                    JOptionPane.showMessageDialog(null, "Check-in cannot be later than check-out!");
                    return "Invalid Check-In format!";
                }
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Check-in cannot be later than check-out!");
            }
            
            String roomSelected = getRoomSelection();
            Path filePath = Paths.get("rooms.txt");
            List<String> lines = Files.readAllLines(filePath, StandardCharsets.UTF_8);
            for (int i = 0; i < lines.size(); i++) {
                String[] fields = lines.get(i).split(", ");
                if (fields[0].equals(roomSelected) && fields[2].equals("Available")) {
                    lines.set(i, fields[0] + ", " + fields[1] + ", Unavailable, " + fields[3] + ", " + fields[4]);
                    break;
                }
            }
            Files.write(filePath, lines, StandardCharsets.UTF_8);
            
            FileWriter fw = new FileWriter("booking.txt", true);
            PrintWriter outputFile = new PrintWriter(fw);
            outputFile.print(getName() + ", ");
            outputFile.print(getContact() + ", ");
            outputFile.print(getEmail() + ", ");
            outputFile.print(getIc() + ", ");
            outputFile.print(getChkin() + ", ");
            outputFile.print(getChkout() + ", ");
            outputFile.print(getRoomSelection());
            
            outputFile.println();
            outputFile.close();

            return "Success";
        }
        
        catch (Exception ex)
        {
            return ex.toString();
        }
    }
}
