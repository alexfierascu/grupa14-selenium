package recap.model;

import java.util.ArrayList;

public class Executie {

  public static void main(String[] args) {
    //ne cream un obiect(referinta) la clasa Om
    //scriem numele clasei (Om), scriem numele obiectului(om1),  folosim semnul =, folosim referinta de new object
    //prin cuvantul new, apelam constructorul clasei pe care vrem sa o initializam ( Om() )
    Om om1 = new Om("Azeului", "Adam", 999999, 95);
    Om om2 = new Om("Azeului", "Eva");
    om2.setVarsta(999997);
    om2.setGreutate(65);
    Om om3 = new Om();
    om3.setNume("Aevei");
    om3.setPrenume("Cain");
    om3.setVarsta(25);
    om3.setGreutate(70);
    om3.setCuloarePar("verde");

    om1.afisareInformatiiOm();
    om2.afisareInformatiiOm();
    om3.afisareInformatiiOm();

    ArrayList<String> eleviiDinClasaOlimpica = new ArrayList<>();
    String x = "Mitica";
    eleviiDinClasaOlimpica.add(x);
  }

}
