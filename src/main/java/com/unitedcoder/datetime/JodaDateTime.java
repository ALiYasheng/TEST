package com.unitedcoder.datetime;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.time.ZoneId;
import java.util.Set;


public class JodaDateTime {
    public static void main(String[] args) {

        //define new joda date time
        DateTime date = new DateTime();
        System.out.println(date.toString());
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-mm/dd-hh:mmss");
        System.out.println(date.toString(formatter));

        DateTime universalTime = new DateTime(DateTimeZone.UTC);
        System.out.println("universal time" + universalTime);

        Set<String> timeZones= ZoneId.getAvailableZoneIds();
        for (String s:timeZones){
            System.out.println(s);
        }

        DateTimeZone urumqiTime = DateTimeZone.forID("Asia/Urumqi");
        DateTime time = new DateTime(urumqiTime);
        System.out.println(" Urumqi time is " + time);

        DateTimeZone kshgarTime = DateTimeZone.forID("Asia/Kashgar");
        DateTime time2 = new DateTime(kshgarTime);
        System.out.println(" Kashgar time is " + time2);

        //get day name
        System.out.println(universalTime.dayOfWeek());
        System.out.println(universalTime.getMonthOfYear());
        System.out.println(universalTime.getYear());

        //get difference
        DateTime beginDate = new DateTime("2022-02-20");
        DateTime endDate = new DateTime();
        Period period = new Period(beginDate,endDate, PeriodType.days());
        System.out.println(period.getDays());
    }
}
