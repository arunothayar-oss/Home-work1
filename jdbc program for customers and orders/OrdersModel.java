
package COPackage;

public class OrdersModel 
{
    private int ordNo;
    private double purchAmt;
    private String ordDate;
    private int customerId;
    private int salesmanId;
    
    public OrdersModel()
    {
    
    }

    public OrdersModel(int ordNo, double purchAmt, String ordDate, int customerId, int salesmanId) 
    {
        this.ordNo = ordNo;
        this.purchAmt = purchAmt;
        this.ordDate = ordDate;
        this.customerId = customerId;
        this.salesmanId = salesmanId;
    }

    public int getOrdNo() {
        return ordNo;
    }

    public void setOrdNo(int ordNo) {
        this.ordNo = ordNo;
    }

    public double getPurchAmt() {
        return purchAmt;
    }

    public void setPurchAmt(double purchAmt) {
        this.purchAmt = purchAmt;
    }

    public String getOrdDate() {
        return ordDate;
    }

    public void setOrdDate(String ordDate) {
        this.ordDate = ordDate;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getSalesmanId() {
        return salesmanId;
    }

    public void setSalesmanId(int salesmanId) {
        this.salesmanId = salesmanId;
    }
    
    
}
