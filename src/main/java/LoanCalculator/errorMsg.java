package LoanCalculator;

import javax.swing.JOptionPane;

public class errorMsg {
    
    //DATA MEMBERS
    String errorMessage;
    String errorTitle;
    
    public errorMsg()
    {
        this(null, null);
    }//DEFAULT CONSTRUCTOR
    
    public errorMsg(String errorMessage, String errorTitle) 
    {
        this.errorMessage = errorMessage;
        this.errorTitle = errorTitle;
    }//CONSTRUCTOR WITH PARAMETER

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorTitle() {
        return errorTitle;
    }

    public void setErrorTitle(String errorTitle) {
        this.errorTitle = errorTitle;
    }
    
    public void getMsgbox (){
        JOptionPane.showMessageDialog(null, errorMessage, errorTitle, JOptionPane.ERROR_MESSAGE);
    }//END METHOD getMsgbox
    
}//END CLASS
