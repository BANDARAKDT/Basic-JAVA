public class TemperatureClassReporter extends CelciusReporter implements TemperatureInfo{
    @Override 
    public double getTemperature(){
        return temperatureInC;
    }

    @Override 
    public double getTemperatureInF(){
        return cToF(temperatureInC);
    }
    @Override 
    public void setTemperatureInC(double temperatureInC) { 
        this.temperatureInC = temperatureInC; 
        } 
        @Override 
        public void setTemperatureInF(double temperatureInF) { 
        this.temperatureInC = fToC(temperatureInF); 
        } 
        
        private double fToC(double f) { 
            return ((f - 32) * 5 / 9); 
           } 
           
           private double cToF(double c) { 
            return ((c * 9 / 5) + 32); 
           }

        @Override
        public double getTemperatureInC() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getTemperatureInC'");
        } 
}
