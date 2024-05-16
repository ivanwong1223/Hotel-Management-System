/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sign_up;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Staff {
    private static final String FILE_PATH = "staff.txt";
    private String staffID;
    private String password;
    
    public Staff(String staffID, String password) {
        this.staffID = staffID;
        this.password = password;
    }
    
    
    public static boolean validateLogin(String staffID, String password) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            String storedStaffID = null;
            String storedPassword = null;

            while ((line = br.readLine()) != null) {
                if (storedStaffID == null) {
                    storedStaffID = line;
                } else {
                    storedPassword = line;
                    
                    if (staffID.equals(storedStaffID) && password.equals(storedPassword)) {
                        return true; 
                    }

                    // Reset storedUsername and storedPassword for the next pair of credentials
                    storedStaffID = null;
                    storedPassword = null;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false; 
    }
}
