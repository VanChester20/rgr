
import org.junit.*;


public class AppTest2 {
	
	Api api=new Api();
	
	@Test
	public void testRunApp() {
		new App(); //can it run application
	}

    @Test
    public void testApp(){
        Assert.assertEquals(25,  api.calcArea(5, 5));
        
    }
}
