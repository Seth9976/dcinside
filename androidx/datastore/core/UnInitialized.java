package androidx.datastore.core;

import y4.l;

final class UnInitialized extends State {
    @l
    public static final UnInitialized a;

    static {
        UnInitialized.a = new UnInitialized();
    }

    private UnInitialized() {
        super(null);
    }
}

