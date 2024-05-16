/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sign_up;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class editDisplay {
    private String name;
    private String contact;
    private String email;
    private String ic;
    private String roomId;
    private String checkinDate;
    private String checkoutDate;
    
    
    public editDisplay(String name, String contact, String email, String ic, String roomId, String checkinDate, String checkoutDate) {
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.ic = ic;
        this.roomId = roomId;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
    }
    
    public String getName(){
        return name;
    }
    
    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public String getIc() {
        return ic;
    }

    public String getCheckinDate() {
        return checkinDate;
    }

    public String getCheckoutDate() {
        return checkoutDate;
    }
    
    public void setChkIn(String chk_in){
        checkinDate = chk_in;
    }
    
    public void setChkOut(String chk_out){
        checkinDate = chk_out;
    }
    
    public void setName(String cus_name){
        name = cus_name;
    }
    
    public void setContact(String cus_contact){
        contact = cus_contact; 
    }
    
    public void setEmail(String cus_email){
        email = cus_email; 
    }
    
    public void setIC(String cus_ic){
        ic = cus_ic;
    }
    
    public static String displayBooked(JComboBox cmbRoom) {
        try{
            File file = new File("rooms.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()){
                String roomsid = scan.nextLine();
                String[] parts = roomsid.split(", ");
                if (parts[2].equals("Unavailable")){
                    cmbRoom.addItem(parts[0]);
                }
            }
            scan.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }
    
    
    public String writeRecord(){
        String roomID = this.roomId;
        
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
            
            String chk_in = getCheckinDate();
            if (chk_in.isEmpty()) {
                JOptionPane.showMessageDialog(null, "The date cannot be empty!");
                return "The date cannot be empty!";
            }
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
            dateFormat.setLenient(false);
            try {
                Date ChkIn = dateFormat.parse(chk_in);
                if (checkoutDate == null || ChkIn.before(dateFormat.parse(checkoutDate))) {
                    this.checkinDate = dateFormat.format(ChkIn);
                    setChkIn(chk_in);
                } else {
                    JOptionPane.showMessageDialog(null, "Check-in cannot be later than check-out!");
                    return "Invalid Check-In format!";
                }
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Check-in cannot be later than check-out!");
            }
            
            String chk_out = getCheckoutDate();
            if (chk_out.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please input the date!");
                return "Please input the date!";
            }
            
            File file = new File("booking.txt");
            Path path = file.toPath();
            List<String> lines = Files.readAllLines(path);
            List<String> newLines = new ArrayList<>();
            boolean roomIDFound = false;
            
            for (int i = 0; i < lines.size(); i++) {
                String line = lines.get(i);
                String[] parts = line.split(", ");

                if (parts[6].equals(roomID)) {
                    roomIDFound = true;
                }else{
                    newLines.add(line);
                }
            }
            
            if (roomIDFound) {
                String modifiedLine = this.name + ", " + this.contact + ", " + this.email + ", " + this.ic + ", " + this.checkinDate + ", " + this.checkoutDate + ", " + this.roomId;
                newLines.add(modifiedLine);
                Files.write(path, newLines);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Success";
    }
    
    
    public static void display(JComboBox<String> cmbRoom, JTextField cName, JTextField cEmail, JTextField cContact, JTextField cIC, JTextField chkIn, JTextField chkOut) {
        try (BufferedReader br = new BufferedReader(new FileReader("booking.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                String roomId = parts[6];
                if (roomId.equals(cmbRoom.getSelectedItem())) {
                    cName.setText(parts[0]);
                    cEmail.setText(parts[2]);
                    cContact.setText(parts[1]);
                    cIC.setText(parts[3]);
                    chkIn.setText(parts[4]);
                    chkOut.setText(parts[5]);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public static boolean deleteBooking(String roomId){
        try {            
            File file = new File("booking.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            
            File tempFile = new File("temp.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            
            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                if (line.contains(roomId)) {
                    found = true;
                    continue;
                } 
                writer.write(line + "\n");
            }
            reader.close();
            writer.close();
            
            if (found) {
                file.delete();
                tempFile.renameTo(file);
                return true;
            } else {
                return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
