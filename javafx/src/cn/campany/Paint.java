package cn.campany;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;

public class Paint extends Application {



    Pane pane = new Pane();

    ArrayList<Shape> allShape = new ArrayList<>();
    Paint() throws Exception {
        start(new Stage());
    }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("画板-拼夕夕版");stage.setWidth(1000);stage.setHeight(800);
        stage.setMinWidth(1000);stage.setMinHeight(800);
        stage.getIcons().add(new Image("picture/paint.png"));

        //图形选择
        Button point = new Button("point");point.setMinWidth(60);
        Button line = new Button("line");line.setPrefWidth(60);
        Button circle = new Button("circle");circle.setPrefWidth(60);

        Button ellipse = new Button("ellipse");ellipse.setPrefWidth(60);
        Button rectangle = new Button("rectangle");rectangle.setPrefWidth(70);
        Button cls = new Button("清屏");cls.setPrefWidth(60);
        cls.setOnAction(actionEvent -> {
            pane.getChildren().clear();
        });

        //图形
        HBox hBox_sharp = new HBox(10,point,line,circle,ellipse,rectangle);
        hBox_sharp.setAlignment(Pos.CENTER);//hBox_sharp.setStyle("-fx-background-image:url(\"picture/login.png\")");
        hBox_sharp.setStyle("-fx-background-color:#faebd7");
        TitledPane titledPane_sharp = new TitledPane("选择图形",hBox_sharp);
        titledPane_sharp.setStyle("-fx-background-color:#faebd7");
        titledPane_sharp.setContent(hBox_sharp);titledPane_sharp.prefWidthProperty().bind(stage.widthProperty().divide(2));

