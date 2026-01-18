package pl.wsb.fitnesstracker.livecoding.ioc;

/**
 * Demonstrates the Inversion of Control (IoC) principle.
 * In this example, the dependency {@link Bar} is created outside of {@link Foo}
 * and injected into it, rather than {@link Foo} creating its own dependency.
 */
public class IoC {

    /**
     * The main method to execute the IoC demonstration.
     *
     * @param args command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Instance created outside
        Bar bar = new Bar();

        // Foo constructed with Bar (from outside)
        Foo foo = new Foo(bar);
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
     * A class that depends on {@link Bar}.
     */
    static class Foo {
        private Bar bar;

        /**
         * Constructs a new Foo instance with the specified dependency.
         *
         * @param bar the dependency to be injected.
         */
        // Dependency injected from Outside
        public Foo(Bar bar) {
            this.bar = bar;
        }

        /**
         * Uses the injected {@link Bar} dependency to perform an action.
         */
        public void useBar() {
            bar.doSomething();
        }
    }
}
