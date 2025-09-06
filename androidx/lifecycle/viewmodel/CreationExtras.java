package androidx.lifecycle.viewmodel;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public abstract class CreationExtras {
    public static final class Empty extends CreationExtras {
        @l
        public static final Empty b;

        static {
            Empty.b = new Empty();
        }

        @Override  // androidx.lifecycle.viewmodel.CreationExtras
        @m
        public Object a(@l Key creationExtras$Key0) {
            L.p(creationExtras$Key0, "key");
            return null;
        }
    }

    public interface Key {
    }

    @l
    private final Map a;

    public CreationExtras() {
        this.a = new LinkedHashMap();
    }

    @m
    public abstract Object a(@l Key arg1);

    @l
    public final Map b() {
        return this.a;
    }
}

