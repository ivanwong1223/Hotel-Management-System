/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package sign_up;


public class BookingDetails {
    //encapsulation
    private String name;
    private String contact;
    private String email;
    private String ic;
    private String checkinDate;
    private String checkoutDate;
    private String checkinMonth;
    private String checkoutMonth;
    private String year;
    private String roomSelected;
    
    public BookingDetails (String name, String contact, String email, String ic, String checkinDate, String checkoutDate, String checkinMonth, String checkoutMonth, String year, String roomSelected) {
        //assign values from the parameter to attribute of object
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.ic = ic;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
        this.checkinMonth = checkinMonth;
        this.checkoutMonth = checkoutMonth;
        this.year = year;
        this.roomSelected = roomSelected;
    }
    
    public String getName() {
        //get value at the method
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

    public String getCheckinMonth() {
        return checkinMonth;
    }

    public String getCheckoutMonth() {
        return checkoutMonth;
    }

    public String getYear() {
        return year;
    }
    
    public String getRoomSelection(){
        return roomSelected;
    }
    
    //it doesn't return any value.
    //change the data of the variable in the method
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
    
    public void setChkInDate(String chk_in_date){
        checkinDate = chk_in_date;
    }
    
    public void setChkOutDate(String chk_out_date){
        checkoutDate = chk_out_date;
    }
    
    public void setChkInMonth(String chk_in_month){
        checkinMonth = chk_in_month;
    }
    
    public void setChkOutMonth(String chk_out_month){
        checkoutMonth = chk_out_month;
    }
    
    public void setYear(String Year){
        year = Year;
    }
    
    public void setROOMSelected(String roomSelect){
        roomSelected = roomSelect;
    }
}
