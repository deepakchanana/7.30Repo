package org.testing.TestScripts;

import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.VideoPlay;
import org.testng.annotations.Test;

public class TC7 extends Base
{
	@Test
	public void testCase7()
	{
		Login login=new Login(driver, pr);
		login.signin("username","password1");
		VideoPlay video=new VideoPlay(driver, pr);
		video.playAParticularvideo();
		video.likeVideo();
		
	}

}
