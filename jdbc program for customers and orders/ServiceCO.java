
package COPackage;

import java.util.*;
public class ServiceCO
{
   
DAO dao = new DAO();

    public void addCustomer(CustomerModel c) throws Exception
    {
        dao.insertCustomer(c);
    }

    public void addOrder(OrdersModel o) throws Exception
    {
        dao.insertOrder(o);
    }

    public void showFiltered(double min, double max) throws Exception
    {
        List<ResultModel> list = dao.getFilteredOrders(min, max);

        if(list.isEmpty())
        {
            System.out.println("No records found");
        }
        else
        {
            for(ResultModel r : list)
            {
                System.out.println(
                    r.getOrdNo()+" | "+r.getPurchAmt()+" | "+r.getCustName()+" | "+r.getCity()
                );
            }
        }
    }
}