        //颜色
        Label rightNowLabel = new Label("Now:");
        Button rightNowButton = new Button();rightNowButton.setTextFill(Color.WHITE);
        Separator separator = new Separator(Orientation.VERTICAL);//separator.setStyle("-fx-background-color:#ffffff");
        Button blackButton = new Button();blackButton.setStyle("-fx-background-color:#000000");
        blackButton.setOnAction(actionEvent -> {
            rightNowButton.setStyle("-fx-background-color:#000000");
            rightNowButton.setTextFill(Color.rgb(0,0,0));
        });
        Button greyButton = new Button();greyButton.setStyle("-fx-background-color:#808001");
        greyButton.setOnAction(actionEvent -> {
            rightNowButton.setStyle("-fx-background-color:#808001");
            rightNowButton.setTextFill(Color.rgb(128,128,1));
        });
        Button firebrickButton = new Button();firebrickButton.setStyle("-fx-background-color:#b22222");
        firebrickButton.setOnAction(actionEvent -> {
            rightNowButton.setStyle("-fx-background-color:#b22222");
            rightNowButton.setTextFill(Color.rgb(178,34,34));
        });
        Button orangeRedButton = new Button();orangeRedButton.setStyle("-fx-background-color:#ff4500");
        orangeRedButton.setOnAction(actionEvent -> {
            rightNowButton.setStyle("-fx-background-color:#ff4500");
            rightNowButton.setTextFill(Color.rgb(255,69,0));
        });
        Button redButton = new Button();redButton.setStyle("-fx-background-color:#ff0000");
        redButton.setOnAction(actionEvent -> {
            rightNowButton.setStyle("-fx-background-color:#ff0000");
            rightNowButton.setTextFill(Color.rgb(255,0,0));
        });
        Button yellowButton = new Button();yellowButton.setStyle("-fx-background-color:#ffff00");
        yellowButton.setOnAction(actionEvent -> {
            rightNowButton.setStyle("-fx-background-color:#ffff00");
            rightNowButton.setTextFill(Color.rgb(255,255,0));
        });
        Button greenButton = new Button();greenButton.setStyle("-fx-background-color:#008000");
        greenButton.setOnAction(actionEvent -> {
            rightNowButton.setStyle("-fx-background-color:#008000");
            rightNowButton.setTextFill(Color.rgb(0,128,0));
        });
        Button deepSkyBlueButton = new Button();deepSkyBlueButton.setStyle("-fx-background-color:#00bfff");
        deepSkyBlueButton.setOnAction(actionEvent -> {
            rightNowButton.setStyle("-fx-background-color:#00bfff");
            rightNowButton.setTextFill(Color.rgb(0,191,255));
        });
        Button mediumSlateBlueBlueButton = new Button();mediumSlateBlueBlueButton.setStyle("-fx-background-color:#7b68ee");
        mediumSlateBlueBlueButton.setOnAction(actionEvent -> {
            rightNowButton.setStyle("-fx-background-color:#7b68ee");
            rightNowButton.setTextFill(Color.rgb(123,104,238));
        });
        Button aliceBlueButton = new Button();aliceBlueButton.setStyle("-fx-background-color:#f0f8ff");
        aliceBlueButton.setOnAction(actionEvent -> {
            rightNowButton.setStyle("-fx-background-color:#f0f8ff");
            rightNowButton.setTextFill(Color.rgb(240,248,255));
        });
        Button aquaButton = new Button();aquaButton.setStyle("-fx-background-color:#00ffff");
        aquaButton.setOnAction(actionEvent -> {
            rightNowButton.setStyle("-fx-background-color:#00ffff");
            rightNowButton.setTextFill(Color.rgb(0,255,255));
        });
        Button pinkButton = new Button();pinkButton.setStyle("-fx-background-color:#ffc0cb");
        pinkButton.setOnAction(actionEvent -> {
            rightNowButton.setStyle("-fx-background-color:#ffc0cb");
            rightNowButton.setTextFill(Color.rgb(255,192,203));
        });
        Button oliveButton = new Button();oliveButton.setStyle("-fx-background-color:#808000");
        oliveButton.setOnAction(actionEvent -> {
            rightNowButton.setStyle("-fx-background-color:#808000");
            rightNowButton.setTextFill(Color.rgb(128,128,128));
        });
        Button whiteButton = new Button();whiteButton.setStyle("-fx-background-color:#ffffff");
        whiteButton.setOnAction(actionEvent -> {
            rightNowButton.setStyle("-fx-background-color:#ffffff");
            rightNowButton.setTextFill(Color.rgb(255,255,255));
        });
        Button navyButton = new Button();navyButton.setStyle("-fx-background-color:#000080");
        navyButton.setOnAction(actionEvent -> {
            rightNowButton.setStyle("-fx-background-color:#000080");
            rightNowButton.setTextFill(Color.rgb(0,0,128));
        });
        Button darkRedButton = new Button();darkRedButton.setStyle("-fx-background-color:#8b0000");
        darkRedButton.setOnAction(actionEvent -> {
            rightNowButton.setStyle("-fx-background-color:#8b0000");
            rightNowButton.setTextFill(Color.rgb(139,0,0));
        });
        Button goldButton = new Button();goldButton.setStyle("-fx-background-color:#ffd700");
        goldButton.setOnAction(actionEvent -> {
            rightNowButton.setStyle("-fx-background-color:#ffd700");
            rightNowButton.setTextFill(Color.rgb(255,215,0));
        });
        Button lightcyanButton = new Button();lightcyanButton.setStyle("-fx-background-color:#87cefa");
        lightcyanButton.setOnAction(actionEvent -> {
            rightNowButton.setStyle("-fx-background-color:#87cefa");
            rightNowButton.setTextFill(Color.rgb(135,206,250));
        });
        Button magentaButton = new Button();magentaButton.setStyle("-fx-background-color:#ff00ff");
        magentaButton.setOnAction(actionEvent -> {
            rightNowButton.setStyle("-fx-background-color:#ff00ff");
            rightNowButton.setTextFill(Color.rgb(255,0,255));
        });


