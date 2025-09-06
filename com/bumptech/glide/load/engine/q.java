package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.g;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class q extends Exception {
    static final class a implements Appendable {
        private final Appendable a;
        private boolean b;
        private static final String c = "";
        private static final String d = "  ";

        a(Appendable appendable0) {
            this.b = true;
            this.a = appendable0;
        }

        @NonNull
        private CharSequence a(@Nullable CharSequence charSequence0) {
            return charSequence0 == null ? "" : charSequence0;
        }

        @Override
        public Appendable append(char c) throws IOException {
            boolean z = false;
            if(this.b) {
                this.b = false;
                this.a.append("  ");
            }
            if(c == 10) {
                z = true;
            }
            this.b = z;
            this.a.append(c);
            return this;
        }

        @Override
        public Appendable append(@Nullable CharSequence charSequence0) throws IOException {
            CharSequence charSequence1 = this.a(charSequence0);
            return this.append(charSequence1, 0, charSequence1.length());
        }

        @Override
        public Appendable append(@Nullable CharSequence charSequence0, int v, int v1) throws IOException {
            CharSequence charSequence1 = this.a(charSequence0);
            boolean z = false;
            if(this.b) {
                this.b = false;
                this.a.append("  ");
            }
            if(charSequence1.length() > 0 && charSequence1.charAt(v1 - 1) == 10) {
                z = true;
            }
            this.b = z;
            this.a.append(charSequence1, v, v1);
            return this;
        }
    }

    private final List a;
    private g b;
    private com.bumptech.glide.load.a c;
    private Class d;
    private String e;
    @Nullable
    private Exception f;
    private static final long g = 1L;
    private static final StackTraceElement[] h;

    static {
        q.h = new StackTraceElement[0];
    }

    public q(String s) {
        this(s, Collections.emptyList());
    }

    public q(String s, Throwable throwable0) {
        this(s, Collections.singletonList(throwable0));
    }

    public q(String s, List list0) {
        this.e = s;
        this.setStackTrace(q.h);
        this.a = list0;
    }

    private void a(Throwable throwable0, List list0) {
        if(throwable0 instanceof q) {
            for(Object object0: ((q)throwable0).e()) {
                this.a(((Throwable)object0), list0);
            }
            return;
        }
        list0.add(throwable0);
    }

    private static void b(List list0, Appendable appendable0) {
        try {
            q.c(list0, appendable0);
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
    }

    private static void c(List list0, Appendable appendable0) throws IOException {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            appendable0.append("Cause (").append(String.valueOf(v1 + 1)).append(" of ").append(String.valueOf(v)).append("): ");
            Throwable throwable0 = (Throwable)list0.get(v1);
            if(throwable0 instanceof q) {
                ((q)throwable0).i(appendable0);
            }
            else {
                q.d(throwable0, appendable0);
            }
        }
    }

    private static void d(Throwable throwable0, Appendable appendable0) {
        try {
            appendable0.append(throwable0.getClass().toString()).append(": ").append(throwable0.getMessage()).append('\n');
        }
        catch(IOException unused_ex) {
            throw new RuntimeException(throwable0);
        }
    }

    public List e() {
        return this.a;
    }

    @Nullable
    public Exception f() {
        return this.f;
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }

    public List g() {
        List list0 = new ArrayList();
        this.a(this, list0);
        return list0;
    }

    @Override
    public String getMessage() {
        StringBuilder stringBuilder0 = new StringBuilder(71);
        stringBuilder0.append(this.e);
        String s = "";
        stringBuilder0.append((this.d == null ? "" : ", " + this.d));
        stringBuilder0.append((this.c == null ? "" : ", " + this.c));
        if(this.b != null) {
            s = ", " + this.b;
        }
        stringBuilder0.append(s);
        List list0 = this.g();
        if(list0.isEmpty()) {
            return stringBuilder0.toString();
        }
        if(list0.size() == 1) {
            stringBuilder0.append("\nThere was 1 root cause:");
        }
        else {
            stringBuilder0.append("\nThere were ");
            stringBuilder0.append(list0.size());
            stringBuilder0.append(" root causes:");
        }
        for(Object object0: list0) {
            stringBuilder0.append('\n');
            stringBuilder0.append(((Throwable)object0).getClass().getName());
            stringBuilder0.append('(');
            stringBuilder0.append(((Throwable)object0).getMessage());
            stringBuilder0.append(')');
        }
        stringBuilder0.append("\n call GlideException#logRootCauses(String) for more detail");
        return stringBuilder0.toString();
    }

    public void h(String s) {
        List list0 = this.g();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Log.i(s, "Root cause (" + (v1 + 1) + " of " + v + ")", ((Throwable)list0.get(v1)));
        }
    }

    private void i(Appendable appendable0) {
        q.d(this, appendable0);
        q.b(this.e(), new a(appendable0));
    }

    void j(g g0, com.bumptech.glide.load.a a0) {
        this.k(g0, a0, null);
    }

    void k(g g0, com.bumptech.glide.load.a a0, Class class0) {
        this.b = g0;
        this.c = a0;
        this.d = class0;
    }

    public void l(@Nullable Exception exception0) {
        this.f = exception0;
    }

    @Override
    public void printStackTrace() {
        this.printStackTrace(System.err);
    }

    @Override
    public void printStackTrace(PrintStream printStream0) {
        this.i(printStream0);
    }

    @Override
    public void printStackTrace(PrintWriter printWriter0) {
        this.i(printWriter0);
    }
}

