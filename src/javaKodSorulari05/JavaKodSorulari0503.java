package javaKodSorulari05;

public class JavaKodSorulari0503 {

	/*
    Verilen String array icerisindeki tekrar eden karakterleri yazdiran Java kodunu yaziniz. 
    String str=“ilovejavatoo” 
    Output: o v a
             */
    public static void main(String[] args) {
        
        
            
            String str = "ahmetahmet";
            
            String tEden = "";
            
            for(int i=0; i<str.length();i++) {
                
                for(int j=i+1; j<str.length();j++) {
                    
                    if(str.charAt(i)==str.charAt(j) && !(tEden.contains(str.substring(i, i+1)))) {
                        
                        tEden = tEden + str.charAt(i);
                        System.out.print(str.charAt(i) + " ");
                        
                    }
                    
                }
                } 
            
            
        
        
    }

	
	
	
}
