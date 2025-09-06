package androidx.room;

import A3.a;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import y4.l;

@RestrictTo({Scope.c})
public abstract class SharedSQLiteStatement {
    @l
    private final RoomDatabase a;
    @l
    private final AtomicBoolean b;
    @l
    private final D c;

    public SharedSQLiteStatement(@l RoomDatabase roomDatabase0) {
        L.p(roomDatabase0, "database");
        super();
        this.a = roomDatabase0;
        this.b = new AtomicBoolean(false);
        this.c = E.a(new a() {
            final SharedSQLiteStatement e;

            {
                this.e = sharedSQLiteStatement0;
                super(0);
            }

            @l
            public final SupportSQLiteStatement b() {
                return this.e.d();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
    }

    @l
    public SupportSQLiteStatement b() {
        this.c();
        return this.g(this.b.compareAndSet(false, true));
    }

    protected void c() {
        this.a.c();
    }

    private final SupportSQLiteStatement d() {
        String s = this.e();
        return this.a.h(s);
    }

    @l
    protected abstract String e();

    private final SupportSQLiteStatement f() {
        return (SupportSQLiteStatement)this.c.getValue();
    }

    // 去混淆评级： 低(20)
    private final SupportSQLiteStatement g(boolean z) {
        return z ? this.f() : this.d();
    }

    public void h(@l SupportSQLiteStatement supportSQLiteStatement0) {
        L.p(supportSQLiteStatement0, "statement");
        if(supportSQLiteStatement0 == this.f()) {
            this.b.set(false);
        }
    }
}

