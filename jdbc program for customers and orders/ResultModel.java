
package COPackage;


public class ResultModel 
{
    
    private int ordNo;
    private double purchAmt;
    private String custName;
    private String city;
    
    public ResultModel()
    {
        
    
    }

    public ResultModel(int ordNo, double purchAmt, String custName, String city) 
    {
        this.ordNo = ordNo;
        this.purchAmt = purchAmt;
        this.custName = custName;
        this.city = city;
    }

    public int getOrdNo() 
    {
        return ordNo;
    }

    public void setOrdNo(int ordNo) 
    {
        this.ordNo = ordNo;
    }

    public double getPurchAmt() 
    {
        return purchAmt;
    }

    public void setPurchAmt(double purchAmt) 
    {
        this.purchAmt = purchAmt;
    }

    public String getCustName() 
    {
        return custName;
    }

    public void setCustName(String custName)
    {
        this.custName = custName;
    }

    public String getCity() 
    {
        return city;
    }

    public void setCity(String city) 
    {
        this.city = city;
    }
    
    
}
