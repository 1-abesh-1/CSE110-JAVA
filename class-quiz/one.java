

public class Main{
  public static void main(String [] args){
    
    int cost=950;
    int disc=0;
    if(900>=cost && cost>=800){
        disc=(cost*12)/100;
        if(disc%2==0){
            cost=cost-disc;
        }else{
            disc=disc+55;
            cost=cost-disc;
        }
        
    }else if(1200>=cost && cost>=950){
        disc=(cost*20)/100;
        if(disc%2==0){
            cost=cost-disc;
        }else{
            disc=disc+55;
            cost=cost-disc;
        }
    }
   
    System.out.println(cost);
    

  }
  
  
}
