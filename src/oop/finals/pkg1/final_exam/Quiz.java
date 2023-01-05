
package oop.finals.pkg1.final_exam;


public class Quiz {
  private int id;
  private Student student;
  private int totalScore;
  private int maxScore;
  
  public Quiz(int id, Student student, int totalScore, int maxScore) {
    this.id = id;
    this.student = student;
    this.totalScore = totalScore;
    this.maxScore = maxScore;
  }
  
  public double grade() {
    return (double) totalScore / maxScore;
  }
}