package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Micah Puccio-Ball
 *  Files saved as
 * path
 * description
 * Name::description::duedate::0/1
 */

import com.sun.javafx.image.BytePixelGetter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class List extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        try   {
            Parent root = FXMLLoader.load(getClass().getResource("List.fxml"));

            Scene scene = new Scene(root);


            primaryStage.setScene(scene);
            primaryStage.setTitle("List");
            primaryStage.show();
        }
        catch (IOException e)   {
            e.printStackTrace();
        }

    }
}
