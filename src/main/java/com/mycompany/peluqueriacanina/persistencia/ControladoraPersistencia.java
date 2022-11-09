
package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;
import java.util.List;


public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
       duenioJpa.create(duenio);
       mascotaJpa.create(masco);
    }

    public List<Mascota> traerMascotas() {
        
        return mascotaJpa.findMascotaEntities();
                
    }
}
