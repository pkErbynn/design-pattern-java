package objectCompositionExample;

// Aim: Adapt turkey to a duck
// ...a turkey acting like a duck (turkey will conform to duck's interface ) even though they are incompatible
// ...by modifying turkey to a duck
// means, turkey is the adopter, duck = Adaptee / Target

public class TurkeyAdapter implements IDuck {   // duck as target
    ITurkey turkey; // turkey as source,x needed for conversions. uses composition

    // Adopter class (that needs to be wrapped) is passed as constructor parameter
    public TurkeyAdapter(ITurkey turkey) {  // Adapter class needs an instance of the turkey adopter
        this.turkey = turkey;
    }

    @Override
    public void quack() {   // the actual turkey-to-duck conversion
        this.turkey.gobble();   // since turkey can't quack, its gobble will be translated to gobble
    }

    @Override
    public void fly() {   // since turkey(the adopter) can't fly long distance...it will fly 5 short distances to simulate a long one
        int i = 0;
        while (i < 5) {
            turkey.fly();
            i ++;
        }
    }
}
