
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//
//class Order {
//     String orderId;
//     String menuId;
//     int quantity;
//
//    public Order(String orderId, String menuId, int quantity) {
//        this.orderId = orderId;
//        this.menuId = menuId;
//        this.quantity = quantity;
//    }
//
//    public String getOrderId() {
//        return orderId;
//    }
//
//    public String getMenuId() {
//        return menuId;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//}
//	class Menu {
//	     String menuId;
//	    String menuName;
//	    int price;
//
//	    public Menu(String menuId, String menuName, int  price) {
//	        this.menuId = menuId;
//	        this.menuName = menuName;
//	        this.price = price;
//	    }
//
//	    public String getMenuId() {
//	        return menuId;
//	    }
//
//	    public String getMenuName() {
//	        return menuName;
//	    }
//
//	    public double getPrice() {
//	        return price;
//	    }
//	}
//// reverse the string sorting srting 
//public class OrderMenuMain {
//
//	public static void main(String[] args) {
//		ArrayList<Order> al1= new ArrayList<>();
//		al1.add(new Order("1","101",1));
//		al1.add(new Order("2","102",2));
//		al1.add(new Order("3","103",2));
//		al1.add(new Order("4","104",1));
//		
//		System.out.println(al1);
//		
//		ArrayList<Menu> al2 = new ArrayList<>();
//		al2.add(new Menu("101"," Tea",20));
//		al2.add(new Menu("102"," Coffee",50));
//		al2.add(new Menu("103","Vada Pav ",20));
//		al2.add(new Menu("104"," Dosa",20));
//
//		
//		System.out.println(al2);
//		
//		
//		HashMap<String, Integer>hm =new HashMap<>();
//		
//		
//		for(int i= 0;i<al1.size();i++) {
//			for(int j = 0; j<al2.size();j++) {
//				
//				
//				
//			int quantity;
//			int price;
//			int	totalbill = quantity * price;
//			
//			
//				int totalbill= al1.get(i).quantity * al2.get(j).price;
//				
//				if (al1.get(i).menuId==al2.get(j).menuId) {
//					
//					
//					hm.put(al2.get(j).menuName, totalbill);
//					
//					System.out.println("Total BIl:"+ totalbill);
//				}
//			}
//			System.out.println(hm);
//
//			
//		}
//		
//		
//		
//		
//		
//		
//		
	 

		
		
		
//	
//	}
//}
//


//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class OrderMenuMain {
//	
//	
//    public static void main(String[] args) {
//    	
//    	
//        ArrayList<Order> orderList = new ArrayList<>();
//        orderList.add(new Order("1", "101", 2));
//        orderList.add(new Order("2", "102", 3));
//        orderList.add(new Order("3", "103", 1));
//        orderList.add(new Order("4", "101", 2));
//
//        ArrayList<Menu> menuList = new ArrayList<>();
//        menuList.add(new Menu("101", "Pizza", 10.0));
//        menuList.add(new Menu("102", "Burger", 5.0));
//        menuList.add(new Menu("103", "Fries", 3.0));
//
//        Map<String, Double> billMap = new HashMap<>();
//
//        for (Order order : orderList) {
//            String menuId = order.getMenuId();
//            int quantity = order.getQuantity();
//            double price = getMenuPrice(menuList, menuId);
//
//            double bill = quantity * price;
//
//            if (billMap.containsKey(menuId)) {
//                double currentBill = billMap.get(menuId);
//                billMap.put(menuId, currentBill + bill);
//            } else {
//                billMap.put(menuId, bill);
//            }
//        }
//
//        // Display the menu name and total bill
//        System.out.println("Menu Name \t\t Total Bill");
//        for (Map.Entry<String, Double> entry : billMap.entrySet()) {
//            String menuId = entry.getKey();
//            double bill = entry.getValue();
//            String menuName = getMenuName(menuList, menuId);
//            System.out.println(menuName + "\t\t" + bill);
//        }
//    }
//
//    public static double getMenuPrice(List<Menu> menuList, String menuId) {
//        for (Menu menu : menuList) {
//            if (menu.getMenuId().equals(menuId)) {
//                return menu.getPrice();
//            }
//        }
//        return 0.0; // Return 0 if menu id is not found
//    }
//
//    public static String getMenuName(List<Menu> menuList, String menuId) {
//        for (Menu menu : menuList) {
//            if (menu.getMenuId().equals(menuId)) {
//                return menu.getMenuName();
//            }
//        }
//        return ""; // Return empty string if menu id is not found
//    }
//}
//
//class Order {
//    private String orderId;
//    private String menuId;
//    private int quantity;
//
//    public Order(String orderId, String menuId, int quantity) {
//        this.orderId = orderId;
//        this.menuId = menuId;
//        this.quantity = quantity;
//    }
//
//    public String getOrderId() {
//        return orderId;
//    }
//
//    public String getMenuId() {
//        return menuId;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//}
//
//class Menu {
//    private String menuId;
//    private String menuName;
//    private double price;
//
//    public Menu(String menuId, String menuName, double price) {
//        this.menuId = menuId;
//        this.menuName = menuName;
//        this.price = price;
//    }
//
//    public String getMenuId() {
//        return menuId;
//    }
//
//    public String getMenuName() {
//        return menuName;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//}
//
//
//
//














































package com.map;

import java.util.ArrayList;
import java.util.HashMap;


class Order1{
	
	int oid;
	int menuId;
	int oQty;
	public Order1(int oid, int menuId, int oQty) {
		this.oid = oid;
		this.menuId = menuId;
		this.oQty = oQty;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", menuId=" + menuId + ", oQty=" + oQty + "]";
	}

}
class Menu1{
	int mId;
	String mName;
	int mPrice;
	
	public Menu1(int mId, String mName, int mPrice) {
		this.mId = mId;
		this.mName = mName;
		this.mPrice = mPrice;
	}

	@Override
	public String toString() {
		return "Menu1 [mId=" + mId + ", mName=" + mName + ", mPrice=" + mPrice + "]";
	}
}

public class OrderMenuMain {
	
	
	public static void main(String[] args) {
		
		ArrayList<Order1>order=new ArrayList<>();
		order.add(new Order1(10,1,2));
		order.add(new Order1(20,1,3));
		order.add(new Order1(10,3,1));
		
		
		
		
		
		ArrayList<Menu1>menu=new ArrayList<>();
		
		
		
		
		menu.add(new Menu1(1, "Tea", 10));
		menu.add(new Menu1(2, "vadapav", 20));
		menu.add(new Menu1(3, "Dosa", 70));
		
		HashMap<String, Integer>hm=new HashMap<>();
		
		for(int i=0;i<menu.size();i++) {
			
			
			
			int totalBill=0;
			for(int j=0;j<order.size();j++) {
				if(menu.get(i).mId==order.get(j).menuId) {
					
					totalBill=totalBill+menu.get(i).mPrice*order.get(j).oQty;
					
//				 for(int i = 0; i<menu.size();i++) {
//					 
//				 }
//					
					
				}
			}
			
			hm.put(menu.get(i).mName, totalBill);
			
		}
		System.out.println("FB".hashCode());
	}}
