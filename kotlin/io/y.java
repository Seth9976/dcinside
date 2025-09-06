package kotlin.io;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.S0;
import kotlin.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.m;
import kotlin.sequences.p;
import y4.l;
import z3.i;

@s0({"SMAP\nReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,157:1\n54#1,4:158\n1#2:162\n1#2:165\n1317#3,2:163\n*S KotlinDebug\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n*L\n35#1:158,4\n35#1:162\n35#1:163,2\n*E\n"})
@i(name = "TextStreamsKt")
public final class y {
    @f
    private static final BufferedReader a(Reader reader0, int v) {
        L.p(reader0, "<this>");
        return reader0 instanceof BufferedReader ? ((BufferedReader)reader0) : new BufferedReader(reader0, v);
    }

    @f
    private static final BufferedWriter b(Writer writer0, int v) {
        L.p(writer0, "<this>");
        return writer0 instanceof BufferedWriter ? ((BufferedWriter)writer0) : new BufferedWriter(writer0, v);
    }

    static BufferedReader c(Reader reader0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0x2000;
        }
        L.p(reader0, "<this>");
        return reader0 instanceof BufferedReader ? ((BufferedReader)reader0) : new BufferedReader(reader0, v);
    }

    static BufferedWriter d(Writer writer0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0x2000;
        }
        L.p(writer0, "<this>");
        return writer0 instanceof BufferedWriter ? ((BufferedWriter)writer0) : new BufferedWriter(writer0, v);
    }

    public static final long e(@l Reader reader0, @l Writer writer0, int v) {
        L.p(reader0, "<this>");
        L.p(writer0, "out");
        char[] arr_c = new char[v];
        int v1 = reader0.read(arr_c);
        long v2 = 0L;
        while(v1 >= 0) {
            writer0.write(arr_c, 0, v1);
            v2 += (long)v1;
            v1 = reader0.read(arr_c);
        }
        return v2;
    }

    public static long f(Reader reader0, Writer writer0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0x2000;
        }
        return y.e(reader0, writer0, v);
    }

    public static final void g(@l Reader reader0, @l Function1 function10) {
        L.p(reader0, "<this>");
        L.p(function10, "action");
        BufferedReader bufferedReader0 = reader0 instanceof BufferedReader ? ((BufferedReader)reader0) : new BufferedReader(reader0, 0x2000);
        try {
            Iterator iterator0 = y.h(bufferedReader0).iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    goto label_13;
                }
                Object object0 = iterator0.next();
                function10.invoke(object0);
            }
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            c.a(bufferedReader0, throwable0);
            throw throwable1;
        }
    label_13:
        c.a(bufferedReader0, null);
    }

    @l
    public static final m h(@l BufferedReader bufferedReader0) {
        L.p(bufferedReader0, "<this>");
        return p.f(new s(bufferedReader0));
    }

    @l
    public static final byte[] i(@l URL uRL0) {
        byte[] arr_b;
        L.p(uRL0, "<this>");
        InputStream inputStream0 = FirebasePerfUrlConnection.openStream(uRL0);
        try {
            L.m(inputStream0);
            arr_b = b.p(inputStream0);
        }
        catch(Throwable throwable0) {
            c.a(inputStream0, throwable0);
            throw throwable0;
        }
        c.a(inputStream0, null);
        return arr_b;
    }

    @l
    public static final List j(@l Reader reader0) {
        static final class a extends N implements Function1 {
            final ArrayList e;

            a(ArrayList arrayList0) {
                this.e = arrayList0;
                super(1);
            }

            public final void b(String s) {
                L.p(s, "it");
                this.e.add(s);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((String)object0));
                return S0.a;
            }
        }

        L.p(reader0, "<this>");
        List list0 = new ArrayList();
        y.g(reader0, new a(((ArrayList)list0)));
        return list0;
    }

    @l
    public static final String k(@l Reader reader0) {
        L.p(reader0, "<this>");
        StringWriter stringWriter0 = new StringWriter();
        y.f(reader0, stringWriter0, 0, 2, null);
        String s = stringWriter0.toString();
        L.o(s, "toString(...)");
        return s;
    }

    @f
    private static final String l(URL uRL0, Charset charset0) {
        L.p(uRL0, "<this>");
        L.p(charset0, "charset");
        return new String(y.i(uRL0), charset0);
    }

    static String m(URL uRL0, Charset charset0, int v, Object object0) {
        if((v & 1) != 0) {
            charset0 = kotlin.text.f.b;
        }
        L.p(uRL0, "<this>");
        L.p(charset0, "charset");
        return new String(y.i(uRL0), charset0);
    }

    @f
    private static final StringReader n(String s) {
        L.p(s, "<this>");
        return new StringReader(s);
    }

    public static final Object o(@l Reader reader0, @l Function1 function10) {
        Object object0;
        L.p(reader0, "<this>");
        L.p(function10, "block");
        BufferedReader bufferedReader0 = reader0 instanceof BufferedReader ? ((BufferedReader)reader0) : new BufferedReader(reader0, 0x2000);
        try {
            object0 = function10.invoke(y.h(bufferedReader0));
        }
        catch(Throwable throwable0) {
            c.a(bufferedReader0, throwable0);
            throw throwable0;
        }
        c.a(bufferedReader0, null);
        return object0;
    }
}

