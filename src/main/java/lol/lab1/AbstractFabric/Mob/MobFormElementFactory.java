package lol.lab1.AbstractFabric.Mob;


import lol.lab1.AbstractFabric.FormElementFactory;
import lol.lab1.AbstractFabric.Button;
import lol.lab1.AbstractFabric.Checkbox;
import lol.lab1.AbstractFabric.Input;

public class MobFormElementFactory implements FormElementFactory {
    public Button createButton() {
        return new MobButton();
    }

    public Checkbox createCheckbox() {
        return new MobCheckbox();
    }

    public Input createInput() {
        return new MobInput();
    }
}
