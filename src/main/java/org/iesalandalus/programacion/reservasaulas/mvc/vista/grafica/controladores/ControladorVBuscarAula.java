package org.iesalandalus.programacion.reservasaulas.mvc.vista.grafica.controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;

public class ControladorVBuscarAula {

    @FXML
    private Button btBuscarAula;

    @FXML
    private TableColumn<?, ?> colAulaReservas;

    @FXML
    private TableColumn<?, ?> colNombreAula;

    @FXML
    private TableColumn<?, ?> colPermReservas;

    @FXML
    private TableColumn<?, ?> colProfReservas;

    @FXML
    private TableColumn<?, ?> colPuestosAula;

    @FXML
    private TableColumn<?, ?> colPuntosReservas;

    @FXML
    private TextField inputBuscarAula;

    @FXML
    private MenuItem menuBorrarAula;

    @FXML
    private TableView<?> tabAulas;

    @FXML
    private TableView<?> tabReservas;

    @FXML
    private TitledPane vBuscarAula;

    @FXML
    void acBorrarAula(ActionEvent event) {

    }

    @FXML
    void acBuscarAula(ActionEvent event) {

    }

}
