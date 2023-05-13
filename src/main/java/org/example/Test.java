package org.example;

import com.github.eloyzone.jalalicalendar.DateConverter;
import com.github.eloyzone.jalalicalendar.JalaliDate;

public class Test {
    public static void main(String[] args) {
        DateConverter dateConverter = new DateConverter();
        JalaliDate aliJBrithDate = dateConverter.gregorianToJalali(1997, 2, 11);
        System.out.println(aliJBrithDate);
    }
}
