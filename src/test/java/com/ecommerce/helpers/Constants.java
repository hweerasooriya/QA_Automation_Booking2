package com.ecommerce.helpers;

public class Constants {
	
	public final static String FOLDER_SEPERATOR = "\\";
	public final static String DATE_FORMAT = "yyyy/MM/dd HH:mm:ss";
	
	public static String LOGIN_PAGE = "https://www.makemytrip.com/";
	
	public final static String IMAGE_EXTENSION = ".png";
	public final static String IMAGE_LOCATION = "target\\SCREENS_SHOTS\\";
	
	public final static String TEST_BROWSER_CHROME = "Y";
	public final static String TEST_BROWSER_FIRE_FOX = "N";
    public final static String TEST_BROWSER_IE = "N";
    public final static String TEST_BROWSER_EDGE = "N";
    
    public final static String CHROME_DRIVER_PATH = "bin\\chromedriver.exe";
    public final static String IE_DRIVER_PATH = "bin\\IEDriverServer.exe";
    public final static String EDGE_DRIVER_PATH = "bin\\MicrosoftWebDriver.exe";
    public final static String FIREFOX_DRIVER_PATH = "bin\\geckodriver.exe";
    
 // Types of elements
    public final static String TYPE_TEXT = "T";
    public final static String TYPE_DROP_DOWN = "D";
    public final static String TYPE_CHECK_BOX = "C";
    public final static String TYPE_RADIO_BOX = "R";
    
    public final static boolean GET_SCREEN_SHOTS = true;
    public final static boolean ADD_SUB_FOLDER_CREATION = true; 
    
    public final static String HOME_PAGE = "Home Page" + FOLDER_SEPERATOR;
        
    public final static long TIME_OUT_PERIOD = 20;
    public static final int waitTime=0;

}
