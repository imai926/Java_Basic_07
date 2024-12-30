package java_basic_07;

import static org.junit.Assert.*;

import org.junit.Test;

public class IndexTest {

	@Test
	public void testProduct() {
		Product product = new Product("商品A", 50.0);
		assertEquals("商品A", product.getName());
		assertEquals(50.0, product.getPrice(), 0.01);
	}

	@Test
	public void testAddItem() {
		ShoppingCart shopcart = new ShoppingCart();
		Product productA = new Product("商品A", 50.0);
		Product productB = new Product("商品B", 30.0);
		shopcart.addItem(productA);
		shopcart.addItem(productB);
		assertEquals(2, shopcart.itemCount);
	}
	
	@Test
	public void testGetTotalPrice(){
		ShoppingCart shopcart = new ShoppingCart();
		Product productA = new Product("商品A", 50.0);
		Product productB = new Product("商品B", 30.0);
		shopcart.addItem(productA);
		shopcart.addItem(productB);
		assertEquals(80.0, shopcart.getTotalPrice(), 0.01);
	}
}
