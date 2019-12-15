import java.util.List;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class OracleDataAdapter implements IDataAdapter {
    public int connect(String dbfile) {
        //...
        return CONNECTION_OPEN_OK;
    }

    public int disconnect() {
        // ...
        return CONNECTION_CLOSE_OK;

    }
    public CustomerModel loadCustomer(int id) {
        return null;
    }
    public int saveCustomer(CustomerModel customer) {return CUSTOMER_SAVED_OK;}

    public ProductModel loadProduct(int id) {
        return null;
    }
    public int saveProduct(ProductModel model) {
        return PRODUCT_SAVED_OK;
    }

    @Override
    public int savePurchase(PurchaseModel model) {
        return 0;
    }

    @Override
    public PurchaseModel loadPurchase(int id) {return null;}
    @Override
    public PurchaseListModel loadPurchaseHistory(int customerID) {
        return null;
    }

    public ArrayList<PurchaseModel> loadPurchaseHistory() {
        return null;
    }

    @Override
    public ProductListModel searchProduct(String name, double minPrice, double maxPrice) {
        return null;
    }

    @Override
    public UserModel loadUser(String username) {
        return null;
    }

}
