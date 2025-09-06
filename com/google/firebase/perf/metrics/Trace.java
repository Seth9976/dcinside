package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.application.b;
import com.google.firebase.perf.f;
import com.google.firebase.perf.metrics.validator.e;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.a;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.transport.k;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.x;
import j..util.DesugarCollections;
import j..util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class Trace extends b implements Parcelable, f, a {
    class com.google.firebase.perf.metrics.Trace.a implements Parcelable.Creator {
        com.google.firebase.perf.metrics.Trace.a() {
            super();
        }

        public Trace a(@NonNull Parcel parcel0) {
            return new Trace(parcel0, false, null);
        }

        public Trace[] b(int v) {
            return new Trace[v];
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(@NonNull Parcel parcel0) {
            return this.a(parcel0);
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.b(v);
        }
    }

    class com.google.firebase.perf.metrics.Trace.b implements Parcelable.Creator {
        com.google.firebase.perf.metrics.Trace.b() {
            super();
        }

        public Trace a(Parcel parcel0) {
            return new Trace(parcel0, true, null);
        }

        public Trace[] b(int v) {
            return new Trace[v];
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.a(parcel0);
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.b(v);
        }
    }

    @Keep
    public static final Parcelable.Creator CREATOR;
    private final WeakReference a;
    private final Trace b;
    private final GaugeManager c;
    private final String d;
    private final Map e;
    private final Map f;
    private final List g;
    private final List h;
    private final k i;
    private final com.google.firebase.perf.util.a j;
    private Timer k;
    private Timer l;
    private static final com.google.firebase.perf.logging.a m;
    private static final Map n;
    @VisibleForTesting
    static final Parcelable.Creator o;

    static {
        Trace.m = com.google.firebase.perf.logging.a.e();
        Trace.n = new ConcurrentHashMap();
        Trace.CREATOR = new com.google.firebase.perf.metrics.Trace.a();
        Trace.o = new com.google.firebase.perf.metrics.Trace.b();
    }

    private Trace(@NonNull Parcel parcel0, boolean z) {
        super((z ? null : com.google.firebase.perf.application.a.c()));
        this.a = new WeakReference(this);
        this.b = (Trace)parcel0.readParcelable(Trace.class.getClassLoader());
        this.d = parcel0.readString();
        ArrayList arrayList0 = new ArrayList();
        this.h = arrayList0;
        parcel0.readList(arrayList0, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap0 = new ConcurrentHashMap();
        this.e = concurrentHashMap0;
        this.f = new ConcurrentHashMap();
        parcel0.readMap(concurrentHashMap0, Counter.class.getClassLoader());
        this.k = (Timer)parcel0.readParcelable(Timer.class.getClassLoader());
        this.l = (Timer)parcel0.readParcelable(Timer.class.getClassLoader());
        List list0 = DesugarCollections.synchronizedList(new ArrayList());
        this.g = list0;
        parcel0.readList(list0, PerfSession.class.getClassLoader());
        if(z) {
            this.i = null;
            this.j = null;
            this.c = null;
            return;
        }
        this.i = k.l();
        this.j = new com.google.firebase.perf.util.a();
        this.c = GaugeManager.getInstance();
    }

    Trace(Parcel parcel0, boolean z, com.google.firebase.perf.metrics.Trace.a trace$a0) {
        this(parcel0, z);
    }

    private Trace(@NonNull Trace trace0, @NonNull String s, Timer timer0, Timer timer1, @Nullable List list0, @Nullable Map map0, @Nullable Map map1) {
        this.a = new WeakReference(this);
        this.b = trace0;
        this.d = s.trim();
        this.k = timer0;
        this.l = timer1;
        if(list0 == null) {
            list0 = new ArrayList();
        }
        this.h = list0;
        if(map0 == null) {
            map0 = new ConcurrentHashMap();
        }
        this.e = map0;
        if(map1 == null) {
            map1 = new ConcurrentHashMap();
        }
        this.f = map1;
        this.j = trace0.j;
        this.i = trace0.i;
        this.g = DesugarCollections.synchronizedList(new ArrayList());
        this.c = trace0.c;
    }

    private Trace(@NonNull String s) {
        this(s, k.l(), new com.google.firebase.perf.util.a(), com.google.firebase.perf.application.a.c(), GaugeManager.getInstance());
    }

    public Trace(@NonNull String s, @NonNull k k0, @NonNull com.google.firebase.perf.util.a a0, @NonNull com.google.firebase.perf.application.a a1) {
        this(s, k0, a0, a1, GaugeManager.getInstance());
    }

    public Trace(@NonNull String s, @NonNull k k0, @NonNull com.google.firebase.perf.util.a a0, @NonNull com.google.firebase.perf.application.a a1, @NonNull GaugeManager gaugeManager0) {
        super(a1);
        this.a = new WeakReference(this);
        this.b = null;
        this.d = s.trim();
        this.h = new ArrayList();
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        this.j = a0;
        this.i = k0;
        this.g = DesugarCollections.synchronizedList(new ArrayList());
        this.c = gaugeManager0;
    }

    @Override  // com.google.firebase.perf.session.a
    public void a(PerfSession perfSession0) {
        if(perfSession0 == null) {
            Trace.m.l("Unable to add new SessionId to the Trace. Continuing without it.");
            return;
        }
        if(this.q() && !this.s()) {
            this.g.add(perfSession0);
        }
    }

    private void c(@NonNull String s, @NonNull String s1) {
        if(this.s()) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace \'%s\' has been stopped", this.d));
        }
        if(!this.f.containsKey(s) && this.f.size() >= 5) {
            throw new IllegalArgumentException("Exceeds max limit of number of attributes - 5");
        }
        e.d(s, s1);
    }

    @NonNull
    public static Trace d(@NonNull String s) {
        return new Trace(s);
    }

    @Override  // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    @NonNull
    @VisibleForTesting
    Map e() {
        return this.e;
    }

    @VisibleForTesting
    Timer f() {
        return this.l;
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            if(this.r()) {
                Trace.m.m("Trace \'%s\' is started but not stopped when it is destructed!", new Object[]{this.d});
                this.incrementTsnsCount(1);
            }
        }
        finally {
            super.finalize();
        }
    }

    @NonNull
    @VisibleForTesting
    public String g() {
        return this.d;
    }

    @Override  // com.google.firebase.perf.f
    @Keep
    @Nullable
    public String getAttribute(@NonNull String s) {
        return (String)this.f.get(s);
    }

    @Override  // com.google.firebase.perf.f
    @Keep
    @NonNull
    public Map getAttributes() {
        return new HashMap(this.f);
    }

    @Keep
    public long getLongMetric(@NonNull String s) {
        Counter counter0 = s == null ? null : ((Counter)this.e.get(s.trim()));
        return counter0 == null ? 0L : counter0.a();
    }

    @VisibleForTesting
    List h() {
        ArrayList arrayList0;
        synchronized(this.g) {
            arrayList0 = new ArrayList();
            for(Object object0: this.g) {
                PerfSession perfSession0 = (PerfSession)object0;
                if(perfSession0 != null) {
                    arrayList0.add(perfSession0);
                }
            }
        }
        return DesugarCollections.unmodifiableList(arrayList0);
    }

    @VisibleForTesting
    Timer i() {
        return this.k;
    }

    @Keep
    public void incrementMetric(@NonNull String s, long v) {
        String s1 = e.e(s);
        if(s1 != null) {
            Trace.m.d("Cannot increment metric \'%s\'. Metric name is invalid.(%s)", new Object[]{s, s1});
            return;
        }
        if(!this.q()) {
            Trace.m.m("Cannot increment metric \'%s\' for trace \'%s\' because it\'s not started", new Object[]{s, this.d});
            return;
        }
        if(this.s()) {
            Trace.m.m("Cannot increment metric \'%s\' for trace \'%s\' because it\'s been stopped", new Object[]{s, this.d});
            return;
        }
        Counter counter0 = this.t(s.trim());
        counter0.d(v);
        Object[] arr_object = {s, counter0.a(), this.d};
        Trace.m.b("Incrementing metric \'%s\' to %d on trace \'%s\'", arr_object);
    }

    @NonNull
    @VisibleForTesting
    List l() {
        return this.h;
    }

    @NonNull
    static Trace m(@NonNull String s) {
        synchronized(Trace.class) {
            Map map0 = Trace.n;
            Trace trace0 = (Trace)map0.get(s);
            if(trace0 == null) {
                trace0 = new Trace(s);
                map0.put(s, trace0);
            }
            return trace0;
        }
    }

    @NonNull
    @VisibleForTesting
    static Trace o(@NonNull String s, @NonNull k k0, @NonNull com.google.firebase.perf.util.a a0, @NonNull com.google.firebase.perf.application.a a1) {
        synchronized(Trace.class) {
            Map map0 = Trace.n;
            Trace trace0 = (Trace)map0.get(s);
            if(trace0 == null) {
                trace0 = new Trace(s, k0, a0, a1, GaugeManager.getInstance());
                map0.put(s, trace0);
            }
            return trace0;
        }
    }

    @Override  // com.google.firebase.perf.f
    @Keep
    public void putAttribute(@NonNull String s, @NonNull String s1) {
        boolean z = true;
        try {
            s = s.trim();
            s1 = s1.trim();
            this.c(s, s1);
            Trace.m.b("Setting attribute \'%s\' to \'%s\' on trace \'%s\'", new Object[]{s, s1, this.d});
        }
        catch(Exception exception0) {
            Trace.m.d("Can not set attribute \'%s\' with value \'%s\' (%s)", new Object[]{s, s1, exception0.getMessage()});
            z = false;
        }
        if(z) {
            this.f.put(s, s1);
        }
    }

    @Keep
    public void putMetric(@NonNull String s, long v) {
        String s1 = e.e(s);
        if(s1 != null) {
            Trace.m.d("Cannot set value for metric \'%s\'. Metric name is invalid.(%s)", new Object[]{s, s1});
            return;
        }
        if(!this.q()) {
            Trace.m.m("Cannot set value for metric \'%s\' for trace \'%s\' because it\'s not started", new Object[]{s, this.d});
            return;
        }
        if(this.s()) {
            Trace.m.m("Cannot set value for metric \'%s\' for trace \'%s\' because it\'s been stopped", new Object[]{s, this.d});
            return;
        }
        this.t(s.trim()).e(v);
        Trace.m.b("Setting metric \'%s\' to \'%s\' on trace \'%s\'", new Object[]{s, v, this.d});
    }

    @VisibleForTesting
    boolean q() {
        return this.k != null;
    }

    // 去混淆评级： 低(20)
    @VisibleForTesting
    boolean r() {
        return this.q() && !this.s();
    }

    @Override  // com.google.firebase.perf.f
    @Keep
    public void removeAttribute(@NonNull String s) {
        if(this.s()) {
            Trace.m.c("Can\'t remove a attribute from a Trace that\'s stopped.");
            return;
        }
        this.f.remove(s);
    }

    @VisibleForTesting
    boolean s() {
        return this.l != null;
    }

    @Keep
    public void start() {
        if(!com.google.firebase.perf.config.a.h().N()) {
            Trace.m.a("Trace feature is disabled.");
            return;
        }
        String s = e.f(this.d);
        if(s != null) {
            Trace.m.d("Cannot start trace \'%s\'. Trace name is invalid.(%s)", new Object[]{this.d, s});
            return;
        }
        if(this.k != null) {
            Trace.m.d("Trace \'%s\' has already started, should not start again!", new Object[]{this.d});
            return;
        }
        this.k = this.j.a();
        this.registerForAppState();
        PerfSession perfSession0 = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.a);
        this.a(perfSession0);
        if(perfSession0.f()) {
            this.c.collectGaugeMetricOnce(perfSession0.e());
        }
    }

    @Keep
    public void stop() {
        if(!this.q()) {
            Trace.m.d("Trace \'%s\' has not been started so unable to stop!", new Object[]{this.d});
            return;
        }
        if(this.s()) {
            Trace.m.d("Trace \'%s\' has already stopped, should not stop again!", new Object[]{this.d});
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.a);
        this.unregisterForAppState();
        Timer timer0 = this.j.a();
        this.l = timer0;
        if(this.b == null) {
            this.u(timer0);
            if(this.d.isEmpty()) {
                Trace.m.c("Trace name is empty, no log is sent to server");
            }
            else {
                x x0 = new com.google.firebase.perf.metrics.k(this).a();
                this.i.I(x0, this.getAppState());
                if(SessionManager.getInstance().perfSession().f()) {
                    this.c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().e());
                }
            }
        }
    }

    @NonNull
    private Counter t(@NonNull String s) {
        Counter counter0 = (Counter)this.e.get(s);
        if(counter0 == null) {
            counter0 = new Counter(s);
            this.e.put(s, counter0);
        }
        return counter0;
    }

    private void u(Timer timer0) {
        if(this.h.isEmpty()) {
            return;
        }
        Trace trace0 = (Trace)this.h.get(this.h.size() - 1);
        if(trace0.l == null) {
            trace0.l = timer0;
        }
    }

    void v(@NonNull String s) {
        Timer timer0 = this.j.a();
        this.u(timer0);
        Trace trace0 = new Trace(this, s, timer0, null, null, null, null);
        this.h.add(trace0);
    }

    @Nullable
    static Trace w(@NonNull String s) {
        Trace trace0 = (Trace)Trace.n.get(s);
        if(trace0 != null) {
            trace0.start();
        }
        return trace0;
    }

    @Override  // android.os.Parcelable
    @Keep
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        parcel0.writeParcelable(this.b, 0);
        parcel0.writeString(this.d);
        parcel0.writeList(this.h);
        parcel0.writeMap(this.e);
        parcel0.writeParcelable(this.k, 0);
        parcel0.writeParcelable(this.l, 0);
        synchronized(this.g) {
            parcel0.writeList(this.g);
        }
    }

    void x() {
        this.u(this.j.a());
    }

    @Nullable
    static Trace y(@NonNull String s) {
        Map map0 = Trace.n;
        Trace trace0 = (Trace)map0.get(s);
        if(trace0 != null) {
            trace0.stop();
            map0.remove(s);
        }
        return trace0;
    }
}

