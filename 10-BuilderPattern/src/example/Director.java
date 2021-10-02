package example;

// Directory has the builder algo to construct a prod

public class Director {
    IBuilder builder;

    public void Construct(IBuilder builder){
        this.builder =  builder;
        builder.createBody();
        builder.createHeadlight();
        builder.insertWheels();
    }

    // director doesn't show the product, the concrete shows its self
}
