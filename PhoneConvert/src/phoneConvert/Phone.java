package phoneConvert;

import java.util.Scanner;

public class Phone
{

    public static void main(String[] args)
    {
        String workChar = null;
        String phoneAlpha = "STATEFARM";
        String phoneNumeric = "";
        String[] digits = new String[]
        { "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "WXYZ9" };
        System.out.println("Enter you alpha number: ");
        // Scanner input = new Scanner(System.in);
        // phoneAlpha = input.next();
        phoneAlpha = phoneAlpha.toUpperCase();

        if (phoneAlpha.length() != 7)
        {
            phoneAlpha = phoneAlpha.substring(0, 7);
        }

        for (int i = 0; i < phoneAlpha.length(); i++)
        {
            workChar = phoneAlpha.substring(i, i + 1);
            // System.out.println("working character:");
            // System.out.println(workChar);
            int found = 0;
            for (int j = 0; j < digits.length; j++)
            {
                // System.out.println(j);
                found = 0;
                if (digits[j].contains(workChar))
                {
                    phoneNumeric = phoneNumeric
                            + digits[j].substring(digits[j].length() - 1);
                    found = 1;
                }

            }
            // if (found == 0) {
            // phoneNum = phoneNum + workChar;
            // found=0;
            // }
            if (i == 2)
            {
                phoneNumeric = phoneNumeric + "-";
            }


        }
        System.out.println("Your converted phone number is: " + phoneNumeric);

    }

}
