package bolts;

import java.util.Locale;
import java.util.concurrent.CancellationException;

public class d {
    private final f a;

    d(f f0) {
        this.a = f0;
    }

    public boolean a() {
        return this.a.k();
    }

    public e b(Runnable runnable0) {
        return this.a.o(runnable0);
    }

    public void c() throws CancellationException {
        this.a.p();
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", this.getClass().getName(), Integer.toHexString(this.hashCode()), Boolean.toString(this.a.k()));
    }
}

