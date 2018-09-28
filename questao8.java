public class MyClass {
    
    public static void main(String args[]) {
        
        
        Long la = 123L;   // Informe o número A
        Long lb = 456L;   // Informe o número B
        

        String sa = Long.toString(la);
        String sb =  Long.toString(lb);

        int count = 0;
        
        if(sa.length() >= sb.length()){ 
            count =  sa.length()-1; 
        }else{ 
            count = sb.length()-1;
        }
        
        StringBuilder scc = new StringBuilder();

        for(int x = 0; x <= count; x++){
            if(sa.length()-1 >= x){
                scc.append(sa.charAt(x));
            }
            if(sb.length()-1 >= x){
                scc.append(sb.charAt(x));
            }
            
            if(scc.toString().length() >=7){
               break;
            } 
        }
        
        long result = Long.valueOf(scc.toString().trim());
        
        if(result > 1000000L){
           System.out.println("-1");
        }else{
            System.out.println(scc);
        }
    }
}