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
        
    
}
