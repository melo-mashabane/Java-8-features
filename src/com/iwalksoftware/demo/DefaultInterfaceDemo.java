package com.iwalksoftware.demo;

class InterfaceImpl implements InterfaceOne{

    @Override
    public void methodOne(String str) {
        System.out.println("Calling from:  Inner Class InterfaceImpl : " +  str);
    }
}

public class DefaultInterfaceDemo {
    public DefaultInterfaceDemo() {
    }

    public static void main(String[] args) {

        /*
            Accessing InterfaceOne static method.
            This method is not required to be overridden.
         */
        InterfaceOne.print("Welcome iWalk. A step by step guide on 'How-To'");

        // Using overridden method.
        InterfaceOne obj = new InterfaceImpl();
        obj.methodOne("iWalk");

        // Accessing InterfaceOne default method.
        obj.log("Which log is being run?");



    }
}
