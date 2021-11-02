package aula10082021;


public class Aula10082021 {
        public static void main(String[]   args){
            
            //for
            for(int i = 0; i < 10; i++){
                     System.out.println(i + " < 10 ");
        }
            
          //while
          int cont  = 0;
          while(cont < 10){
              System.out.println("WHILE : " + cont + " < 10" );
              cont++;
          }
          
          //do while
          int cont2 = 0 ;
          
          do{
              System.out.println("DO WHILE " + cont2 +  " < 10");
              cont2++;
          }while(cont2 < 10);
           
          int valor01, valor02, calculo;
          
          try{
              valor01 = 100;
              valor02 = 10;
              calculo = valor01 / valor02;
         
              System.out.println("Executado com sucesso :");
          }catch(Exception ex){
              System.out.println("Error  : " +  ex.getMessage());
          }finally {
              System.out.println("Executo sempre !!");
          }

        }
}
