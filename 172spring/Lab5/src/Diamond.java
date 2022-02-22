
public class Diamond {
    double CaratWeighs;
    String clarity;
    Character colorRating;
    double FinalValue;


    public Diamond(double CaratWeighs, String clarity, Character colorRating){
        this.CaratWeighs = CaratWeighs;
        this.clarity = clarity;
        this.colorRating = colorRating;
        this.FinalValue = 0;
    }

    public boolean CaratCost(){
        if (CaratWeighs >= 1){
            FinalValue = CaratWeighs * 1500;
            return true;
        }
        else{
            return false;
        }

    }
    public double getBasePrice(){
        return FinalValue;
    }

    public void calcCharityCost(){
        if (clarity == "flawless"){
            FinalValue = FinalValue * 2;
        }
        else{
            FinalValue = FinalValue * 1;
        }
    }

    public void calcColorRateCost(){
        if(colorRating == 'D'){
            FinalValue = FinalValue * 1;
        }
        else if(colorRating == 'K'){
            FinalValue = FinalValue - (0.2 * FinalValue);
        }
        else{
            FinalValue = FinalValue - (0.3 * FinalValue);
        }
    }

    public double getFinalValue(){
        return FinalValue;
    }


}
