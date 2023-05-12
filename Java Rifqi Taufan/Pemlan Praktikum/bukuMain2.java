import java.util.Scanner;
public class bukuMain2 {
    private static final Scanner input = new Scanner(System.in);
    public static void main (String[] args) {

        // tambahan index untuk atribut sinopsis.
        String[][] bukuTeknologi = {{"Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", "464", "2008", "Had he known what was going to happen, he would have never stepped into the shower."},
                                    {"Code Complete: A Practical Handbook of Software Construction", "Steve McConnell", "914", "1993", "The tortoise jumped into the lake with dreams of becoming a sea turtle."},
                                    {"The Design of Everyday Things", "Donald A. Norman", "370", "2013", "There have been days when I wished to be separated from my body, but today wasn't one of those days."},
                                    {"The Art of Computer Programming", "Donald E. Knuth", "672", "1997", "He ran out of money, so he had to stop playing poker."},
                                    {"Java Experiment in Google Company", "Muhammad Rifqi Taufan", "1000", "2023", "The blinking lights of the antenna tower came into focus just as I heard a loud snap."}};
        
        String[][] bukuFilsafat = {{"Critique of Pure Reason", "Immanuel Kant", "856", "1781", "There aren't enough towels in the world to stop the sewage flowing from his mouth."},
                                   {"Thus Spoke Zarathustra", "Friedrich Nietzsche", "276", "1883", "The memory we used to share is no longer coherent."},
                                   {"The Nicomachean Ethics", "Aristotle", "400", "2004", "She moved forward only because she trusted that the ending she now was going through must be followed by a new beginning."},
                                   {"The Phenomenology of Spirit", "Georg Wilhelm Friedrich Hegel", "368", "2009", "I am happy to take your donation; any amount will be greatly appreciated."},
                                   {"Coffee Philosophy", "Dewi Lestari", "134", "2006", "Pair your designer cowboy hat with scuba gear for a memorable occasion."}};
        
        String[][] bukuSejarah = {{"A History of the World", "Andrew Marr", "500", "2014", "He knew it was going to be a bad day when he saw mountain lions roaming the streets."},
                                  {"The Rise and Fall of the Third Reich", "William L. Shirer", "1280", "1960", "Imagine his surprise when he discovered that the safe was full of pudding."},
                                  {"The Crusades: The Authoritative History of the War for the Holy Land", "Thomas Asbridge", "784", "2011", "It had been sixteen days since the zombies first attacked."},
                                  {"Guns, Germs, and Steel: The Fates of Human Societies", "Jared Diamond", "480", "1999", "Wisdom is easily acquired when hiding under the bed with a saucepan on your head."},
                                  {"M1 World Championship", "Evos", "43", "2019", "Tahun ini adalah tahun yang sering dijadikan sejarah karena itu terakhir kali Indonesia juara M World Championship."}};
                                
        String[][] bukuAgama = {{"A History of God", "Karen Armstrong", "460", "1993", "He learned the hardest lesson of his life and had the scars, both physical and mental, to prove it."},
                                {"The Reformation: A History", "Diarmaid MacCulloch", "832", "2003", "The tears of a clown make my lipstick run, but my shower cap is still intact."},
                                {"Islam: A Short History", "Karen Armstrong", "272", "2002", "His confidence would have bee admirable if it wasn't for his stupidity."},
                                {"The Gnostic Gospels", "Elaine Pagels", "182", "1989", "Buried deep in the snow, he hoped his batteries were fresh in his avalanche beacon."},
                                {"A History of the Jews", "Paul Johnson", "656", "1988", "If you don't like toenails, you probably shouldn't look at your feet."}};
        
        String[][] bukuPsikologi = {{"Thinking, Fast and Slow", "Daniel Kahneman", "499", "2011", "She tilted her head back and let whip cream stream into her mouth while taking a bath."},
                                    {"Flow: The Psychology of Optimal Experience", "Mihaly Csikszentmihalyi", "336", "2008", "There's an art to getting your way, and spitting olive pits across the table isn't it."},
                                    {"Emotional Intelligence", "Daniel Goleman", "352", "2005", "I was offended by the suggestion that my baby brother was a jewel thief."},
                                    {"The Social Animal", "David Brooks", "544", "1972", "He had a vague sense that trees gave birth to dinosaurs."},
                                    {"The Power of Habit", "Charles Duhigg", "371", "2012", "She learned that water bottles are no longer just to hold liquid, but they're also status symbols."}};
                                
        String[][] bukuPolitik = {{"Politics", "Aristotle", "184", "2009", "The complicated school homework left the parents trying to help their kids quite confused."},
                                  {"The Social Contract", "Jean-Jacques Rousseau", "118", "2019", "He was so preoccupied with whether or not he could that he failed to stop to consider if he should."},
                                  {"The Road to Serfdom", "Friedrich Hayek", "266", "1944", "He knew it was going to be a bad day when he saw mountain lions roaming the streets."},
                                  {"The End of History and the Last Man", "Francis Fukuyama", "418", "1992", "My secretary is the only person who truly understands my stamp-collecting obsession."},
                                  {"Das Kapital: A Critque of Political Economy", "Karl Marx", "200", "2011", "We have young kids who often walk into our room at night for various reasons including clowns in the closet."}};
                                  
        String[][] bukuFiksi = {{"To Kill a Mockingbird", "Harper Lee", "281", "1960", "All she wanted was the answer, but she had no idea how much she would hate it."},
                                {"Pride and Prejudice", "Jane Austen", "432", "1813", "Harrold felt confident that nobody would ever suspect his spy pigeon."},
                                {"The Great Gatsby", "F. Scott Fitzgerald", "208", "2004", "The best part of marriage is animal crackers with peanut butter."},
                                {"The Lord of the Rings", "J. R. R. Tolkien", "1178", "1954", "He was surprised that his immense laziness was inspirational to others."},
                                {"The Alchemist", "Paulo Coelho", "218", "1988", "This is the last random sentence I will be writing and I am going to stop mid-sent."}};
    
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
                Copy(bukuTeknologi, "TEKNOLOGI");
                break;

                case 2 : 
                setKategoriKeseluruhan(bukuFilsafat, "FILSAFAT");
                Copy(bukuFilsafat, "FILSAFAT");
                break;

                case 3 : 
                setKategoriKeseluruhan(bukuSejarah, "SEJARAH");
                Copy(bukuSejarah, "SEJARAH");
                break;

                case 4 : 
                setKategoriKeseluruhan(bukuAgama, "AGAMA");
                Copy(bukuAgama, "AGAMA");
                break;

                case 5 : 
                setKategoriKeseluruhan(bukuPsikologi, "PSIKOLOGI");
                Copy(bukuPsikologi, "PSIKOLOGI");
                break;

                case 6 : 
                setKategoriKeseluruhan(bukuPolitik, "POLITIK");
                Copy(bukuPolitik, "POLITIK");
                break;

                case 7 : 
                setKategoriKeseluruhan(bukuFiksi, "FIKSI");
                Copy(bukuFiksi, "FIKSI");
                break;

            }
        }
        while (pilihan >= 1 && pilihan <= 7);
        System.out.println("TIDAK ADA PILIHAN");
    }
        
    public static void setKategoriKeseluruhan(String[][] kategori, String kategoriBuku) {
        bukuClass2 seluruh = new bukuClass2();

        seluruh.setKategoriBuku(kategoriBuku);

        for (int i = 0; i < kategori.length; i++) {
            seluruh.setJudulBuku(kategori[i][0]);
            seluruh.setPenulisBuku(kategori[i][1]);
            seluruh.setJumlahHalaman(kategori[i][2]);
            seluruh.setTahunTerbit(kategori[i][3]);
            seluruh.setSinopsisBuku(kategori[i][4]);
            seluruh.tampilan();
        }
    }

    // method copy.
    public static void Copy(String[][] kategori, String kategoriBuku) {
        bukuClass2 seluruh = new bukuClass2();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Judul buku = ");
        String judul = input.nextLine();
        int i = seluruh.cariCopy(judul, kategori);

        bukuClass2 hasilCopy = new bukuClass2(kategori[i][0], kategori[i][1], kategoriBuku, kategori[i][2], kategori[i][3], kategori[i][4]);

        System.out.println();
        System.out.println("HASIL COPY BUKU");
        System.out.println();
        hasilCopy.tampilan();
    }
}
