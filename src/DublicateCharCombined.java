
public class DublicateCharCombined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int i = 0;

		
		String m="abbcbbdefbbgbbhbbmbb";
		 char[] charArray = m.toCharArray();
		 for ( i = 0; i < charArray.length-1; i++) {
			 System.out.println("After Split  : "+charArray[i]);
			 System.out.println();	

			 if (charArray[i] == 'b' && charArray[i+1] == 'b') {
				count++;
			}
			 

		}
			System.out.println(charArray[i]+" = "+count);

		
		

		

	}

}
