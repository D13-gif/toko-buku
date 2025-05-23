package model;

/**
 *
 * @author adivira123
 */
public abstract class pelanggan {
    protected String name;
    protected String hpNo;
    
    /**
     *
     * @param n
     * @param hp
     */
    public pelanggan (String n, String hp){
        name = n;
        hpNo = hp;
    }

    public String getName() {
        return name;
    }

    public String getHpNo() {
        return hpNo;
    }
}
