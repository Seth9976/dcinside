package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import jeb.synthetic.FIN;
import kotlin.collections.u;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.w;
import kotlin.sequences.p;
import kotlin.text.v;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.B;
import okio.Z;
import okio.n;
import y4.l;
import y4.m;

public final class PublicSuffixDatabase {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // This method was un-flattened
        private final String binarySearch(byte[] arr_b, byte[][] arr2_b, int v) {
            int v6;
            int v1 = arr_b.length;
            int v2 = 0;
            while(v2 < v1) {
                int v3;
                for(v3 = (v2 + v1) / 2; v3 > -1 && arr_b[v3] != 10; --v3) {
                }
                int v4 = v3 + 1;
                for(int v5 = 1; true; ++v5) {
                    v6 = v4 + v5;
                    if(arr_b[v6] == 10) {
                        break;
                    }
                }
                int v7 = v6 - v4;
                int v8 = v;
                int v9 = 0;
                int v10 = 0;
            alab1:
                while(true) {
                    for(int v11 = Util.and(arr2_b[v8][v9], ((byte)0xFF)); true; v11 = 46) {
                        int v12 = v11 - Util.and(arr_b[v4 + v10], ((byte)0xFF));
                        if(v12 != 0) {
                            break alab1;
                        }
                        ++v10;
                        ++v9;
                        if(v10 == v7) {
                            break alab1;
                        }
                        if(arr2_b[v8].length != v9) {
                            break;
                        }
                        if(v8 == arr2_b.length - 1) {
                            break alab1;
                        }
                        ++v8;
                        v9 = -1;
                    }
                }
                if(v12 >= 0) {
                    if(v12 <= 0) {
                        int v13 = v7 - v10;
                        int v14 = arr2_b[v8].length - v9;
                        for(int v15 = v8 + 1; v15 < arr2_b.length; ++v15) {
                            v14 += arr2_b[v15].length;
                        }
                        if(v14 >= v13) {
                            if(v14 <= v13) {
                                Charset charset0 = StandardCharsets.UTF_8;
                                L.o(charset0, "UTF_8");
                                return new String(arr_b, v4, v7, charset0);
                            }
                            v2 = v6 + 1;
                            continue;
                        }
                    }
                    else {
                        v2 = v6 + 1;
                        continue;
                    }
                }
                v1 = v3;
            }
            return null;
        }

