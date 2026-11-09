
void main(){}





public class RossiGoException extends Exception{
    public RossiGoException(String message){
        super(message);
    }
}
public class VeicoloNonDisponibile extends RossiGoException{
    public VeicoloNonDisponibile(String message){
        super(message);
    }
}
public class BatteriaScaricaException extends RossiGoException{
    public BatteriaScaricaException(String message){
        super(message);
    }
}
public class CreditoInsufficienteException extends RossiGoException{
    public CreditoInsufficienteException(String message){
        super(message);
    }
}
public class UtenteNonTrovatoException extends RossiGoException{
    public UtenteNonTrovatoException(String message){
        super(message);
    }
}
public class CodiceFiscaleNonValido extends RossiGoException{
    public CodiceFiscaleNonValido(String message){
        super(message);
    }
}


public abstract class Veicolo{
    private String codice;
    private double lvlBatteria;
    private String  stato;

    public Veicolo(){
        codice = "";
        lvlBatteria = 0;
        stato = "";
    }

    public Veicolo(String codice, double lvlBatteria, String stato){
        this.codice = codice;
        this.lvlBatteria = lvlBatteria;
        this.stato = stato;
    }

    public abstract double calcolaCosto(int minuti);
    public abstract double consumoBatteriPerMinuto();

    public String getCodice() {
        return codice;
    }
    public double getLvlBatteria() {
        return lvlBatteria;
    }
    public String getStato() {
        return stato;
    }


}
public class Bici extends Veicolo{

    private int nMarce;

    public Bici(){
        super();
        nMarce = 0;
    }

    public Bici(String codice, double lvlBatteria, String stato, int marce){
        super(codice, lvlBatteria, stato);
        this.nMarce = marce;
    }

    @Override
    public double calcolaCosto(int minuti) {
        return minuti * 0.15;
    }
    @Override
    public double consumoBatteriPerMinuto() {
        return (getLvlBatteria()/0.07)*100;
    }

    @Override
    public String toString() {
        return super.toString() + nMarce;
    }
}
public class Monopattino extends Veicolo{

    private int vMax;

    public Monopattino(){
        super();
        vMax = 0;
    }

    public Monopattino(String codice, double lvlBatteria, String stato, int vMax){
        super(codice, lvlBatteria, stato);
        this.vMax = vMax;
    }

    @Override
    public double calcolaCosto(int minuti) {
        return minuti * 0.25;
    }
    @Override
    public double consumoBatteriPerMinuto() {
        return (getLvlBatteria()/0.15)*100;
    }

    @Override
    public String toString() {
        return super.toString() + vMax;
    }
}
public class Utente{
    private int id;
    private String nome;
    private String email;
    private String cFiscale;
    private double credito;

    public Utente(){
        id =  0;
        nome = "";
        email = "";
        cFiscale = "";
        credito = 0;
    }

    public Utente(int id, String nome, String email, String cFiscale, double credito){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cFiscale = cFiscale;
        this.credito = credito;
    }

    public int getId() {
        return id;
    }
    public String getCodFiscale() {
        return cFiscale;
    }
    public double getCredito() {
        return credito;
    }
    public void setCredito(double credito){
        this.credito = credito;

    }

    @Override
    public String toString() {
        return id + "\t" + nome + "\t" + email + "\t" + cFiscale;
    }
}
/*public class Noleggio{
    Utente utente;
    Veicolo veicolo;
    private String oInizio;
    private String oFine;

    public Noleggio(){
        oInizio = "";
        oFine = "";
    }

    public Noleggio(Utente u, Veicolo v, String inizio, String fine){
        this.oInizio = inizio;
        this.oFine = fine;
    }
    public String getOInizio() {
        return oInizio;
    }
    public String getOFine() {
        return oFine;
    }

    public String NNoleggio(Utente u, Veicolo v,String oinizio,String ofine){
        return u.toString() +"\t"+ v.toString() +"\t"+ oinizio +"\t"+ ofine;
    }
}*/
public class FlottaService{
    ArrayList<Veicolo> veiculos = new ArrayList<>();
    ArrayList<Utente> utentes = new ArrayList<>();

    Utente utente;
    Veicolo veicolo;

    public void registraVeicolo(Veicolo veicolo){
        veiculos.add(veicolo);
    }
    public void registraUtente(Utente utente){
        utentes.add(utente);
    }
    public void SbloccaVeicolo(String codice, String idUtente) throws VeicoloNonDisponibile, BatteriaScaricaException{



    }
}