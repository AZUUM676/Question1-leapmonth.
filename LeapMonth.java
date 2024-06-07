/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.leapmonth;

/**
 *
 * @author azuum
 */
public class LeapMonth {

    public static void main(String[] args) {
        int Year = 2024;
        int Month =  4;
      boolean isLeapMonth= checkLeapMonth(Year, Month);
      if (isLeapMonth){
                  System.out.println("The Month is a leapMonth");

      }else{
                  System.out.println("The Month is not leapMonth");

      }
    }
     public static boolean checkLeapMonth(int Year, int Month) {
        boolean isLeapMonth = (Year % 4 == 0);
        isLeapMonth = isLeapMonth && (Month % 100 != 0);
        isLeapMonth = isLeapMonth || (Month % 400 == 0);
        return isLeapMonth;
}
}

