package sample;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;



public class Controller {
    public Label basePriceLabel;
    public Label totalPriceLabel;
    public Label weightErrorLabel;
    public Label charityErrorLabel;
    public Label colorErrorLabel;
    public TextField weightTextField;
    public RadioButton charityYesButton;
    public RadioButton charityNotButton;
    public RadioButton colorDButton;
    public RadioButton colorTButton;
    public RadioButton colorKButton;
    public Button CalculateButton;

    public void processResults(){
        charityErrorLabel.setVisible(false);
        colorErrorLabel.setVisible(false);
        weightErrorLabel.setVisible(false);
        boolean error = false;

        //check for no charity error
        if (!charityYesButton.isSelected() && !charityNotButton.isSelected()) {
            charityErrorLabel.setText("Charity cannot be blank");
            charityErrorLabel.setVisible(true);
            error = true;

        }
        else if (charityYesButton.isSelected() && charityNotButton.isSelected()) {
            charityErrorLabel.setText("Charity cannot be both");
            charityErrorLabel.setVisible(true);
            error = true;

        }
        //check for no color error
        if (!colorDButton.isSelected() && !colorKButton.isSelected() && !colorTButton.isSelected()) {
            colorErrorLabel.setText("Color cannot be blank");
            colorErrorLabel.setVisible(true);
            error = true;
        }
        else if(colorDButton.isSelected() && colorKButton.isSelected() && colorTButton.isSelected()) {
            colorErrorLabel.setText("Color cannot be all");
            colorErrorLabel.setVisible(true);
            error = true;
        }
        //check for weight error
        double dWeight = 0;
        String weights = weightTextField.getText();
        try { //age is not a number
            dWeight = Double.parseDouble(weights);
            if (dWeight < 1.0) {//age is less than zero
                weightErrorLabel.setText("Weight can't be less than 1");
                weightErrorLabel.setVisible(true);
                error = true;
            }

        } catch (NumberFormatException e) {
            weightErrorLabel.setText("Weight can't be blank");
            weightErrorLabel.setVisible(true);
            error = true;
        }

        //if all is ok, do the calculation
        if (!error) {
            String clarity;
            Character ColorRating = 'A';
            if (charityYesButton.isSelected()){
                clarity = "flawless";
            }
            else{
                clarity = "not flawless";
            }
            if (colorKButton.isSelected()){
                ColorRating = 'K';
            }
            else if(colorDButton.isSelected()){
                ColorRating = 'D';
            }
            else if(colorTButton.isSelected()){
                ColorRating = 'T';
            }
            Diamond diamonds = new Diamond(dWeight, clarity, ColorRating);
            diamonds.CaratCost();
            basePriceLabel.setText("Base Price is:  " + diamonds.getBasePrice());
            basePriceLabel.setVisible(true);
            diamonds.calcCharityCost();
            diamonds.calcColorRateCost();
            totalPriceLabel.setText("Total Price is " + diamonds.getFinalValue());
            totalPriceLabel.setVisible(true);
        }

    }
}
