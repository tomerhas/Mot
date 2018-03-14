package extensiones;

import java.util.regex.Pattern;

import org.openqa.selenium.WebElement;

public class Split {
	
	
	public static String[] splitText( WebElement element, String simbol  ){
		
		
		String string =  ReadText.getText(element );
		String[] parts = string.split(simbol);
		return parts;
		/*String part1 = parts[0];
		String part2=parts[1];
		String part3=parts[2];
		return part1+part2;*/
		
					
	}
	
	
	
	

}
