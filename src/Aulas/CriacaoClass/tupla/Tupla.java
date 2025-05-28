package Aulas.CriacaoClass.tupla;

public class Tupla <F, S> {
    private F pri;
    private S seg;
    public Tupla(F pri, S seg) {
        this.pri = pri;
        this.seg = seg;
    }
    public F getPri() {
        return pri;
    }
    public void setPri(F pri) {
        this.pri = pri;
    }
    public S getSeg() {
        return seg;
    }
    public void setSeg(S seg) {
        this.seg = seg;
    }
    @Override
    public String toString() {
        return "pri=" + pri + ", seg=" + seg;
    }


    

}
