package rnsr.rag.util;

import rnsr.rag.grammar.Polynomial;

public class ConsumeSetting {

    private Polynomial consumed;
    private Polynomial remainder;

    public ConsumeSetting(Polynomial consumed, Polynomial remainder) {
        this.consumed = consumed;
        this.remainder = remainder;
    }

    public Polynomial getConsumed() {
        return consumed;
    }

    public Polynomial getRemainder() {
        return remainder;
    }

}
