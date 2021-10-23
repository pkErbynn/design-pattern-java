package pkerb.drawingChallenge_2;

// abstract implementor
public interface IColor {
    public void fillWithColor(int border);
}

class RedColor implements IColor {

    @Override
    public void fillWithColor(int border) {
        System.out.println("filling with red color with " + border + " border width");
    }
}

class GreenColor implements IColor {

    @Override
    public void fillWithColor(int border) {
        System.out.println("filling with green color with " + border + " border width");
    }
}

// now these concrete classes can be extended and varied
