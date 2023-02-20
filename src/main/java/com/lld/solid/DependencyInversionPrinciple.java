package com.lld.solid;
// Class should depend on interfaces rather than concrete classes
interface Keyboard{
    public void type();
}
interface Mouse{
    public void click();
}

class WiredKeyboard implements Keyboard{
    @Override
    public void type() {

    }
}

class WirelessMouse implements Mouse{
    @Override
    public void click() {

    }
}

class MacbookOld{
    private final WiredKeyboard keyboard;
    private final WirelessMouse mouse;

    MacbookOld(WiredKeyboard keyboard, WirelessMouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

}

// Solution

class Macbook{
    private final Keyboard keyboard;
    private final Mouse mouse;

    public Macbook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}

public class DependencyInversionPrinciple {

}
