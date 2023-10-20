import java.util.Map;

public class IPod implements IPlayer{
    private Map<Integer, String> catalog;

    @Override
    public void play(int id) {
        System.out.println("Tocando música id = " + id);
    }

    @Override
    public void pause(int id) {
        System.out.println("Pausando música id = " + id);
    }

    @Override
    public void selectFromCatalog() {
        System.out.println("Selecionando música do catálogo");
    }
}
