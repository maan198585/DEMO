package GmailAvutomation2;



import org.testng.annotations.Test;

 

public class DataProvider

{

    @Test(testName = "data-provider")

    public Object[][] dataProviderMethod() {

        return new Object[][] { { "data one" }, { "data two" } };

    }

 

    @Test(dataProvider = "data-provider")

    public void testMethod(String data) {

        System.out.println("Data is: " + data);

    }

}

 

