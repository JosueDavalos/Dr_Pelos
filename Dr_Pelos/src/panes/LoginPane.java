/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panes;

import dr_pelos.Metodos;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import panes.personalCaja.PersonalCaja;

/**
 *
 * @author JosueDavalos
 */
public class LoginPane {
     private BorderPane root;
    private Label warningMessage = new Label("");
    private TextField user;
    private PasswordField password;
    
    public LoginPane(){ 
        root = new BorderPane(); 
        root.setTop(LoginTop());
        root.setBottom(LoginBottom());
        root.setCenter(LoginCenter());     
    }
    
    private Pane LoginCenter(){
        user = new TextField();
        password = new PasswordField();
        Label Luser = new Label("Usuario:    ");
        Luser.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        Luser.setTextFill(Color.BLACK);
        user.setMaxSize(400, 400);
        password.setMaxSize(400, 400);
        password.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.ENTER)  {
                     login();
                }
            }
        });
        
        Label Lpassword = new Label("Contrasena:");
        Lpassword.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        Lpassword.setTextFill(Color.BLACK);
        
        VBox vUser = new VBox(Luser,user); vUser.setAlignment(Pos.CENTER);
        VBox vPassword = new VBox(Lpassword,password); vPassword.setAlignment(Pos.CENTER);
        VBox gp = new VBox(vUser, vPassword);
        gp.setAlignment(Pos.CENTER);
        gp.setSpacing(20);
        gp.setBackground(Background.EMPTY);
        return gp;
    }
    
    private Pane LoginTop(){
        Label inicioSesionL = new Label("Inicio de Sesion");
        inicioSesionL.setFont(Font.font("Arial", FontWeight.BOLD, 40));
        inicioSesionL.setTextFill(Color.BLACK);
        ImageView img_sesion = Metodos.getImagen("sesion", 200, 200);
        VBox vb = new VBox(inicioSesionL,img_sesion);
        vb.setAlignment(Pos.CENTER);
        vb.setSpacing(20);
        return vb;
    }
    private void login(){
        warningMessage.setText("");
            String usuario = user.getText();
            String contra = password.getText();
            if(!usuario.equals("")){
                PersonalCaja personalCajaPane = new PersonalCaja();
                root.getChildren().clear();
                root.setCenter(personalCajaPane.getRoot());
            /*}else if(Metodos.esProfesor(usuario, contra,warningMessage)){
                ProfePane profe_pane = new ProfePane();
                Metodos.username = usuario; Metodos.password = contra; Metodos.usuario= Metodos.getProfesorUser(usuario);
                root.getChildren().clear();
                root.setCenter(profe_pane.getRoot());*/
            }else if(warningMessage.getText().equals("")){
                warningMessage.setText("Contraseña o correo INCORRECTO");
            }
    }
    
    private Pane LoginBottom(){
        VBox vb = new VBox();
        Button ingresar = new Button("Ingresar");
        Button salir = new Button("   Salir   ");
        ingresar.setStyle("-fx-background-color: #000000;-fx-text-fill: white;-fx-font-size: 20;");
        salir.setStyle("-fx-background-color: #000000;-fx-text-fill: white;-fx-font-size: 20;");
        
        ingresar.setOnMouseClicked((event) -> {
            login();  
        });
        
        salir.setOnMouseClicked((event) -> {
            System.exit(0);
        });
        
        HBox hb = new HBox(ingresar, salir);
        hb.setAlignment(Pos.CENTER); hb.setSpacing(50);
        warningMessage.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        warningMessage.setTextFill(Color.RED);
        warningMessage.setTranslateY(-30);
        vb.getChildren().addAll(hb,warningMessage);
        vb.setAlignment(Pos.CENTER);
        vb.setSpacing(70);
        return vb;
    }
    
     public Pane getRoot(){
        return root;
    }

    public Label getWarningMessage() {
        return warningMessage;
    }
}
