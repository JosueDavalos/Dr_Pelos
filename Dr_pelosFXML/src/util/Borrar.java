/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author jeffer
 */
public class Borrar {
  /*  //    private ObservableList<Alumno> listaAlumnos; // utilizo la observablelist static de Alumno.alumnos
    @FXML private TableView<Alumno> tbAlumno;
    //COLUMNAS
    @FXML private TableColumn<Alumno, String> colCedula;
    @FXML private TableColumn<Alumno, String> colEntrenador;
    @FXML private TableColumn<Alumno, String> colMatriculacion;
    @FXML private TableColumn<Alumno, String> colNombre;
    @FXML private TableColumn<Alumno, String> colEdad;
    @FXML private TableColumn<Alumno, String> colNivel;
    @FXML private TableColumn<Alumno, String> colColorDeCinturon;
    
    @FXML private TextField nombreTxt;
    @FXML private TextField cedulaTxt;
    
    @FXML private Button buscarNombreBtn;
    @FXML private Button buscarCedulaBtn;
    
    @FXML private Button regresarBtn;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Se inicializo");
        Connection conexion= Conectar.getConn();
        buscarPorNombre();//llena la tabla inicialmente sea por nombre o por cedula porque al principio ambos casilleros estan vacios entonoces toma todos los registros
        System.out.println("despues buscarpornombre");                        
        tbAlumno.setEditable(true);
        colNombre.setCellFactory(TextFieldTableCell.forTableColumn()); 
       
        colEdad.setCellFactory(TextFieldTableCell.forTableColumn(new StringConverter() {
//                       cell.commitEdit(converter.fromString(textField.getText()));//el error que me salia

            @Override
            public String toString(Object object) {
                Integer i= (Integer) object;
                return i+"";
            }
            
            @Override
            public Integer fromString(String string) {
                return Integer.parseInt(string);
            }
        }));
        colNivel.setCellFactory(TextFieldTableCell.forTableColumn(new StringConverter(){
            @Override
            public String toString(Object object){
                Nivel n= (Nivel)object;
                return n.toString();               
            }
            public Nivel fromString(String string){
                return Nivel.valueOf(string);
            }
        }));
        
//      colNivel.setCellFactory(TextFieldTableCell.forTableColumn());//no salee

        colColorDeCinturon.setCellFactory(TextFieldTableCell.forTableColumn());
// 
    }
    @FXML
    public void changeName(CellEditEvent<Alumno,String> t){//t = edittedCell
        Alumno alumnoSelected = tbAlumno.getSelectionModel().getSelectedItem();
        alumnoSelected.setNombre(t.getNewValue().toString());
        actualizarDatosEdit(alumnoSelected.getCedula(),"nombre",alumnoSelected.getNombre());//si sirve
//        ((Alumno) t.getTableView().getItems().get( //tambien sale con esto
//        t.getTablePosition().getRow())).setNombre(t.getNewValue());
    }
    @FXML
    public void changeColorDeCinturon(CellEditEvent<Alumno,String> t){
        Alumno alumnoSelected = tbAlumno.getSelectionModel().getSelectedItem();
        alumnoSelected.setColorDeCinturon(t.getNewValue().toString());
        actualizarDatosEdit(alumnoSelected.getCedula(),"colorDeCinturon",alumnoSelected.getColorDeCinturon());
        
    }
    @FXML
    public void changeNivel(CellEditEvent<Alumno,Nivel> t){
        Alumno alumnoSelected = tbAlumno.getSelectionModel().getSelectedItem();
        alumnoSelected.setNivel(t.getNewValue());
        actualizarDatosEdit(alumnoSelected.getCedula(),"nivel",alumnoSelected.getNivel().toString());
    }
    @FXML
    public void changeEdad (CellEditEvent<Alumno,Integer> edittedCell){
        Alumno alumnoSelected=tbAlumno.getSelectionModel().getSelectedItem();
//        alumnoSelected.setEdad(Integer.parseInt(edittedCell.getNewValue())); errorr
           alumnoSelected.setEdad(edittedCell.getNewValue());
        System.out.println(edittedCell.getRowValue());// me devuelve el alumno ya modificado
        actualizarDatosEdit(alumnoSelected.getCedula(),"edad",alumnoSelected.getEdad()+"");//si sirve :D

    }
    public void alertaDelete(){
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Alerta de eliminación de registro");
        alert.setHeaderText("Usted ha presionado el botón de eliminar");
        alert.setContentText("Desea eliminar en realidad el registro?");
        ButtonType cancelar = new ButtonType("Cancelar");
        ButtonType continuar = new ButtonType("Continuar");
        alert.getButtonTypes().setAll(cancelar,continuar);
        Optional<ButtonType> result =alert.showAndWait();
        if((result.get()==cancelar)){
            alert.close();
        }else{
            eliminarRegistro();
        }
    }
    public void eliminarRegistro(){
        Alumno alumnoSelected =tbAlumno.getSelectionModel().getSelectedItem();
        try{String s = "Delete from alumno where cedula=?";
        PreparedStatement ps = Conectar.conn.prepareStatement(s);
        ps.setString(1,alumnoSelected.getCedula());
        ps.execute();
        Alumno.alumnos.remove(alumnoSelected);        
        }
        catch(SQLException e){
            e.printStackTrace();
        }catch(Exception e){
            System.out.println("DEBES SELECCIONAR UN REGISTRO");
        }
    }
    
    public void buscarPorNombre(){//en realidad estos metodos se los utiliza en el FXMLConsultarController
        System.out.println("Buscar por nombre");
        tbAlumno.getItems().clear();
//        listaAlumnos = FXCollections.observableArrayList();
        tbAlumno.setItems(Alumno.alumnos);//el TableView se llena con observableArrayList
        Connection conexion= Conectar.getConn();
        String nombre= nombreTxt.getText();
        llenarInformacionAlumnoNombre(conexion,Alumno.alumnos, nombre);//como el table view ya contiene la lista solo anadirle mas elementos ya sale
        colCedula.setCellValueFactory(new PropertyValueFactory<Alumno,String>("cedula"));
        colEntrenador.setCellValueFactory(new PropertyValueFactory<Alumno,String>("entrenador"));
        colMatriculacion.setCellValueFactory(new PropertyValueFactory<Alumno,String>("matriculacion"));
        colNombre.setCellValueFactory(new PropertyValueFactory<Alumno,String>("nombre"));
        colEdad.setCellValueFactory(new PropertyValueFactory<Alumno,String>("edad"));
        colNivel.setCellValueFactory(new PropertyValueFactory<Alumno,String>("nivel"));
        colColorDeCinturon.setCellValueFactory(new PropertyValueFactory<Alumno,String>("colorDeCinturon"));
        cedulaTxt.setText("");
        
    }
    public void buscarPorCedula(){
        tbAlumno.getItems().clear();
//        listaAlumnos = FXCollections.observableArrayList();
        tbAlumno.setItems(Alumno.alumnos);
        Connection conexion= Conectar.getConn();
        String cedula= cedulaTxt.getText();
        llenarInformacionAlumnoCedula(conexion,Alumno.alumnos, cedula);
        colCedula.setCellValueFactory(new PropertyValueFactory<Alumno,String>("cedula"));//le setea el valor de esa columna del table view del Alumno
        colEntrenador.setCellValueFactory(new PropertyValueFactory<Alumno,String>("entrenador"));
        colMatriculacion.setCellValueFactory(new PropertyValueFactory<Alumno,String>("matriculacion"));
        colNombre.setCellValueFactory(new PropertyValueFactory<Alumno,String>("nombre"));
        colEdad.setCellValueFactory(new PropertyValueFactory<Alumno,String>("edad"));
        colNivel.setCellValueFactory(new PropertyValueFactory<Alumno,String>("nivel"));
        colColorDeCinturon.setCellValueFactory(new PropertyValueFactory<Alumno,String>("colorDeCinturon"));
        nombreTxt.setText("");
        
    }
    public static void llenarInformacionAlumnoNombre(Connection connection, ObservableList<Alumno> lista, String nombre) {
        try {
        System.out.println("llenarInformacionAlumnoNombre");            
            Statement sql = connection.createStatement();
            ResultSet resultado = sql.executeQuery("Select * from Alumno where Nombre Like "+'"'+"%"+nombre+'%'+'"');
            while (resultado.next()) {
                //Alumno(String cedula, String entrenador, String nombre, String nivel, int edad, String colorDeCinturon)
                lista.add(new Alumno(resultado.getString("cedula"),
                        resultado.getString("Entrenador"),
                        resultado.getString("matriculación"),
                        resultado.getString("nombre"),
                        Nivel.valueOf(resultado.getString("nivel")),
                        resultado.getInt("edad"),
                        resultado.getString("colorDeCinturon")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(FXMLConsultarController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private void actualizarDatosEdit(String cedula,String campo,String newValue){
        try{
            String s="Update alumno set "+campo+"=? Where cedula =?";
            PreparedStatement ps=Conectar.conn.prepareStatement(s);
            ps.setString(1,newValue );
            ps.setString(2,cedula);
            ps.execute();       
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
        public static void llenarInformacionAlumnoCedula(Connection connection, ObservableList<Alumno> lista, String cedula) {
        try {
            Statement sql = connection.createStatement();
            ResultSet resultado = sql.executeQuery("Select * from Alumno where Cedula Like "+'"'+"%"+cedula+'%'+'"');
            while (resultado.next()) {
                //Alumno(String cedula, String entrenador, String nombre, String nivel, int edad, String colorDeCinturon)
                lista.add(new Alumno(resultado.getString("cedula"),
                        resultado.getString("Entrenador"),
                        resultado.getString("matriculación"),
                        resultado.getString("nombre"),
                        Nivel.valueOf(resultado.getString("nivel")),
                        resultado.getInt("edad"),
                        resultado.getString("colorDeCinturon")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(FXMLConsultarController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
            @FXML
    private void regresar(ActionEvent event) throws IOException {
        Parent segunda = FXMLLoader.load(getClass().getResource("FXMLSegundaScene.fxml"));
        Scene segundaScene = new Scene(segunda);
        Stage windows = (Stage) ((Node) event.getSource()).getScene().getWindow();
        windows.setScene(segundaScene);
        windows.show();
    }*/
}
