package layout;
// Andrey Matheu
import javax.swing.JFrame;

import views.AdicionarProduto;

public class Janela extends JFrame {

    public Janela() {
        super("SISTEMAS DISTRIBUÍDOS");
        add(new AdicionarProduto());
        setSize(280, 400);
        setVisible(true);
    }

}
