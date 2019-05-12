package design.patterns.structural.adapter.class_implementation;

public interface IntegerValueInterface {

    public int getInteger();
}

class IntegerValue implements IntegerValueInterface {
    @Override
    public int getInteger() {
        return 5;
    }
}

/**
 * Adapter pattern using Class inheritance
 **/
class ClassAdapter extends IntegerValue {

    @Override
    public int getInteger() {
        return 2 + super.getInteger();
    }
}

/**
 * Adapter pattern using composition
 */
class ObjectAdapter {

    private IntegerValueInterface myInt;

    public ObjectAdapter(IntegerValueInterface myInt) {
        this.myInt = myInt;
    }

    public int getInteger() {
        return 2 + this.myInt.getInteger();
    }
}
