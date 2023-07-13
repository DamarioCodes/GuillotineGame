/**
 * This class runs the application and implements the GUI.
 * 
 * @author Damario Hamilton
 */
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Guillotine extends Application {
    private static int number;
    private VBox box = new VBox();
    private GuillotineCode GuillotineCode;

    public static void setNumber(int n) {
        Guillotine.number = n;
    }

    public void start(Stage stage) {
        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");
        GuillotineCode = new GuillotineCode(Guillotine.number);

        BorderPane pane = new BorderPane();
        Label turn = new Label("Player 1's Turn");
        pane.setTop(turn);
        BorderPane.setAlignment(pane.getTop(), Pos.CENTER);

        VBox player1 = new VBox();
        player1.setAlignment(Pos.TOP_CENTER);
        Label player1Info = new Label("Player 1's Score: 0");
        player1.setPrefWidth(250);
        player1.getChildren().add(player1Info);
        Button player1MoveBack4 = new Button("Move 1st Card Back 4");
        Button player1MoveBack3 = new Button("Move 1st Card Back 3");
        Button player1MoveBack2 = new Button("Move 1st Card Back 2");
        Button player1MoveBack1 = new Button("Move 1st Card Back 1");
        Button player1MoveToEnd = new Button("Move to end");
        Button player1MoveToFront = new Button("Move to front");
        Button player1ReverseDeck = new Button("Reverse deck");
        Button player1ReverseFirst5 = new Button("Reverse first 5");
        Button player1Skip = new Button("skip");
        Button player1TakeCard = new Button("Take Card");
        player1.getChildren().add(player1MoveBack4);
        player1.getChildren().add(player1MoveBack3);
        player1.getChildren().add(player1MoveBack2);
        player1.getChildren().add(player1MoveBack1);
        player1.getChildren().add(player1MoveToEnd);
        player1.getChildren().add(player1MoveToFront);
        player1.getChildren().add(player1ReverseDeck);
        player1.getChildren().add(player1ReverseFirst5);
        player1.getChildren().add(player1Skip);
        player1.getChildren().add(player1TakeCard);
        Label collected1 = new Label("People Collected :");
        player1.getChildren().add(collected1);

        VBox player1Collected = new VBox();
        player1Collected.setAlignment(Pos.TOP_CENTER);
        ScrollPane player1CollectedPane = new ScrollPane(player1Collected);
        player1CollectedPane.setPrefSize(250, 500);
        player1CollectedPane.setFitToWidth(true);
        player1.getChildren().add(player1CollectedPane);
        pane.setLeft(player1);

        VBox player2 = new VBox();
        player2.setAlignment(Pos.TOP_CENTER);
        Label player2Info = new Label("Player 2's Score: 0");
        player2.setPrefWidth(250);
        player2.getChildren().add(player2Info);
        Button player2MoveBack4 = new Button("Move 1st Card Back 4");
        Button player2MoveBack3 = new Button("Move 1st Card Back 3");
        Button player2MoveBack2 = new Button("Move 1st Card Back 2");
        Button player2MoveBack1 = new Button("Move 1st Card Back 1");
        Button player2MoveToEnd = new Button("Move to end");
        Button player2MoveToFront = new Button("Move to front");
        Button player2ReverseDeck = new Button("Reverse deck");
        Button player2ReverseFirst5 = new Button("Reverse first 5");
        Button player2Skip = new Button("skip");
        Button player2TakeCard = new Button("Take Card");
        player2.getChildren().add(player2MoveBack4);
        player2.getChildren().add(player2MoveBack3);
        player2.getChildren().add(player2MoveBack2);
        player2.getChildren().add(player2MoveBack1);
        player2.getChildren().add(player2MoveToEnd);
        player2.getChildren().add(player2MoveToFront);
        player2.getChildren().add(player2ReverseDeck);
        player2.getChildren().add(player2ReverseFirst5);
        player2.getChildren().add(player2Skip);
        player2.getChildren().add(player2TakeCard);
        Label collected2 = new Label("People Collected :");
        player2.getChildren().add(collected2);

        VBox player2Collected = new VBox();
        player2Collected.setAlignment(Pos.TOP_CENTER);
        ScrollPane player2CollectedPane = new ScrollPane(player2Collected);
        player2CollectedPane.setPrefSize(250, 500);
        player2CollectedPane.setFitToWidth(true);
        player2.getChildren().add(player2CollectedPane);
        pane.setRight(player2);

        player1MoveBack4.setOnAction(e -> {
            if (GuillotineCode.isPlayer1sTurn()) {
                GuillotineCode.getDeck().moveBack(4);
                Guillotine.this.updateTile();
                Button b = (Button)e.getSource();
                b.setDisable(true);
            }
        });

        player1MoveBack3.setOnAction(e -> {
            if (GuillotineCode.isPlayer1sTurn()) {
                GuillotineCode.getDeck().moveBack(3);
                Guillotine.this.updateTile();
                Button b = (Button)e.getSource();
                b.setDisable(true);
            }
        });

        player1MoveBack2.setOnAction(e -> {
            if (GuillotineCode.isPlayer1sTurn()) {
                GuillotineCode.getDeck().moveBack(2);
                Guillotine.this.updateTile();
                Button b = (Button)e.getSource();
                b.setDisable(true);
            }
        });

        player1MoveBack1.setOnAction(e -> {
            if (GuillotineCode.isPlayer1sTurn()) {
                GuillotineCode.getDeck().moveBack(1);
                Guillotine.this.updateTile();
                Button b = (Button)e.getSource();
                b.setDisable(true);
            }
        });

        player1MoveToEnd.setOnAction(e -> {
            if (GuillotineCode.isPlayer1sTurn()) {
                GuillotineCode.getDeck().moveFirstToLast();
                box.getChildren().add(box.getChildren().remove(0));
                Button b = (Button)e.getSource();
                b.setDisable(true);
            }
        });

        player1MoveToFront.setOnAction(e -> {
            if (GuillotineCode.isPlayer1sTurn()) {
                GuillotineCode.getDeck().lastToFirst();
                box.getChildren().add(0, box.getChildren().remove(box.getChildren().size() - 1));
                Button b = (Button)e.getSource();
                b.setDisable(true);
            }
        });

        player1ReverseDeck.setOnAction(e -> {
            if (GuillotineCode.isPlayer1sTurn()) {
                GuillotineCode.getDeck().reverseList();
                Guillotine.this.updateTile();
                Button b = (Button)e.getSource();
                b.setDisable(true);
            }
        });

        player1ReverseFirst5.setOnAction(e -> {
            if (GuillotineCode.isPlayer1sTurn()) {
                GuillotineCode.getDeck().reverseFirstK(5);
                Guillotine.this.updateTile();
                Button b = (Button)e.getSource();
                b.setDisable(true);
            }
        });

        player1Skip.setOnAction(e -> {
            if (GuillotineCode.isPlayer1sTurn()) {
                GuillotineCode.setPlayer1sTurn(false);
                Button b = (Button)e.getSource();
                b.setDisable(true);
                turn.setText("Player 2's Turn");
            }
        });

        player1TakeCard.setOnAction(e -> {
            if (GuillotineCode.isPlayer1sTurn()) {
                player1Collected.getChildren().add(box.getChildren().remove(0));
                GuillotineCode.takeFirst(p1);
                player1Info.setText("Player 1's Score: " + p1.getScore());

                if (GuillotineCode.getDeck().length() == 0) {
                    player1MoveBack4.setDisable(true);
                    player1MoveBack3.setDisable(true);
                    player1MoveBack2.setDisable(true);
                    player1MoveBack1.setDisable(true);
                    player1MoveToEnd.setDisable(true);
                    player1MoveToFront.setDisable(true);
                    player1ReverseDeck.setDisable(true);
                    player1ReverseFirst5.setDisable(true);
                    player1Skip.setDisable(true);
                    player1TakeCard.setDisable(true);
                    player2MoveBack4.setDisable(true);
                    player2MoveBack3.setDisable(true);
                    player2MoveBack2.setDisable(true);
                    player2MoveBack1.setDisable(true);
                    player2MoveToEnd.setDisable(true);
                    player2MoveToFront.setDisable(true);
                    player2ReverseDeck.setDisable(true);
                    player2ReverseFirst5.setDisable(true);
                    player2Skip.setDisable(true);
                    player2TakeCard.setDisable(true);

                    if (p1.getScore() > p2.getScore()) {
                        turn.setText("Player 1 Wins!");
                    } else if (p1.getScore() < p2.getScore()) {
                        turn.setText("Player 2 Wins!");
                    } else {
                        turn.setText("Tie");
                    }
                } else {
                    turn.setText("Player 2's Turn");
                }

                GuillotineCode.setPlayer1sTurn(false);
            }
        });

        player2MoveBack4.setOnAction(e -> {
            if (!GuillotineCode.isPlayer1sTurn()) {
                GuillotineCode.getDeck().moveBack(4);
                Guillotine.this.updateTile();
                Button b = (Button)e.getSource();
                b.setDisable(true);
            }
        });

        player2MoveBack3.setOnAction(e -> {
            if (!GuillotineCode.isPlayer1sTurn()) {
                GuillotineCode.getDeck().moveBack(3);
                Guillotine.this.updateTile();
                Button b = (Button)e.getSource();
                b.setDisable(true);
            }
        });

        player2MoveBack2.setOnAction(e -> {
            if (!GuillotineCode.isPlayer1sTurn()) {
                GuillotineCode.getDeck().moveBack(2);
                Guillotine.this.updateTile();
                Button b = (Button)e.getSource();
                b.setDisable(true);
            }
        });

        player2MoveBack1.setOnAction(e -> {
            if (!GuillotineCode.isPlayer1sTurn()) {
                GuillotineCode.getDeck().moveBack(1);
                Guillotine.this.updateTile();
                Button b = (Button)e.getSource();
                b.setDisable(true);
            }
        });

        player2MoveToEnd.setOnAction(e -> {
            if (!GuillotineCode.isPlayer1sTurn()) {
                GuillotineCode.getDeck().moveFirstToLast();
                box.getChildren().add(box.getChildren().remove(0));
                Button b = (Button)e.getSource();
                b.setDisable(true);
            }
        });

        player2MoveToFront.setOnAction(e -> {
            if (!GuillotineCode.isPlayer1sTurn()) {
                GuillotineCode.getDeck().lastToFirst();
                box.getChildren().add(0, box.getChildren().remove(box.getChildren().size() - 1));
                Button b = (Button)e.getSource();
                b.setDisable(true);
            }
        });

        player2ReverseDeck.setOnAction(e -> {
            if (!GuillotineCode.isPlayer1sTurn()) {
                GuillotineCode.getDeck().reverseList();
                Guillotine.this.updateTile();
                Button b = (Button)e.getSource();
                b.setDisable(true);
            }
        });

        player2ReverseFirst5.setOnAction(e -> {
            if (!GuillotineCode.isPlayer1sTurn()) {
                GuillotineCode.getDeck().reverseFirstK(5);
                Guillotine.this.updateTile();
                Button b = (Button)e.getSource();
                b.setDisable(true);
            }
        });

        player2Skip.setOnAction(e -> {
            if (!GuillotineCode.isPlayer1sTurn()) {
                GuillotineCode.setPlayer1sTurn(true);
                Button b = (Button)e.getSource();
                b.setDisable(true);
                turn.setText("Player 1's Turn");
            }
        });

        player2TakeCard.setOnAction(e -> {
            if (!GuillotineCode.isPlayer1sTurn()) {
                player2Collected.getChildren().add(box.getChildren().remove(0));
                GuillotineCode.takeFirst(p2);
                player2Info.setText("Player 2's Score: " + p2.getScore());

                if (GuillotineCode.getDeck().length() == 0) {
                    player1MoveBack4.setDisable(true);
                    player1MoveBack3.setDisable(true);
                    player1MoveBack2.setDisable(true);
                    player1MoveBack1.setDisable(true);
                    player1MoveToEnd.setDisable(true);
                    player1MoveToFront.setDisable(true);
                    player1ReverseDeck.setDisable(true);
                    player1ReverseFirst5.setDisable(true);
                    player1Skip.setDisable(true);
                    player1TakeCard.setDisable(true);
                    player2MoveBack4.setDisable(true);
                    player2MoveBack3.setDisable(true);
                    player2MoveBack2.setDisable(true);
                    player2MoveBack1.setDisable(true);
                    player2MoveToEnd.setDisable(true);
                    player2MoveToFront.setDisable(true);
                    player2ReverseDeck.setDisable(true);
                    player2ReverseFirst5.setDisable(true);
                    player2Skip.setDisable(true);
                    player2TakeCard.setDisable(true);

                    if (p1.getScore() > p2.getScore()) {
                        turn.setText("Player 1 Wins!");
                    } else if (p1.getScore() < p2.getScore()) {
                        turn.setText("Player 2 Wins!");
                    } else {
                        turn.setText("Tie");
                    }
                } else {
                    turn.setText("Player 1's Turn");
                }

                GuillotineCode.setPlayer1sTurn(true);
            }
        });

        Guillotine.this.updateTile();
        box.setAlignment(Pos.TOP_CENTER);
        ScrollPane s = new ScrollPane(box);
        s.setFitToWidth(true);
        s.setPrefSize(250, 400);
        pane.setCenter(s);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    public void updateTile() {
        box.getChildren().clear();

        for (Card c : GuillotineCode.getDeck()) {
            Button b = new Button(c.toString());
            b.setMinSize(200, 30);
            box.getChildren().add(b);
        }
    }

    public static void main(String[] args) {
        if (args.length == 0)
            Guillotine.setNumber(20);
        else
            Guillotine.setNumber(Integer.parseInt(args[0]));

        Application.launch(args);
    }
}
