package cn.campany;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Login extends Application {
    public static final String account = "admin";
    public static final String passwd = "12345678";
    @Override
    public void start(Stage stage) throws Exception {
        stage.setResizable(false);
        stage.setWidth(800);
        stage.setHeight(600);
        stage.setTitle("QQ-拼夕夕版");
        stage.getIcons().add(new Image("picture/logon.png"));
        GridPane gridPane = new GridPane();//gridPane.setStyle("-fx-background-image:url(\"picture/cat.jpg\")");
        Label label_account = new Label("账号:");
        gridPane.add(label_account, 0, 0);
        label_account.setPrefSize(50, 50);
        label_account.setFont(Font.font("SimHei", 20));
        TextField textField_account = new TextField();
        gridPane.add(textField_account, 1, 0);
        textField_account.setPrefSize(30, 30);
        textField_account.setFont(Font.font(15));
        textField_account.setPromptText("默认账号为:admin");
        textField_account.setTooltip(new Tooltip("默认账号为:admin"));
        Label label_passwd = new Label("密码:");
        gridPane.add(label_passwd, 0, 1);
        label_passwd.setPrefSize(50, 50);
        label_passwd.setFont(Font.font("SimHei", 20));
        PasswordField passwordField = new PasswordField();
        gridPane.add(passwordField, 1, 1);
        passwordField.setPromptText("默认密码为:12345678");
        passwordField.setPrefSize(30, 30);
        passwordField.setFont(Font.font(15));
        passwordField.setTooltip(new Tooltip("默认密码为:12345678"));
        Button button_Login = new Button("注册");
        gridPane.add(button_Login, 1, 3);
        button_Login.setPrefSize(55, 40);
        button_Login.setFont(Font.font(15));
        Button button_logon = new Button("登录");
        gridPane.add(button_logon, 1, 3);
        button_logon.setPrefSize(55, 40);
        button_logon.setFont(Font.font(15));
        GridPane.setMargin(button_logon, new Insets(0, 0, 0, 220));
        button_logon.setOnAction(actionEvent -> {
            if (account.equals(textField_account.getText()) && passwd.equals(passwordField.getText())) {
                stage.close();
                try {
                    new Paint();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        Label label = new Label("VX: MMGZSTHL");
        label.setTextFill(Color.BLACK);
        label.setPrefSize(120, 50);
        label.setFont(Font.font("SimHei", 20));
        gridPane.add(label, 1, 6);
        GridPane.setMargin(label, new Insets(0, 0, 0, 155));
        Hyperlink hyperlink = new Hyperlink("点击获取更多信息");
        gridPane.add(hyperlink, 1, 7);
        hyperlink.setPrefSize(180, 50);
        hyperlink.setFont(Font.font("SimHei", 20));
        GridPane.setMargin(hyperlink, new Insets(0, 0, 0, 100));
        hyperlink.setOnAction(actionEvent -> {
            HostServices hostServices = getHostServices();
            hostServices.showDocument("http://47.101.180.27");
        });

        gridPane.setAlignment(Pos.CENTER);
        gridPane.setStyle("-fx-background-color:#87CEFA;" +
                "-fx-background-image:url(\"picture/login.jfif\");" +
                "-fx-hgap:10;" +
                "-fx-vgap:10");
        Scene scene = new Scene(gridPane);
        stage.setScene(scene);
        button_logon.requestFocus();
        stage.show();
    }
}
