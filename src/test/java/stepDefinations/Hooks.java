package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@MobileTest")
	public void beforevalidation() {
		
		System.out.println(" before mobile  hook");
		
	}

	@After("@MobileTest")
	public void Aftervalidation() {
		
		System.out.println(" After mobile  hook");
	}
		
		@Before("@WebTest")
		public void beforewebvalidation() {
			
			System.out.println(" before web  hook");
			
		}

		@After("@WebTest")
		public void Afterwebvalidation() {
			
			System.out.println(" After web before  hook");
		}
	}

