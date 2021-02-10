package codingtest;

class animal{
	
	public void shout()
	{
		System.out.println("animals shout");
		
	}
}

class dog extends animal{

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		super.shout();
		System.out.println("dog barks");
	}


	
	
}

class horse extends animal{

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		super.shout();
		
		System.out.println("horse neiggh");
		
	}
	
}
	class cat extends animal{

		@Override
		public void shout() {
			// TODO Auto-generated method stub
			super.shout();
			
			System.out.println("cat meooow");
			
		}
		
		
		
		
		
	}
	


public class animalclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal a=new animal();
		animal d=new dog();
		animal b=new cat();
		animal h=new horse();
		b.shout();
		d.shout();
		h.shout();
		

	
	}

}
