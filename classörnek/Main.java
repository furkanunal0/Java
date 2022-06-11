public class Main {
public static void main(String[] args){
    Teacher t1 = new Teacher("arzu","123123","TRH");
    Teacher t2 = new Teacher("Ahmer","123123","FZK");
    Teacher t3 = new Teacher("Memo","123123123","KMY");
    Course tarih = new Course("Tarih","101","TRH");
    tarih.addTeacher(t1);
    Course fizik = new Course("fizik","101","FZK");
    fizik.addTeacher(t2);
    Course kimya = new Course("Kimya","101","KMY");
    kimya.addTeacher(t3);

    Student s1 = new Student("ibrahim","130","3/A",tarih,fizik,kimya);
    s1.addBulkExam(10,40,50);
    s1.İsPass();




}
}
