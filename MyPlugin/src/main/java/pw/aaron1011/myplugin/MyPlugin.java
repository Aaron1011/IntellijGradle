package pw.aaron1011.myplugin;

import pw.aaron1011.somelibrary.SomeLibrary;

public class MyPlugin {

    public static void useLibrary() {
        SomeLibrary.sayHello();
    }

    public static void main(String[] args) {
        useLibrary();
    }
}
