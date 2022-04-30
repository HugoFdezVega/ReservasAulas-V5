package org.iesalandalus.programacion.reservasaulas.mvc.vista.grafica.controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TitledPane;

public class ControladorVBuscarReserva {

    @FXML
    private Button btBuscarReserva;

    @FXML
    private TableColumn<?, ?> colAulaReservas;

    @FXML
    private TableColumn<?, ?> colPermReservas;

    @FXML
    private TableColumn<?, ?> colProfReservas;

    @FXML
    private TableColumn<?, ?> colPuntosReservas;

    @FXML
    private DatePicker inputFecha;

    @FXML
    private ComboBox<?> inputHoras;

    @FXML
    private ComboBox<?> inputTramo;

    @FXML
    private RadioButton rbPorHoras;

    @FXML
    private RadioButton rbPorTramo;

    @FXML
    private TableView<?> tabReservas;

    @FXML
    private TitledPane vBuscarReserva;

    @FXML
    void acBuscarReserva(ActionEvent event) {

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
