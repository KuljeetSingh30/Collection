import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DublicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int[] array = {1,1,2,3,4,5,6,7,8,8};
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < array.length ; i++)
        {
			
			
            //If same integer is already present then add method will return FALSE
            if(set.add(array[i]) == false)
            {
                System.out.println("Duplicate element found : " + array[i]);
            }
        }

	}

}
