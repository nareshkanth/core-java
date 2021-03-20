
import java.util.ArrayList;

public class ArraysList {

	public static void main(String[] args) {
		ArrayList<Integer> num=new ArrayList<Integer>();
		num.add(8);
		num.add(9);
		num.add(7);
		num.add(4);				//array list is where we can make change the data
		num.add(3);
		num.add(1);
		for (int i:num);
		{
			System.out.println( num );
		
		}
		System.out.println('[');
		for(int i=0;i<=num.size()-1;i++);{
			System.out.println('i'+" ");
		}
		System.out.println(']');
	}

}