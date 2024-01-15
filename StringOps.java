public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
		
		}

    public static String capVowelsLowRest (String string) {
		String res = "";
        for (int i = 0; i < string.length(); i++) {
			char ch= (string.charAt(i));
		if(ch == ' '){
               res = res + ch;
		}
				else{
				if (ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'a') {
					ch = (char) (ch - 32);
					res = res + ch;
				}                     						
					else{
						if (ch !='I' && ch !='E' && ch !='O' && ch !='U' && ch !='A') {
							if (ch >= 'A' && ch <= 'Z') {
							ch = (char) (ch + 32);
							res = res + ch;
							}
							else{
								if (ch >= 'a' && ch <= 'z') {
									ch = ch;
									res = res + ch;
								}
							}			
						}
						else{
							ch = ch;
							res = res + ch;
							}
						}
					}
				}	
			return res;
	}
	
	
	
	//help functions: 
	public static boolean Cap(char c) {
        return c >= 'A' && c <= 'Z';
    }
	
	public static char upCase(char s) {
        if (s >= 'a' && s <= 'z') {
            return (char) (s - 'a' + 'A');
        } else {
            return s; 
        }
    }
	
	public static char lowcase(char s) {
        if (s >= 'A' && s <= 'Z') {
            return (char) (s - 'A' + 'a');
        } else {
            return s; 
        }
    }
	
	
	
    public static String camelCase (String string) {
        // Write your code here:
		 
		boolean Cap = false;
        boolean isFirst = false;
        String res = "";

        for (int i = 0; i < string.length(); i++) {
            if (!isFirst && string.charAt(i) != ' ') {
                res += lowcase(string.charAt(i));
                isFirst = true;
                Cap = false;
                continue;
            }
            if (Cap && string.charAt(i) != ' ') {
                res += upCase(string.charAt(i));
                Cap = false;
            } else if (string.charAt(i) != ' ' && !Cap) {

                res += lowcase(string.charAt(i));

            }
            if (string.charAt(i) == ' ') {

                Cap = true;
            }
        }
        return res;
    }
    
	
		 
        // Populate the array with values
          public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
			int count = 0;
			for (int i = 0; i < string.length(); i++) {
				if (string.charAt(i) == chr) {
				count ++;
				}
			}
				int[] result = new int[count];
				int index =0;
				for (int i=0; i< string.length(); i++) {
					if (string.charAt(i) == chr){
						result [index] =i;
						index++;
					}
				}
		
		return result;
		}
	 }
