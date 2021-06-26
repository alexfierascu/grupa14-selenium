package recap.model;

public class Om {

  private String nume;
  private String prenume;
  private int varsta;
  private double greutate;
  private String culoarePar;

  public String getCuloarePar() {
    return culoarePar;
  }

  public void setCuloarePar(String culoarePar) {
    this.culoarePar = culoarePar;
  }

  public String getNume() {
    return nume;
  }

  public void setNume(String nume) {
    this.nume = nume;
  }

  public String getPrenume() {
    return prenume;
  }

  public void setPrenume(String prenume) {
    this.prenume = prenume;
  }

  public int getVarsta() {
    return varsta;
  }

  public void setVarsta(int varsta) {
    this.varsta = varsta;
  }

  public double getGreutate() {
    return greutate;
  }

  public void setGreutate(double greutate) {
    this.greutate = greutate;
  }

  //constructor implicit - care nu are parametrii
  //metoda speciala pentru a construi un obiect
  //ea mereu (aproape) este public
  public Om() {
  }


  //constructor explicit - care are parametrii
  //metoda speciala pentru a construi un obiect
  //ea mereu (aproape) este public
  public Om(String numeOm, String prenumeOm, int varstaOm,
      double greutateOm) {
    this.nume = numeOm;
    this.prenume = prenumeOm;
    this.varsta = varstaOm;
    this.greutate = greutateOm;
  }

  public Om(String numeOm, String prenumeOm) {
    this.nume = numeOm;
    this.prenume = prenumeOm;
  }

  public void afisareInformatiiOm() {
    System.out.println("Omul nostru  " + prenume + " " + nume + " are varsta de " + varsta
        + " si are o greutate de " + greutate);
  }
}