package Metodos.RepositorioMetodoJava;

public class SmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

/**
 * @param novoCanal
 */
public void mudarCanal (int novoCanal){
    canal = novoCanal;
}

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

        /**
         * 
        */
        public void aumentarVolume() {
        System.out.print ("Aumentado o volume para:" + volume);
        volume ++ ;
        }
        /**
         * 
         */
        public void diminuirVolume() {
        System.out.print ("Diminuindo o volume para:" + volume);
        volume --;
        }

            /**
             * 
            */
            public void ligar(){
            ligada = true;
            }
            /**
             * 
             */
            public void desligar(){
            desligada = false;
            }
    
}
