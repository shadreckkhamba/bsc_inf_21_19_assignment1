class Student extends Loan{
private double interest =0.15;
private double loanAmount;
private int yearOfStudy;
double subsidence;
private String name;
private String program;



public Student(){

}
public Student ( double interest, double loanAmount, int yearOfStudy, double subsistence,String name,String program){
this.interest = interest;
this.loanAmount = loanAmount;
this.yearOfStudy = yearOfStudy;
this.subsidence = subsidence;
this.name = name;
this.program = program;
}

    public Student(double interest, double loanAmount, int yearOfStudy, String name, String program) {
        super();
    }

    public double getSubsidence(){
    return subsidence;

}
public void setSubsidence(double subsidence){
    this.subsidence = subsidence;
}
public double getInterest(){
    return interest;

}
public void setInterest(double interest){
    this.interest = interest;
}
public double getLoanamount(){
    return loanAmount;

}
public void setLoanamount(double loanAmount){
    this.loanAmount = loanAmount;
}
public int getYear(){
    return yearOfStudy;

}
public void setYear(int yearOfStudy){
    this.yearOfStudy = yearOfStudy;
}


public String getName(){
    return name;
}
public void setName(String name){
    this.name = name;
}
public String getProgram(){
    return program;
}
public void setProgram(String name){
    this.program = program;
}

}