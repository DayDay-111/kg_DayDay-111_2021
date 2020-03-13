import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        if(args.length!=2){
            System.out.println("parameter number is not 2");
            return ;
        }
        String s1=args[0];
        String s2=args[1];
        if(s1.length()!=s2.length()){
            System.out.println("Two string did not have same length");
            return ;
        }
        System.out.println(s1+s2);

        System.out.println(mapString( s1,s2));

    }

    public static boolean mapString(String str1,String str2){
        Map<Character,Character> charMap = new HashMap<Character,Character>();
        char[] char1=str1.toCharArray();
        char[] char2=str2.toCharArray();

        for(int i=0;i<char1.length;i++){
            char origiChar = char1[i];
            char mapChar= char2[i];
            if(charMap.get(origiChar)==null){
                charMap.put(origiChar,mapChar);
            }else{
                if(charMap.get(origiChar)!=mapChar){
                    return false;
                }
            }
        }
        return true;
    }
}
