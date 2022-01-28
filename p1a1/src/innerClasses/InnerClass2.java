
		package innerClasses;

		public class InnerClass2 {
			private String msg="Inner Classes";

			 void display(){  
				 class Inner{  
					 void msg(){
						 System.out.println(msg);
					 }  
			  }  
			  
			  Inner l=new Inner();  
			  l.msg();  
			 }  
		}
		

	
