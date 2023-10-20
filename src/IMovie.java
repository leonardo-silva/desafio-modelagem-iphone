import java.util.Map;

public class IMovie implements IPlayer {
    private Map<Integer, String> catalog;

    @Override
    public void play(int id) {
        System.out.println("Exibindo filme id = " + id);
    }

    @Override
    public void pause(int id) {
        System.out.println("Pausando filme id = " + id);
    }

    @Override
    public void selectFromCatalog() {
        System.out.println("Selecionando filme do catálogo");
    }
}
