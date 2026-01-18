package pl.wsb.fitnesstracker.livecoding.ioc;

/**
 * Demonstrates code structure without Inversion of Control (IoC).
 * In this example, {@link Foo} is responsible for creating its own dependency {@link Bar},
 * leading to tight coupling between the two classes.
 */
public class WithoutIoC {

    /**
     * The main method to execute the demonstration.
     *
     * @param args command-line arguments (not used).
     */
    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.useBar();
    }

    /**
     * A dependency class that performs an action.
     */
    static class Bar {
        /**
         * Performs an action and prints a message to the console.
         */
        public void doSomething() {
            System.out.println("Doing something in Bar");
        }
    }

    /**
     * A class that depends on {@link Bar} and manages its lifecycle directly.
     */
    static class Foo {
        private Bar bar;

        /**
         * Constructs a new Foo instance.
         * This constructor directly instantiates {@link Bar}, creating a hard dependency.
         */
        public Foo() {
            this.bar = new Bar(); // Direct dependency!
        }

        /**
         * Uses the internally created {@link Bar} instance to perform an action.
         */
        public void useBar() {
            bar.doSomething();
        }
    }
}
