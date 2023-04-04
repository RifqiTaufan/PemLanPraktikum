import java.util.Scanner;
public class bukuMain {
    private static final Scanner input = new Scanner(System.in);
    public static void main (String[] args) {

        String[][] bukuTeknologi = {{"Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", "464", "2008"},
                                    {"Code Complete: A Practical Handbook of Software Construction", "Steve McConnell", "914", "1993"},
                                    {"The Design of Everyday Things", "Donald A. Norman", "370", "2013"},
                                    {"The Art of Computer Programming", "Donald E. Knuth", "672", "1997"},
                                    {"Java Experiment in Google Company", "Muhammad Rifqi Taufan", "1000", "2023"}};
        
        String[][] bukuFilsafat = {{"Critique of Pure Reason", "Immanuel Kant", "856", "1781"},
                                   {"Thus Spoke Zarathustra", "Friedrich Nietzsche", "276", "1883"},
                                   {"The Nicomachean Ethics", "Aristotle", "400", "2004"},
                                   {"The Phenomenology of Spirit", "Georg Wilhelm Friedrich Hegel", "368", "2009"},
                                   {"Coffee Philosophy", "Dewi Lestari", "134", "2006"}};
        
        String[][] bukuSejarah = {{"A History of the World", "Andrew Marr", "500", "2014"},
                                  {"The Rise and Fall of the Third Reich", "William L. Shirer", "1280", "1960"},
                                  {"The Crusades: The Authoritative History of the War for the Holy Land", "Thomas Asbridge", "784", "2011"},
                                  {"Guns, Germs, and Steel: The Fates of Human Societies", "Jared Diamond", "480", "1999"},
                                  {"M1 World Championship", "Evos", "43", "2019"}};
                                
        String[][] bukuAgama = {{"A History of God", "Karen Armstrong", "460", "1993"},
                                {"The Reformation: A History", "Diarmaid MacCulloch", "832", "2003"},
                                {"Islam: A Short History", "Karen Armstrong", "272", "2002"},
                                {"The Gnostic Gospels", "Elaine Pagels", "182", "1989"},
                                {"A History of the Jews", "Paul Johnson", "656", "1988"}};
        
        String[][] bukuPsikologi = {{"Thinking, Fast and Slow", "Daniel Kahneman", "499", "2011"},
                                    {"Flow: The Psychology of Optimal Experience", "Mihaly Csikszentmihalyi", "336", "2008"},
                                    {"Emotional Intelligence", "Daniel Goleman", "352", "2005"},
                                    {"The Social Animal", "David Brooks", "544", "1972"},
                                    {"The Power of Habit", "Charles Duhigg", "371", "2012"}};
                                
        String[][] bukuPolitik = {{"Politics", "Aristotle", "184", "2009"},
                                  {"The Social Contract", "Jean-Jacques Rousseau", "118", "2019"},
                                  {"The Road to Serfdom", "Friedrich Hayek", "266", "1944"},
                                  {"The End of History and the Last Man", "Francis Fukuyama", "418", "1992"},
                                  {"Das Kapital: A Critque of Political Economy", "Karl Marx", "200", "2011"}};
                                  
        String[][] bukuFiksi = {{"To Kill a Mockingbird", "Harper Lee", "281", "1960"},
                                {"Pride and Prejudice", "Jane Austen", "432", "1813"},
                                {"The Great Gatsby", "F. Scott Fitzgerald", "208", "2004"},
                                {"The Lord of the Rings", "J. R. R. Tolkien", "1178", "1954"},
                                {"The Alchemist", "Paulo Coelho", "218", "1988"}};
        int pilihan;
        do {
            System.out.println("1. Teknologi");
            System.out.println("2. Filsafat");
            System.out.println("3. Sejarah");
            System.out.println("4. Agama");
            System.out.println("5. Psikologi");
            System.out.println("6. Politik");
            System.out.println("7. Fiksi");
            System.out.print("Pilih 1 kategori buku : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1 : 
                setKategoriKeseluruhan(bukuTeknologi, "TEKNOLOGI");
                break;

                case 2 : 
                setKategoriKeseluruhan(bukuFilsafat, "FILSAFAT");
                break;

                case 3 : 
                setKategoriKeseluruhan(bukuSejarah, "SEJARAH");
                break;

                case 4 : 
                setKategoriKeseluruhan(bukuAgama, "AGAMA");
                break;

                case 5 : 
                setKategoriKeseluruhan(bukuPsikologi, "PSIKOLOGI");
                break;

                case 6 : 
                setKategoriKeseluruhan(bukuPolitik, "POLITIK");
                break;

                case 7 : 
                setKategoriKeseluruhan(bukuFiksi, "FIKSI");
                break;

            }
        }
        while (pilihan >= 1 && pilihan < 7);
        System.out.println("TIDAK ADA PILIHAN");
    }
        
    public static void setKategoriKeseluruhan(String[][] kategori, String kategoriBuku) {
        bukuClass seluruh = new bukuClass();

        seluruh.setKategoriBuku(kategoriBuku);

        for (int i = 0; i < kategori.length; i++) {
            seluruh.setJudulBuku(kategori[i][0]);
            seluruh.setPenulisBuku(kategori[i][1]);
            seluruh.setJumlahHalaman(kategori[i][2]);
            seluruh.setTahunTerbit(kategori[i][3]);
            seluruh.tampilan();
        }
    }
}