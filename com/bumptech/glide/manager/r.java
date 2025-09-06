package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.util.h.b;
import com.bumptech.glide.util.h;
import com.bumptech.glide.util.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

final class r {
    interface c {
        void a();

        boolean b();
    }

    @RequiresApi(24)
    static final class d implements c {
        class a extends ConnectivityManager.NetworkCallback {
            final d a;

            void a(boolean z) {
                o.b();
                d r$d0 = d.this;
                boolean z1 = r$d0.a;
                r$d0.a = z;
                if(z1 != z) {
                    r$d0.b.a(z);
                }
            }

            private void b(boolean z) {
                class com.bumptech.glide.manager.r.d.a.a implements Runnable {
                    final boolean a;
                    final a b;

                    com.bumptech.glide.manager.r.d.a.a(boolean z) {
                        this.a = z;
                        super();
                    }

                    @Override
                    public void run() {
                        a.this.a(this.a);
                    }
                }

                o.y(new com.bumptech.glide.manager.r.d.a.a(this, z));
            }

            @Override  // android.net.ConnectivityManager$NetworkCallback
            public void onAvailable(@NonNull Network network0) {
                this.b(true);
            }

            @Override  // android.net.ConnectivityManager$NetworkCallback
            public void onLost(@NonNull Network network0) {
                this.b(false);
            }
        }

        boolean a;
        final com.bumptech.glide.manager.b.a b;
        private final b c;
        private final ConnectivityManager.NetworkCallback d;

        d(b h$b0, com.bumptech.glide.manager.b.a b$a0) {
            this.d = new a(this);
            this.c = h$b0;
            this.b = b$a0;
        }

        @Override  // com.bumptech.glide.manager.r$c
        public void a() {
            ((ConnectivityManager)this.c.get()).unregisterNetworkCallback(this.d);
        }

        @Override  // com.bumptech.glide.manager.r$c
        @SuppressLint({"MissingPermission"})
        public boolean b() {
            boolean z = ((ConnectivityManager)this.c.get()).getActiveNetwork() != null;
            try {
                this.a = z;
                ((ConnectivityManager)this.c.get()).registerDefaultNetworkCallback(this.d);
                return true;
            }
            catch(RuntimeException runtimeException0) {
                if(Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", runtimeException0);
                }
                return false;
            }
        }
    }

    static final class e implements c {
        class com.bumptech.glide.manager.r.e.a extends BroadcastReceiver {
            final e a;

            @Override  // android.content.BroadcastReceiver
            public void onReceive(@NonNull Context context0, Intent intent0) {
                e.this.e();
            }
        }

        final Context a;
        final com.bumptech.glide.manager.b.a b;
        private final b c;
        volatile boolean d;
        volatile boolean e;
        final BroadcastReceiver f;
        static final Executor g;

        static {
            e.g = AsyncTask.SERIAL_EXECUTOR;
        }

        e(Context context0, b h$b0, com.bumptech.glide.manager.b.a b$a0) {
            this.f = new com.bumptech.glide.manager.r.e.a(this);
            this.a = context0.getApplicationContext();
            this.c = h$b0;
            this.b = b$a0;
        }

        @Override  // com.bumptech.glide.manager.r$c
        public void a() {
            class com.bumptech.glide.manager.r.e.c implements Runnable {
                final e a;

                @Override
                public void run() {
                    if(!e.this.e) {
                        return;
                    }
                    e.this.e = false;
                    e.this.a.unregisterReceiver(e.this.f);
                }
            }

            com.bumptech.glide.manager.r.e.c r$e$c0 = new com.bumptech.glide.manager.r.e.c(this);
            e.g.execute(r$e$c0);
        }

        @Override  // com.bumptech.glide.manager.r$c
        public boolean b() {
            class com.bumptech.glide.manager.r.e.b implements Runnable {
                final e a;

                @Override
                public void run() {
                    e.this.d = e.this.c();
                    try {
                        IntentFilter intentFilter0 = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                        e.this.a.registerReceiver(e.this.f, intentFilter0);
                        e.this.e = true;
                    }
                    catch(SecurityException securityException0) {
                        if(Log.isLoggable("ConnectivityMonitor", 5)) {
                            Log.w("ConnectivityMonitor", "Failed to register", securityException0);
                        }
                        e.this.e = false;
                    }
                }
            }

            com.bumptech.glide.manager.r.e.b r$e$b0 = new com.bumptech.glide.manager.r.e.b(this);
            e.g.execute(r$e$b0);
            return true;
        }

