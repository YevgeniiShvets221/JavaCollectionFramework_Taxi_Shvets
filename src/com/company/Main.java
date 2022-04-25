package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(120);
        list.add(39);
        list.add(7);
        list.add(21);
        list.add(124);
        list.add(9);
        System.out.println("Massive of all the prices:");
        System.out.println(list);

            IPrice e1 = new TaxiPaymentKM(100,"Bond",120); // 1 km - 1,2 euro
            IPrice e2 = new TaxiPaymentKM(32,"Joker",39);
            IPrice e3 = new TaxiPaymentKM(6,"Bolt",7);

            IPrice e4 = new TaxiPaymentHRS("Uklon",42,21); // 1 min - 2 euro
            IPrice e5 = new TaxiPaymentHRS("Odessa mama",124,62);
            IPrice e6 = new TaxiPaymentHRS("Angel",18,9);

            List <IPrice> ftList = new ArrayList<>();
            ftList.add(e1);
            ftList.add(e2);
            ftList.add(e3);
            ftList.add(e4);
            ftList.add(e5);
            ftList.add(e6);


           int sum = ftList.stream().mapToInt(tax ->tax.getTotalPrice()).sum();
           int sum_for_km = ftList.stream().filter(tax->tax instanceof TaxiPaymentKM)
                   .mapToInt(tax ->tax.getTotalPrice()).sum();
            int sum_for_hrs = ftList.stream().filter(tax->tax instanceof TaxiPaymentHRS)
                    .mapToInt(tax ->tax.getTotalPrice()).sum();
           int min_price = ftList.stream().mapToInt(tax ->tax.getTotalPrice()).min().orElse(0);
           double avg_price = ftList.stream().mapToInt(tax ->tax.getTotalPrice()).average().orElse(0);
            System.out.println("Sum of prices is:");
            System.out.println(sum);
            System.out.println("Minimal price is:");
            System.out.println(min_price);
            System.out.println("Average price is:");
            System.out.println(avg_price);
            System.out.println("Sum of prices in kilometers:");
            System.out.println(sum_for_km);
            System.out.println("Sum of prices in time:");
            System.out.println(sum_for_hrs);
        }
}

