package org.iesalandalus.programacion.reservasaulas.mvc.modelo;

import org.iesalandalus.programacion.reservasaulas.mvc.modelo.negocio.ficheros.FactoriaFuenteDatosFicheros;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.negocio.memoria.FactoriaFuenteDatosMemoria;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.negocio.mongodb.FactoriaFuenteDatosMongodb;

public enum FactoriaFuenteDatos {
	MEMORIA{
		@Override
		public IFuenteDatos crear() {
			IFuenteDatos memoria=new FactoriaFuenteDatosMemoria();
			return memoria;
		}
	}, 
	FICHEROS {
		@Override
		public IFuenteDatos crear() {
			IFuenteDatos ficheros=new FactoriaFuenteDatosFicheros();
			return ficheros;
		}
	},
	MONGODB {
		@Override
		public IFuenteDatos crear() {
			IFuenteDatos mongodb=new FactoriaFuenteDatosMongodb();
			return mongodb;
		}
	};
	
	FactoriaFuenteDatos() {	
	}
	
	public abstract IFuenteDatos crear();
}
