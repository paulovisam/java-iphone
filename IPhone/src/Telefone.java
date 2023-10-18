public class Telefone {
    public Boolean ligar;
    public Boolean atender;
    public Boolean iniciarCorreioVoz;

    public Telefone(Boolean ligar, Boolean atender, Boolean iniciarCorreioVoz) {
        this.ligar = ligar;
        this.atender = atender;
        this.iniciarCorreioVoz = iniciarCorreioVoz;
    }
    public Boolean getLigar() {
        return ligar;
    }
    public void setLigar(Boolean ligar) {
        this.ligar = ligar;
    }
    public Boolean getAtender() {
        return atender;
    }
    public void setAtender(Boolean atender) {
        this.atender = atender;
    }
    public Boolean getIniciarCorreioVoz() {
        return iniciarCorreioVoz;
    }
    public void setIniciarCorreioVoz(Boolean iniciarCorreioVoz) {
        this.iniciarCorreioVoz = iniciarCorreioVoz;
    }
}
