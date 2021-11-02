package com.company.listadiamant;

public class AplicatieListaGen {

    public static void main(String[] args) {
        boolean dinFata = true;
        ListaGenerica2<String> lst = new ListaGenerica2<>();
        /*
        lst.insertLaUrma("Bucuresti");
        lst.insertInFata("Suceava");
        lst.insertLaUrma("Iasi");
        System.out.print("Orasele din lista:");
        for (String el : lst) {
            System.out.print(el + ", ");
        }
        System.out.println();
        */
        for (int i = 0; i < 21; i++) {
            String o = Integer.toString(i); // o=""+i
            if (i % 2 != 0)
                lst.insertInFata(o);
            else
                lst.insertLaUrma(o);
        }
        while(lst.size() != 0)
        {
            System.out.print("Numerele din lsta(" + lst.size() + "):");
            for (String el : lst)
            {
                System.out.print(Integer.parseInt(el) + ", ");
            }
            System.out.println();
            //4
            //lst.eliminaPrimul();

            //5
            //lst.eliminaUltimul();

            //6
            if(dinFata)
            {
                lst.eliminaPrimul();
                dinFata = false;
            }
            else
            {
                lst.eliminaUltimul();
                dinFata = true;
            }
        }
        System.out.println("Numerele din lsta(" + lst.size() + ')');

        //3
        /*
        System.out.println();
        System.out.print("Intregii din lsta x10: ");
        for (String el : lst) {
            System.out.print((Integer.parseInt(el) * 10) + ", ");
        }
        System.out.println();
        System.out.println("Lungimea listei este " + lst.size());
        */
    }
}