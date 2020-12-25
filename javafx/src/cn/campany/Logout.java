package cn.campany;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Logout extends Application{
    public Logout(){
        Stage stage = new Stage();
        stage.setFullScreen(true);stage.setResizable(false);stage.setIconified(false);
        ImageView imageView = new ImageView("picture/lol.jpg");
        imageView.fitWidthProperty().bind(stage.widthProperty());imageView.fitHeightProperty().bind(stage.heightProperty());
        stage.setOnCloseRequest(windowEvent -> {
            new Logout();
        });
        Scene scene = new Scene(new Pane(imageView));
        stage.setScene(scene);
        stage.show();
    }
    @Override
    public void start(Stage stage) throws Exception {
    }
}
