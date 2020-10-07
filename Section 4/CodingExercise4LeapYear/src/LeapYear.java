public class LeapYear {
    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999){
            return false;
        }else{
            long test1 = year % 4;
            long test2 = year % 100;
            long test3 = year % 400;
            if(test1 != 0){
                return false;
            } else {
                if(test2 == 0){
                    if(test3 == 0){
                        return true;
                    }else{
                        return false;
                    }
                }else{
                    return true;
                }
            }
        }
    }
}
