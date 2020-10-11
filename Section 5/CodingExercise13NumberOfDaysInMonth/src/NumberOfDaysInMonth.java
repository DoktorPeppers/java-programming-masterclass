public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year){

        if(year < 1 || year > 9999){
            return false;
        } else{
            long test1 = year % 4;
            long test2 = year % 100;
            long test3 = year % 400;
            if(test1 != 0){
                return false;
            } else {
                if(test2 == 0){
                    return test3 == 0;
                }else{
                    return true;
                }
            }
        }
    }

    public static int getDaysInMonth(int month, int year){
        if(month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }
        boolean leap = isLeapYear(year);
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;

            case 2:
                if(leap){
                    return 29;
                } else{
                    return 28;
                }

            case 4: case 6: case 9: case 11:
                return 30;


            default:
                return -1;
        }
    }
}
