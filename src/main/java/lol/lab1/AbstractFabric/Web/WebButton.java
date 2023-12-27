package lol.lab1.AbstractFabric.Web;


import lol.lab1.AbstractFabric.Button;

public class WebButton implements Button {
    public void render() {
        System.out.println("render WebButton");
    }

    public void onClick() {
        System.out.println("Event on click WebButton");
    }
}
