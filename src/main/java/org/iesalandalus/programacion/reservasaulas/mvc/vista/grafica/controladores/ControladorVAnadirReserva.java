package org.iesalandalus.programacion.reservasaulas.mvc.vista.grafica.controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TitledPane;

public class ControladorVAnadirReserva {

    @FXML
    private Button btAceptar;

    @FXML
    private Button btCancelar;

    @FXML
    private TableColumn<?, ?> colMailProf;

    @FXML
    private TableColumn<?, ?> colNombreAula;

    @FXML
    private TableColumn<?, ?> colNombreProf;

    @FXML
    private TableColumn<?, ?> colPuestosAula;

    @FXML
    private TableColumn<?, ?> colPuntosProf;

    @FXML
    private TableColumn<?, ?> colTelfProf;

    @FXML
    private DatePicker inputFecha;

    @FXML
    private ComboBox<?> inputHoras;

    @FXML
    private ComboBox<?> inputTramo;

    @FXML
    private MenuItem menuBorrarAula;

    @FXML
    private MenuItem menuBorrarProfesor;

    @FXML
    private RadioButton rbPorHoras;

    @FXML
    private RadioButton rbPorTramo;

    @FXML
    private TableView<?> tabAulas;

    @FXML
    private TableView<?> tabProfesores;

    @FXML
    private TitledPane vAnadirReserva;

    @FXML
    void acAnadirReserva(ActionEvent event) {

    }

    @FXML
    void acBorrarAula(ActionEvent event) {

    }

    @FXML
    void acBorrarProfesor(ActionEvent event) {

    }

    @FXML
    void acCancelar(ActionEvent event) {

    }

    @FXML
    void acFecha(ActionEvent event) {

    }

    @FXML
    void acHora(ActionEvent event) {

    }

    @FXML
    void acPorHoras(ActionEvent event) {

    }

    @FXML
    void acPorTramo(ActionEvent event) {

    }

    @FXML
    void acTramo(ActionEvent event) {

    }

}
