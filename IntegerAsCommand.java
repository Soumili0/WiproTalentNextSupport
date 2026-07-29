public class IntegerAsCommand {
    public static void main(String[] args){
        if(args.length <2){
            System.out.println("error:please give exactly two arguments");
            return;
        }

        try{
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            System.out.println("sum of two numbers is: "+(num1+num2));
        }
        catch(NumberFormatException e){
            System.out.println("error:please give valid integer");
        }
    }
}
