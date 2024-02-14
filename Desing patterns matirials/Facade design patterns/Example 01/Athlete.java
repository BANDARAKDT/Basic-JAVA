public class Athlete {
    Sprinters sprinters;
    RoadRunners roadRunners;

    
    
    /**
     * 
     */
    public Athlete(){
        sprinters=new Sprinters();
        roadRunners=new RoadRunners();

        public void RoadRunners(){
            roadRunners.run();
            roadRunners.breathing();
        }

        public Sprinters(){
            sprinters.run();
            sprinters.start();
        }
      

       
    }


   
}
