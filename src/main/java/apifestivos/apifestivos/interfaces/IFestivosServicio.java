package apifestivos.apifestivos.interfaces;

import apifestivos.apifestivos.entidades.Festivo;

import java.util.List;


public interface IFestivosServicio {

    public List<Festivo> listar();

    public String esFestivo(String date);
    
}
