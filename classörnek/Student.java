public class Student {
String name;
String stuNo;
String classes;
Course c1;
Course c2;
Course c3;
double avarage;
int İsPass;


    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.İsPass = 0;

    }

    void addBulkExam(int note1, int note2, int note3){

        if(note1 >= 0 && note1 <= 100){                                         //bunu daha farklı yazabilir misin diye sor.
           this.c1.note = note1;
        }
        if(note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if(note3 >= 0 && note3 <= 100){
            this.c3.note = note3;
        }
            else {
                System.out.println("gecersiz not girdiniz.");
        }

    }


    void İsPass(){
        this.avarage = (this.c1.note + this.c2.note + this.c3.note) /3;
        if(this.avarage >= 50){
            System.out.println("Ogrenci sinifi gecmistir.");
        }
        else{
            System.out.println("Ogrenci sinifta kalmistir.");
        }
    }












}
