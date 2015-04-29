package Goods;

public class GoodsApp {
	public static void main(String[] args) {
		Goods camera=new Goods();
		camera.setName("Nicon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(30);
		Goods goods2=new Goods("Nicon2", 500000, 200, 100);
		
		System.out.println("상품이름 : "+camera.getName());
		System.out.println("상품가격 : "+camera.getPrice());
		System.out.println("재고수량 : "+camera.getCountStock());
		System.out.println("팔린수량 : "+camera.getCountSold());
		System.out.println(goods2);
	}
}
