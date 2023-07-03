
package finance.dept;

import marketing.section.*;

public class Mul  
{
    public static void  main(String[] args) {
        Mul b = new Mul();
        b.myTable();

    }
  
    public void myTable() {

        for(int k = 1; k<=2; k++) 
        {
            for(int i = 1; i<=3; i++) 
            {
                ////int num = 2;
                String str = " "+i;
                System.out.println(str +" x " + k + " = " +	(i*k));
            }
            System.out.println("");
        }	
            
        
        
        
        
        //marketing.section.Addition obj = new marketing.section.Addition();
        //obj.addNum();

            //int result = obj.addNum(2, 5);
            //System.out.println(result);
            //System.out.println(obj.addNum(490, 5));


  }



  

  
}
