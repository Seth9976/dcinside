package rx.observers;

import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import rx.exceptions.b;
import rx.f;
import rx.h;

@Deprecated
public class i implements h {
    static final class a implements h {
        @Override  // rx.h
        public void d() {
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
        }

        @Override  // rx.h
        public void onNext(Object object0) {
        }
    }

    private final h a;
    private final List b;
    private final List c;
    private final List d;
    private static final h e;

    static {
        i.e = new a();
    }

    public i() {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = i.e;
    }

    public i(h h0) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = h0;
    }

    public List S() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    public void b(List list0) {
        if(this.b.size() != list0.size()) {
            this.g("Number of items does not match. Provided: " + list0.size() + "  Actual: " + this.b.size() + ".\nProvided values: " + list0 + "\nActual values: " + this.b + "\n");
        }
        for(int v = 0; v < list0.size(); ++v) {
            Object object0 = list0.get(v);
            Object object1 = this.b.get(v);
            if(object0 != null) {
                if(!object0.equals(object1)) {
                    this.g("Value at index: " + v + " expected to be [" + object0 + "] (" + object0.getClass().getSimpleName() + ") but was: [" + object1 + "] (" + (object1 == null ? "null" : object1.getClass().getSimpleName()) + ")\n");
                }
            }
            else if(object1 != null) {
                this.g("Value at index: " + v + " expected to be [null] but was: [" + object1 + "]\n");
            }
        }
    }

    @Override  // rx.h
    public void d() {
        this.d.add(f.b());
        this.a.d();
    }

    public void f() {
        if(this.c.size() > 1) {
            this.g("Too many onError events: " + this.c.size());
        }
        if(this.d.size() > 1) {
            this.g("Too many onCompleted events: " + this.d.size());
        }
        if(this.d.size() == 1 && this.c.size() == 1) {
            this.g("Received both an onError and onCompleted. Should be one or the other.");
        }
        if(this.d.isEmpty() && this.c.isEmpty()) {
            this.g("No terminal events received.");
        }
    }

    final void g(String s) {
        StringBuilder stringBuilder0 = new StringBuilder(s.length() + 0x20);
        stringBuilder0.append(s);
        stringBuilder0.append(" (");
        int v = this.d.size();
        stringBuilder0.append(v);
        stringBuilder0.append(" completion");
        if(v != 1) {
            stringBuilder0.append('s');
        }
        stringBuilder0.append(')');
        if(!this.c.isEmpty()) {
            int v1 = this.c.size();
            stringBuilder0.append(" (+");
            stringBuilder0.append(v1);
            stringBuilder0.append(" error");
            if(v1 != 1) {
                stringBuilder0.append('s');
            }
            stringBuilder0.append(')');
        }
        AssertionError assertionError0 = new AssertionError(stringBuilder0.toString());
        if(!this.c.isEmpty()) {
            if(this.c.size() == 1) {
                assertionError0.initCause(((Throwable)this.c.get(0)));
            }
            else {
                assertionError0.initCause(new b(this.c));
            }
        }
        throw assertionError0;
    }

    public List h() {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(this.b);
        arrayList0.add(this.c);
        arrayList0.add(this.d);
        return DesugarCollections.unmodifiableList(arrayList0);
    }

    public List i() {
        return DesugarCollections.unmodifiableList(this.d);
    }

    @Override  // rx.h
    public void onError(Throwable throwable0) {
        this.c.add(throwable0);
        this.a.onError(throwable0);
    }

    @Override  // rx.h
    public void onNext(Object object0) {
        this.b.add(object0);
        this.a.onNext(object0);
    }

    public List z() {
        return DesugarCollections.unmodifiableList(this.c);
    }
}

