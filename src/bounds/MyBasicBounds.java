package bounds;

interface CanPlay {
    String play();
}

class Violin<T extends CanPlay> {
    T violin;

    public Violin(T violin) {
        this.violin = violin;
    }

    public T getViolin() {
        return violin;
    }

    String displayPlaying() {
        return violin.play();
    }
}

class Price {
    double price = 14.88d;
}

class ViolinwithPrice<T extends Price & CanPlay > {
    T item;

    public ViolinwithPrice(T item) {
        this.item = item;
    }
    T getItem() { return item;}

    String displayPlaying(){
        return item.play();
    }

    double getPrice(){return item.price;}
}

class Bounded2 extends Price implements CanPlay{
    @Override
    public String play() {
        return "Is playing";
    }
}

public class MyBasicBounds {
    public static void main(String[] args) {
        ViolinwithPrice<Bounded2> violinwithPrice =
                new ViolinwithPrice<>(new Bounded2());

        System.out.println( violinwithPrice.displayPlaying());
        System.out.println(violinwithPrice.getPrice());
    }
}
