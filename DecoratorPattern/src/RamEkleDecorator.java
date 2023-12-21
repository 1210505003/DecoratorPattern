public class RamEkleDecorator extends BilgisayarDecorator{

    private int ramMiktar;
    public RamEkleDecorator(Bilgisayar bilgisayar) {
        super(bilgisayar);
        this.ramMiktar = 8;
    }

    public RamEkleDecorator(Bilgisayar bilgisayar, int ramMiktar) {
        super(bilgisayar);
        this.ramMiktar = ramMiktar;
    }

    @Override
    public double fiyat() {
        // RAM miktarına göre fiyat hesapla
        if (ramMiktar == 16) {
            return super.fiyat() + 4500;
        } else if (ramMiktar == 32) {
            return super.fiyat() + 6500;
        } else {
            return super.fiyat() + 2500;
        }
    }

    @Override
    public String aciklama() {
        return super.aciklama() +" " +ramMiktar+ " GB RAM eklendi..";
    }
}
