public class Course {
  Teacher abc;
  String name;
  String code;
  String prefix;
  int note = 0;

  Course(String name,String code,String prefix){
    this.name = name;
    this.code = code;
    this.prefix = prefix;
  }

  void addTeacher(Teacher Teacher){
    if(Teacher.branch.equals(this.prefix)) {
      this.abc = Teacher;
    }
    else{
      System.out.println("Bu ogretmen bu sinifa giremez.");
    }
  }

  void printTeacherInfo(){
    this.abc.print();
  }


  }
