import java.math.*;
import java.text.*;
import java.time.*;
import java.time.format.*;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        User[] users = new User[2];
        User user1 = new User();
        user1.customerId = 1;
        user1.id = 1;
        user1.name = "Empoyee1";

        user1.activatedOn =   LocalDate.of(parseInt("2021"), parseInt("11"), parseInt("04"));
        user1.deactivatedOn =  LocalDate.of(parseInt("2022"), parseInt("04"), parseInt("10")); // 4316
        User user2 = new User();
        user2.customerId = 1;
        user2.id = 2;
        user2.name = "Empoyee2";
        user2.activatedOn =   LocalDate.of(parseInt("2021"), parseInt("12"), parseInt("04"));
        user2.deactivatedOn = null;
        users[0] = user1;
        users[1] = user2;

        Subscription s = new Subscription(1,1,5000);
        monthlyCharge( "2018-01",  s,  users);
    }

    public static int monthlyCharge(String month, Subscription subscription, User[] users) {
        int totalCharge = 0 ;
        try{
            for(User u : users){

                if(u.activatedOn== null){
                    continue;
                }

                String  startDate = u.activatedOn.toString();
                int startDay  = u.activatedOn.getDayOfMonth();
                int startMonth = u.activatedOn.getMonthValue();
                int startYear = u.activatedOn.getYear();
                int endDay=0;
                int endMonth=0;
                int endYear=0;
                if(u.deactivatedOn != null){
                    String  endDate = u.deactivatedOn.toString();
                    endDay  = u.deactivatedOn.getDayOfMonth();
                    endMonth =u.deactivatedOn.getMonthValue();
                    endYear = u.deactivatedOn.getYear();
                }
                LocalDate date = LocalDate.of(parseInt(month.split("-")[0]), parseInt(month.split("-")[1]), 1);
                int totalDaysInMonth = date.lengthOfMonth();

                int totalChargePerday = subscription.monthlyPriceInCents / totalDaysInMonth;
                int m = date.getMonthValue();
                int y = date.getYear();
                if(m == startMonth && m == endMonth){
                    if(y == startYear && y == endYear){
                        int totalDaysActivated = totalDaysInMonth - endDay;
                        totalCharge += totalDaysActivated * totalChargePerday;
                    }
                }{
                    if(y< startYear){
                        continue;
                    }
                    totalCharge += subscription.monthlyPriceInCents;
                }
            }
        }catch(Exception e){
            System.out.println(e.getLocalizedMessage());
        }


        return totalCharge;
    }
}