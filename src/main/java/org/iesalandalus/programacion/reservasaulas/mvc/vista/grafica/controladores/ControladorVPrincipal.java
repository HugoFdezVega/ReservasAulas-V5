package org.iesalandalus.programacion.reservasaulas.mvc.vista.grafica.controladores;

import java.awt.Button;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;

import javafx.fxml.FXML;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Tab;



public class ControladorVPrincipal {

    @FXML
    private Button btAbrirAnadirAula;

    @FXML
    private Button btAbrirAnadirProfesor;

    @FXML
    private Button btAbrirAnadirReserva;

    @FXML
    private Button btAbrirBuscarAula;

    @FXML
    private Button btAbrirBuscarProfesor;

    @FXML
    private Button btAbrirBuscarReserva;

    @FXML
    private TableColumn<?, ?> colAulaReservas;

    @FXML
    private TableColumn<?, ?> colMailProf;

    @FXML
    private TableColumn<?, ?> colNombreAula;

    @FXML
    private TableColumn<?, ?> colNombreProf;

    @FXML
    private TableColumn<?, ?> colPermReservas;

    @FXML
    private TableColumn<?, ?> colProfReservas;

    @FXML
    private TableColumn<?, ?> colPuestosAula;

    @FXML
    private TableColumn<?, ?> colPuntosProf;

    @FXML
    private TableColumn<?, ?> colPuntosReservas;

    @FXML
    private TableColumn<?, ?> colTelfProf;

    @FXML
    private MenuItem menuBorrarAula;

    @FXML
    private MenuItem menuBorrarProfesor;

    @FXML
    private MenuItem menuBorrarReserva;

    @FXML
    private Tab pesAulas;

    @FXML
    private Tab pesProfesores;

    @FXML
    private Tab pesReservas;

    @FXML
    private TableView<?> tabAulas;

    @FXML
    private TableView<?> tabProfesores;

    @FXML
    private TableView<?> tabReservas;

    @FXML
    private AnchorPane vAulas;

    @FXML
    private TabPane vPrincipal;

    @FXML
    private AnchorPane vProfesores;

    @FXML
    private AnchorPane vReservas;

    @FXML
    void acAbrirAnadirAula(ActionEvent event) {

    }

    @FXML
    void acAbrirAnadirProf(ActionEvent event) {

    }

    @FXML
    void acAbrirBuscarAula(ActionEvent event) {

    }

    @FXML
    void acAbrirBuscarProf(ActionEvent event) {

    }

    @FXML
    void acBorrarAula(ActionEvent event) {

    }

    @FXML
    void acBorrarProfesor(ActionEvent event) {

    }

    @FXML
    void acBorrarReserva(ActionEvent event) {

    }

}