        HBox hBox_color = new HBox(5,rightNowLabel,rightNowButton,separator,blackButton,greyButton,firebrickButton,orangeRedButton,redButton,yellowButton,greenButton,deepSkyBlueButton,
                mediumSlateBlueBlueButton,aliceBlueButton,aquaButton,pinkButton,oliveButton,whiteButton,navyButton,darkRedButton,goldButton,lightcyanButton,magentaButton);
        HBox.setMargin(rightNowButton,new Insets(0,10,0,0));
                hBox_color.setAlignment(Pos.CENTER);hBox_color.setStyle("-fx-background-color:#faebd7");
        TitledPane titledPane_color = new TitledPane("选择填充颜色",hBox_color);
        titledPane_color.setContent(hBox_color);titledPane_color.prefWidthProperty().bind(stage.widthProperty().divide(2));

        HBox hBoxTop1 = new HBox();
        hBoxTop1.getChildren().addAll(titledPane_sharp,titledPane_color);
        MenuItem new_menuItem = new MenuItem("新建(N)");
        MenuItem open_menuItem = new MenuItem("打开(O)");
        open_menuItem.setOnAction(actionEvent -> {
            System.out.println("点击成功");
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("www"));
                Object obj = objectInputStream.readObject();
                System.out.println("2");
                if(obj instanceof MyCircle){
                    System.out.println("3");
                    MyCircle myCircle = (MyCircle) obj;
                    pane.getChildren().add(myCircle);
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        });
        MenuItem save_menuItem = new MenuItem("保存(S)");

        MenuItem saveTo_menuItem = new MenuItem("另存为(A)");


        Menu mainMenu = new Menu("主页");
        Menu viewMenu = new Menu("清屏");
        //viewMenu.setOnAction(actionEvent -> pane.getChildren().clear());

