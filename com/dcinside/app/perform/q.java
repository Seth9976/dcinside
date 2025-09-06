package com.dcinside.app.perform;

import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.HashMap;
import java.util.Map.Entry;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class q implements Handler.Callback {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final m a(@l AppCompatActivity appCompatActivity0, @l n n0) {
            L.p(appCompatActivity0, "a");
            L.p(n0, "c");
            b q$b0 = q.d.c(appCompatActivity0);
            m m0 = (m)q$b0.j0(n0.type());
            if(m0 == null) {
                m0 = (m)n0.a(appCompatActivity0);
                q$b0.i0(m0);
            }
            return m0;
        }
    }

    public static final class b extends Fragment {
        public static final class com.dcinside.app.perform.q.b.a {
            private com.dcinside.app.perform.q.b.a() {
            }

            public com.dcinside.app.perform.q.b.a(w w0) {
            }
        }

        @l
        private final HashMap a;
        private boolean b;
        private boolean c;
        @l
        public static final com.dcinside.app.perform.q.b.a d = null;
        @l
        public static final String e = "performer_lifecycle";

        static {
            b.d = new com.dcinside.app.perform.q.b.a(null);
        }

        public b() {
            this.a = new HashMap();
        }

        public final void i0(@y4.m m m0) {
            L.m(m0);
            Class class0 = m0.getClass();
            this.a.put(class0, m0);
            FragmentActivity fragmentActivity0 = this.getActivity();
            if(this.c) {
                m0.a(fragmentActivity0);
                return;
            }
            if(this.b) {
                m0.d(fragmentActivity0);
                return;
            }
            m0.c(fragmentActivity0);
        }

        public final Object j0(@l Class class0) {
            L.p(class0, "clazz");
            return this.a.get(class0);
        }

        @Override  // androidx.fragment.app.Fragment
        public void onDestroy() {
            this.c = true;
            FragmentActivity fragmentActivity0 = this.getActivity();
            for(Object object0: this.a.entrySet()) {
                ((m)((Map.Entry)object0).getValue()).a(fragmentActivity0);
            }
            this.a.clear();
            super.onDestroy();
        }

        @Override  // androidx.fragment.app.Fragment
        public void onLowMemory() {
            FragmentActivity fragmentActivity0 = this.getActivity();
            for(Object object0: this.a.entrySet()) {
                ((m)((Map.Entry)object0).getValue()).b(fragmentActivity0);
            }
            this.a.clear();
            super.onLowMemory();
        }

        @Override  // androidx.fragment.app.Fragment
        public void onStart() {
            super.onStart();
            this.b = true;
            FragmentActivity fragmentActivity0 = this.getActivity();
            for(Object object0: this.a.entrySet()) {
                ((m)((Map.Entry)object0).getValue()).d(fragmentActivity0);
            }
        }

        @Override  // androidx.fragment.app.Fragment
        public void onStop() {
            this.b = false;
            FragmentActivity fragmentActivity0 = this.getActivity();
            for(Object object0: this.a.entrySet()) {
                ((m)((Map.Entry)object0).getValue()).c(fragmentActivity0);
            }
            super.onStop();
        }
    }

    @l
    private final HashMap a;
    @l
    private final Handler b;
    @l
    public static final a c = null;
    @l
    private static final q d = null;
    private static final int e = 1;

    static {
        q.c = new a(null);
        q.d = new q();
    }

    public q() {
        this.a = new HashMap();
        this.b = new Handler(Looper.getMainLooper(), this);
    }

    private final b c(AppCompatActivity appCompatActivity0) {
        FragmentManager fragmentManager0 = appCompatActivity0.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        Fragment fragment0 = fragmentManager0.s0("performer_lifecycle");
        b q$b0 = fragment0 instanceof b ? ((b)fragment0) : null;
        if(q$b0 == null) {
            q$b0 = (b)this.a.get(fragmentManager0);
            if(q$b0 == null) {
                q$b0 = new b();
                this.a.put(fragmentManager0, q$b0);
                try {
                    fragmentManager0.u().k(q$b0, "performer_lifecycle").r();
                }
                catch(Exception unused_ex) {
                    try {
                        q$b0.onStop();
                    }
                    catch(Exception unused_ex) {
                    }
                    try {
                        q$b0.onDestroy();
                    }
                    catch(Exception unused_ex) {
                    }
                }
                this.b.obtainMessage(1, fragmentManager0).sendToTarget();
            }
        }
        return q$b0;
    }

    @Override  // android.os.Handler$Callback
    public boolean handleMessage(@l Message message0) {
        L.p(message0, "message");
        if(message0.what == 1) {
            try {
                FragmentManager fragmentManager0 = message0.obj instanceof FragmentManager ? ((FragmentManager)message0.obj) : null;
                if(fragmentManager0 != null) {
                    this.a.remove(fragmentManager0);
                }
                return true;
            }
            catch(Exception unused_ex) {
            }
        }
        return false;
    }
}

