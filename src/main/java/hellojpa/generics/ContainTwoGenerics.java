package hellojpa.generics;

public class ContainTwoGenerics <I, O>{
    I i;
    O o;

    public String call1(){
        return i.toString();
    }

    public String call2(){
        return o.toString();
    }
}
