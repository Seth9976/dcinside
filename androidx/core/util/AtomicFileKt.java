package androidx.core.util;

import android.util.AtomicFile;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.f;
import y4.l;

@s0({"SMAP\nAtomicFile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n1#1,72:1\n30#1,13:73\n*S KotlinDebug\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n46#1:73,13\n*E\n"})
public final class AtomicFileKt {
    @l
    public static final byte[] a(@l AtomicFile atomicFile0) {
        return atomicFile0.readFully();
    }

    @l
    public static final String b(@l AtomicFile atomicFile0, @l Charset charset0) {
        return new String(atomicFile0.readFully(), charset0);
    }

    public static String c(AtomicFile atomicFile0, Charset charset0, int v, Object object0) {
        if((v & 1) != 0) {
            charset0 = f.b;
        }
        return AtomicFileKt.b(atomicFile0, charset0);
    }

    public static final void d(@l AtomicFile atomicFile0, @l Function1 function10) {
        FileOutputStream fileOutputStream0 = atomicFile0.startWrite();
        try {
            function10.invoke(fileOutputStream0);
        }
        catch(Throwable throwable0) {
            atomicFile0.failWrite(fileOutputStream0);
            throw throwable0;
        }
        atomicFile0.finishWrite(fileOutputStream0);
    }

    public static final void e(@l AtomicFile atomicFile0, @l byte[] arr_b) {
        FileOutputStream fileOutputStream0 = atomicFile0.startWrite();
        try {
            fileOutputStream0.write(arr_b);
        }
        catch(Throwable throwable0) {
            atomicFile0.failWrite(fileOutputStream0);
            throw throwable0;
        }
        atomicFile0.finishWrite(fileOutputStream0);
    }

    public static final void f(@l AtomicFile atomicFile0, @l String s, @l Charset charset0) {
        byte[] arr_b = s.getBytes(charset0);
        L.o(arr_b, "this as java.lang.String).getBytes(charset)");
        AtomicFileKt.e(atomicFile0, arr_b);
    }

    public static void g(AtomicFile atomicFile0, String s, Charset charset0, int v, Object object0) {
        if((v & 2) != 0) {
            charset0 = f.b;
        }
        AtomicFileKt.f(atomicFile0, s, charset0);
    }
}