        @l
        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }
    }

    @l
    public static final Companion Companion = null;
    private static final char EXCEPTION_MARKER = '!';
    @l
    private static final List PREVAILING_RULE = null;
    @l
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    @l
    private static final byte[] WILDCARD_LABEL;
    @l
    private static final PublicSuffixDatabase instance;
    @l
    private final AtomicBoolean listRead;
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    @l
    private final CountDownLatch readCompleteLatch;

    static {
        PublicSuffixDatabase.Companion = new Companion(null);
        PublicSuffixDatabase.WILDCARD_LABEL = new byte[]{42};
        PublicSuffixDatabase.PREVAILING_RULE = u.k("*");
        PublicSuffixDatabase.instance = new PublicSuffixDatabase();
    }

    public PublicSuffixDatabase() {
        this.listRead = new AtomicBoolean(false);
        this.readCompleteLatch = new CountDownLatch(1);
    }

    private final List findMatchingRule(List list0) {
        List list2;
        List list1;
        String s2;
        String s1;
        if(this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            }
            catch(InterruptedException unused_ex) {
                Thread.currentThread().interrupt();
            }
        }
        else {
            this.readTheListUninterruptibly();
        }
        if(this.publicSuffixListBytes == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int v = list0.size();
        byte[][] arr2_b = new byte[v][];
        for(int v1 = 0; v1 < v; ++v1) {
            String s = (String)list0.get(v1);
            Charset charset0 = StandardCharsets.UTF_8;
            L.o(charset0, "UTF_8");
            byte[] arr_b = s.getBytes(charset0);
            L.o(arr_b, "this as java.lang.String).getBytes(charset)");
            arr2_b[v1] = arr_b;
        }
        for(int v2 = 0; true; ++v2) {
            s1 = null;
            s2 = null;
            if(v2 >= v) {
                break;
            }
            Companion publicSuffixDatabase$Companion0 = PublicSuffixDatabase.Companion;
            byte[] arr_b1 = this.publicSuffixListBytes;
            if(arr_b1 == null) {
                L.S("publicSuffixListBytes");
                arr_b1 = null;
            }
            String s3 = publicSuffixDatabase$Companion0.binarySearch(arr_b1, arr2_b, v2);
            if(s3 != null) {
                s1 = s3;
                break;
            }
        }
        String s4 = null;
        if(v > 1) {
            byte[][] arr2_b1 = (byte[][])arr2_b.clone();
            int v3 = arr2_b1.length - 1;
            for(int v4 = 0; v4 < v3; ++v4) {
                arr2_b1[v4] = PublicSuffixDatabase.WILDCARD_LABEL;
                Companion publicSuffixDatabase$Companion1 = PublicSuffixDatabase.Companion;
                byte[] arr_b2 = this.publicSuffixListBytes;
                if(arr_b2 == null) {
                    L.S("publicSuffixListBytes");
                    arr_b2 = null;
                }
                String s5 = publicSuffixDatabase$Companion1.binarySearch(arr_b2, arr2_b1, v4);
                if(s5 != null) {
                    s4 = s5;
                    break;
                }
            }
        }
        if(s4 != null) {
            for(int v5 = 0; v5 < v - 1; ++v5) {
                Companion publicSuffixDatabase$Companion2 = PublicSuffixDatabase.Companion;
                byte[] arr_b3 = this.publicSuffixExceptionListBytes;
                if(arr_b3 == null) {
                    L.S("publicSuffixExceptionListBytes");
                    arr_b3 = null;
                }
                String s6 = publicSuffixDatabase$Companion2.binarySearch(arr_b3, arr2_b, v5);
                if(s6 != null) {
                    s2 = s6;
                    break;
                }
            }
        }
        if(s2 != null) {
            return v.U4(('!' + s2), new char[]{'.'}, false, 0, 6, null);
        }
        if(s1 == null && s4 == null) {
            return PublicSuffixDatabase.PREVAILING_RULE;
        }
        if(s1 == null) {
            list1 = u.H();
        }
        else {
            list1 = v.U4(s1, new char[]{'.'}, false, 0, 6, null);
            if(list1 == null) {
                list1 = u.H();
            }
        }
        if(s4 == null) {
            list2 = u.H();
        }
        else {
            list2 = v.U4(s4, new char[]{'.'}, false, 0, 6, null);
            if(list2 == null) {
                list2 = u.H();
                return list1.size() > list2.size() ? list1 : list2;
            }
        }
        return list1.size() > list2.size() ? list1 : list2;
    }

    @m
    public final String getEffectiveTldPlusOne(@l String s) {
        L.p(s, "domain");
        String s1 = IDN.toUnicode(s);
        L.o(s1, "unicodeDomain");
        List list0 = this.splitDomain(s1);
        List list1 = this.findMatchingRule(list0);
        if(list0.size() == list1.size() && ((String)list1.get(0)).charAt(0) != 33) {
            return null;
        }
        return ((String)list1.get(0)).charAt(0) == 33 ? p.e1(p.k0(u.A1(this.splitDomain(s)), list0.size() - list1.size()), ".", null, null, 0, null, null, 62, null) : p.e1(p.k0(u.A1(this.splitDomain(s)), list0.size() - (list1.size() + 1)), ".", null, null, 0, null, null, 62, null);
    }

    private final void readTheList() throws IOException {
        int v1;
        try {
            h l0$h0 = new h();
            h l0$h1 = new h();
            InputStream inputStream0 = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if(inputStream0 == null) {
                return;
            }
            n n0 = Z.e(new B(Z.u(inputStream0)));
            try {
                l0$h0.a = n0.O2(((long)n0.readInt()));
                l0$h1.a = n0.O2(((long)n0.readInt()));
            }
            catch(Throwable throwable0) {
                c.a(n0, throwable0);
                throw throwable0;
            }
            c.a(n0, null);
            synchronized(this) {
                v1 = FIN.finallyOpen$NT();
                Object object0 = l0$h0.a;
                L.m(object0);
                this.publicSuffixListBytes = (byte[])object0;
                Object object1 = l0$h1.a;
                L.m(object1);
                this.publicSuffixExceptionListBytes = (byte[])object1;
                FIN.finallyCodeBegin$NT(v1);
            }
        }
        finally {
            this.readCompleteLatch.countDown();
        }
        FIN.finallyCodeEnd$NT(v1);
    }

    private final void readTheListUninterruptibly() {
        boolean z = false;
        try {
            while(true) {
                try {
                label_1:
                    this.readTheList();
                    goto label_15;
                }
                catch(InterruptedIOException unused_ex) {
                }
                catch(IOException iOException0) {
                    goto label_7;
                }
                Thread.interrupted();
                z = true;
                goto label_1;
            label_7:
                Platform.Companion.get().log("Failed to read public suffix list", 5, iOException0);
                if(z) {
                    break;
                }
                return;
            }
        }
        catch(Throwable throwable0) {
            goto label_12;
        }
        Thread.currentThread().interrupt();
        return;
    label_12:
        if(z) {
            Thread.currentThread().interrupt();
        }
        throw throwable0;
    label_15:
        if(z) {
            Thread.currentThread().interrupt();
        }
    }

    public final void setListBytes(@l byte[] arr_b, @l byte[] arr_b1) {
        L.p(arr_b, "publicSuffixListBytes");
        L.p(arr_b1, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = arr_b;
        this.publicSuffixExceptionListBytes = arr_b1;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }

    private final List splitDomain(String s) {
        List list0 = v.U4(s, new char[]{'.'}, false, 0, 6, null);
        return L.g(u.p3(list0), "") ? u.d2(list0, 1) : list0;
    }
}

