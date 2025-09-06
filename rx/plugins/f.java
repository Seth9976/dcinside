package rx.plugins;

import androidx.compose.animation.core.d;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

public class f {
    static final class a extends b {
    }

    private final AtomicReference a;
    private final AtomicReference b;
    private final AtomicReference c;
    private final AtomicReference d;
    private final AtomicReference e;
    private static final f f;
    static final b g;

    static {
        f.f = new f();
        f.g = new a();
    }

    f() {
        this.a = new AtomicReference();
        this.b = new AtomicReference();
        this.c = new AtomicReference();
        this.d = new AtomicReference();
        this.e = new AtomicReference();
    }

    public rx.plugins.a a() {
        class rx.plugins.f.b extends rx.plugins.a {
            final f a;

        }

        if(this.d.get() == null) {
            Object object0 = f.e(rx.plugins.a.class, f.h());
            if(object0 == null) {
                rx.plugins.f.b f$b0 = new rx.plugins.f.b(this);
                d.a(this.d, null, f$b0);
                return (rx.plugins.a)this.d.get();
            }
            d.a(this.d, null, ((rx.plugins.a)object0));
        }
        return (rx.plugins.a)this.d.get();
    }

    public b b() {
        if(this.a.get() == null) {
            Object object0 = f.e(b.class, f.h());
            if(object0 == null) {
                d.a(this.a, null, f.g);
                return (b)this.a.get();
            }
            d.a(this.a, null, ((b)object0));
        }
        return (b)this.a.get();
    }

    @Deprecated
    public static f c() {
        return f.f;
    }

    public rx.plugins.d d() {
        if(this.b.get() == null) {
            Object object0 = f.e(rx.plugins.d.class, f.h());
            if(object0 == null) {
                d.a(this.b, null, e.f());
                return (rx.plugins.d)this.b.get();
            }
            d.a(this.b, null, ((rx.plugins.d)object0));
        }
        return (rx.plugins.d)this.b.get();
    }

    static Object e(Class class0, Properties properties0) {
        Properties properties1 = (Properties)properties0.clone();
        String s = class0.getSimpleName();
        String s1 = properties1.getProperty("rxjava.plugin." + s + ".implementation");
        if(s1 == null) {
            try {
                Iterator iterator0 = properties1.entrySet().iterator();
                while(true) {
                label_5:
                    if(!iterator0.hasNext()) {
                        goto label_17;
                    }
                    Object object0 = iterator0.next();
                    String s2 = ((Map.Entry)object0).getKey().toString();
                    if(s2.startsWith("rxjava.plugin.") && s2.endsWith(".class") && s.equals(((Map.Entry)object0).getValue().toString())) {
                        String s3 = "rxjava.plugin." + s2.substring(0, s2.length() - 6).substring(14) + ".impl";
                        s1 = properties1.getProperty(s3);
                        if(s1 == null) {
                            throw new IllegalStateException("Implementing class declaration for " + s + " missing: " + s3);
                        }
                        goto label_17;
                    }
                }
            }
            catch(SecurityException securityException0) {
                securityException0.printStackTrace();
                goto label_17;
            }
            goto label_5;
        }
    label_17:
        if(s1 != null) {
            try {
                return Class.forName(s1).asSubclass(class0).newInstance();
            }
            catch(ClassCastException classCastException0) {
                throw new IllegalStateException(s + " implementation is not an instance of " + s + ": " + s1, classCastException0);
            }
            catch(ClassNotFoundException classNotFoundException0) {
                throw new IllegalStateException(s + " implementation class not found: " + s1, classNotFoundException0);
            }
            catch(InstantiationException instantiationException0) {
                throw new IllegalStateException(s + " implementation not able to be instantiated: " + s1, instantiationException0);
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw new IllegalStateException(s + " implementation not able to be accessed: " + s1, illegalAccessException0);
            }
        }
        return null;
    }

    public g f() {
        if(this.e.get() == null) {
            Object object0 = f.e(g.class, f.h());
            if(object0 == null) {
                d.a(this.e, null, g.h());
                return (g)this.e.get();
            }
            d.a(this.e, null, ((g)object0));
        }
        return (g)this.e.get();
    }

    public h g() {
        if(this.c.get() == null) {
            Object object0 = f.e(h.class, f.h());
            if(object0 == null) {
                d.a(this.c, null, i.f());
                return (h)this.c.get();
            }
            d.a(this.c, null, ((h)object0));
        }
        return (h)this.c.get();
    }

    static Properties h() {
        return System.getProperties();
    }

    public void i(rx.plugins.a a0) {
        if(!d.a(this.d, null, a0)) {
            throw new IllegalStateException("Another strategy was already registered: " + this.c.get());
        }
    }

    public void j(b b0) {
        if(!d.a(this.a, null, b0)) {
            throw new IllegalStateException("Another strategy was already registered: " + this.a.get());
        }
    }

    public void k(rx.plugins.d d0) {
        if(!d.a(this.b, null, d0)) {
            throw new IllegalStateException("Another strategy was already registered: " + this.b.get());
        }
    }

    public void l(g g0) {
        if(!d.a(this.e, null, g0)) {
            throw new IllegalStateException("Another strategy was already registered: " + this.e.get());
        }
    }

    public void m(h h0) {
        if(!d.a(this.c, null, h0)) {
            throw new IllegalStateException("Another strategy was already registered: " + this.c.get());
        }
    }

    public void n() {
        f.f.a.set(null);
        f.f.b.set(null);
        f.f.c.set(null);
        f.f.d.set(null);
        f.f.e.set(null);
    }
}

