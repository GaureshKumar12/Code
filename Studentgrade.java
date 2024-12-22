import java.util.Scanner;
class Studentgarde{
    public static void main(String args[]){
        Scanner stud=new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.println("Enter the number of subjects");
        int n = stud.nextInt();
        System.out.println("Enter the marks in each subject");
        int sum =0;
        for(int i=0;i<n;i++){
            int subjects = stud.nextInt();
            sum=sum + subjects;
        }
        System.out.println("The total mark is " + sum);
        double avg;
        avg = (double) sum/n;
        System.out.println("The average percentage is " + avg); 
        if(avg >= 90){
            System.out.println("Grade: A");
        }
        else if(avg>=70 && avg<90){
            System.out.println("Grade: B");
        }
        else if(avg>=60 && avg<70){
            System.out.println("Grade: C");
        }
        else if(avg>=50 && avg<60){
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Fail");
        }
    }
}