class Postgraduate extends Student{
double researchGrant;


public Postgraduate(){
super();
}
public Postgraduate ( double researchGrant, double interest, double loanAmount, int yearOfStudy,String name,String program){
super( interest, loanAmount, yearOfStudy, name, program);
this.researchGrant = researchGrant;

}
public double getResearch(){
    return researchGrant;
}
public void setResearch(double researchGrant){
    this.researchGrant = researchGrant;
}
}