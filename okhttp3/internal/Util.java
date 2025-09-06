package okhttp3.internal;

import A3.a;
import j..util.DesugarCollections;
import j..util.DesugarTimeZone;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.collections.T;
import kotlin.collections.Y;
import kotlin.collections.u;
import kotlin.io.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import kotlin.ranges.s;
import kotlin.text.r;
import kotlin.text.v;
import okhttp3.Call;
import okhttp3.EventListener.Factory;
import okhttp3.EventListener;
import okhttp3.Headers.Builder;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody.Companion;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
import okhttp3.internal.io.FileSystem;
import okio.c0;
import okio.m0;
import okio.n;
import okio.o0;
import okio.o;
import y4.l;
import y4.m;
import z3.f;
import z3.i;

@s0({"SMAP\nUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Util.kt\nokhttp3/internal/Util\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,636:1\n37#2,2:637\n1627#3,6:639\n1#4:645\n1549#5:646\n1620#5,3:647\n*S KotlinDebug\n*F\n+ 1 Util.kt\nokhttp3/internal/Util\n*L\n127#1:637,2\n167#1:639,6\n300#1:646\n300#1:647,3\n*E\n"})
@i(name = "Util")
public final class Util {
    @l
    @f
    public static final byte[] EMPTY_BYTE_ARRAY = null;
    @l
    @f
    public static final Headers EMPTY_HEADERS = null;
    @l
    @f
    public static final RequestBody EMPTY_REQUEST = null;
    @l
    @f
    public static final ResponseBody EMPTY_RESPONSE = null;
    @l
    private static final c0 UNICODE_BOMS = null;
    @l
    @f
    public static final TimeZone UTC = null;
    @l
    private static final r VERIFY_AS_IP_ADDRESS = null;
    @f
    public static final boolean assertionsEnabled = false;
    @l
    @f
    public static final String okHttpName = null;
    @l
    public static final String userAgent = "okhttp/4.12.0";

