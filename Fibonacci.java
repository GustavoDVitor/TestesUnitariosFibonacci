
public class Fibonacci {

    public String calculaFib(int num){
        int fib0 = 0;
        int fib1 = 1;
        String result = "";

        if(num < 0 || num > 40){
            return "numero invalido";
        }

        if(num == 0){
            return result.concat("Fib("+num+") = "+fib0);
        } else{
            if(num == 1){
                return result.concat("Fib("+num+") = "+fib1);
            }
            else{
                int fibn = 0;
                
                for(int i = 1; i < num; i++){
                    fibn = fib1 + fib0;
                    fib0 = fib1;
                    fib1 = fibn;
                }
                return result.concat("Fib("+num+") = "+fibn);
            }
        }
    }

    public static void main (String[] args) {
        
        Fibonacci fib = new Fibonacci();
        System.out.println(fib.calculaFib(0));
    }
    
}

