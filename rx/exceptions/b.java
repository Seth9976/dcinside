package rx.exceptions;

import j..util.DesugarCollections;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public final class b extends RuntimeException {
    static final class a extends RuntimeException {
        private static final long a = 3875212506787802066L;
        static final String b = "Chain of Causes for CompositeException In Order Received =>";

        @Override
        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    static abstract class rx.exceptions.b.b {
        abstract Object a();

        abstract void b(Object arg1);
    }

    static final class c extends rx.exceptions.b.b {
        private final PrintStream a;

        c(PrintStream printStream0) {
            this.a = printStream0;
        }

        @Override  // rx.exceptions.b$b
        Object a() {
            return this.a;
        }

        @Override  // rx.exceptions.b$b
        void b(Object object0) {
            this.a.println(object0);
        }
    }

    static final class d extends rx.exceptions.b.b {
        private final PrintWriter a;

        d(PrintWriter printWriter0) {
            this.a = printWriter0;
        }

        @Override  // rx.exceptions.b$b
        Object a() {
            return this.a;
        }

        @Override  // rx.exceptions.b$b
        void b(Object object0) {
            this.a.println(object0);
        }
    }

    private final List a;
    private final String b;
    private Throwable c;
    private static final long d = 0x29FFCC6947B49592L;

    @Deprecated
    public b(String s, Collection collection0) {
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        ArrayList arrayList0 = new ArrayList();
        if(collection0 == null) {
            linkedHashSet0.add(new NullPointerException());
        }
        else {
            for(Object object0: collection0) {
                Throwable throwable0 = (Throwable)object0;
                if(throwable0 instanceof b) {
                    linkedHashSet0.addAll(((b)throwable0).b());
                }
                else if(throwable0 == null) {
                    linkedHashSet0.add(new NullPointerException());
                }
                else {
                    linkedHashSet0.add(throwable0);
                }
            }
        }
        arrayList0.addAll(linkedHashSet0);
        List list0 = DesugarCollections.unmodifiableList(arrayList0);
        this.a = list0;
        this.b = list0.size() + " exceptions occurred. ";
    }

    public b(Collection collection0) {
        this(null, collection0);
    }

    public b(Throwable[] arr_throwable) {
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        ArrayList arrayList0 = new ArrayList();
        if(arr_throwable == null) {
            linkedHashSet0.add(new NullPointerException());
        }
        else {
            for(int v = 0; v < arr_throwable.length; ++v) {
                Throwable throwable0 = arr_throwable[v];
                if(throwable0 instanceof b) {
                    linkedHashSet0.addAll(((b)throwable0).b());
                }
                else if(throwable0 == null) {
                    linkedHashSet0.add(new NullPointerException());
                }
                else {
                    linkedHashSet0.add(throwable0);
                }
            }
        }
        arrayList0.addAll(linkedHashSet0);
        List list0 = DesugarCollections.unmodifiableList(arrayList0);
        this.a = list0;
        this.b = list0.size() + " exceptions occurred. ";
    }

    private void a(StringBuilder stringBuilder0, Throwable throwable0, String s) {
        stringBuilder0.append(s);
        stringBuilder0.append(throwable0);
        stringBuilder0.append('\n');
        StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
        for(int v = 0; v < arr_stackTraceElement.length; ++v) {
            StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
            stringBuilder0.append("\t\tat ");
            stringBuilder0.append(stackTraceElement0);
            stringBuilder0.append('\n');
        }
        if(throwable0.getCause() != null) {
            stringBuilder0.append("\tCaused by: ");
            this.a(stringBuilder0, throwable0.getCause(), "");
        }
    }

    public List b() {
        return this.a;
    }

    private List c(Throwable throwable0) {
        List list0 = new ArrayList();
        Throwable throwable1 = throwable0.getCause();
        if(throwable1 != null && throwable1 != throwable0) {
            while(true) {
                list0.add(throwable1);
                Throwable throwable2 = throwable1.getCause();
                if(throwable2 == null || throwable2 == throwable1) {
                    break;
                }
                throwable1 = throwable1.getCause();
            }
        }
        return list0;
    }

    private Throwable d(Throwable throwable0) {
        Throwable throwable1 = throwable0.getCause();
        if(throwable1 != null && throwable1 != throwable0) {
            while(true) {
                Throwable throwable2 = throwable1.getCause();
                if(throwable2 == null || throwable2 == throwable1) {
                    break;
                }
                throwable1 = throwable1.getCause();
            }
            return throwable1;
        }
        return throwable0;
    }

    private void e(rx.exceptions.b.b b$b0) {
        StringBuilder stringBuilder0 = new StringBuilder(0x80);
        stringBuilder0.append(this);
        stringBuilder0.append('\n');
        StackTraceElement[] arr_stackTraceElement = this.getStackTrace();
        for(int v = 0; v < arr_stackTraceElement.length; ++v) {
            StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
            stringBuilder0.append("\tat ");
            stringBuilder0.append(stackTraceElement0);
            stringBuilder0.append('\n');
        }
        int v1 = 1;
        for(Object object0: this.a) {
            stringBuilder0.append("  ComposedException ");
            stringBuilder0.append(v1);
            stringBuilder0.append(" :\n");
            this.a(stringBuilder0, ((Throwable)object0), "\t");
            ++v1;
        }
        synchronized(b$b0.a()) {
            b$b0.b(stringBuilder0.toString());
        }
    }

    @Override
    public Throwable getCause() {
        synchronized(this) {
            if(this.c == null) {
                a b$a0 = new a();
                HashSet hashSet0 = new HashSet();
                Throwable throwable0 = b$a0;
                for(Object object0: this.a) {
                    Throwable throwable1 = (Throwable)object0;
                    if(!hashSet0.contains(throwable1)) {
                        hashSet0.add(throwable1);
                        for(Object object1: this.c(throwable1)) {
                            Throwable throwable2 = (Throwable)object1;
                            if(hashSet0.contains(throwable2)) {
                                throwable1 = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            }
                            else {
                                hashSet0.add(throwable2);
                            }
                        }
                        try {
                            throwable0.initCause(throwable1);
                        }
                        catch(Throwable unused_ex) {
                        }
                        throwable0 = this.d(throwable0);
                    }
                }
                this.c = b$a0;
            }
            return this.c;
        }
    }

    @Override
    public String getMessage() {
        return this.b;
    }

    @Override
    public void printStackTrace() {
        this.printStackTrace(System.err);
    }

    @Override
    public void printStackTrace(PrintStream printStream0) {
        this.e(new c(printStream0));
    }

    @Override
    public void printStackTrace(PrintWriter printWriter0) {
        this.e(new d(printWriter0));
    }
}

