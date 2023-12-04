package apifestivos.apifestivos.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import apifestivos.apifestivos.entidades.Festivo;

import apifestivos.apifestivos.interfaces.IFestivosServicio;


@RestController
@RequestMapping("/festivo")
public class FestivosControlador {

    private IFestivosServicio servicio;

    public FestivosControlador(IFestivosServicio servicio) {
        this.servicio = servicio;
    }

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Festivo> listar() {
        return this.servicio.listar();
    }
    
}
