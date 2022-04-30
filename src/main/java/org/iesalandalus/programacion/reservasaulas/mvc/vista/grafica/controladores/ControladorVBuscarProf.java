package org.iesalandalus.programacion.reservasaulas.mvc.vista.grafica.controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;

public class ControladorVBuscarProf {

    @FXML
    private Button btBuscarProf;

    @FXML
    private TableColumn<?, ?> colAulaReservas;

    @FXML
    private TableColumn<?, ?> colMailProf;

    @FXML
    private TableColumn<?, ?> colNombreProf;

    @FXML
    private TableColumn<?, ?> colPermReservas;

    @FXML
    private TableColumn<?, ?> colProfReservas;

    @FXML
    private TableColumn<?, ?> colPuntosProf;

    @FXML
    private TableColumn<?, ?> colPuntosReservas;

    @FXML
    private TableColumn<?, ?> colTelfProf;

    @FXML
    private TextField inputBuscarProf;

    @FXML
    private TableView<?> tabProfesores;

    @FXML
    private TableView<?> tabReservas;

    @FXML
    private TitledPane vBuscarProf;

    @FXML
    void acBuscarProf(ActionEvent event) {

    }

}
