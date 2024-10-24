package test;
import java.util.List;

public class StudentCourseLinker{
  private List<Integer> idStudents;
  private List<Integer> idCourse;

  private List<List<Integer>> grades;
  private List<Boolean> passed;
  

  public void StudentCourseLinker(){
      idStudents = new ArrayList<Integer>();
      idCourse = new ArrayList<Integer>();
      grades = new ArrayList<List<Integer>>();
      passed = new ArrayList<Boolean>();    
  }

  public void addStudentToCourse(int idSt, int idC){
      idStudents.push(idSt);
      idCourse.push(idC);
      grades.push(new ArrayList<Integer>());
      passed.push(false);
  }

  public void addGrade(int idSt, int idC, int grade){
      for(int i = 0; i < idStudents.size(), i++){
        if(idStudents.getAt(i) == idSt && idCourse.getAt(i) == idC){
          grades.getAt(i).push(grade);
        }
      }
  }

  public void passStudent(int idSt, int idC){
    for(int i = 0; i < idStudents.size(), i++){
      if(idStudents.getAt(i) == idSt && idCourse.getAt(i) == idC){
        passed.set(i,true);
      }
    }
  }

  public void removeStudent(int idSt, int idC){
    for(int i = 0; i < idStudents.size(), i++){
      if(idStudents.getAt(i) == idSt && idCourse.getAt(i) == idC){
        idStudents.remove(i);
        idCourse.remove(i);
      }
    }
  }
  
};