    static {
        byte[] arr_b = new byte[0];
        Util.EMPTY_BYTE_ARRAY = arr_b;
        Util.EMPTY_HEADERS = Headers.Companion.of(new String[0]);
        Util.EMPTY_RESPONSE = Companion.create$default(ResponseBody.Companion, arr_b, null, 1, null);
        Util.EMPTY_REQUEST = okhttp3.RequestBody.Companion.create$default(RequestBody.Companion, arr_b, null, 0, 0, 7, null);
        o[] arr_o = {o.d.i("efbbbf"), o.d.i("feff"), o.d.i("fffe"), o.d.i("0000ffff"), o.d.i("ffff0000")};
        Util.UNICODE_BOMS = c0.e.d(arr_o);
        TimeZone timeZone0 = DesugarTimeZone.getTimeZone("GMT");
        L.m(timeZone0);
        Util.UTC = timeZone0;
        Util.VERIFY_AS_IP_ADDRESS = new r("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        Util.assertionsEnabled = false;
        L.o("okhttp3.OkHttpClient", "OkHttpClient::class.java.name");
        Util.okHttpName = "OkHttp";
    }

    public static final void addIfAbsent(@l List list0, Object object0) {
        L.p(list0, "<this>");
        if(!list0.contains(object0)) {
            list0.add(object0);
        }
    }

    public static final int and(byte b, int v) {
        return b & v;
    }

    public static final int and(short v, int v1) {
        return v & v1;
    }

    public static final long and(int v, long v1) {
        return ((long)v) & v1;
    }

    @l
    public static final Factory asFactory(@l EventListener eventListener0) {
        L.p(eventListener0, "<this>");
        return (Call call0) -> {
            L.p(eventListener0, "$this_asFactory");
            L.p(call0, "it");
            return eventListener0;
        };
    }

    // 检测为 Lambda 实现
    private static final EventListener asFactory$lambda$8(EventListener eventListener0, Call call0) [...]

    // 去混淆评级： 低(20)
    public static final void assertThreadDoesntHoldLock(@l Object object0) {
        L.p(object0, "<this>");
        if(Util.assertionsEnabled && Thread.holdsLock(object0)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-12493 MUST NOT hold lock on " + object0);
        }
    }

    // 去混淆评级： 低(20)
    public static final void assertThreadHoldsLock(@l Object object0) {
        L.p(object0, "<this>");
        if(Util.assertionsEnabled && !Thread.holdsLock(object0)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-12514 MUST hold lock on " + object0);
        }
    }

    public static final boolean canParseAsIpAddress(@l String s) {
        L.p(s, "<this>");
        return Util.VERIFY_AS_IP_ADDRESS.k(s);
    }

    public static final boolean canReuseConnectionFor(@l HttpUrl httpUrl0, @l HttpUrl httpUrl1) {
        L.p(httpUrl0, "<this>");
        L.p(httpUrl1, "other");
        return L.g(httpUrl0.host(), httpUrl1.host()) && httpUrl0.port() == httpUrl1.port() && L.g(httpUrl0.scheme(), httpUrl1.scheme());
    }

    public static final int checkDuration(@l String s, long v, @m TimeUnit timeUnit0) {
        L.p(s, "name");
        int v1 = Long.compare(v, 0L);
        if(v1 < 0) {
            throw new IllegalStateException((s + " < 0").toString());
        }
        if(timeUnit0 == null) {
            throw new IllegalStateException("unit == null");
        }
        long v2 = timeUnit0.toMillis(v);
        if(v2 > 0x7FFFFFFFL) {
            throw new IllegalArgumentException((s + " too large.").toString());
        }
        if(v2 == 0L && v1 > 0) {
            throw new IllegalArgumentException((s + " too small.").toString());
        }
        return (int)v2;
    }

    public static final void checkOffsetAndCount(long v, long v1, long v2) {
        if((v1 | v2) < 0L || v1 > v || v - v1 < v2) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(@l Closeable closeable0) {
        L.p(closeable0, "<this>");
        try {
            closeable0.close();
        }
        catch(RuntimeException runtimeException0) {
            throw runtimeException0;
        }
        catch(Exception unused_ex) {
        }
    }

    public static final void closeQuietly(@l ServerSocket serverSocket0) {
        L.p(serverSocket0, "<this>");
        try {
            serverSocket0.close();
        }
        catch(RuntimeException runtimeException0) {
            throw runtimeException0;
        }
        catch(Exception unused_ex) {
        }
    }

    public static final void closeQuietly(@l Socket socket0) {
        L.p(socket0, "<this>");
        try {
            socket0.close();
        }
        catch(AssertionError assertionError0) {
            throw assertionError0;
        }
        catch(RuntimeException runtimeException0) {
            if(!L.g(runtimeException0.getMessage(), "bio == null")) {
                throw runtimeException0;
            }
        }
        catch(Exception unused_ex) {
        }
    }

    @l
    public static final String[] concat(@l String[] arr_s, @l String s) {
        L.p(arr_s, "<this>");
        L.p(s, "value");
        Object[] arr_object = Arrays.copyOf(arr_s, arr_s.length + 1);
        L.o(arr_object, "copyOf(this, newSize)");
        ((String[])arr_object)[kotlin.collections.l.we(((String[])arr_object))] = s;
        return (String[])arr_object;
    }

    public static final int delimiterOffset(@l String s, char c, int v, int v1) {
        L.p(s, "<this>");
        while(v < v1) {
            if(s.charAt(v) == c) {
                return v;
            }
            ++v;
        }
        return v1;
    }

    public static final int delimiterOffset(@l String s, @l String s1, int v, int v1) {
        L.p(s, "<this>");
        L.p(s1, "delimiters");
        while(v < v1) {
            if(v.V2(s1, s.charAt(v), false, 2, null)) {
                return v;
            }
            ++v;
        }
        return v1;
    }

    public static int delimiterOffset$default(String s, char c, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = s.length();
        }
        return Util.delimiterOffset(s, c, v, v1);
    }

    public static int delimiterOffset$default(String s, String s1, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = s.length();
        }
        return Util.delimiterOffset(s, s1, v, v1);
    }

