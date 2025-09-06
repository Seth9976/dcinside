package com.google.firebase.analytics.connector;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface a {
    @KeepForSdk
    public interface com.google.firebase.analytics.connector.a.a {
        @KeepForSdk
        void a();

        @KeepForSdk
        void b();

        @KeepForSdk
        void c(@NonNull Set arg1);
    }

    @KeepForSdk
    public interface b {
        @KeepForSdk
        void a(int arg1, @Nullable Bundle arg2);
    }

    @KeepForSdk
    public static class c {
        @NonNull
        @KeepForSdk
        public String a;
        @NonNull
        @KeepForSdk
        public String b;
        @Nullable
        @KeepForSdk
        public Object c;
        @Nullable
        @KeepForSdk
        public String d;
        @KeepForSdk
        public long e;
        @Nullable
        @KeepForSdk
        public String f;
        @Nullable
        @KeepForSdk
        public Bundle g;
        @Nullable
        @KeepForSdk
        public String h;
        @Nullable
        @KeepForSdk
        public Bundle i;
        @KeepForSdk
        public long j;
        @Nullable
        @KeepForSdk
        public String k;
        @Nullable
        @KeepForSdk
        public Bundle l;
        @KeepForSdk
        public long m;
        @KeepForSdk
        public boolean n;
        @KeepForSdk
        public long o;

    }

    @KeepForSdk
    void a(@NonNull String arg1, @NonNull String arg2, @Nullable Bundle arg3);

    @KeepForSdk
    void b(@NonNull String arg1, @NonNull String arg2, @NonNull Object arg3);

    @WorkerThread
    @KeepForSdk
    int c(@NonNull @Size(min = 1L) String arg1);

    @KeepForSdk
    void clearConditionalUserProperty(@NonNull @Size(max = 24L, min = 1L) String arg1, @Nullable String arg2, @Nullable Bundle arg3);

    @NonNull
    @WorkerThread
    @KeepForSdk
    List d(@NonNull String arg1, @Nullable @Size(max = 23L, min = 1L) String arg2);

    @T1.a
    @Nullable
    @KeepForSdk
    com.google.firebase.analytics.connector.a.a e(@NonNull String arg1, @NonNull b arg2);

    @KeepForSdk
    void f(@NonNull c arg1);

    @NonNull
    @WorkerThread
    @KeepForSdk
    Map g(boolean arg1);
}

