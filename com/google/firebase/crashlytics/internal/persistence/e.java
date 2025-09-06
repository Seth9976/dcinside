package com.google.firebase.crashlytics.internal.persistence;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.common.m;
import com.google.firebase.crashlytics.internal.metadata.o;
import com.google.firebase.crashlytics.internal.model.F.a;
import com.google.firebase.crashlytics.internal.model.F.f.d;
import com.google.firebase.crashlytics.internal.model.F.f;
import com.google.firebase.crashlytics.internal.model.F;
import com.google.firebase.crashlytics.internal.model.serialization.j;
import com.google.firebase.crashlytics.internal.settings.k;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

public class e {
    private final AtomicInteger a;
    private final g b;
    private final k c;
    private final m d;
    private static final Charset e = null;
    private static final int f = 8;
    private static final String g = "report";
    private static final String h = "start-time";
    private static final String i = "event";
    private static final int j = 10;
    private static final String k = "%010d";
    private static final int l = 0;
    private static final String m = "_";
    private static final String n = "";
    private static final j o;
    private static final Comparator p;
    private static final FilenameFilter q;

    static {
        e.e = Charset.forName("UTF-8");
        e.l = 15;
        e.o = new j();
        e.p = (File file0, File file1) -> file1.getName().compareTo(file0.getName());
        e.q = (File file0, String s) -> s.startsWith("event");
    }

    public e(g g0, k k0, m m0) {
        this.a = new AtomicInteger(0);
        this.b = g0;
        this.c = k0;
        this.d = m0;
    }

    public void A(@NonNull F f0) {
        f f$f0 = f0.n();
        if(f$f0 == null) {
            com.google.firebase.crashlytics.internal.g.f().b("Could not get session for report");
            return;
        }
        String s = f$f0.i();
        try {
            String s1 = e.o.O(f0);
            e.G(this.b.r(s, "report"), s1);
            e.H(this.b.r(s, "start-time"), "", f$f0.l());
        }
        catch(IOException iOException0) {
            com.google.firebase.crashlytics.internal.g.f().c("Could not persist report for session " + s, iOException0);
        }
    }

    @NonNull
    private static String B(@NonNull File file0) throws IOException {
        byte[] arr_b = new byte[0x2000];
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try(FileInputStream fileInputStream0 = new FileInputStream(file0)) {
            int v;
            while((v = fileInputStream0.read(arr_b)) > 0) {
                byteArrayOutputStream0.write(arr_b, 0, v);
            }
            return new String(byteArrayOutputStream0.toByteArray(), e.e);
        }
    }

    private void C(@NonNull File file0, @NonNull com.google.firebase.crashlytics.internal.model.F.e f$e0, @NonNull String s, a f$a0) {
        String s1 = this.d.d(s);
        try {
            String s2 = e.B(file0);
            F f0 = e.o.N(s2).v(f$e0).r(f$a0).q(s1);
            e.G(this.b.j(s), e.o.O(f0));
        }
        catch(IOException iOException0) {
            com.google.firebase.crashlytics.internal.g.f().n("Could not synthesize final native report file for " + file0, iOException0);
        }
    }

    private void D(String s, long v) {
        boolean z;
        List list0 = this.b.s(s, e.q);
        if(list0.isEmpty()) {
            com.google.firebase.crashlytics.internal.g.f().k("Session " + s + " has no events.");
            return;
        }
        Collections.sort(list0);
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = list0.iterator();
    alab1:
        while(true) {
            z = false;
            while(true) {
                if(!iterator0.hasNext()) {
                    break alab1;
                }
                Object object0 = iterator0.next();
                File file0 = (File)object0;
                try {
                    String s1 = e.B(file0);
                    arrayList0.add(e.o.l(s1));
                    if(!z && !e.s(file0.getName())) {
                        break;
                    }
                }
                catch(IOException iOException0) {
                    com.google.firebase.crashlytics.internal.g.f().n("Could not add event to report for " + file0, iOException0);
                    continue;
                }
                z = true;
            }
        }
        if(arrayList0.isEmpty()) {
            com.google.firebase.crashlytics.internal.g.f().m("Could not parse event files for session " + s);
            return;
        }
        String s2 = o.n(s, this.b);
        String s3 = this.d.d(s);
        this.E(this.b.r(s, "report"), arrayList0, v, z, s2, s3);
    }

    private void E(@NonNull File file0, @NonNull List list0, long v, boolean z, @Nullable String s, @Nullable String s1) {
        File file1;
        try {
            j j0 = e.o;
            F f0 = j0.N(e.B(file0)).x(v, z, s).q(s1).s(list0);
            f f$f0 = f0.n();
            if(f$f0 == null) {
                return;
            }
            com.google.firebase.crashlytics.internal.g.f().b("appQualitySessionId: " + s1);
            if(z) {
                String s2 = f$f0.i();
                file1 = this.b.m(s2);
            }
            else {
                String s3 = f$f0.i();
                file1 = this.b.o(s3);
            }
            e.G(file1, j0.O(f0));
            return;
        }
        catch(IOException iOException0) {
        }
        com.google.firebase.crashlytics.internal.g.f().n("Could not synthesize final report file for " + file0, iOException0);
    }

