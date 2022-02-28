import java.util.Random;

public class RandomNum {

	public static void main(String[] args) 
	{	
		Random r=new Random();
        double s= 0; 
        int loop= 10;
        int max= 50;

        for (int i = 0; i < loop; i++)
        {
            int val = r.nextInt(max) + 1; //+1 for getting range 1 to max
            System.out.println(val);

             s+=val; // sum of all random numbers
        }

        System.out.println("Your average is: " + (s/loop));

	}

}