        @SuppressLint({"MissingPermission"})
        boolean c() {
            try {
                NetworkInfo networkInfo0 = ((ConnectivityManager)this.c.get()).getActiveNetworkInfo();
                return networkInfo0 != null && networkInfo0.isConnected();
            }
            catch(RuntimeException runtimeException0) {
                if(Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", runtimeException0);
                }
                return true;
            }
        }

        void d(boolean z) {
            class com.bumptech.glide.manager.r.e.e implements Runnable {
                final boolean a;
                final e b;

                com.bumptech.glide.manager.r.e.e(boolean z) {
                    this.a = z;
                    super();
                }

                @Override
                public void run() {
                    e.this.b.a(this.a);
                }
            }

            o.y(new com.bumptech.glide.manager.r.e.e(this, z));
        }

        void e() {
            class com.bumptech.glide.manager.r.e.d implements Runnable {
                final e a;

                @Override
                public void run() {
                    boolean z = e.this.d;
                    e.this.d = e.this.c();
                    if(z != e.this.d) {
                        if(Log.isLoggable("ConnectivityMonitor", 3)) {
                            Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + e.this.d);
                        }
                        e.this.d(e.this.d);
                    }
                }
            }

            com.bumptech.glide.manager.r.e.d r$e$d0 = new com.bumptech.glide.manager.r.e.d(this);
            e.g.execute(r$e$d0);
        }
    }

    private final c a;
    @GuardedBy("this")
    final Set b;
    @GuardedBy("this")
    private boolean c;
    private static volatile r d = null;
    private static final String e = "ConnectivityMonitor";

    private r(@NonNull Context context0) {
        class com.bumptech.glide.manager.r.a implements b {
            final Context a;
            final r b;

            com.bumptech.glide.manager.r.a(Context context0) {
                this.a = context0;
                super();
            }

            public ConnectivityManager a() {
                return (ConnectivityManager)this.a.getSystemService("connectivity");
            }

            @Override  // com.bumptech.glide.util.h$b
            public Object get() {
                return this.a();
            }
        }


        class com.bumptech.glide.manager.r.b implements com.bumptech.glide.manager.b.a {
            final r a;

            @Override  // com.bumptech.glide.manager.b$a
            public void a(boolean z) {
                o.b();
                synchronized(r.this) {
                    ArrayList arrayList0 = new ArrayList(r.this.b);
                }
                for(Object object0: arrayList0) {
                    ((com.bumptech.glide.manager.b.a)object0).a(z);
                }
            }
        }

        this.b = new HashSet();
        b h$b0 = h.a(new com.bumptech.glide.manager.r.a(this, context0));
        com.bumptech.glide.manager.r.b r$b0 = new com.bumptech.glide.manager.r.b(this);
        d r$d0 = Build.VERSION.SDK_INT >= 24 ? new d(h$b0, r$b0) : new e(context0, h$b0, r$b0);
        this.a = r$d0;
    }

    static r a(@NonNull Context context0) {
        if(r.d == null) {
            Class class0 = r.class;
            synchronized(class0) {
                if(r.d == null) {
                    r.d = new r(context0.getApplicationContext());
                }
            }
        }
        return r.d;
    }

    @GuardedBy("this")
    private void b() {
        if(!this.c && !this.b.isEmpty()) {
            this.c = this.a.b();
        }
    }

    @GuardedBy("this")
    private void c() {
        if(this.c && this.b.isEmpty()) {
            this.a.a();
            this.c = false;
        }
    }

    void d(com.bumptech.glide.manager.b.a b$a0) {
        synchronized(this) {
            this.b.add(b$a0);
            this.b();
        }
    }

    @VisibleForTesting
    static void e() {
        r.d = null;
    }

    void f(com.bumptech.glide.manager.b.a b$a0) {
        synchronized(this) {
            this.b.remove(b$a0);
            this.c();
        }
    }
}

