
//this class holds all the application constants
package initialisers;

	import java.text.SimpleDateFormat;
	import java.util.Calendar;

	public class Constants {
		
		//Browser :- Select Browsers Firefox/ Chrome
		public static final String browser = "firefox";
		
		//Application Url
		public static final String url= "https://www.zomato.com/";
		
		
		// BUILD GENERATOR
		static Calendar c = Calendar.getInstance();
		static SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy.HHmmss");
		static String build = sdf.format(c.getTime());
		public static final String BUILD = build;

}