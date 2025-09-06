package androidx.sqlite.util;

import android.util.Log;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@RestrictTo({Scope.b})
@s0({"SMAP\nProcessLock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessLock.kt\nandroidx/sqlite/util/ProcessLock\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
public final class ProcessLock {
    @s0({"SMAP\nProcessLock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessLock.kt\nandroidx/sqlite/util/ProcessLock$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,103:1\n361#2,7:104\n*S KotlinDebug\n*F\n+ 1 ProcessLock.kt\nandroidx/sqlite/util/ProcessLock$Companion\n*L\n99#1:104,7\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        private final Lock b(String s) {
            synchronized(ProcessLock.g) {
                Map map1 = ProcessLock.g;
                ReentrantLock reentrantLock0 = map1.get(s);
                if(reentrantLock0 == null) {
                    reentrantLock0 = new ReentrantLock();
                    map1.put(s, reentrantLock0);
                }
                return reentrantLock0;
            }
        }
    }

    private final boolean a;
    @m
    private final File b;
    @l
    private final Lock c;
    @m
    private FileChannel d;
    @l
    public static final Companion e = null;
    @l
    private static final String f = "SupportSQLiteLock";
    @l
    private static final Map g;

    static {
        ProcessLock.e = new Companion(null);
        ProcessLock.g = new HashMap();
    }

    public ProcessLock(@l String s, @m File file0, boolean z) {
        L.p(s, "name");
        super();
        this.a = z;
        this.b = file0 == null ? null : new File(file0, s + ".lck");
        this.c = ProcessLock.e.b(s);
    }

    public final void b(boolean z) {
        this.c.lock();
        if(z) {
            try {
                File file0 = this.b;
                if(file0 == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File file1 = file0.getParentFile();
                if(file1 != null) {
                    file1.mkdirs();
                }
                FileChannel fileChannel0 = new FileOutputStream(this.b).getChannel();
                fileChannel0.lock();
                this.d = fileChannel0;
                return;
            }
            catch(IOException iOException0) {
            }
            this.d = null;
            Log.w("SupportSQLiteLock", "Unable to grab file lock.", iOException0);
        }
    }

    public static void c(ProcessLock processLock0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = processLock0.a;
        }
        processLock0.b(z);
    }

    public final void d() {
        FileChannel fileChannel0 = this.d;
        if(fileChannel0 != null) {
            try {
                fileChannel0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        this.c.unlock();
    }
}

