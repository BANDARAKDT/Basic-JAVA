package EXAMPLE02;

public class ComplexName implements ComplexInterface{
    private String fname;
    private String lname;
@Override
    public String getfName(){
        return fname;
    }
    
    @Override
    public void setfName(String fname){
        this.fname=fname;
    }
@Override
    public String getlName(){
        return lname;
    }
   @Override 
    public void setlName(String lname){
        this.lname=lname;
    }



}
