public class Main {
    public static void main(String[] args) {


        Bilgisayar temelBilgisayar = new TemelBilgisayar();
        System.out.println("Fiyat: " +  temelBilgisayar.fiyat() + "TL");
        System.out.println("Açıklama: " + temelBilgisayar.aciklama());

        //Ram Eklenmiş
        Bilgisayar ram8GBBilgisayar = new RamEkleDecorator(temelBilgisayar, 8);
        System.out.println("Fiyat: " + ram8GBBilgisayar.fiyat() + " TL");
        System.out.println("Açıklama: " + ram8GBBilgisayar.aciklama());

        Bilgisayar ram16GBBilgisayar = new RamEkleDecorator(temelBilgisayar, 16);
        System.out.println("\nFiyat: " + ram16GBBilgisayar.fiyat() + " TL");
        System.out.println("Açıklama: " + ram16GBBilgisayar.aciklama());

        Bilgisayar ram32GBBilgisayar = new RamEkleDecorator(temelBilgisayar, 32);
        System.out.println("\nFiyat: " + ram32GBBilgisayar.fiyat() + " TL");
        System.out.println("Açıklama: " + ram32GBBilgisayar.aciklama());


       //Depolama Birimi eklenen
        Bilgisayar depolama2TBBilgisayar = new DepolamaBirimEkleDecorator(temelBilgisayar);


        System.out.println("Fiyat: " + depolama2TBBilgisayar.fiyat() + " TL");
        System.out.println("Açıklama: " + depolama2TBBilgisayar.aciklama());


        Bilgisayar depolama1TBBilgisayar = new DepolamaBirimEkleDecorator(temelBilgisayar, 1);
        System.out.println("\nFiyat: " + depolama1TBBilgisayar.fiyat() + " TL");
        System.out.println("Açıklama: " + depolama1TBBilgisayar.aciklama());


        Bilgisayar depolama512GBBilgisayar = new DepolamaBirimEkleDecorator(temelBilgisayar, 512);
        System.out.println("\nFiyat: " + depolama512GBBilgisayar.fiyat() + " TL");
        System.out.println("Açıklama: " + depolama512GBBilgisayar.aciklama());

        // Depolama Birimi ve Ram Eklenen
        Bilgisayar depolamaRamliBilgisayar = new DepolamaBirimEkleDecorator(new RamEkleDecorator(new TemelBilgisayar()));

        Bilgisayar ramDepolama1TBBilgisayar = new DepolamaBirimEkleDecorator(new RamEkleDecorator(temelBilgisayar, 8), 1);
        System.out.println("\nFiyat: " + ramDepolama1TBBilgisayar.fiyat() + " TL");
        System.out.println("Açıklama: " + ramDepolama1TBBilgisayar.aciklama());

        Bilgisayar ramDepolama512GBBilgisayar = new DepolamaBirimEkleDecorator(new RamEkleDecorator(temelBilgisayar, 8), 512);
        System.out.println("\nFiyat: " + ramDepolama512GBBilgisayar.fiyat() + " TL");
        System.out.println("Açıklama: " + ramDepolama512GBBilgisayar.aciklama());

        Bilgisayar ramDepolama2TBBilgisayar = new DepolamaBirimEkleDecorator(new RamEkleDecorator(temelBilgisayar, 8), 2);
        System.out.println("\nFiyat: " + ramDepolama2TBBilgisayar.fiyat() + " TL");
        System.out.println("Açıklama: " + ramDepolama2TBBilgisayar.aciklama());

        Bilgisayar ram16GBDepolama1TBBilgisayar = new DepolamaBirimEkleDecorator(new RamEkleDecorator(temelBilgisayar, 16), 1);
        System.out.println("\nFiyat: " + ram16GBDepolama1TBBilgisayar.fiyat() + " TL");
        System.out.println("Açıklama: " + ram16GBDepolama1TBBilgisayar.aciklama());

        Bilgisayar ram16GBDepolama512GBBilgisayar = new DepolamaBirimEkleDecorator(new RamEkleDecorator(temelBilgisayar, 16), 512);
        System.out.println("\nFiyat: " + ram16GBDepolama512GBBilgisayar.fiyat() + " TL");
        System.out.println("Açıklama: " + ram16GBDepolama512GBBilgisayar.aciklama());

        Bilgisayar ram16GBDepolama2TBBilgisayar = new DepolamaBirimEkleDecorator(new RamEkleDecorator(temelBilgisayar, 16), 2);
        System.out.println("\nFiyat: " + ram16GBDepolama2TBBilgisayar.fiyat() + " TL");
        System.out.println("Açıklama: " + ram16GBDepolama2TBBilgisayar.aciklama());

        Bilgisayar ram32GBDepolama1TBBilgisayar = new DepolamaBirimEkleDecorator(new RamEkleDecorator(temelBilgisayar, 32), 1);
        System.out.println("\nFiyat: " + ram32GBDepolama1TBBilgisayar.fiyat() + " TL");
        System.out.println("Açıklama: " + ram32GBDepolama1TBBilgisayar.aciklama());

        Bilgisayar ram32GBDepolama512GBBilgisayar = new DepolamaBirimEkleDecorator(new RamEkleDecorator(temelBilgisayar, 32), 512);
        System.out.println("\nFiyat: " + ram32GBDepolama512GBBilgisayar.fiyat() + " TL");
        System.out.println("Açıklama: " + ram32GBDepolama512GBBilgisayar.aciklama());

        Bilgisayar ram32GBDepolama2TBBilgisayar = new DepolamaBirimEkleDecorator(new RamEkleDecorator(temelBilgisayar, 32), 2);
        System.out.println("\nFiyat: " + ram32GBDepolama2TBBilgisayar.fiyat() + " TL");
        System.out.println("Açıklama: " + ram32GBDepolama2TBBilgisayar.aciklama());

    }
}