public class Main {
    public static void main(String[] args) {
        System.out.println("\t<<< Desafio Modelagem iPhone >>>\n");

        IPlayer myIPod = new IPod();
        myIPod.play(12);
        myIPod.pause(12);
        myIPod.selectFromCatalog();
        System.out.println();

        IPlayer myIMovie = new IMovie();
        myIMovie.play(122);
        myIMovie.pause(122);
        myIPod.selectFromCatalog();
        System.out.println();

        IPhoneCall myIPhone = new KillerApp();
        myIPhone.makeCall("+55 31 9993-9900");
        myIPhone.answerCall("+55 31 9993-9900");
        myIPhone.initVoiceMail("+55 31 9993-9900");
        System.out.println();

        IBrowser myBrowser = new Safari();
        myBrowser.showPage("https://angular.io/guide/component-overview");
        myBrowser.addNewTab("https://angular.io/guide/component-overview");
        myBrowser.refreshPage(234);
    }
}