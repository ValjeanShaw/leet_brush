package primary.arrayPack;

/**
 * @author xiaoran
 * @date 2020/01/21
 */
public class PlusOne {

    public static void main(String[] args) {

    }

    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] newArr = new int[digits.length+1];
        newArr[0]=1;
        for(int i=0;i<digits.length;i++){
            newArr[i+1] = digits[i];
        }
        return newArr;
    }
}
