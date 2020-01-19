package day3.sito;

public class SitoEratostenesa {

    public static void main(String[] args) {
        SitoEratostenesa sitoExample = new SitoEratostenesa();
        boolean[] tablica = sitoExample.createTableWithSth(50);
        sitoExample.wypiszTablice(sitoExample.doSito(tablica));

    }

    private boolean[] createTableWithSth(int length) {
        boolean[] tableOfbooleans = new boolean[length];
        for (int i = 2; i < length; i++) {
            tableOfbooleans[i] = true;
        }
        return tableOfbooleans;
    }

    private boolean[] doSito(boolean[] table) {
        for (int i = 2; i < table.length; i++) {
            if (table[i] == true) {
                for (int j = i * 2; j < table.length; j += i) {
                    table[j] = false;
                }
            }
        }
        return table;
    }

    private void wypiszTablice(boolean[] table) {
        for (int i = 2; i < table.length; i++) {
            if (table[i]) {
                System.out.print(i + ", ");
            }
        }
    }

}