        Menu fileMenu = new Menu("文件");fileMenu.getItems().addAll(new_menuItem,open_menuItem,save_menuItem,saveTo_menuItem);
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu,mainMenu,viewMenu);

        HBox hBox_property = new HBox(10);hBox_property.setStyle("-fx-background-color:#faebd7");hBox_property.setAlignment(Pos.CENTER);
        //Label width = new Label("宽度");
        Label label1 = new Label("长/长轴:");
        TextField input_width = new TextField();input_width.setPromptText("输入图形长度/椭圆长轴");
        Label label2 = new Label("宽/短轴");
        TextField  input_height = new TextField();input_height.setPromptText("输入图形宽度/椭圆短轴");
        Label label3 = new Label("Radius");
        TextField  input_circle = new TextField();input_circle.setPromptText("输入圆的半径");
        Label label4 = new Label("Stroke:");
        ColorPicker colorPicker = new ColorPicker();
        hBox_property.getChildren().addAll(label1,input_width,label2,input_height,label3,input_circle,label4,colorPicker,cls);

        VBox vBoxTopRoot = new VBox();
        vBoxTopRoot.getChildren().addAll(menuBar,hBoxTop1,hBox_property);

        //TOP区域设置
        BorderPane root = new BorderPane();
        root.setTop(vBoxTopRoot);

        //CENTRE区域设置
        pane.setStyle("-fx-background-color:#faebd7");
        root.setCenter(pane);


        Scene scene = new Scene(root);
        stage.setScene(scene);


        //BOTTOM区域
        HBox hBoxBottom = new HBox(100);
        Label labelXY = new Label();
        ImageView imageViewLabelXY = new ImageView("picture/px.png");
        imageViewLabelXY.setFitHeight(15);
        labelXY.setGraphic(imageViewLabelXY);
        pane.setOnMouseMoved(mouseEvent -> labelXY.setText("("+mouseEvent.getSceneX()+","+ (mouseEvent.getSceneY()-vBoxTopRoot.getHeight())+")"+"像素"));

        Label labelS = new Label("面积:");
        Label labelC = new Label("周长:");

        Hyperlink hyperlink = new Hyperlink("点击此链接，加入我们!");
        hyperlink.setPadding(new Insets(0,0,0, 300));
        hyperlink.setOnAction(actionEvent -> {
            HostServices hostServices = getHostServices();
            hostServices.showDocument("http://47.101.180.27");
        });

        hBoxBottom.getChildren().addAll(labelXY,labelS,labelC,hyperlink);
        root.setBottom(hBoxBottom);

        point.setOnMouseReleased(mouseEvent -> {
            Circle myPoint = new Circle();allShape.add(myPoint);
            myPoint.setCenterX(mouseEvent.getSceneX());myPoint.setCenterY(mouseEvent.getSceneY()-vBoxTopRoot.getHeight());
            myPoint.setRadius(5);myPoint.setFill(Color.BLACK);myPoint.setStroke(Color.BLACK);
            pane.getChildren().add(myPoint);
            myPoint.setOnMouseDragged(mouseEvent1 -> {
                myPoint.setCenterX(mouseEvent1.getSceneX());myPoint.setCenterY(mouseEvent1.getSceneY()-vBoxTopRoot.getHeight());
            });
        });

        line.setOnAction(actionEvent -> {
            Line myLine = new Line(0,0,0,0);
            myLine.setStrokeWidth(3);
            pane.getChildren().add(myLine);
            pane.setOnMousePressed(mouseEvent1 -> {

                myLine.setStartX(mouseEvent1.getSceneX());myLine.setStartY(mouseEvent1.getSceneY()-vBoxTopRoot.getHeight());
                myLine.setEndX(mouseEvent1.getSceneX());myLine.setEndY(mouseEvent1.getSceneY()-vBoxTopRoot.getHeight());
                pane.setOnMouseDragged(mouseEvent2 -> {
                    myLine.setEndX(mouseEvent2.getSceneX());myLine.setEndY(mouseEvent2.getSceneY()-vBoxTopRoot.getHeight());
                });
            });
            pane.setOnMouseReleased(mouseEvent -> {
                pane.setOnMousePressed(mouseEvent1 -> {});
                pane.setOnMouseDragged(mouseEvent1 -> {});
            });
        });

        ellipse.setOnMouseReleased(mouseEvent -> {
            Ellipse myEllipse = new Ellipse();allShape.add(myEllipse);
            myEllipse.setCenterX(mouseEvent.getSceneX());myEllipse.setCenterY(mouseEvent.getSceneY()-vBoxTopRoot.getHeight());
            myEllipse.setRadiusX(70);myEllipse.setRadiusY(35);myEllipse.setStroke(Color.WHITE);
            myEllipse.setFill(Color.WHITE);
            pane.getChildren().add(myEllipse);
            myEllipse.setOnMouseDragged(mouseEvent1 -> {
                myEllipse.setCenterX(mouseEvent1.getSceneX());myEllipse.setCenterY(mouseEvent1.getSceneY()-vBoxTopRoot.getHeight());
                myEllipse.requestFocus();
            });
            myEllipse.setOnKeyPressed(keyEvent -> {
                labelS.setText("面积:"+ Math.round(myEllipse.getRadiusX()*myEllipse.getRadiusY()*Math.PI));
                labelC.setText("周长:"+ Math.round(myEllipse.getRadiusY()*2*Math.PI+4*(myEllipse.getRadiusX()-myEllipse.getRadiusY())));
                switch (keyEvent.getCode()) {
                    case DELETE:pane.getChildren().remove(myEllipse);break;
                    case W:myEllipse.setRadiusY(myEllipse.getRadiusY()+10);break;
                    case D:myEllipse.setRadiusX(myEllipse.getRadiusX()+10);break;
                    case S:myEllipse.setRadiusY(myEllipse.getRadiusY()-10);break;
                    case A:myEllipse.setRadiusX(myEllipse.getRadiusX()-10);break;
                }
            });
            myEllipse.setOnMouseClicked(mouseEvent1 -> {
                labelS.setText("面积:"+ Math.round(myEllipse.getRadiusX()*myEllipse.getRadiusY()*Math.PI));
                labelC.setText("周长:"+ Math.round(myEllipse.getRadiusY()*2*Math.PI+4*(myEllipse.getRadiusX()-myEllipse.getRadiusY())));
                double newRadiusY = myEllipse.getRadiusY(),newRadiusX = myEllipse.getRadiusX();
                if(!input_width.getText().equals(""))   newRadiusX = Double.parseDouble(input_width.getText());
                if(!input_height.getText().equals(""))   newRadiusY = Double.parseDouble(input_height.getText());
                if(newRadiusX>=5 && newRadiusY >=5){
                    myEllipse.setRadiusX(newRadiusX);myEllipse.setRadiusY(newRadiusY);
                }
                if (mouseEvent1.getClickCount() == 2) {
                    myEllipse.requestFocus();
                    myEllipse.setStroke(colorPicker.getValue());
                    myEllipse.setFill(rightNowButton.getTextFill());
                }
            });
            labelS.setText("面积:"+ Math.round(myEllipse.getRadiusX()*myEllipse.getRadiusY()*Math.PI));
            labelC.setText("周长:"+ Math.round(myEllipse.getRadiusY()*2*Math.PI+4*(myEllipse.getRadiusX()-myEllipse.getRadiusY())));
        });

        rectangle.setOnMouseReleased(mouseEvent -> {
            Rectangle myRectangle = new Rectangle();allShape.add(myRectangle);
            myRectangle.setX(mouseEvent.getSceneX());myRectangle.setY(mouseEvent.getSceneY()-vBoxTopRoot.getHeight());
            myRectangle.setWidth(120);myRectangle.setHeight(80);myRectangle.setFill(Color.WHITE);myRectangle.setStroke(Color.WHITE);
            myRectangle.minWidth(120);myRectangle.minHeight(80);
            pane.getChildren().add(myRectangle);
            myRectangle.setOnMouseDragged(mouseEvent1 -> {
                myRectangle.setX(mouseEvent1.getSceneX());myRectangle.setY(mouseEvent1.getSceneY()-vBoxTopRoot.getHeight());
                myRectangle.requestFocus();
            });
            myRectangle.setOnKeyPressed(keyEvent -> {
                labelS.setText("面积:"+ Math.round(myRectangle.getHeight()*myRectangle.getWidth()));
                labelC.setText("周长:"+ Math.round(myRectangle.getHeight()*2+myRectangle.getWidth()*2));
                switch (keyEvent.getCode()) {
                    case DELETE:pane.getChildren().remove(myRectangle);break;
                    case W:myRectangle.setHeight(myRectangle.getHeight()+10);break;
                    case D:myRectangle.setWidth(myRectangle.getWidth()+10);break;
                    case S:myRectangle.setHeight(myRectangle.getHeight()-10);break;
                    case A:myRectangle.setWidth(myRectangle.getWidth()-10);break;
                }
            });
            myRectangle.setOnMouseClicked(mouseEvent1 -> {
                labelS.setText("面积:"+ Math.round(myRectangle.getHeight()*myRectangle.getWidth()));
                labelC.setText("周长:"+ Math.round(myRectangle.getHeight()*2+myRectangle.getWidth()*2));
                double newWidth = myRectangle.getWidth(),newHeight = myRectangle.getHeight();
                if(!input_width.getText().equals(""))   newWidth = Double.parseDouble(input_width.getText());
                if(!input_height.getText().equals(""))   newHeight = Double.parseDouble(input_height.getText());
                myRectangle.setWidth(newWidth);myRectangle.setHeight(newHeight);
                if (mouseEvent1.getClickCount() == 2) {
                    myRectangle.requestFocus();
                    myRectangle.setStroke(colorPicker.getValue());
                    myRectangle.setFill(rightNowButton.getTextFill());
                }
            });
            labelS.setText("面积:"+ Math.round(myRectangle.getHeight()*myRectangle.getWidth()));
            labelC.setText("周长:"+ Math.round(myRectangle.getHeight()*2+myRectangle.getWidth()*2));
        });

        circle.setOnMouseReleased(mouseEvent -> {
            MyCircle myCircle = new MyCircle();allShape.add(myCircle);
            save_menuItem.setOnAction(actionEvent -> {
                try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("www.txt"))) {
                    myCircle.writeExternal(objectOutputStream);
                    objectOutputStream.writeObject(myCircle);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            open_menuItem.setOnAction(actionEvent -> {
                MyCircle myCircle1 = new MyCircle();
                try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("www.txt"))){
                    myCircle1.readExternal(objectInputStream);
                    pane.getChildren().add(myCircle1);
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            });
            myCircle.setCenterX(mouseEvent.getSceneX());myCircle.setCenterY(mouseEvent.getSceneY()-vBoxTopRoot.getHeight());
            myCircle.setRadius(50);myCircle.setStroke(Color.WHITE);myCircle.setFill(Color.WHITE);
            pane.getChildren().add(myCircle);
            myCircle.setOnMouseDragged(mouseEvent1 -> {
                myCircle.setCenterX(mouseEvent1.getSceneX());myCircle.setCenterY(mouseEvent1.getSceneY()-vBoxTopRoot.getHeight());
                myCircle.requestFocus();
            });
            myCircle.setOnKeyPressed(keyEvent -> {
                labelS.setText("面积:"+ Math.round(myCircle.getRadius()*myCircle.getRadius()*Math.PI));
                labelC.setText("周长:"+ Math.round(myCircle.getRadius()*2*Math.PI));
                switch (keyEvent.getCode()) {
                    case DELETE:pane.getChildren().remove(myCircle);break;
                    case E:myCircle.setRadius(myCircle.getRadius()+10);break;
                    case D:myCircle.setRadius(myCircle.getRadius()-10);break;
                    case SPACE:if(keyEvent.isControlDown()){
                        myCircle.setFill(null);
                    }else myCircle.setFill(rightNowButton.getTextFill());break;
                }
            });
            myCircle.setOnMouseClicked(mouseEvent1 -> {
                labelS.setText("面积:"+ Math.round(myCircle.getRadius()*myCircle.getRadius()*Math.PI));
                labelC.setText("周长:"+ Math.round(myCircle.getRadius()*2*Math.PI));
                double newRadius = myCircle.getRadius();
                if(!input_circle.getText().equals(""))
                    newRadius = Double.parseDouble(input_circle.getText());
                if(newRadius > 5) myCircle.setRadius(newRadius);
                myCircle.requestFocus();
                if (mouseEvent1.getClickCount() == 2) {
                    myCircle.setStroke(colorPicker.getValue());
                    myCircle.setFill(rightNowButton.getTextFill());
                }
            });
            labelS.setText("面积:"+ Math.round(myCircle.getRadius()*myCircle.getRadius()*Math.PI));
            labelC.setText("周长:"+ Math.round(myCircle.getRadius()*2*Math.PI));
        });
        stage.show();

        stage.setOnCloseRequest(windowEvent -> {
            stage.close();
            for(int i = 0;i < 1; i++) {
                if(i % 5 == 0){
                    System.gc();
                    i = 0;
                }
                try {
                    Thread.sleep(100);
                    new Logout();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}


class MyCircle extends Circle implements Externalizable {
    private static final long serialVersionUID = System.currentTimeMillis();

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeDouble(this.getCenterX());
        out.writeDouble(this.getCenterY());
        out.writeDouble(this.getRadius());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.setCenterX(in.readDouble());
        this.setCenterY(in.readDouble());
        this.setRadius(in.readDouble());
    }
}