    private int F(String s, int v) {
        c c0 = (File file0, String s) -> // 去混淆评级： 低(20)
        s.startsWith("event") && !s.endsWith("_");
        List list0 = this.b.s(s, c0);
        Collections.sort(list0, (File file0, File file1) -> e.o(file0.getName()).compareTo(e.o(file1.getName())));
        return e.f(list0, v);
    }

    private static void G(File file0, String s) throws IOException {
        try(OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(new FileOutputStream(file0), e.e)) {
            outputStreamWriter0.write(s);
        }
    }

    private static void H(File file0, String s, long v) throws IOException {
        try(OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(new FileOutputStream(file0), e.e)) {
            outputStreamWriter0.write(s);
            file0.setLastModified(v * 1000L);
        }
    }

    private SortedSet e(@Nullable String s) {
        this.b.d();
        SortedSet sortedSet0 = this.p();
        if(s != null) {
            sortedSet0.remove(s);
        }
        if(sortedSet0.size() <= 8) {
            return sortedSet0;
        }
        while(sortedSet0.size() > 8) {
            String s1 = (String)sortedSet0.last();
            com.google.firebase.crashlytics.internal.g.f().b("Removing session over cap: " + s1);
            this.b.f(s1);
            sortedSet0.remove(s1);
        }
        return sortedSet0;
    }

    private static int f(List list0, int v) {
        int v1 = list0.size();
        for(Object object0: list0) {
            if(v1 <= v) {
                return v1;
            }
            g.w(((File)object0));
            --v1;
        }
        return v1;
    }

    private void g() {
        int v = this.c.a().a.b;
        List list0 = this.n();
        int v1 = list0.size();
        if(v1 <= v) {
            return;
        }
        for(Object object0: list0.subList(v, v1)) {
            ((File)object0).delete();
        }
    }

    private static long h(long v) [...] // Inlined contents

    public void i() {
        this.j(this.b.p());
        this.j(this.b.n());
        this.j(this.b.k());
    }

    private void j(List list0) {
        for(Object object0: list0) {
            ((File)object0).delete();
        }
    }

    public void k(@Nullable String s, long v) {
        for(Object object0: this.e(s)) {
            com.google.firebase.crashlytics.internal.g.f().k("Finalizing report for session " + ((String)object0));
            this.D(((String)object0), v);
            this.b.f(((String)object0));
        }
        this.g();
    }

    public void l(String s, com.google.firebase.crashlytics.internal.model.F.e f$e0, a f$a0) {
        File file0 = this.b.r(s, "report");
        com.google.firebase.crashlytics.internal.g.f().b("Writing native session report for " + s + " to file: " + file0);
        this.C(file0, f$e0, s, f$a0);
    }

    @NonNull
    private static String m(int v, boolean z) {
        String s = String.format(Locale.US, "%010d", v);
        return z ? "event" + s + "_" : "event" + s + "";
    }

    private List n() {
        List list0 = new ArrayList();
        list0.addAll(this.b.n());
        list0.addAll(this.b.k());
        Collections.sort(list0, e.p);
        List list1 = this.b.p();
        Collections.sort(list1, e.p);
        list0.addAll(list1);
        return list0;
    }

    @NonNull
    private static String o(@NonNull String s) {
        return s.substring(0, e.l);
    }

    public SortedSet p() {
        return new TreeSet(this.b.g()).descendingSet();
    }

    public long q(String s) {
        return this.b.r(s, "start-time").lastModified();
    }

    // 去混淆评级： 低(30)
    public boolean r() {
        return !this.b.p().isEmpty() || !this.b.n().isEmpty() || !this.b.k().isEmpty();
    }

    // 去混淆评级： 低(20)
    private static boolean s(@NonNull String s) {
        return s.startsWith("event") && s.endsWith("_");
    }

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static boolean t(@NonNull File file0, @NonNull String s) [...]

    // 检测为 Lambda 实现
    private static int u(File file0, File file1) [...]

    // 检测为 Lambda 实现
    private static boolean v(File file0, String s) [...]

    @NonNull
    public List w() {
        List list0 = this.n();
        List list1 = new ArrayList();
        for(Object object0: list0) {
            File file0 = (File)object0;
            try {
                String s = e.B(file0);
                ((ArrayList)list1).add(com.google.firebase.crashlytics.internal.common.F.a(e.o.N(s), file0.getName(), file0));
            }
            catch(IOException iOException0) {
                com.google.firebase.crashlytics.internal.g.f().n("Could not load report file " + file0 + "; deleting", iOException0);
                file0.delete();
            }
        }
        return list1;
    }

    // 检测为 Lambda 实现
    private static int x(@NonNull File file0, @NonNull File file1) [...]

    public void y(@NonNull d f$f$d0, @NonNull String s) {
        this.z(f$f$d0, s, false);
    }

    public void z(@NonNull d f$f$d0, @NonNull String s, boolean z) {
        int v = this.c.a().a.a;
        String s1 = e.o.m(f$f$d0);
        String s2 = e.m(this.a.getAndIncrement(), z);
        try {
            e.G(this.b.r(s, s2), s1);
        }
        catch(IOException iOException0) {
            com.google.firebase.crashlytics.internal.g.f().n("Could not persist event for session " + s, iOException0);
        }
        this.F(s, v);
    }
}

