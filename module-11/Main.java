/*
 * Usiel Figueroa
 * M11: Programming Assignment 
 * CSD402-A311 Java for Programmers
 * February 24, 2025
 *
 * Purpose: Demonstrate the use of JavaFX BorderPane and ScrollPane.
 *
 * References:
 * Oracle, JavaFX BorderPane Documentation: https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/BorderPane.html
 * GeeksforGeeks, JavaFX BorderPane Class: https://www.geeksforgeeks.org/javafx-borderpane-class/
 * Oracle, JavaFX ScrollPane Documentation: https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/ScrollPane.html
 * Tutorialspoint, How to create a scroll pane using JavaFX?: https://www.tutorialspoint.com/how-to-create-a-scroll-pane-using-javafx
 */


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;

public class Main extends Application 
{ 
  
  @Override
      public void start(Stage primaryStage) {
          // Create a BorderPane layout as the root container for the scene.
          BorderPane borderPane = new BorderPane();

          // Create labels for the static regions of the BorderPane.
          Label topLabel = new Label("Top Usiel Figueroa");
          Label bottomLabel = new Label("Bottom: CSD402-A311 Java for Programmers");
          Label leftLabel = new Label("Left M11: Programming Assignment");
          Label rightLabel = new Label("Right: February 24, 2025");

          // Assign the labels to their respective regions.
          borderPane.setTop(topLabel);
          borderPane.setBottom(bottomLabel);
          borderPane.setLeft(leftLabel);
          borderPane.setRight(rightLabel);

          // Create a VBox with multiple labels to simulate scrollable content.
          VBox scrollableContent = new VBox();
          for (int i = 1; i <= 64; i++) {
              Label label = new Label("Usiel Figueroa " + i);
              scrollableContent.getChildren().add(label);
          }

          // Create a ScrollPane and set the VBox as its content.
          ScrollPane scrollPane = new ScrollPane();
          scrollPane.setContent(scrollableContent);

          // Place the ScrollPane in the center region of the BorderPane.
          borderPane.setCenter(scrollPane);

          // Create a Scene using the BorderPane as the root node.
          Scene scene = new Scene(borderPane, 646, 444);

          // Configure the stage with title and scene, then display the GUI.
          primaryStage.setTitle("JavaFX BorderPane and ScrollPane Example");
          primaryStage.setScene(scene);
          primaryStage.show();
      }

      public static void main(String[] args) {
          // Launch the JavaFX application.
          launch(args);
      }
  }