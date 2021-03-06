import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class thoughtworks {
    public static String[][] num0 = new String[][] { { " ", "-", " " }, { "|", " ", "|" }, { " ", " ", " " }, { "|", " ", "|" }, { " ", "-", " " } };
    public static String[][] num1 = new String[][] { { " ", " ", " " }, { " ", " ", "|" }, { " ", " ", " " }, { " ", " ", "|" }, { " ", " ", " " } };
    public static String[][] num2 = new String[][] { { " ", "-", " " }, { " ", " ", "|" }, { " ", "-", " " }, { "|", " ", " " }, { " ", "-", " " } };
    public static String[][] num3 = new String[][] { { " ", "-", " " }, { " ", " ", "|" }, { " ", "-", " " }, { " ", " ", "|" }, { " ", "-", " " } };
    public static String[][] num4 = new String[][] { { " ", " ", " " }, { "|", " ", "|" }, { " ", "-", " " }, { " ", " ", "|" }, { " ", " ", " " } };
    public static String[][] num5 = new String[][] { { " ", "-", " " }, { "|", " ", " " }, { " ", "-", " " }, { " ", " ", "|" }, { " ", "-", " " } };
    public static String[][] num6 = new String[][] { { " ", "-", " " }, { "|", " ", " " }, { " ", "-", " " }, { "|", " ", "|" }, { " ", "-", " " } };
    public static String[][] num7 = new String[][] { { " ", "-", " " }, { " ", " ", "|" }, { " ", " ", " " }, { " ", " ", "|" }, { " ", " ", " " } };
    public static String[][] num8 = new String[][] { { " ", "-", " " }, { "|", " ", "|" }, { " ", "-", " " }, { "|", " ", "|" }, { " ", "-", " " } };
    public static String[][] num9 = new String[][] { { " ", "-", " " }, { "|", " ", "|" }, { " ", "-", " " }, { " ", " ", "|" }, { " ", "-", " " } };
    public static String[][] error = new String[][] {{ " ", "-", " " }, { "|", " ", " " }, { " ", "-", " " }, { "|", " ", " " }, { " ", "-", " " } };
    public static String[][][] numAll = new String[][][] { num0, num1, num2, num3, num4, num5, num6, num7, num8, num9 };

    public static  String[][] num0_2 = new String[][] { {" ","-","-"," "}, {"|"," "," ","|"}, {"|"," "," ","|"}, {" "," "," "," "}, {"|"," "," ","|"}, {"|"," "," ","|"}, {" ","-","-"," "} };
    public static  String[][] num1_2 = new String[][] { {" "," "," "," "}, {" "," "," ","|"}, {" "," "," ","|"}, {" "," "," "," "}, {" "," "," ","|"}, {" "," "," ","|"}, {" "," "," "," "} };
    public static  String[][] num2_2 = new String[][] { {" ","-","-"," "}, {" "," "," ","|"}, {" "," "," ","|"}, {" ","-","-"," "}, {"|"," "," "," "}, {"|"," "," "," "}, {" ","-","-"," "} };
    public static  String[][] num3_2 = new String[][] { {" ","-","-"," "}, {" "," "," ","|"}, {" "," "," ","|"}, {" ","-","-"," "}, {" "," "," ","|"}, {" "," "," ","|"}, {" ","-","-"," "} };
    public static  String[][] num4_2 = new String[][] { {" "," "," "," "}, {"|"," "," ","|"}, {"|"," "," ","|"}, {" ","-","-"," "}, {" "," "," ","|"}, {" "," "," ","|"}, {" "," "," "," "} };
    public static  String[][] num5_2 = new String[][] { {" ","-","-"," "}, {"|"," "," "," "}, {"|"," "," "," "}, {" ","-","-"," "}, {" "," "," ","|"}, {" "," "," ","|"}, {" ","-","-"," "} };
    public static  String[][] num6_2 = new String[][] { {" ","-","-"," "}, {"|"," "," "," "}, {"|"," "," "," "}, {" ","-","-"," "}, {"|"," "," ","|"}, {"|"," "," ","|"}, {" ","-","-"," "} };
    public static  String[][] num7_2 = new String[][] { {" ","-","-"," "}, {" "," "," ","|"}, {" "," "," ","|"}, {" "," "," "," "}, {" "," "," ","|"}, {" "," "," ","|"}, {" "," "," "," "} };
    public static  String[][] num8_2 = new String[][] { {" ","-","-"," "}, {"|"," "," ","|"}, {"|"," "," ","|"}, {" ","-","-"," "}, {"|"," "," ","|"}, {"|"," "," ","|"}, {" ","-","-"," "} };
    public static  String[][] num9_2 = new String[][] { {" ","-","-"," "}, {"|"," "," ","|"}, {"|"," "," ","|"}, {" ","-","-"," "}, {" "," "," ","|"}, {" "," "," ","|"}, {" ","-","-"," "} };
    public static String[][][] numAll_2 = new String[][][]{num0_2, num1_2, num2_2, num3_2, num4_2, num5_2, num6_2, num7_2, num8_2, num9_2 };
    public static  String[][] error_2 = new String[][] { {" ","-","-"," "}, {"|"," "," "," "}, {"|"," "," "," "}, {" ","-","-"," "}, {"|"," "," "," "},{"|"," "," "," "}, {" ","-","-"," "} };


    public static void main(String[] args) {
//        printResult("MCMXCIV",1);
        int sizeNum = 1;
        Scanner in = new Scanner(System.in);
        String size = in.nextLine();
        String romanNumber = in.nextLine();
        if(size.length() == 0) {
            sizeNum = 1;
        }else{
            sizeNum = Integer.parseInt(String.valueOf(size.charAt(9)));
        }
        Map<Character,Integer> map1 = new HashMap<>();
        map1.put('I',1);
        map1.put('V',5);
        map1.put('X',10);
        map1.put('L',50);
        map1.put('C',100);
        map1.put('D',500);
        map1.put('M',1000);

        boolean isValid = true;
        char[] roman = romanNumber.toCharArray();
        for(char ele: roman){
            if(!map1.containsKey(ele)){
                isValid = false;
                break;
            }
        }
        if(isValid){
            printResult(romanNumber,sizeNum);
        }else{
            printError(sizeNum);
        }

    }


    public static String[][][] romanToInt(String str,int size){
        Map<Character,Integer>map = new HashMap<>();          //使用hashmap存储罗马数字与整数的映射
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int res = 0;
        for(int i = 0 ;i<str.length();i++)
        {
            if(i+1 < str.length()){
                int a = map.get(str.charAt(i)) ;
                int b = map.get(str.charAt(i+1));

                if(b > a)
                {
                    res  = res - map.get(str.charAt(i));
                }
                else{
                    res = res + map.get(str.charAt(i));
                }
            }
            else{
                res = res + map.get(str.charAt(i));
            }
        }

        String strRes = String.valueOf(res);
        int resLen = strRes.length();

        String[][][] numberArr = new String[resLen][][];
        char[] intNumberCharArr = strRes.toCharArray();
        String[][][] num = size == 2?numAll_2:numAll;
        for(int i=0;i<intNumberCharArr.length;i++){
            numberArr[i] = num[Integer.parseInt(String.valueOf(intNumberCharArr[i]))];
        }
        return numberArr;

    }
    public static void printError(int size){
        String[][] errorArray = size == 2?error_2:error;
        for(int i=0;i<errorArray.length;i++){
            for(int j=0;j<errorArray[0].length;j++){
                System.out.print(errorArray[i][j]);
            }
            System.out.println(" ");
        }
    }

    public static void printResult(String str, int size){
        String[][][] getStr = romanToInt(str,size);

        for(int i =0 ;i<getStr[0].length; i++){                     //对于三维数组，先从每一行开始输出
            for(int k=0;k<getStr.length;k++){                       //对于每一个数字
                for(int j=0;j<getStr[0][0].length;j++){             //对于每一列输出
                    System.out.print(getStr[k][i][j]);
                }
            }
            System.out.println(" ");
        }
    }


}
