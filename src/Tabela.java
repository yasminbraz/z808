import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Tabela {

    private HashMap<String, String[]> tabela;

    public Tabela() {
        this.tabela = new HashMap<>();
    }

    public HashMap<String, String[]> getTabela() {
        return tabela;
    }

    public void setTabela(HashMap<String, String[]> tabela) {
        this.tabela = tabela;
    }
}
