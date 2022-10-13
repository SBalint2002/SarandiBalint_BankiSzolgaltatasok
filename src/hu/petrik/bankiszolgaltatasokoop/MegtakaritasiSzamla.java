package hu.petrik.bankiszolgaltatasokoop;

public class MegtakaritasiSzamla extends Szamla {
    private double kamat;
    public static double alapKamat;

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    public double getKamat() {
        return kamat;
    }

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    @Override
    public boolean kivesz(int osszeg) {
        if (getAktualisEgyenleg() - osszeg < 0) {
            return false;
        } else {
            this.aktualisEgyenleg -= osszeg;
            return true;
        }
    }

    public void kamatJovairas() {
        befizet((int)kamat*this.getAktualisEgyenleg());
    }
}