package io.reactivex.observers;

import e3.r;
import io.reactivex.A;
import io.reactivex.disposables.c;
import io.reactivex.internal.util.k;
import io.reactivex.internal.util.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class a implements c {
    static class io.reactivex.observers.a.a {
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static abstract class b extends Enum implements Runnable {
        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        static final class io.reactivex.observers.a.b.a extends b {
            io.reactivex.observers.a.b.a(String s, int v) {
                super(s, v, null);
            }

            @Override  // io.reactivex.observers.a$b
            public void run() {
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        static final class io.reactivex.observers.a.b.b extends b {
            io.reactivex.observers.a.b.b(String s, int v) {
                super(s, v, null);
            }

            @Override  // io.reactivex.observers.a$b
            public void run() {
                Thread.yield();
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        static final class io.reactivex.observers.a.b.c extends b {
            io.reactivex.observers.a.b.c(String s, int v) {
                super(s, v, null);
            }

            @Override  // io.reactivex.observers.a$b
            public void run() {
                b.a(1);
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        static final class d extends b {
            d(String s, int v) {
                super(s, v, null);
            }

            @Override  // io.reactivex.observers.a$b
            public void run() {
                b.a(10);
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        static final class e extends b {
            e(String s, int v) {
                super(s, v, null);
            }

            @Override  // io.reactivex.observers.a$b
            public void run() {
                b.a(100);
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        static final class f extends b {
            f(String s, int v) {
                super(s, v, null);
            }

            @Override  // io.reactivex.observers.a$b
            public void run() {
                b.a(1000);
            }
        }

        public static final enum b a;
        public static final enum b b;
        public static final enum b c;
        public static final enum b d;
        public static final enum b e;
        public static final enum b f;
        private static final b[] g;

        static {
            io.reactivex.observers.a.b.a a$b$a0 = new io.reactivex.observers.a.b.a("SPIN", 0);
            b.a = a$b$a0;
            io.reactivex.observers.a.b.b a$b$b0 = new io.reactivex.observers.a.b.b("YIELD", 1);
            b.b = a$b$b0;
            io.reactivex.observers.a.b.c a$b$c0 = new io.reactivex.observers.a.b.c("SLEEP_1MS", 2);
            b.c = a$b$c0;
            d a$b$d0 = new d("SLEEP_10MS", 3);
            b.d = a$b$d0;
            e a$b$e0 = new e("SLEEP_100MS", 4);
            b.e = a$b$e0;
            f a$b$f0 = new f("SLEEP_1000MS", 5);
            b.f = a$b$f0;
            b.g = new b[]{a$b$a0, a$b$b0, a$b$c0, a$b$d0, a$b$e0, a$b$f0};
        }

        private b(String s, int v) {
            super(s, v);
        }

        b(String s, int v, io.reactivex.observers.a.a a$a0) {
            this(s, v);
        }

        static void a(int v) {
            try {
                Thread.sleep(v);
            }
            catch(InterruptedException interruptedException0) {
                throw new RuntimeException(interruptedException0);
            }
        }

        @Override
        public abstract void run();

        public static b valueOf(String s) {
            return (b)Enum.valueOf(b.class, s);
        }

        public static b[] values() {
            return (b[])b.g.clone();
        }
    }

    protected final CountDownLatch a;
    protected final List b;
    protected final List c;
    protected long d;
    protected Thread e;
    protected boolean f;
    protected int g;
    protected int h;
    protected CharSequence i;
    protected boolean j;

    public a() {
        this.b = new y();
        this.c = new y();
        this.a = new CountDownLatch(1);
    }

    public final a A(Object object0) {
        if(this.b.size() != 1) {
            throw this.W("expected: " + a.b0(object0) + " but was: " + this.b);
        }
        Object object1 = this.b.get(0);
        if(!io.reactivex.internal.functions.b.c(object0, object1)) {
            throw this.W("expected: " + a.b0(object0) + " but was: " + a.b0(object1));
        }
        return this;
    }

    public final a B(int v, r r0) {
        if(this.b.size() == 0) {
            throw this.W("No values");
        }
        if(v >= this.b.size()) {
            throw this.W("Invalid index: " + v);
        }
        try {
            if(r0.test(this.b.get(v))) {
                return this;
            }
        }
        catch(Exception exception0) {
            throw k.f(exception0);
        }
        throw this.W("Value not present");
    }

    public final a C(int v, Object object0) {
        int v1 = this.b.size();
        if(v1 == 0) {
            throw this.W("No values");
        }
        if(v >= v1) {
            throw this.W("Invalid index: " + v);
        }
        Object object1 = this.b.get(v);
        if(!io.reactivex.internal.functions.b.c(object0, object1)) {
            throw this.W("expected: " + a.b0(object0) + " but was: " + a.b0(object1));
        }
        return this;
    }

    public final a D(int v) {
        int v1 = this.b.size();
        if(v1 != v) {
            throw this.W("Value counts differ; expected: " + v + " but was: " + v1);
        }
        return this;
    }

    public final a E(Iterable iterable0) {
        Iterator iterator0 = this.b.iterator();
        Iterator iterator1 = iterable0.iterator();
        int v;
        for(v = 0; true; ++v) {
            boolean z = iterator1.hasNext();
            boolean z1 = iterator0.hasNext();
            if(!z1 || !z) {
                break;
            }
            Object object0 = iterator1.next();
            Object object1 = iterator0.next();
            if(!io.reactivex.internal.functions.b.c(object0, object1)) {
                throw this.W("Values at position " + v + " differ; expected: " + a.b0(object0) + " but was: " + a.b0(object1));
            }
        }
        if(z1) {
            throw this.W("More values received than expected (" + v + ")");
        }
        if(z) {
            throw this.W("Fewer values received than expected (" + v + ")");
        }
        return this;
    }

    public final a F(Iterable iterable0) {
        return this.w().E(iterable0).p().s();
    }

    public final a G(Collection collection0) {
        if(collection0.isEmpty()) {
            this.r();
            return this;
        }
        for(Object object0: this.b) {
            if(!collection0.contains(object0)) {
                throw this.W("Value not in the expected collection: " + a.b0(object0));
            }
            if(false) {
                break;
            }
        }
        return this;
    }

    public final a H(Collection collection0) {
        return this.w().G(collection0).p().s();
    }

    public final a I(Object[] arr_object) {
        int v = this.b.size();
        if(v != arr_object.length) {
            throw this.W("Value count differs; expected: " + arr_object.length + " " + Arrays.toString(arr_object) + " but was: " + v + " " + this.b);
        }
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = this.b.get(v1);
            Object object1 = arr_object[v1];
            if(!io.reactivex.internal.functions.b.c(object1, object0)) {
                throw this.W("Values at position " + v1 + " differ; expected: " + a.b0(object1) + " but was: " + a.b0(object0));
            }
        }
        return this;
    }

    public final a J(Object[] arr_object) {
        return this.w().I(arr_object).p().s();
    }

    public final a K() throws InterruptedException {
        if(this.a.getCount() == 0L) {
            return this;
        }
        this.a.await();
        return this;
    }

    public final boolean L(long v, TimeUnit timeUnit0) throws InterruptedException {
        boolean z = this.a.getCount() == 0L || this.a.await(v, timeUnit0);
        this.j = !z;
        return z;
    }

    public final a M(int v) {
        return this.O(v, b.d, 5000L);
    }

    public final a N(int v, Runnable runnable0) {
        return this.O(v, runnable0, 5000L);
    }

    public final a O(int v, Runnable runnable0, long v1) {
        long v2 = System.currentTimeMillis();
        while(true) {
            if(v1 > 0L && System.currentTimeMillis() - v2 >= v1) {
                this.j = true;
                return this;
            }
            if(this.a.getCount() == 0L || this.b.size() >= v) {
                return this;
            }
            runnable0.run();
        }
    }

    public final a P(long v, TimeUnit timeUnit0) {
        try {
            if(!this.a.await(v, timeUnit0)) {
                this.j = true;
                this.dispose();
                return this;
            }
            return this;
        }
        catch(InterruptedException interruptedException0) {
            this.dispose();
            throw k.f(interruptedException0);
        }
    }

    public final boolean Q() {
        try {
            this.K();
            return true;
        }
        catch(InterruptedException unused_ex) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public final boolean R(long v, TimeUnit timeUnit0) {
        try {
            return this.L(v, timeUnit0);
        }
        catch(InterruptedException unused_ex) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public final a S() {
        this.j = false;
        return this;
    }

    public final long T() {
        return this.d;
    }

    public final int U() {
        return this.c.size();
    }

    public final List V() {
        return this.c;
    }

    protected final AssertionError W(String s) {
        StringBuilder stringBuilder0 = new StringBuilder(s.length() + 0x40);
        stringBuilder0.append(s);
        stringBuilder0.append(" (");
        stringBuilder0.append("latch = ");
        stringBuilder0.append(this.a.getCount());
        stringBuilder0.append(", ");
        stringBuilder0.append("values = ");
        stringBuilder0.append(this.b.size());
        stringBuilder0.append(", ");
        stringBuilder0.append("errors = ");
        stringBuilder0.append(this.c.size());
        stringBuilder0.append(", ");
        stringBuilder0.append("completions = ");
        stringBuilder0.append(this.d);
        if(this.j) {
            stringBuilder0.append(", timeout!");
        }
        if(this.a()) {
            stringBuilder0.append(", disposed!");
        }
        CharSequence charSequence0 = this.i;
        if(charSequence0 != null) {
            stringBuilder0.append(", tag = ");
            stringBuilder0.append(charSequence0);
        }
        stringBuilder0.append(')');
        AssertionError assertionError0 = new AssertionError(stringBuilder0.toString());
        if(!this.c.isEmpty()) {
            if(this.c.size() == 1) {
                assertionError0.initCause(((Throwable)this.c.get(0)));
                return assertionError0;
            }
            assertionError0.initCause(new io.reactivex.exceptions.a(this.c));
        }
        return assertionError0;
    }

    public final List X() {
        List list0 = new ArrayList();
        list0.add(this.d0());
        list0.add(this.V());
        ArrayList arrayList0 = new ArrayList();
        for(long v = 0L; v < this.d; ++v) {
            arrayList0.add(A.a());
        }
        list0.add(arrayList0);
        return list0;
    }

    public final boolean Y() {
        return this.a.getCount() == 0L;
    }

    public final boolean Z() {
        return this.j;
    }

    public final Thread a0() {
        return this.e;
    }

    public static String b0(Object object0) {
        return object0 == null ? "null" : object0 + " (class: " + object0.getClass().getSimpleName() + ")";
    }

    public final a c() {
        long v = this.d;
        if(v == 0L) {
            throw this.W("Not completed");
        }
        if(v > 1L) {
            throw this.W("Multiple completions: " + v);
        }
        return this;
    }

    public final int c0() {
        return this.b.size();
    }

    public final a d() {
        return this.w().r().p().s();
    }

    public final List d0() {
        return this.b;
    }

    public final a e(r r0) {
        int v = this.c.size();
        if(v == 0) {
            throw this.W("No errors");
        }
        for(Object object0: this.c) {
            Throwable throwable0 = (Throwable)object0;
            try {
                if(r0.test(throwable0)) {
                    goto label_10;
                }
                goto label_13;
            }
            catch(Exception exception0) {
                throw k.f(exception0);
            }
        label_10:
            if(v != 1) {
                throw this.W("Error present but other errors as well");
            }
            return this;
        label_13:
            if(false) {
                break;
            }
        }
        throw this.W("Error not present");
    }

    public final a e0(CharSequence charSequence0) {
        this.i = charSequence0;
        return this;
    }

    public final a f(Class class0) {
        return this.e(io.reactivex.internal.functions.a.l(class0));
    }

    public final a h(Throwable throwable0) {
        return this.e(io.reactivex.internal.functions.a.i(throwable0));
    }

    public final a i(String s) {
        switch(this.c.size()) {
            case 0: {
                throw this.W("No errors");
            }
            case 1: {
                String s1 = ((Throwable)this.c.get(0)).getMessage();
                if(!io.reactivex.internal.functions.b.c(s, s1)) {
                    throw this.W("Error message differs; exptected: " + s + " but was: " + s1);
                }
                return this;
            }
            default: {
                throw this.W("Multiple errors");
            }
        }
    }

    public final a j(r r0, Object[] arr_object) {
        return this.w().I(arr_object).e(r0).s();
    }

    public final a k(Class class0, Object[] arr_object) {
        return this.w().I(arr_object).f(class0).s();
    }

    public final a l(Class class0, String s, Object[] arr_object) {
        return this.w().I(arr_object).f(class0).i(s).s();
    }

    public final a n(r r0) {
        int v = this.b.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = this.b.get(v1);
            try {
                if(r0.test(object0)) {
                    throw this.W("Value at position " + v1 + " matches predicate " + r0.toString() + ", which was not expected.");
                }
            }
            catch(Exception exception0) {
                throw k.f(exception0);
            }
        }
        return this;
    }

    public final a o(Object object0) {
        int v = this.b.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(io.reactivex.internal.functions.b.c(this.b.get(v1), object0)) {
                throw this.W("Value at position " + v1 + " is equal to " + a.b0(object0) + "; Expected them to be different");
            }
        }
        return this;
    }

    public final a p() {
        if(this.c.size() != 0) {
            throw this.W("Error(s) present: " + this.c);
        }
        return this;
    }

    public final a q() {
        if(this.j) {
            throw this.W("Timeout?!");
        }
        return this;
    }

    public final a r() {
        return this.D(0);
    }

    public final a s() {
        long v = this.d;
        int v1 = Long.compare(v, 1L);
        if(v1 == 0) {
            throw this.W("Completed!");
        }
        if(v1 > 0) {
            throw this.W("Multiple completions: " + v);
        }
        return this;
    }

    public abstract a t();

    public final a u() {
        if(this.a.getCount() == 0L) {
            throw this.W("Subscriber terminated!");
        }
        return this;
    }

    public final a v(Object[] arr_object) {
        return this.w().I(arr_object).p().c();
    }

    public abstract a w();

    public final a x() {
        if(this.a.getCount() != 0L) {
            throw this.W("Subscriber still running!");
        }
        long v = this.d;
        if(v > 1L) {
            throw this.W("Terminated with multiple completions: " + v);
        }
        int v1 = this.c.size();
        if(v1 > 1) {
            throw this.W("Terminated with multiple errors: " + v1);
        }
        if(v != 0L && v1 != 0) {
            throw this.W("Terminated with multiple completions and errors: " + v);
        }
        return this;
    }

    public final a y() {
        if(!this.j) {
            throw this.W("No timeout?!");
        }
        return this;
    }

    public final a z(r r0) {
        this.B(0, r0);
        if(this.b.size() > 1) {
            throw this.W("Value present but other values as well");
        }
        return this;
    }
}

