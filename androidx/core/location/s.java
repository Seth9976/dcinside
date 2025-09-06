package androidx.core.location;

import android.location.Location;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class s implements Consumer {
    public final androidx.core.util.Consumer a;

    public s(androidx.core.util.Consumer consumer0) {
        this.a = consumer0;
    }

    @Override
    public final void accept(Object object0) {
        this.a.accept(((Location)object0));
    }

    @Override
    public Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

