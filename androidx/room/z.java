package androidx.room;

public final class z implements Runnable {
    public final Runnable a;
    public final TransactionExecutor b;

    public z(Runnable runnable0, TransactionExecutor transactionExecutor0) {
        this.a = runnable0;
        this.b = transactionExecutor0;
    }

    @Override
    public final void run() {
        TransactionExecutor.b(this.a, this.b);
    }
}

