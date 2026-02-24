
package pkgenum;


public enum TrafficSignalEnum 
{
    RED("Stop"),
    YELLOW("Get ready"),
    GREEN("Go");
    private String meaning;
    TrafficSignalEnum(String meaning)
    {
        this.meaning=meaning;
                
    }
    public String getMeaning()
    {
        return meaning;
    }
}
