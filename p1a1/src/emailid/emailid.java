
		package emailid;
		import java.util.ArrayList;
		import java.util.regex.Pattern;

		class emailid {

			
				public static boolean isValid(String email)
				{
					String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
										"[a-zA-Z0-9_+&*-]+)*@" +
										"(?:[a-zA-Z0-9-]+\\.)+[a-z" +
										"A-Z]{2,7}$";
										
					Pattern pat = Pattern.compile(emailRegex);
					if (email == null)
						return false;
					return pat.matcher(email).matches();
				}

				public static void main(String[] args)
				{
					ArrayList<String> address = new ArrayList<>();
						
					address.add("amrutha.6360@gmail.com");
					address.add("kotregoudagmail.com");
						
					for(String i : address){
						if (isValid(i))
							System.out.println(i + " - True");
						else
							System.out.println(i + " - False");
					}
				}
			}


	
