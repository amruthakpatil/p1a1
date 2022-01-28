
		package exceptionHandling;

		class MyException extends Exception{
			   String str1;
			   MyException(String str2) {
				str1=str2;
			   }
			   public String toString(){ 
				return ("Exception Occurred: "+str1);
			   }
			}

		public class ExceptionDemo {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				try{
					System.out.println("Starting of try block");
					// I'm throwing the custom exception using throw
					throw new MyException("This is My error Message");
				}
				catch(MyException exp){
					System.out.println("Catch Block");
					System.out.println(exp);
				}


			}

		}

	
