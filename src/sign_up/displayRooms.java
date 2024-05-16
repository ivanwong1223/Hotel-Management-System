/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sign_up;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;


public class displayRooms {
    public static String display(JTable cr){
        
        try{
            File file = new File("rooms.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            DefaultTableModel model = (DefaultTableModel) cr.getModel();
            model.setRowCount(0);
            
            while ((line = br.readLine()) != null) {
                String[] rowData = line.trim().split(",");
                
                if (rowData.length >= 3 && rowData[2].trim().equals("Available")){
                    double fifthColumn = Double.parseDouble(rowData[4]);
                    rowData[4] = String.format("%.2f", fifthColumn);
                    model.addRow(rowData);
                }
            }
            br.close();
        }catch(IOException ex){
            Logger.getLogger(available_room.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static String displayCMB(JComboBox rSelection) {
        try{
            File file = new File("rooms.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()){
                String roomsid = scan.nextLine();
                String[] parts = roomsid.split(", ");
                if (parts[2].equals("Available")){
                    rSelection.addItem(parts[0]);
                }
            }
            scan.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }
    
    //this is the method called from the available_room
    public static String displayTable(JTable vAR) {
        try{
            File file = new File("rooms.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            DefaultTableModel model = (DefaultTableModel) vAR.getModel();
            model.setRowCount(0);
            
            while ((line = br.readLine()) != null) {
                String[] rowData = line.trim().split(",");
                
                double fifthColumn = Double.parseDouble(rowData[4]);
                rowData[4] = String.format("%.2f", fifthColumn);
                model.addRow(rowData);
            }
            br.close();
        }catch(IOException ex){
            Logger.getLogger(available_room.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}