

import org.junit.*;


public class AppTest {
	
	Api api=new Api();
	
	@Test
	public void testRunApp() {
		new App(); //can it run application
	}

    @Test
    public void testApp(){
        Assert.assertEquals(360,  api.calcArea(10, 36));
    }
}
