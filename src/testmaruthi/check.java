package testmaruthi;

public class check{
	public static void check(int s)
	{
			try{
	    double d= Double.valueOf(s);
	    if (d==(int)d){
	        System.out.println("integer"+(int)d);
	    }else{
	        System.out.println("double"+d);
	    }
	}catch(Exception e){
	    System.out.println("not number");
	}
}
}