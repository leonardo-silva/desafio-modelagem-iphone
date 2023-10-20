public class KillerApp implements IPhoneCall {
    @Override
    public void makeCall(String phoneNumber) {
        System.out.println("Ligando para " + phoneNumber);
    }

    @Override
    public void answerCall(String phoneNumber) {
        System.out.println("Atendendo chamada de " + phoneNumber);
    }

    @Override
    public void initVoiceMail(String phoneNumber) {
        System.out.println("Iniciando gravação de correio de voz para " + phoneNumber);
    }
}
