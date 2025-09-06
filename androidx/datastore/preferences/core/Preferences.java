package androidx.datastore.preferences.core;

import java.util.Map;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public abstract class Preferences {
    public static final class Key {
        @l
        private final String a;

        public Key(@l String s) {
            L.p(s, "name");
            super();
            this.a = s;
        }

        @l
        public final String a() {
            return this.a;
        }

        @l
        public final Pair b(Object object0) {
            return new Pair(this, object0);
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@m Object object0) {
            return object0 instanceof Key ? L.g(this.a, ((Key)object0).a) : false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @l
        public String toString() {
            return this.a;
        }
    }

    public static final class Pair {
        @l
        private final Key a;
        private final Object b;

        public Pair(@l Key preferences$Key0, Object object0) {
            L.p(preferences$Key0, "key");
            super();
            this.a = preferences$Key0;
            this.b = object0;
        }

        @l
        public final Key a() {
            return this.a;
        }

        public final Object b() {
            return this.b;
        }
    }

    @l
    public abstract Map a();

    public abstract boolean b(@l Key arg1);

    @m
    public abstract Object c(@l Key arg1);

    @l
    public final MutablePreferences d() {
        return new MutablePreferences(Y.J0(this.a()), false);
    }

    @l
    public final Preferences e() {
        return new MutablePreferences(Y.J0(this.a()), true);
    }
}

