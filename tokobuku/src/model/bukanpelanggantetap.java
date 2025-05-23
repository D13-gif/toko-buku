package model;

/**
 *
 * @author adivira123
 */
public class bukanpelanggantetap extends pelanggan {

    public bukanpelanggantetap(String n, String hp) {
        super(n, hp);
    }
    
    @Override
    public String toString() {
        return "\npelanggan Name : " + name + "\npelanggan Phone Number : " + hpNo;
    }
}
