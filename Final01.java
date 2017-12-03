/**
 * Final01
 */
import java.util.*;

public class Final01 {
        static Scanner scan = new Scanner(System.in);
        public static void main(String[] args) {
            int Days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
            String[] Month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

            ForwardDay(Days,Month);
            BackwardDay(Days,Month);
            
        }
        static void ForwardDay(int[] Days,String[] Month){
          
            System.out.println("Enter This Day (d|m|y) : ");

            int temp = scan.nextInt();
            
            int yy = temp % 10000;

            int mm = (temp / 10000) % 100;

            int dd = ( (temp / 10000)  / 100) % 100;

            System.out.println("How Many  : ");
            
            int move = scan.nextInt();

            int dd1 = dd,mm1=mm,yy1=yy;
            int count = 0; 
            leapYear(yy,Days);
            while(move > count){
                dd1++;
                count++;
                if(dd1 > Days[mm]){
                    dd1 = 1; mm1++;
                    if(mm1 == 13){
                        yy1++;
                        mm1 = 1;
                        leapYear(yy,Days);
                    }
                }
            }
            System.out.println("ForWard To => Year : "+ (yy1 + 543)  + " , Month : " + Month[mm1] + " , Day  : "+dd1);

        }
        static void BackwardDay(int[] Days,String[] Month){
            System.out.println("Enter This Day (d|m|y) : ");
            
            int temp = scan.nextInt();
                        
            int yy = temp % 10000;
            
            int mm = (temp / 10000) % 100;
            
            int dd = ( (temp / 10000)  / 100) % 100;
            
            System.out.println("How Many  : ");
                        
            int move = scan.nextInt();

            int dd1 = dd,mm1=mm,yy1=yy;
            int count = 0; 
            leapYear(yy,Days);
            while(move > count ){
                dd1--;
                count++;
                if(dd1 == 1 ){
                    mm1--;
                    dd1 = Days[mm1];
                    if(mm1 == 1){
                        mm1 = 12;
                        yy1--;
                        leapYear(yy,Days);
                    }
                }

            }
            System.out.println("Backward To => Year : "+ (yy1 + 543)  + " , Month : " + Month[mm1] + " , Day  : "+dd1);
            


        }
        static void leapYear(int yy,int[] Days){
            if(yy % 4 == 0 && (yy % 100 !=0 || yy % 400 == 0))  Days[1] = 29; 
            else  Days[1] = 28;
        }
        
    
}