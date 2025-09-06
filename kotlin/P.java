package kotlin;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import kotlin.internal.e;
import kotlin.internal.f;
import kotlin.internal.m;
import kotlin.jvm.internal.L;
import y4.l;

class p {
    @h0(version = "1.1")
    @e
    public static void a(@l Throwable throwable0, @l Throwable throwable1) {
        L.p(throwable0, "<this>");
        L.p(throwable1, "exception");
        if(throwable0 != throwable1) {
            m.a.a(throwable0, throwable1);
        }
    }

    @l
    public static final StackTraceElement[] b(@l Throwable throwable0) {
        L.p(throwable0, "<this>");
        StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
        L.m(arr_stackTraceElement);
        return arr_stackTraceElement;
    }

    public static void c(Throwable throwable0) {
    }

    @l
    public static final List d(@l Throwable throwable0) {
        L.p(throwable0, "<this>");
        return m.a.d(throwable0);
    }

    @h0(version = "1.4")
    public static void e(Throwable throwable0) {
    }

    @f
    private static final void f(Throwable throwable0) {
        L.p(throwable0, "<this>");
        throwable0.printStackTrace();
    }

    @f
    private static final void g(Throwable throwable0, PrintStream printStream0) {
        L.p(throwable0, "<this>");
        L.p(printStream0, "stream");
        throwable0.printStackTrace(printStream0);
    }

    @f
    private static final void h(Throwable throwable0, PrintWriter printWriter0) {
        L.p(throwable0, "<this>");
        L.p(printWriter0, "writer");
        throwable0.printStackTrace(printWriter0);
    }

    @h0(version = "1.4")
    @l
    public static final String i(@l Throwable throwable0) {
        L.p(throwable0, "<this>");
        StringWriter stringWriter0 = new StringWriter();
        PrintWriter printWriter0 = new PrintWriter(stringWriter0);
        throwable0.printStackTrace(printWriter0);
        printWriter0.flush();
        String s = stringWriter0.toString();
        L.o(s, "toString(...)");
        return s;
    }
}

