package atm;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Main extends Application {
    private String inputString = "";
    private int historyIndicator = 0;
    private int type = 0;


    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Variables -------------------------------------//

        Transactions main = new Transactions();
        History history = new History();

        // Title
        primaryStage.setTitle("ATM");

        // Main menu
        Label welcomeMessage = new Label();
        Button withdrawal = new Button("Withdraw");
        Button deposit = new Button("Deposit");
        Button balanceInquiry = new Button("Balance Inquiry");
        Button previous = new Button("Previous");
        Button next = new Button("Next");
        Label status = new Label();

        // Withdrawal && Deposit && Card number input
        Label transactionLabel = new Label();
        Button mainMenu = new Button("Main menu");
        Label inputLabel = new Label();
        Label input = new Label();
        Button submit = new Button("Submit");
        Button clear = new Button("Clear");
        Label errorMessage = new Label();

        // Keypad
        Button keypad0 = new Button("0");
        Button keypad1 = new Button("1");
        Button keypad2 = new Button("2");
        Button keypad3 = new Button("3");
        Button keypad4 = new Button("4");
        Button keypad5 = new Button("5");
        Button keypad6 = new Button("6");
        Button keypad7 = new Button("7");
        Button keypad8 = new Button("8");
        Button keypad9 = new Button("9");

        // End of variables -------------------------------------//

        // Main menu scene -------------------------------------//

        GridPane gridMain = new GridPane();

        // Setting size for the pane
        gridMain.setMinSize(320, 200);

        // Setting the padding
        gridMain.setPadding(new Insets(10, 10, 10, 10));

        // Setting the vertical and horizontal gaps between the columns
        gridMain.setVgap(5);
        gridMain.setHgap(5);

        // Setting the Grid alignment
        gridMain.setAlignment(Pos.CENTER);
        
        // Arranging the Grid

        gridMain.add(welcomeMessage, 0, 0, 15, 1);
        gridMain.add(withdrawal, 0, 1);
        gridMain.add(deposit, 2, 1);
        gridMain.add(balanceInquiry, 1, 2);
        gridMain.add(next, 2, 3);
        gridMain.add(previous, 0, 3);
        gridMain.add(status, 0, 6, 5, 1);

        // Style
        welcomeMessage.setText("Welcome to my simple ATM program ;)");
        welcomeMessage.setFont(new Font("Segoe UI Semibold", 12));
        status.setFont(new Font("Segoe UI Semibold", 12));
        next.setMaxSize(100, 100);

        // Actions
        previous.setOnAction(actionEvent -> {
            if (historyIndicator > 0)
                historyIndicator--;
            status.setText(history.getHistory(historyIndicator));

        });
        next.setOnAction(actionEvent -> {
            if (history.size(historyIndicator))
                historyIndicator++;
            status.setText(history.getHistory(historyIndicator));


        });
        balanceInquiry.setOnAction(actionEvent -> {
            status.setText("Balance : " + main.getBalance());
            history.setHistory("Balance", Double.parseDouble(String.valueOf(main.getBalance())));
            if(historyIndicator<5) {
                historyIndicator++;
            } else{
                history.delete();
            }
        });

        Scene mainScene = new Scene(gridMain);

        // End of main menu scene -------------------------------------//

        // Withdrawal scene -------------------------------------//

        GridPane gridTransaction = new GridPane();
        // Setting size for the pane
        gridTransaction.setMinSize(320, 200);

        // Setting the padding
        gridTransaction.setPadding(new Insets(10, 10, 10, 10));

        // Setting the vertical and horizontal gaps between the columns
        gridTransaction.setVgap(5);
        gridTransaction.setHgap(5);

        // Setting the Grid alignment
        gridTransaction.setAlignment(Pos.CENTER);
        
        // Arranging the Grid
        gridTransaction.add(transactionLabel, 0, 0);
        gridTransaction.add(mainMenu, 4, 0);
        gridTransaction.add(inputLabel, 0, 1);
        gridTransaction.add(input, 1, 1, 5, 1);
        gridTransaction.add(submit, 2, 5, 2, 1);
        gridTransaction.add(clear, 4, 1);
        gridTransaction.add(errorMessage, 1, 6, 5, 1);
        gridTransaction.add(keypad1, 1, 2);
        gridTransaction.add(keypad2, 2, 2);
        gridTransaction.add(keypad3, 3, 2);
        gridTransaction.add(keypad4, 1, 3);
        gridTransaction.add(keypad5, 2, 3);
        gridTransaction.add(keypad6, 3, 3);
        gridTransaction.add(keypad7, 1, 4);
        gridTransaction.add(keypad8, 2, 4);
        gridTransaction.add(keypad9, 3, 4);
        gridTransaction.add(keypad0, 1, 5);

        // Style
        transactionLabel.setFont(new Font("Segoe UI Semibold", 12));
        mainMenu.setFont(new Font("Segoe UI Semibold", 12));
        clear.setFont(new Font("Segoe UI Semibold", 12));
        clear.setMaxSize(100, 100);
        errorMessage.setFont(new Font("Segoe UI Semibold", 11));

        Scene withdrawalScene = new Scene(gridTransaction);

        // Actions
        keypad0.setOnAction(actionEvent -> {
            if(!inputString.isEmpty()){
            if (inputString.length() <= 4 && type != 0)
                inputString += "0";
            if (type == 0)
                inputString += "0";
            input.setText(inputString);}
        });
        keypad1.setOnAction(actionEvent -> {
            if (inputString.length() <= 4 && type != 0)
                inputString += "1";
            if (type == 0)
                inputString += "1";
            input.setText(inputString);
        });
        keypad2.setOnAction(actionEvent -> {
            if (inputString.length() <= 4 && type != 0)
                inputString += "2";
            if (type == 0)
                inputString += "2";
            input.setText(inputString);
        });
        keypad3.setOnAction(actionEvent -> {
            if (inputString.length() <= 4 && type != 0)
                inputString += "3";
            if (type == 0)
                inputString += "3";
            input.setText(inputString);
        });
        keypad4.setOnAction(actionEvent -> {
            if (inputString.length() <= 4 && type != 0)
                inputString += "4";
            if (type == 0)
                inputString += "4";
            input.setText(inputString);
        });
        keypad5.setOnAction(actionEvent -> {
            if (inputString.length() <= 4 && type != 0)
                inputString += "5";
            if (type == 0)
                inputString += "5";
            input.setText(inputString);
        });
        keypad6.setOnAction(actionEvent -> {
            if (inputString.length() <= 4 && type != 0)
                inputString += "6";
            if (type == 0)
                inputString += "6";
            input.setText(inputString);
        });
        keypad7.setOnAction(actionEvent -> {
            if (inputString.length() <= 4 && type != 0)
                inputString += "7";
            if (type == 0)
                inputString += "7";
            input.setText(inputString);
        });
        keypad8.setOnAction(actionEvent -> {
            if (inputString.length() <= 4 && type != 0)
                inputString += "8";
            if (type == 0)
                inputString += "8";

            input.setText(inputString);
        });
        keypad9.setOnAction(actionEvent -> {
            if (inputString.length() <= 4 && type != 0)
                inputString += "9";
            if (type == 0)
                inputString += "9";
            input.setText(inputString);
        });
        clear.setOnAction(actionEvent -> {
            inputString = "";
            input.setText("");
        });
        mainMenu.setOnAction(actionEvent -> {
            primaryStage.setScene(mainScene);
            inputString = "";
            input.setText("");
        });
        withdrawal.setOnAction(actionEvent -> {
            type = 1;
            transactionLabel.setText("Withdrawal");
            inputLabel.setText("Enter the amount:");
            mainMenu.setManaged(true);
            errorMessage.setText("");
            errorMessage.setManaged(false);
            primaryStage.setScene(withdrawalScene);
        });
        deposit.setOnAction(actionEvent -> {
            type = 2;
            transactionLabel.setText("Deposit");
            inputLabel.setText("Enter the amount:");
            mainMenu.setManaged(true);
            errorMessage.setText("");
            errorMessage.setManaged(false);
            primaryStage.setScene(withdrawalScene);
        });
        submit.setOnAction(actionEvent -> {
            double amount = main.stringToNumber(inputString);
            if (type == 0) {

                if (main.validator(inputString)) {
                    primaryStage.setScene(mainScene);
                } else {
                    errorMessage.setText("The card number is incorrect.");
                }
            } else if (type == 1) {
                if (main.withdrawal(amount)) {
                    status.setText("Withdrawal completed successfully.");
                    history.setHistory("Withdrawal", amount);
                    if(historyIndicator<5)
                        historyIndicator++;
                    else{
                        history.delete();
                    }
                } else {
                    status.setText("Insufficient funds.");
                }
            } else if (type == 2) {
        		main.deposit(amount);
                    status.setText("Deposit completed successfully.");
                    history.setHistory("Deposit", amount);
                    if(historyIndicator<5)
                        historyIndicator++;
                    else{
                        history.delete();
                    }
                }


            if (type != 0 && !inputString.isEmpty()) {
                primaryStage.setScene(mainScene);
                historyIndicator= history.size();
            }
            inputString = "";
            input.setText("");
        });

        // First run ---------------------//

        transactionLabel.setText("");
        inputLabel.setText("Enter the card number:");
        mainMenu.setManaged(false);
        primaryStage.setScene(withdrawalScene);


        primaryStage.show();

    }
}
