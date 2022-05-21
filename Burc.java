package Kosullu_Ifadeler_ve_Kod_Bloklari;

import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ay: ");
        month = input.nextInt();

        System.out.print("Doğduğunuz gün: ");
        day = input.nextInt();


        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Oğlak Burcu";
                } else {
                    burc = "Kova Burcu";
                }
            } else {
                isError = true;

            }
        } else if (month == 2) {

            if (day >= 1 && day <= 28) {
                if (day < 20) {
                    burc = "Kova Burcu";
                } else {
                    burc = "Balık Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 3) {

            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    burc = "Balık Burcu";
                } else {
                    burc = "Koç Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 4) {

            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    burc = "Koç Burcu";
                } else {
                    burc = "Boğa Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 5) {

            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Boğa Burcu";
                } else {
                    burc = "İkizler Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 6) {

            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "İkizler Burcu";
                } else {
                    burc = "Yengeç Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 7) {

            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Yengeç Burcu";
                } else {
                    burc = "Aslan Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 8) {

            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Aslan Burcu";
                } else {
                    burc = "Başak Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 9) {

            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Başak Burcu";
                } else {
                    burc = "Terazi Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 10) {

            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Terazi Burcu";
                } else {
                    burc = "Akrep Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 11) {

            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Akrep Burcu";
                } else {
                    burc = "Yay Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 12) {

            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Yay Burcu";
                } else {
                    burc = "Oğlak Burcu";
                }
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }


        if (isError) {
            System.out.println("Hatalı giris yaptınız, tekrar deneyiniz.");
        } else {
            System.out.println("Burcunuz: " + burc);
        }


    }
}