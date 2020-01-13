package homeTask;

public class CodingBat {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        return isWeekend && cigars>40 || cigars>=40&&cigars<=60 ? true : false;
    }




//        String a="He";
//        String b="lololo";
//        int lenA=a.length();
//        int lenB=b.length();
//        if(lenA>=lenB){
//            System.out.println( a.substring(lenA-lenB)+b);
//
//        }else
//            System.out.println(a+b.substring(lenB-lenA));
//        ==========================================================
//        DOUBLE THE CHAR
//      String str="The";
//        String str1="";
//        for(int i=0; i<str.length(); i++){
//            str1+=str.charAt(i)+""+str.charAt(i)+"";
//        }
//        System.out.println(str1);
//        COUNT HI
//    String str=" avc hi hi";
//        int count=0;
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)==('h')&&str.charAt(i+1)==('i')){
//                count++;
//            }
//        }
//        System.out.println(count);

//
//        String a="aBCgh";
//        String b="gdjhgabc";
//        int bLen=b.length();
//        int aLen=a.length();
//        a=a.toLowerCase();
//        b=b.toLowerCase();
//        if(aLen==bLen){
//            System.out.println("true1");
//        }
//        if(aLen>bLen&&a.substring(aLen-bLen).equals(b)){
//            System.out.println(true);
//        }else if(bLen>aLen&&b.substring(bLen-aLen).equals(a)){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }
//        ================================================================
//        int[] nums = {3, 4, 3, 4, 3, 4, 4, 3};
//        int count = 0;
//        if (nums.length >= 1 && nums[0] == 3) {
//            count++;
//        }
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i - 1] == 3 && nums[i] == 3) {
//                System.out.println("false");
//            }
//            if (nums[i] == 3) {
//                count++;
//            }
//
//        }
//        if (count == 3){
//        System.out.println("true");
//
//    }else{
//            System.out.println("nothing");
//

//=============================================================================
//        String aaa = "abc";
//        String bbb = "vdsss";
//        String str = "";
//        int len = 0;
//
//        if (aaa.length() > bbb.length()) {
//            len = aaa.length();
//        } else {
//            len = bbb.length();
//
//        }
//
//        for (int i = 0; i < len; i++) {
//            if (i < aaa.length()) {
//                str += aaa.charAt(i);
//            }
//
//            if (i < bbb.length()) {
//                str += bbb.charAt(i);
//            }
//
//
//        }
//
//        System.out.println(str);
//    }
//   String str="Chocolate";
//   int n=4;
//        String sub=str.substring(0,n);
//        System.out.println(sub);
//        String newStr="";
//        for(int i=0;i<n;i++){
//            newStr+=sub.substring(0,sub.length()-i)+"";
//        }
//        System.out.println(newStr);
//
//
//        int n=1;
//        String str="abXYabc";
//        String strHa=str.substring(0, n);
//        String strN=str.substring(n);
//        System.out.println(strHa);
//            System.out.println(strN);
//        System.out.println(str);
//
////        if(str.substring(n).contains(str.substring(0, n)))

//        int lastD=str.indexOf("d");
//        int firstB=str.lastIndexOf("b");
//        if(str.length()>5&&str.contains("bread")){
//            System.out.println(str.substring(lastD+1,firstB));
//        }
//
//        System.out.println('n');

    public static String plusOut(String str, String word) {
        String newStr="";
        int len=word.length();
        for(int i=0;i<str.length()-len;i++){
            if(str.charAt(i)==word.charAt(0)&&str.charAt(i+len)==word.charAt(len-1)){

            }else{
                newStr+="+";
            }

        }
        return newStr;
    }

    public static void main(String[] args) {
        String str="ggohhhh";
        String word="o";
        System.out.println();
        System.out.println(plusOut(str,word));
    }
}












