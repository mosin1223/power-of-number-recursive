import java.util.Scanner;

class power{
   /* private int num ,power;
    void set(int num, int power){
        this.num=num;
        this.power=power;
    }*/

    int answer(int num ,int  power ){
        if(power == 0){
            return 1;
        }
        else{
            return num * answer(num,power-1);
        }
    }
}
public class Q4 {
    public static void main(String args[]){

        Scanner write = new Scanner (System.in);
        int num;
        int power;

        System.out.print("Enter the num for power : ");
        num = write.nextInt();

        System.out.print("enter the power of "+num +" : ");
        power = write.nextInt();

        power p1 = new power();
        //p1.set(num,power);
        System.out.println("Answer is : "+ p1.answer(num,power));
    }


}
