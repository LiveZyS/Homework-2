public class Car {

    //Strings for make and color:
    public String Make;
    public String Color;
    public boolean Handicap;

    //Constructor
    public Car (String Make, String Color, boolean Handicap) {

        this.Make = Make;
        this.Color = Color;
        this.Handicap = Handicap;

    }

    public void SetMake(String NewMake) {

        Make = NewMake;
    }

    public void SetColor(String NewColor) {

        Color = NewColor;
    }

    public void SetHandicap(boolean NewHandicap) {

        Handicap = NewHandicap;
    }

    //Returns
    public boolean Handicap() {

        return Handicap;
    }

    public String toString() {

        return Color + " " + Make;
    }

}
