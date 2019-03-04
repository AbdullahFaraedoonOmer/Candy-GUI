package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @FXML
    private TextField priceonepiece;
    @FXML
    private TextField rulegetextracandy;
    @FXML
    private TextField moneyin;
    @FXML
    private Label youcanbuy;
    @FXML
    private Label extracandy;
    @FXML
    private Label allcandy;
    @FXML
    private Label restcanycover;
    @FXML
    private Button buttonc;


    Candy FirstCAndy = new Candy();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Programer : Abdullah Faraedoon");
        Scene MainS = new Scene(root,410,420);
        primaryStage.setScene(MainS);
        primaryStage.getIcons().add(new Image("IconXX.png"));
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    public void CalculateData() throws InterruptedException {
        try {
            moneyin.setStyle("-fx-background-color: #216869");
            FirstCAndy.resetval();
            FirstCAndy.setPriceForPieces(Double.parseDouble(priceonepiece.getText()));
            FirstCAndy.setRuleForGetExtraCandy(Integer.parseInt(rulegetextracandy.getText()));
            FirstCAndy.setYourMoney(Double.parseDouble(moneyin.getText()));
            FirstCAndy.candyInfo();
            youcanbuy.setText(String.valueOf(FirstCAndy.YouCanBuy()));
            extracandy.setText(String.valueOf(FirstCAndy.YourExtraCandy()));
            allcandy.setText(FirstCAndy.GetAllCandy());
            restcanycover.setText(FirstCAndy.CandyCover());
        }catch (NumberFormatException N){
            System.out.println("empty String");


        }

    }

    public static void main(String[] args) {
        launch(args);
    }

}
