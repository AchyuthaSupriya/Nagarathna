package test_Scripts;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.apache.commons.compress.harmony.pack200.CPClass;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Scripts.Base_Test;
import Generic_Scripts.Generic_xl;
import POM_Scripts.Pom_Class;

public class TS_1 extends Base_Test
{
@Test
public void script() throws EncryptedDocumentException, IOException {
	String usernamed = Generic_xl.getData("Sheet1", 0, 0);
	String passwordd = Generic_xl.getData("Sheet1", 1, 0);
	
	  Pom_Class pmc = new Pom_Class(driver);
	
	pmc.UserName(usernamed);
	pmc.password(passwordd);
	Assert.fail();
	pmc.clicklogin();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
