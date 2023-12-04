package apifestivos.apifestivos.interfaces;

import apifestivos.apifestivos.entidades.Festivo;
import apifestivos.apifestivos.entidades.Tipo;

import java.util.List;



public interface IFestivosServicio {

    public List<Festivo> listar();

    public String esFestivo(String date);

    public Festivo obtener(long id);

    public Festivo guardar(Festivo festivo);

    public boolean eliminar(long id);

}
