package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year>0){
            switch (month){
                case(2):
                    if (year%400==0 || (year%4==0 && year%100 !=0)){
                       System.out.println(29);
                    }
                    else{
                        System.out.println(28);
                    }
                    break;
                case(6):
                    System.out.println(30);
                    break;
                default:
                    System.out.println("invalid date");
                    break;
            }
        }
        else{
            System.out.println("invalid date");
        }


    }
}
