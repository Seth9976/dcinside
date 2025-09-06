package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nTransactionExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionExecutor.kt\nandroidx/room/TransactionExecutor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
public final class TransactionExecutor implements Executor {
    @l
    private final Executor a;
    @l
    private final ArrayDeque b;
    @m
    private Runnable c;
    @l
    private final Object d;

    public TransactionExecutor(@l Executor executor0) {
        L.p(executor0, "executor");
        super();
        this.a = executor0;
        this.b = new ArrayDeque();
        this.d = new Object();
    }

    // 检测为 Lambda 实现
    private static final void b(Runnable runnable0, TransactionExecutor transactionExecutor0) [...]

    public final void c() {
        synchronized(this.d) {
            Object object1 = this.b.poll();
            this.c = (Runnable)object1;
            if(object1 != null) {
                this.a.execute(((Runnable)object1));
            }
        }
    }

    @Override
    public void execute(@l Runnable runnable0) {
        L.p(runnable0, "command");
        synchronized(this.d) {
            z z0 = () -> {
                L.p(runnable0, "$command");
                L.p(this, "this$0");
                try {
                    runnable0.run();
                }
                finally {
                    this.c();
                }
            };
            this.b.offer(z0);
            if(this.c == null) {
                this.c();
            }
        }
    }
}

