package atomics;

class Atom {

    private int value;

    public Atom(int initialValue) {
        this.value = initialValue;
    }

    public synchronized int get() {
        return value;
    }

    public synchronized void set(int newValue) {
        value = newValue;
    }

    public synchronized int incrementAndGet() {
        return ++value;
    }

    public synchronized int decrementAndGet() {
        return --value;
    }

    public synchronized int addAndGet(int delta) {
        value += delta;
        return value;
    }
}
