public interface IBrowser {
    public void showPage(String url);
    public void addNewTab(String url);
    public void refreshPage(int tabId);
}
