package com.google.android.datatransport.runtime;

import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.h;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class r {
    @AutoValue.Builder
    public static abstract class a {
        public abstract r a();

        public abstract a b(String arg1);

        public abstract a c(@Nullable byte[] arg1);

        @RestrictTo({Scope.b})
        public abstract a d(h arg1);
    }

    public static a a() {
        return new b().d(h.a);
    }

    public abstract String b();

    @Nullable
    public abstract byte[] c();

    @RestrictTo({Scope.b})
    public abstract h d();

    public boolean e() {
        return this.c() != null;
    }

    @RestrictTo({Scope.b})
    public r f(h h0) {
        return r.a().b(this.b()).d(h0).c(this.c()).a();
    }

    @Override
    public final String toString() {
        String s = this.b();
        h h0 = this.d();
        return this.c() == null ? String.format("TransportContext(%s, %s, %s)", s, h0, "") : String.format("TransportContext(%s, %s, %s)", s, h0, Base64.encodeToString(this.c(), 2));
    }
}

