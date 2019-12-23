package composite;

import java.util.ArrayList;

/**
 * @author sefamertkaya
 */
public class Computer implements Part {

    private ArrayList<Part> parcaListem = new ArrayList<Part>();


    public void addPart(final Part part) {
        parcaListem.add(part);
    }

    @Override
    public int price() {
        int price = 0;
        for (int i = 0; i < parcaListem.size(); i++) {
            price += parcaListem.get(i).price();
        }
        return price;
    }
}
