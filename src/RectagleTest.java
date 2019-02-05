import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RectangleTest {
	Rectangle myRectangle = new Rectangle(4,5);
	
	@Test
	public voic testGetArea(){
		assertEquals(myRectangle.getArea(), 20);
	}
	
	@Test
	public voic testGetPerimeter(){
		assertEquals(myRectangle.getPerimeter(), 18);
	}
	
	@Test
	public voic testLength(){
		assertEquals(myRectangle.length(), 4);
	}
	
	@Test
	public voic testWidth(){
		assertEquals(myRectangle.width(), 5);
	}
}