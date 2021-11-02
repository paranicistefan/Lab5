package com.company.listadiamant;

import java.util.Iterator;
import java.util.NoSuchElementException;
/**
 * @author PSG
 * @param <T> - tipul informatiei din elementele listei
 */
class IteratorLst<T> implements Iterator<T>{
    private Element<T> pcrt;

    public IteratorLst(Element<T> prim) {
        this.pcrt = prim;
    }
    @Override
    public boolean hasNext(){
        return pcrt==null ? false:true;
    }
    @Override
    public T next() throws NoSuchElementException {
        Element<T> el= pcrt;
        if(el==null) throw new NoSuchElementException();
        pcrt=pcrt.getUrm();
        return el.getInfo();
    }
}
