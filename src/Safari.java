public class Safari implements IBrowser {
    @Override
    public void showPage(String url) {
        System.out.println("Mostrando página " + url);
    }

    @Override
    public void addNewTab(String url) {
        System.out.println("Adicionando nova aba com página " + url);
    }

    @Override
    public void refreshPage(int tabId) {
        System.out.println("Recarregando página na aba " + tabId);
    }
}
