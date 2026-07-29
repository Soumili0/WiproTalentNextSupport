public class CompanyLocationFormatter {
    public static void main(String[] args){
        if(args.length != 2){
            System.out.println("error:please give exactly two arguments");
            return;
        }

        System.out.println(args[0] +" "+"technologies"+" "+args[1]);
    }
    
}
