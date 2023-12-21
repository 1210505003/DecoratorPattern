public class DepolamaBirimEkleDecorator extends BilgisayarDecorator{
    private int depolamaMiktar;
    public DepolamaBirimEkleDecorator(Bilgisayar bilgisayar){
        super(bilgisayar);
        this.depolamaMiktar = 2;
    }
    public DepolamaBirimEkleDecorator(Bilgisayar bilgisayar, int depolamaMiktar){
        super(bilgisayar);
        this.depolamaMiktar = depolamaMiktar;
    }

    @Override
    public double fiyat() {
        if (depolamaMiktar == 1) {
            return super.fiyat() + 3999;
        } else if (depolamaMiktar == 512) {
            return super.fiyat() + 2999;
        } else {
            return super.fiyat() + 4999;
        }
    }

    @Override
    public String aciklama() {
        if (depolamaMiktar == 512) {
            return super.aciklama() + " 512 GB SSD Disk eklendi";
        } else {
            return super.aciklama() + " " + depolamaMiktar + " TB SSD Disk eklendi";
        }
}
}