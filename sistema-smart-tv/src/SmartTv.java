public class SmartTv {
    boolean ligada = false;
    int canal=1;
    int volume= 25;

//MUDAR O CANAL DA TV
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void subirCanal(){
        canal++;
    }
    public void descerCanal(){
        canal++;
    }
//VOLUME DA TV
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
//TV LIGADA OU DESLIGADA
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

}
