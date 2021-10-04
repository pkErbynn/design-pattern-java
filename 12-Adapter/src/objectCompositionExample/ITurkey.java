package objectCompositionExample;

public interface ITurkey {
    public void gobble();
    public void fly();
}

class ForeignTurkey implements ITurkey {

    @Override
    public void gobble() {
        System.out.println("Foreign turkey: gobble gobble ");
    }

    @Override
    public void fly() {
        System.out.println("Foreign turkey: flying at short distance");
    }
}

