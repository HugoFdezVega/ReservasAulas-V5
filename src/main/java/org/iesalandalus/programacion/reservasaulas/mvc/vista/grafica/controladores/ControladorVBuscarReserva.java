package org.iesalandalus.programacion.reservasaulas.mvc.vista.grafica.controladores;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.iesalandalus.programacion.reservasaulas.mvc.controlador.IControlador;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio.Permanencia;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio.PermanenciaPorHora;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio.PermanenciaPorTramo;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio.Reserva;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio.Tramo;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleGroup;

public class ControladorVBuscarReserva {
	ControladorVPrincipal cVPrincipal=null;
	private IControlador controladorMVC;
	private ToggleGroup grupo;
	
	public void setControladorVPrincipal(ControladorVPrincipal controladorVPrincipal) {
		cVPrincipal=controladorVPrincipal;
	}
	
	public void setControladorMVC(IControlador controlador) {
		controladorMVC=controlador;
	}
	
	private ObservableList<Reserva> reservas = FXCollections.observableArrayList();
	
	@FXML private TableView<Reserva> tabReservas;
	@FXML private TableColumn<Reserva, String> colProfReservas;
	@FXML private TableColumn<Reserva, String> colAulaReservas;
	@FXML private TableColumn<Reserva, String> colPermReservas;
	@FXML private TableColumn<Reserva, String> colPuntosReservas;
	
	@FXML private void initialize() {
		tabReservas.setItems(reservas);
		colProfReservas.setCellValueFactory(reserva -> new SimpleStringProperty(reserva.getValue().getProfesor().getNombre()));
		colAulaReservas.setCellValueFactory(reserva -> new SimpleStringProperty(reserva.getValue().getAula().getNombre()));
		colPermReservas.setCellValueFactory(reserva -> new SimpleStringProperty(reserva.getValue().getPermanencia().toString()));
		colPuntosReservas.setCellValueFactory(reserva -> new SimpleStringProperty(String.valueOf(reserva.getValue().getPuntos())));
		
		grupo = new ToggleGroup();
		rbPorHoras.setToggleGroup(grupo);
		rbPorTramo.setToggleGroup(grupo);
		inputHoras.setVisibleRowCount(5);
		inputHoras.setItems(FXCollections.observableArrayList("08:00","09:00","10:00","11:00","12:00","13:00","14:00","15:00","16:00","17:00","18:00","19:00","20:00","21:00","22:00"));
		inputTramo.setItems(FXCollections.observableArrayList("Mañana","Tarde"));
		inputFecha.setValue(LocalDate.now().plusMonths(1));
		
	}
	
	private void rbSeleccionado() {
		  RadioButton seleccionado = (RadioButton)grupo.getSelectedToggle();
		  if (seleccionado==rbPorHoras) {
			  inputHoras.setDisable(false);
			  inputTramo.setDisable(true);
		  }
		  else if (seleccionado==rbPorTramo) {
			  inputHoras.setDisable(true);
			  inputTramo.setDisable(false);
		  }
	}
	
	public 



    @FXML
    void acPorHoras(ActionEvent event) {
    	rbSeleccionado();
    }

    @FXML
    void acPorTramo(ActionEvent event) {
    	rbSeleccionado();
    }
    
    @FXML
    void acBuscarReserva(ActionEvent event) {
    	lbError.setText("");
    	reservas.clear();
    	RadioButton seleccionado = (RadioButton)grupo.getSelectedToggle();
    	Permanencia permanencia=null;
    	Tramo tramo=null;
    	List<Reserva> coleccionReservas=null;
    	if(seleccionado==rbPorHoras) {
    		permanencia=new PermanenciaPorHora(inputFecha.getValue(),LocalTime.parse(inputHoras.getSelectionModel().getSelectedItem()));
    	}
    	else if(seleccionado==rbPorTramo) {
    		if (inputTramo.getSelectionModel().getSelectedItem()=="Mañana") {
    			tramo=Tramo.MANANA;
    		}
    		else if(inputTramo.getSelectionModel().getSelectedItem()=="Tarde") {
    			tramo=Tramo.TARDE;
    		}
    		permanencia=new PermanenciaPorTramo(inputFecha.getValue(),tramo);
    	}
    	coleccionReservas=controladorMVC.getReservasPermanencia(permanencia);
    	if (coleccionReservas==null) {
    		lbError.setText("No existe ningún profesor con ese correo");
    	}
    	else {
    		reservas.setAll(coleccionReservas);
    	}
    }
    
    @FXML
    private Label lbError;
    
    @FXML
    private DatePicker inputFecha;

    @FXML
    private ComboBox<String> inputHoras;

    @FXML
    private ComboBox<String> inputTramo;
    
    @FXML
    private RadioButton rbPorHoras;

    @FXML
    private RadioButton rbPorTramo;
    
    @FXML
    private Button btBuscarReserva;

    @FXML
    private TitledPane vBuscarReserva;

    @FXML
    void acFecha(ActionEvent event) {

    }

    @FXML
    void acHora(ActionEvent event) {

    }



    @FXML
    void acTramo(ActionEvent event) {

    }

}
