package apifestivos.apifestivos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apifestivos.apifestivos.entidades.Festivo;

@Repository
public interface FestivosRepositorio extends JpaRepository<Festivo, Long>  {
    
}
