import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RectangleTest {
	Rectangle myRectangle = new Rectangle(4,5);
	
	@Test
	public void testGetArea(){
		assertEquals(myRectangle.getArea(), 20);
	}
	
	@Test
	public void testGetPerimeter(){
		assertEquals(myRectangle.getPerimeter(), 18);
	}
	
	@Test
	public void testLength(){
		assertEquals(myRectangle.length, 4);
	}
	
	@Test
	public void testWidth(){
		assertEquals(myRectangle.width, 5);
	}
}