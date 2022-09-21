

public class Switch {

	public static void main(String[] args) {
		
	
		int code=1;
		
		String result=switch(code)
		{
		case 1->  {yield "java";}
		case 2->  {yield "C";}
		case 3->  {yield "C++";}
		default-> {yield "python";}
		};
		
		System.out.println(result);

  }
}
