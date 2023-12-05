package apifestivos.apifestivos.interfaces;

import apifestivos.apifestivos.entidades.Festivo;


import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public interface IFestivosServicio {

    public List<Festivo> listar();

    public String esFestivo(String date);

}
