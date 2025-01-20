package JavaDatatypes;

import java.util.Scanner;

class Solution{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            String longOutPutFitted = "";
            String intOutPutFitted = "";
            String shortOutPutFitted = "";
            String byteOutPutFitted = "";
            String value = "";
            try
            {
                String receivedValue = sc.next();
                value = receivedValue;
                Long longValuesConverted = Long.parseLong(receivedValue);
                longOutPutFitted = "* long";
                Integer intValuesConverted = Integer.parseInt(receivedValue);
                intOutPutFitted = "* int";
                Short shortValuesConverted = Short.parseShort(receivedValue);
                shortOutPutFitted = "* short";
                Byte byteValuesConverted = Byte.parseByte(receivedValue);
                byteOutPutFitted = "* byte";
            }
            catch(Exception e)
            {
            }
            if(longOutPutFitted.isEmpty() &&
                    intOutPutFitted.isEmpty() &&
                    shortOutPutFitted.isEmpty() &&
                    byteOutPutFitted.isEmpty()){
                System.out.println(value+" can't be fitted anywhere.");
            }else{
                System.out.println(value+" can be fitted in:");
                if(!byteOutPutFitted.isEmpty())
                    System.out.println(byteOutPutFitted);
                if(!shortOutPutFitted.isEmpty())
                    System.out.println(shortOutPutFitted);
                if(!intOutPutFitted.isEmpty())
                    System.out.println(intOutPutFitted);
                if(!longOutPutFitted.isEmpty())
                    System.out.println(longOutPutFitted);
            }
        }
    }
}
