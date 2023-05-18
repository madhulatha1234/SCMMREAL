package Practice;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.testng.annotations.Test;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AAATEST {
	//https://www.shoppersstack.com/shopping/swagger-ui.html#/Shopper_Profile
	public String author();
	public String[] category() default "regression";
	
}
