public class Iphone implements MusicPlayer, InternetBrowser, SmartPhone {
    

    //Funções do Navegador de Internet!
    @Override
    public void showPage(String url){
        System.out.println("Acessando a página: " + url + " no Iphone!");
    }

    @Override
    public void addNewTab(){
        System.out.println("Adicionando nova aba!");
    }

    @Override
    public void refreshPage(){
        System.out.println("Recarregando a página!");
    }
    

    //Funções do Player de Música
    @Override
    public void selectMusic(String music){
        System.out.println("Selecionada a música: " + music + "!");
    }

    @Override
    public void play(){
        System.out.println("Reproduzindo a música selecionada no Iphone!");
    };

    @Override
    public void pause(){
        System.out.println("Pausando a música no Iphone!");
    }


    //Funções do SmartPhone
    @Override
    public void call(String number){
        System.out.println("Ligando para o número " + number + " no Iphone!");
    }
    
    @Override
    public void answer(){
        System.out.println("Atendendo ligação no Iphone!");
    }

    public void startVoiceMail(){
        System.out.println("Iniciando o Cooreio de Voz no Iphone!");
    }
}
