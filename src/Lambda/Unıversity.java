package Lambda;

public class Unıversity {

 private String Unıversity;
 private String Section;
 private Integer NumberOfStudent;
 private Integer GradePointAverage;

    public Unıversity(){} //  p'siz cons.


    public Unıversity(String unıversity, String section, Integer numberOfStudent, Integer gradePointAverage) { // p'li cons.
        Unıversity = unıversity;
        Section = section;
        NumberOfStudent = numberOfStudent;
        GradePointAverage = gradePointAverage;
    }

    public String getUnıversity() {
        return Unıversity;
    }

    public void setUnıversity(String unıversity) {
        Unıversity = unıversity;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        Section = section;
    }

    public Integer getNumberOfStudent() {
        return NumberOfStudent;
    }

    public void setNumberOfStudent(Integer numberOfStudent) {
        NumberOfStudent = numberOfStudent;
    }

    public Integer getGradePointAverage() {
        return GradePointAverage;
    }

    public void setGradePointAverage(Integer gradePointAverage) {
        GradePointAverage = gradePointAverage;

    }

    @Override
    public String toString() {
        return
                "Unıversity='" + Unıversity + '\'' +
                ", Section='" + Section + '\'' +
                ", NumberOfStudent=" + NumberOfStudent +
                ", GradePointAverage=" + GradePointAverage +
                '}' + "\n";
    }
}


