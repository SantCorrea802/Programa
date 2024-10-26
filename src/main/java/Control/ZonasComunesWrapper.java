/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Beans.ZonaComun;
import java.util.List;

/**
 *
 * @author HP
 */
// Clase para manejar la lista de ZonasComunes
class ZonasComunesWrapper {
    private List<ZonaComun> zonasComunes;

    public List<ZonaComun> getZonasComunes() {
        return zonasComunes;
    }

    public void setZonasComunes(List<ZonaComun> zonasComunes) {
       this.zonasComunes = zonasComunes;
    }
}
