package com.dcinside.app.util;

import android.content.Context;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme;
import androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey.Builder;
import androidx.security.crypto.MasterKey.KeyScheme;
import androidx.security.crypto.MasterKey;
import com.dcinside.app.Application;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

public final class ml {
    static final class a extends N implements A3.a {
        public static final a e;

        static {
            a.e = new a();
        }

        a() {
            super(0);
        }

        @l
        public final SharedPreferences b() {
            Context context0 = Application.e.c();
            MasterKey masterKey0 = new Builder(context0).c(KeyScheme.a).a();
            L.o(masterKey0, "build(...)");
            SharedPreferences sharedPreferences0 = EncryptedSharedPreferences.a(context0, "dcPreferences", masterKey0, PrefKeyEncryptionScheme.b, PrefValueEncryptionScheme.b);
            L.o(sharedPreferences0, "create(...)");
            return sharedPreferences0;
        }

        @Override  // A3.a
        public Object invoke() {
            return this.b();
        }
    }

    @l
    public static final ml a;
    @l
    private static final D b;

    static {
        ml.a = new ml();
        ml.b = E.a(a.e);
    }

    private final SharedPreferences a() {
        return (SharedPreferences)ml.b.getValue();
    }

    public final void b(@l SharedPreferences.OnSharedPreferenceChangeListener sharedPreferences$OnSharedPreferenceChangeListener0) {
        L.p(sharedPreferences$OnSharedPreferenceChangeListener0, "l");
        this.a().registerOnSharedPreferenceChangeListener(sharedPreferences$OnSharedPreferenceChangeListener0);
    }

    public final void c(@l SharedPreferences.OnSharedPreferenceChangeListener sharedPreferences$OnSharedPreferenceChangeListener0) {
        L.p(sharedPreferences$OnSharedPreferenceChangeListener0, "l");
        this.a().unregisterOnSharedPreferenceChangeListener(sharedPreferences$OnSharedPreferenceChangeListener0);
    }
}

