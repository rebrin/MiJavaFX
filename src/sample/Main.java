package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
      /*  Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();*/

        //contenedor de escena
        GridPane gridPane=new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25,25,25,25));

        //añadir elementos a la escena
        Text texto=new Text("Bienvenido");
        texto.setFont(Font.font("Tahoma", FontWeight.BOLD,20));
        gridPane.add(texto,0,0,2,1);

        Label lb1=new Label("Usuario");
        gridPane.add(lb1,0,1);

        TextField tfUser=new TextField();
        gridPane.add(tfUser,1,1);

        Label lb2=new Label("Usuario");
        gridPane.add(lb2,0,2);

        PasswordField tfPass=new PasswordField();
        gridPane.add(tfPass,1,2);

        Button boton=new Button("enviar");
        HBox hBox=new HBox(10);
        hBox.setAlignment(Pos.BOTTOM_RIGHT);
        hBox.getChildren().add(boton);
        gridPane.add(hBox,1,4);

        Text salida=new Text();
        gridPane.add(salida,0,5,2,1);

        boton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                salida.setFill(Color.FIREBRICK);
                salida.setText("haz dado un maldito click!!!!");
            }
        });
        //se asigna la escena al escenario
        Scene scene= new Scene(gridPane,300,275);
        primaryStage.setScene(scene);
        //se muestra el escenario principal

        primaryStage.setTitle("hola mundo de FX");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
