package platform.codingnomads.co.springdata.lab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import platform.codingnomads.co.springdata.lab.models.Route;

import java.util.List;

public interface RouteRepository extends JpaRepository<platform.codingnomads.co.springdata.lab.models.Route, Long> {

    List<platform.codingnomads.co.springdata.lab.models.Route> findByOrigin_code(String code);

    List<platform.codingnomads.co.springdata.lab.models.Route> findByDestination_code(String code);

    List<platform.codingnomads.co.springdata.lab.models.Route> findAllByCodeContaining(String code);

    Route findByCode(String code);
}
