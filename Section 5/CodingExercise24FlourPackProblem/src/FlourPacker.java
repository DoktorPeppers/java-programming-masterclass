public class FlourPacker {

    public static boolean canPack(int bigCount,int smallCount,int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        } else if((bigCount * 5 > goal && smallCount == 0) || (bigCount * 5 < goal && smallCount == 0)){
            return false;
        }
        return ((5 * bigCount) + smallCount >= goal) && (smallCount >= (goal % 5));
    }
}
