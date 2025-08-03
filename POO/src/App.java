public class App {
    public static void main(String[] args) {
        
        //Instância de Iphone
        Iphone myphone = new Iphone();

        System.out.println("\nUtilizando o Iphone!");
        System.out.println("\n----------------------------------\n");

        //Funções do Internet Explorer
        System.out.println("Utilizando o Navegador de Internet!");
        System.out.println("\n----------------------------------\n");
        myphone.showPage("www.dio.me");
        myphone.addNewTab();
        myphone.refreshPage();
        System.out.println("\n----------------------------------\n");

        //Funções do Player
        System.out.println("Utilizando o Player de Música!");
        System.out.println("\n----------------------------------\n");
        myphone.selectMusic("Raimundos: Mulher de fases");
        myphone.play();
        myphone.pause();
        System.out.println("\n----------------------------------\n");

         //Funções do SnartPhone
        System.out.println("Utilizando as funções do SmartPhone!");
        System.out.println("\n----------------------------------\n");
        myphone.call("+55 021 97551-5755");
        myphone.answer();
        myphone.startVoiceMail();
        System.out.println("\n----------------------------------\n");
    }
}
