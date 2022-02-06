class Undergraduate extends Student {

private double stationary;
private double staInterest;
public Undergraduate(){
    super();
}
public Undergraduate (double stationary, double staInterest, double interest, double loanAmount, int yearOfStudy, double subsistence,String name,String program ){
super( interest,
        loanAmount,
        yearOfStudy,
        subsistence,
        name,
        program);
this.stationary = stationary;
this.staInterest = staInterest;

}
public double getStationary(){
    return stationary;
}

public void setStationary(double stationary){
    this. stationary = stationary;
}
public double getStainterest(){
    return 15/100 * stationary;
}

public void setStainterest(double staInterest){
    this. staInterest = staInterest;
}
}
