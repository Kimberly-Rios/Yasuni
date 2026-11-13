
package ec.edu.espoch.yasuni;

import ec.edu.espoch.yasuni.objects.RegularTour;
import ec.edu.espoch.yasuni.objects.SeveralTrail;


public class Yasuni {

    public static void main(String[] args) {
         
       SeveralTrail severalTrail = new SeveralTrail("Limoncocha", 1.0f, 60f, true);

       SeveralTrail[] senderos = {severalTrail};

       RegularTour regularTour = new RegularTour(1502, "Kimberly", senderos);
    }
}