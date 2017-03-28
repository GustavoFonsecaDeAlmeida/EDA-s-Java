package eda9;

import java.util.Comparator;

public class ComparaElemento implements Comparator<Elemento> {
         
    @Override
    public int compare(Elemento c1, Elemento c2) {
        return (c1.getPrio() - c2.getPrio());
    }
}