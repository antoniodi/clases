
/**
 * Write a description of class CrearEstudiante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrearEstudiante
{
    // instance variables - replace the example below with your own
    private Student estudiante;

    /**
     * Constructor for objects of class CrearEstudiante
     */
    public CrearEstudiante()
    {
            
    }
    public Student crear(String fullName, String studentID)
    {
     if((fullName.equals("")) && (studentID.equals(""))) {
            System.out.println("nombre o id de estudiante no valido");
        }else{
            estudiante = new Student(fullName,studentID);
        }
        return estudiante; 
    
    }
    
 
}
