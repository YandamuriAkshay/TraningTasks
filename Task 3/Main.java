package task3;

import com.shop.products.Product;
import com.shop.orders.Orders;
import com.shop.users.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product();
        Orders o = new Orders();
        User u = new User();

        p.show();
        o.placeOrder();
        u.login();
	}

}
