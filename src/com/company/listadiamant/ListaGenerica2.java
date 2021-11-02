package com.company.listadiamant;

public class ListaGenerica2<T> extends ListaGenerica<T>{
    public T eliminaPrimul(){
        Element<T> elmnt = primul;
        primul = primul.getUrm();
        count--;
        return elmnt.getInfo();
    }
    public T eliminaUltimul(){
        Element<T> elmnt = primul;
        Element<T> ultimulElmnt = ultimul ;
        if(primul==ultimul)
        {
            primul=ultimul=null;
            count--;
            return ultimulElmnt.getInfo();
        }
        while (elmnt.getUrm() != ultimul)
        {
            elmnt = elmnt.getUrm();
        }
        ultimul = elmnt;
        ultimul.setUrm(null);
        count--;
        return ultimulElmnt.getInfo();
    }
}
