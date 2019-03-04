package sample;

public class Candy {
    private double Dollar,priceForPieces;
    private int ruleForExtraCandy,X,Y,pCandy,Temp,ate;
    public Candy() {
        this.Dollar = 0;
        this.priceForPieces = 1;
        this.ruleForExtraCandy = 3;
        this.pCandy = 0;
        this.Temp = 0;
    }
    public void setPriceForPieces(double p){ this.priceForPieces = p; }
    private void ateCandy()
    {
        this.ate = (int)(this.Dollar / this.priceForPieces);
    }
    public void setRuleForGetExtraCandy(int a) { this.ruleForExtraCandy = a; }
    public void setYourMoney(double M){ Dollar = M; }
    public void candyInfo()
    {
        this.ateCandy();
        this.pCandy = this.ate;
        do {
            if(this.Temp ==0) {
                this.X = this.pCandy % this.ruleForExtraCandy;
                Y = pCandy / ruleForExtraCandy;
            }else {
                X = Temp % ruleForExtraCandy;
                Y = Temp / ruleForExtraCandy;
            }
            ate += Y;
            Temp = Y + X;
        }while (Temp >= ruleForExtraCandy);
    }
    public String GetAllCandy(){
        String a = String.valueOf(ate);
       return a;
    }
    public String CandyCover(){
        String b = String.valueOf(Temp);
        return b;
    }
    public int YouCanBuy(){
        int f =(int) (Dollar/priceForPieces);
        return f;
    }
    public int YourExtraCandy(){
        int c = (int) (ate-(Dollar/priceForPieces));
        return c;
    }
    public void resetval(){
        X = 0;
        Y = 0;
        pCandy = 0;
        Temp = 0;
        ate = 0;
    }
}