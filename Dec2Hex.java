import java.util.Scanner;

class Dec2Hex
{

    public static int Arg1;

    public static void main(String args[])
    {

	if (args.length == 0) {
	System.out.println("Error: Please provide a decimal number");
	return;
	}

        Arg1 = Integer.parseInt(args[0]);
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem, num;
        num = Arg1;
        String hexadecimal="";
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while(num != 0)
        {
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }

        System.out.println("The Decimal number is represented in the Hexadecimal form: " + hexadecimal);

    }
}