    public static final boolean discard(@l o0 o00, int v, @l TimeUnit timeUnit0) {
        L.p(o00, "<this>");
        L.p(timeUnit0, "timeUnit");
        try {
            return Util.skipAll(o00, v, timeUnit0);
        }
        catch(IOException unused_ex) {
            return false;
        }
    }

    @l
    public static final List filterList(@l Iterable iterable0, @l Function1 function10) {
        L.p(iterable0, "<this>");
        L.p(function10, "predicate");
        List list0 = u.H();
        for(Object object0: iterable0) {
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                if(list0.isEmpty()) {
                    list0 = new ArrayList();
                }
                L.n(list0, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                v0.g(list0).add(object0);
            }
        }
        return list0;
    }

    @l
    public static final String format(@l String s, @l Object[] arr_object) {
        L.p(s, "format");
        L.p(arr_object, "args");
        Locale locale0 = Locale.US;
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
        String s1 = String.format(locale0, s, Arrays.copyOf(arr_object1, arr_object1.length));
        L.o(s1, "format(locale, format, *args)");
        return s1;
    }

    public static final boolean hasIntersection(@l String[] arr_s, @m String[] arr_s1, @l Comparator comparator0) {
        L.p(arr_s, "<this>");
        L.p(comparator0, "comparator");
        if(arr_s.length != 0 && arr_s1 != null && arr_s1.length != 0) {
            for(int v = 0; v < arr_s.length; ++v) {
                String s = arr_s[v];
                Iterator iterator0 = kotlin.jvm.internal.i.a(arr_s1);
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    if(comparator0.compare(s, ((String)object0)) == 0) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(@l Response response0) {
        L.p(response0, "<this>");
        String s = response0.headers().get("Content-Length");
        return s == null ? -1L : Util.toLongOrDefault(s, -1L);
    }

    public static final void ignoreIoExceptions(@l a a0) {
        L.p(a0, "block");
        try {
            a0.invoke();
        }
        catch(IOException unused_ex) {
        }
    }

    @SafeVarargs
    @l
    public static final List immutableListOf(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        Object[] arr_object1 = (Object[])arr_object.clone();
        List list0 = DesugarCollections.unmodifiableList(u.O(Arrays.copyOf(arr_object1, arr_object1.length)));
        L.o(list0, "unmodifiableList(listOf(*elements.clone()))");
        return list0;
    }

    public static final int indexOf(@l String[] arr_s, @l String s, @l Comparator comparator0) {
        L.p(arr_s, "<this>");
        L.p(s, "value");
        L.p(comparator0, "comparator");
        int v = 0;
        while(v < arr_s.length) {
            if(comparator0.compare(arr_s[v], s) != 0) {
                ++v;
                continue;
            }
            return v;
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(@l String s) {
        L.p(s, "<this>");
        int v = s.length();
        int v1 = 0;
        while(v1 < v) {
            int v2 = s.charAt(v1);
            if(L.t(v2, 0x1F) > 0 && L.t(v2, 0x7F) < 0) {
                ++v1;
                continue;
            }
            return v1;
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(@l String s, int v, int v1) {
        L.p(s, "<this>");
        while(v < v1) {
            switch(s.charAt(v)) {
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    ++v;
                    continue;
                }
                default: {
                    return v;
                }
            }
        }
        return v1;
    }

    public static int indexOfFirstNonAsciiWhitespace$default(String s, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = s.length();
        }
        return Util.indexOfFirstNonAsciiWhitespace(s, v, v1);
    }

    public static final int indexOfLastNonAsciiWhitespace(@l String s, int v, int v1) {
        L.p(s, "<this>");
        int v2 = v1 - 1;
        if(v <= v2) {
        alab1:
            while(true) {
                switch(s.charAt(v2)) {
                    case 9: 
                    case 10: 
                    case 12: 
                    case 13: 
                    case 0x20: {
                        if(v2 != v) {
                            break;
                        }
                        break alab1;
                    }
                    default: {
                        return v2 + 1;
                    }
                }
                --v2;
            }
        }
        return v;
    }

    public static int indexOfLastNonAsciiWhitespace$default(String s, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = s.length();
        }
        return Util.indexOfLastNonAsciiWhitespace(s, v, v1);
    }

    public static final int indexOfNonWhitespace(@l String s, int v) {
        L.p(s, "<this>");
        int v1 = s.length();
        while(v < v1) {
            if(s.charAt(v) != 9 && s.charAt(v) != 0x20) {
                return v;
            }
            ++v;
        }
        return s.length();
    }

    public static int indexOfNonWhitespace$default(String s, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        return Util.indexOfNonWhitespace(s, v);
    }

    @l
    public static final String[] intersect(@l String[] arr_s, @l String[] arr_s1, @l Comparator comparator0) {
        L.p(arr_s, "<this>");
        L.p(arr_s1, "other");
        L.p(comparator0, "comparator");
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            for(int v1 = 0; v1 < arr_s1.length; ++v1) {
                if(comparator0.compare(s, arr_s1[v1]) == 0) {
                    arrayList0.add(s);
                    break;
                }
            }
        }
        return (String[])arrayList0.toArray(new String[0]);
    }

    public static final boolean isCivilized(@l FileSystem fileSystem0, @l File file0) {
        L.p(fileSystem0, "<this>");
        L.p(file0, "file");
        m0 m00 = fileSystem0.sink(file0);
        try {
            fileSystem0.delete(file0);
        }
        catch(IOException unused_ex) {
            c.a(m00, null);
            fileSystem0.delete(file0);
            return false;
        }
        catch(Throwable throwable0) {
            c.a(m00, throwable0);
            throw throwable0;
        }
        c.a(m00, null);
        return true;
    }

    public static final boolean isHealthy(@l Socket socket0, @l n n0) {
        L.p(socket0, "<this>");
        L.p(n0, "source");
        try {
            int v = socket0.getSoTimeout();
            try {
                socket0.setSoTimeout(1);
                boolean z = n0.j3();
                return !z;
            }
            finally {
                socket0.setSoTimeout(v);
            }
        }
        catch(SocketTimeoutException unused_ex) {
            return true;
        }
        catch(IOException unused_ex) {
            return false;
        }
    }

    // 去混淆评级： 低(20)
    public static final boolean isSensitiveHeader(@l String s) {
        L.p(s, "name");
        return v.O1(s, "Authorization", true) || v.O1(s, "Cookie", true) || v.O1(s, "Proxy-Authorization", true) || v.O1(s, "Set-Cookie", true);
    }

    public static final void notify(@l Object object0) {
        L.p(object0, "<this>");
        object0.notify();
    }

    public static final void notifyAll(@l Object object0) {
        L.p(object0, "<this>");
        object0.notifyAll();
    }

    public static final int parseHexDigit(char c) {
        if(0x30 <= c && c < 58) {
            return c - 0x30;
        }
        if(97 <= c && c < 103) {
            return c - 87;
        }
        return 65 > c || c >= 71 ? -1 : c - 55;
    }

    @l
    public static final String peerName(@l Socket socket0) {
        L.p(socket0, "<this>");
        SocketAddress socketAddress0 = socket0.getRemoteSocketAddress();
        if(socketAddress0 instanceof InetSocketAddress) {
            String s = ((InetSocketAddress)socketAddress0).getHostName();
            L.o(s, "address.hostName");
            return s;
        }
        return socketAddress0.toString();
    }

    @l
    public static final Charset readBomAsCharset(@l n n0, @l Charset charset0) throws IOException {
        L.p(n0, "<this>");
        L.p(charset0, "default");
        switch(n0.X3(Util.UNICODE_BOMS)) {
            case -1: {
                break;
            }
            case 0: {
                charset0 = StandardCharsets.UTF_8;
                L.o(charset0, "UTF_8");
                break;
            }
            case 1: {
                charset0 = StandardCharsets.UTF_16BE;
                L.o(charset0, "UTF_16BE");
                return charset0;
            }
            case 2: {
                charset0 = StandardCharsets.UTF_16LE;
                L.o(charset0, "UTF_16LE");
                return charset0;
            }
            case 3: {
                return kotlin.text.f.a.b();
            }
            case 4: {
                return kotlin.text.f.a.c();
            }
            default: {
                throw new AssertionError();
            }
        }
        return charset0;
    }

    @m
    public static final Object readFieldOrNull(@l Object object0, @l Class class0, @l String s) {
        Class class2;
        L.p(object0, "instance");
        L.p(class0, "fieldType");
        L.p(s, "fieldName");
        Class class1 = object0.getClass();
        while(true) {
            class2 = Object.class;
            if(L.g(class1, class2)) {
                break;
            }
            try {
                Field field0 = class1.getDeclaredField(s);
                field0.setAccessible(true);
                Object object1 = field0.get(object0);
                return !class0.isInstance(object1) ? null : class0.cast(object1);
            }
            catch(NoSuchFieldException unused_ex) {
                class1 = class1.getSuperclass();
                L.o(class1, "c.superclass");
                continue;
            }
            return null;
        }
        if(!L.g(s, "delegate")) {
            Object object2 = Util.readFieldOrNull(object0, class2, "delegate");
            return object2 == null ? null : Util.readFieldOrNull(object2, class0, s);
        }
        return null;
    }

    public static final int readMedium(@l n n0) throws IOException {
        L.p(n0, "<this>");
        int v = Util.and(n0.readByte(), ((byte)0xFF));
        int v1 = Util.and(n0.readByte(), ((byte)0xFF));
        return Util.and(n0.readByte(), ((byte)0xFF)) | (v << 16 | v1 << 8);
    }

    public static final int skipAll(@l okio.l l0, byte b) {
        L.p(l0, "<this>");
        int v = 0;
        while(!l0.j3() && l0.Q(0L) == b) {
            ++v;
            l0.readByte();
        }
        return v;
    }

    public static final boolean skipAll(@l o0 o00, int v, @l TimeUnit timeUnit0) throws IOException {
        L.p(o00, "<this>");
        L.p(timeUnit0, "timeUnit");
        long v1 = System.nanoTime();
        long v2 = o00.timeout().hasDeadline() ? o00.timeout().deadlineNanoTime() - v1 : 0x7FFFFFFFFFFFFFFFL;
        o00.timeout().deadlineNanoTime(Math.min(v2, timeUnit0.toNanos(((long)v))) + v1);
        try {
            okio.l l0 = new okio.l();
            while(o00.read(l0, 0x2000L) != -1L) {
                l0.c();
            }
        }
        catch(InterruptedIOException unused_ex) {
            if(v2 == 0x7FFFFFFFFFFFFFFFL) {
                o00.timeout().clearDeadline();
                return false;
            }
            o00.timeout().deadlineNanoTime(v1 + v2);
            return false;
        }
        catch(Throwable throwable0) {
            if(v2 == 0x7FFFFFFFFFFFFFFFL) {
                o00.timeout().clearDeadline();
            }
            else {
                o00.timeout().deadlineNanoTime(v1 + v2);
            }
            throw throwable0;
        }
        if(v2 == 0x7FFFFFFFFFFFFFFFL) {
            o00.timeout().clearDeadline();
            return true;
        }
        o00.timeout().deadlineNanoTime(v1 + v2);
        return true;
    }

    @l
    public static final ThreadFactory threadFactory(@l String s, boolean z) {
        L.p(s, "name");
        return (Runnable runnable0) -> {
            L.p(s, "$name");
            Thread thread0 = new Thread(runnable0, s);
            thread0.setDaemon(z);
            return thread0;
        };
    }

    // 检测为 Lambda 实现
    private static final Thread threadFactory$lambda$1(String s, boolean z, Runnable runnable0) [...]

    public static final void threadName(@l String s, @l a a0) {
        L.p(s, "name");
        L.p(a0, "block");
        Thread thread0 = Thread.currentThread();
        thread0.setName(s);
        try {
            a0.invoke();
        }
        finally {
            thread0.setName("jeb-dexdec-sb-st-12388");
        }
    }

    @l
    public static final List toHeaderList(@l Headers headers0) {
        L.p(headers0, "<this>");
        kotlin.ranges.l l0 = s.W1(0, headers0.size());
        List list0 = new ArrayList(u.b0(l0, 10));
        Iterator iterator0 = l0.iterator();
        while(iterator0.hasNext()) {
            int v = ((T)iterator0).b();
            list0.add(new Header(headers0.name(v), headers0.value(v)));
        }
        return list0;
    }

    @l
    public static final Headers toHeaders(@l List list0) {
        L.p(list0, "<this>");
        Builder headers$Builder0 = new Builder();
        for(Object object0: list0) {
            o o0 = ((Header)object0).component1();
            o o1 = ((Header)object0).component2();
            headers$Builder0.addLenient$okhttp(o0.t0(), o1.t0());
        }
        return headers$Builder0.build();
    }

    @l
    public static final String toHexString(int v) {
        String s = Integer.toHexString(v);
        L.o(s, "toHexString(this)");
        return s;
    }

    @l
    public static final String toHexString(long v) {
        String s = Long.toHexString(v);
        L.o(s, "toHexString(this)");
        return s;
    }

    @l
    public static final String toHostHeader(@l HttpUrl httpUrl0, boolean z) {
        L.p(httpUrl0, "<this>");
        String s = v.W2(httpUrl0.host(), ":", false, 2, null) ? '[' + httpUrl0.host() + ']' : httpUrl0.host();
        return !z && httpUrl0.port() == HttpUrl.Companion.defaultPort(httpUrl0.scheme()) ? s : s + ':' + httpUrl0.port();
    }

    public static String toHostHeader$default(HttpUrl httpUrl0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return Util.toHostHeader(httpUrl0, z);
    }

    @l
    public static final List toImmutableList(@l List list0) {
        L.p(list0, "<this>");
        List list1 = DesugarCollections.unmodifiableList(u.Y5(list0));
        L.o(list1, "unmodifiableList(toMutableList())");
        return list1;
    }

    @l
    public static final Map toImmutableMap(@l Map map0) {
        L.p(map0, "<this>");
        if(map0.isEmpty()) {
            return Y.z();
        }
        Map map1 = DesugarCollections.unmodifiableMap(new LinkedHashMap(map0));
        L.o(map1, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return map1;
    }

    public static final long toLongOrDefault(@l String s, long v) {
        L.p(s, "<this>");
        try {
            return Long.parseLong(s);
        }
        catch(NumberFormatException unused_ex) {
            return v;
        }
    }

    public static final int toNonNegativeInt(@m String s, int v) {
        if(s != null) {
            try {
                long v1 = Long.parseLong(s);
                if(v1 > 0x7FFFFFFFL) {
                    return 0x7FFFFFFF;
                }
                return v1 >= 0L ? ((int)v1) : 0;
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        return v;
    }

    @l
    public static final String trimSubstring(@l String s, int v, int v1) {
        L.p(s, "<this>");
        int v2 = Util.indexOfFirstNonAsciiWhitespace(s, v, v1);
        String s1 = s.substring(v2, Util.indexOfLastNonAsciiWhitespace(s, v2, v1));
        L.o(s1, "this as java.lang.String…ing(startIndex, endIndex)");
        return s1;
    }

    public static String trimSubstring$default(String s, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = s.length();
        }
        return Util.trimSubstring(s, v, v1);
    }

    public static final void wait(@l Object object0) {
        L.p(object0, "<this>");
        object0.wait();
    }

    @l
    public static final Throwable withSuppressed(@l Exception exception0, @l List list0) {
        L.p(exception0, "<this>");
        L.p(list0, "suppressed");
        for(Object object0: list0) {
            kotlin.o.a(exception0, ((Exception)object0));
        }
        return exception0;
    }

    public static final void writeMedium(@l okio.m m0, int v) throws IOException {
        L.p(m0, "<this>");
        m0.writeByte(v >>> 16 & 0xFF);
        m0.writeByte(v >>> 8 & 0xFF);
        m0.writeByte(v & 0xFF);
    }
}

