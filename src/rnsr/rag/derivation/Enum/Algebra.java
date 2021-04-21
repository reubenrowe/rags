package rnsr.rag.derivation.Enum;

public enum Algebra {

    CONFIGURATION(3),
    QUERY(2),
    ANSWER(1),
    TERMINAL(0);

    private int id;

    Algebra (int id) {
        this.id = id;
    }

    public Algebra compare(Algebra other) {
        return (this.id >= other.id) ? this : other;
    }

    public int getID() {
        return this.id;
    }

}
