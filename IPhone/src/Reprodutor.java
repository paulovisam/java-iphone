public class Reprodutor {
    public Boolean tocar;
    public Boolean pausar;
    public String musica;

    public void Tocar(Boolean tocar) {
        if(tocar) {
            this.tocar= true;
            this.pausar= false;
        }
        else {
            this.tocar=false;
            this.pausar=true;
        }
    }

    public void Pausar(Boolean pausar) {
        if(pausar) {
            this.tocar= false;
            this.pausar= true;
        }
        else {
            this.tocar=true;
            this.pausar=false;
        }
    }

    public void SelecionarMusica(String Musica) {
        if(this.musica!=Musica) {
            this.musica= Musica;
        }else
            System.out.println("Musica ja selecionada");
    }

    public Reprodutor(Boolean tocar, Boolean pausar, String selecionarMusica){
        this.tocar=tocar;
        this.pausar=pausar;
        this.musica=selecionarMusica;
    }

    public Boolean getTocar() {
        return tocar;
    }

    public void setTocar(Boolean tocar) {
        this.tocar = tocar;
    }

    public Boolean getPausar() {
        return pausar;
    }

    public void setPausar(Boolean pausar) {
        this.pausar = pausar;
    }
}
