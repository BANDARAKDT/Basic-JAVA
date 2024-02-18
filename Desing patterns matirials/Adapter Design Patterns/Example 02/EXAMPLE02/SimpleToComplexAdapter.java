package EXAMPLE02;


public class SimpleToComplexAdapter implements ComplexInterface{
    // this should be client request 
    //this should convert client request to the back-end
    
    SimpleName simpleObject; //to handle to clint

    private String lname;
    private String fname;
  //  get the client(constructer use) and convert it to back-end

        public SimpleToComplexAdapter(SimpleName simple){
            simpleObject=simple;
            fname=simple.getName().split(" ")[0];
            lname=simple.getName().split(" ")[1];


            //accept the client

            //convert client to back end according to client requirements
   
        }
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
