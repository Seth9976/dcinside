package okhttp3;

import B3.a;
import j..time.Instant;
import j..util.DateRetargetClass;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.V;
import kotlin.c0;
import kotlin.collections.u;
import kotlin.internal.n;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.r0;
import kotlin.text.v;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import y4.l;
import y4.m;
import z3.i;

public final class Headers implements a, Iterable {
    @s0({"SMAP\nHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,458:1\n1#2:459\n37#3,2:460\n*S KotlinDebug\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Builder\n*L\n359#1:460,2\n*E\n"})
    public static final class Builder {
        @l
        private final List namesAndValues;

        public Builder() {
            this.namesAndValues = new ArrayList(20);
        }

        @l
        public final Builder add(@l String s) {
            L.p(s, "line");
            int v = v.r3(s, ':', 0, false, 6, null);
            if(v == -1) {
                throw new IllegalArgumentException(("Unexpected header: " + s).toString());
            }
            String s1 = s.substring(0, v);
            L.o(s1, "this as java.lang.String…ing(startIndex, endIndex)");
            String s2 = v.G5(s1).toString();
            String s3 = s.substring(v + 1);
            L.o(s3, "this as java.lang.String).substring(startIndex)");
            this.add(s2, s3);
            return this;
        }

        @IgnoreJRERequirement
        @l
        public final Builder add(@l String s, @l Instant instant0) {
            L.p(s, "name");
            L.p(instant0, "value");
            this.add(s, new Date(instant0.toEpochMilli()));
            return this;
        }

        @l
        public final Builder add(@l String s, @l String s1) {
            L.p(s, "name");
            L.p(s1, "value");
            Headers.Companion.checkName(s);
            Headers.Companion.checkValue(s1, s);
            this.addLenient$okhttp(s, s1);
            return this;
        }

        @l
        public final Builder add(@l String s, @l Date date0) {
            L.p(s, "name");
            L.p(date0, "value");
            this.add(s, DatesKt.toHttpDateString(date0));
            return this;
        }

        @l
        public final Builder addAll(@l Headers headers0) {
            L.p(headers0, "headers");
            int v = headers0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                this.addLenient$okhttp(headers0.name(v1), headers0.value(v1));
            }
            return this;
        }

        @l
        public final Builder addLenient$okhttp(@l String s) {
            L.p(s, "line");
            int v = v.r3(s, ':', 1, false, 4, null);
            if(v != -1) {
                String s1 = s.substring(0, v);
                L.o(s1, "this as java.lang.String…ing(startIndex, endIndex)");
                String s2 = s.substring(v + 1);
                L.o(s2, "this as java.lang.String).substring(startIndex)");
                this.addLenient$okhttp(s1, s2);
                return this;
            }
            if(s.charAt(0) == 58) {
                String s3 = s.substring(1);
                L.o(s3, "this as java.lang.String).substring(startIndex)");
                this.addLenient$okhttp("", s3);
                return this;
            }
            this.addLenient$okhttp("", s);
            return this;
        }

        @l
        public final Builder addLenient$okhttp(@l String s, @l String s1) {
            L.p(s, "name");
            L.p(s1, "value");
            this.namesAndValues.add(s);
            String s2 = v.G5(s1).toString();
            this.namesAndValues.add(s2);
            return this;
        }

        @l
        public final Builder addUnsafeNonAscii(@l String s, @l String s1) {
            L.p(s, "name");
            L.p(s1, "value");
            Headers.Companion.checkName(s);
            this.addLenient$okhttp(s, s1);
            return this;
        }

        @l
        public final Headers build() {
            return new Headers(((String[])this.namesAndValues.toArray(new String[0])), null);
        }

        @m
        public final String get(@l String s) {
            L.p(s, "name");
            int v = this.namesAndValues.size() - 2;
            int v1 = n.c(v, 0, -2);
            if(v1 <= v) {
                while(true) {
                    if(v.O1(s, ((String)this.namesAndValues.get(v)), true)) {
                        return (String)this.namesAndValues.get(v + 1);
                    }
                    if(v == v1) {
                        break;
                    }
                    v -= 2;
                }
            }
            return null;
        }

        @l
        public final List getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        @l
        public final Builder removeAll(@l String s) {
            L.p(s, "name");
            for(int v = 0; v < this.namesAndValues.size(); v += 2) {
                if(v.O1(s, ((String)this.namesAndValues.get(v)), true)) {
                    this.namesAndValues.remove(v);
                    this.namesAndValues.remove(v);
                    v -= 2;
                }
            }
            return this;
        }

        @IgnoreJRERequirement
        @l
        public final Builder set(@l String s, @l Instant instant0) {
            L.p(s, "name");
            L.p(instant0, "value");
            return this.set(s, new Date(instant0.toEpochMilli()));
        }

        @l
        public final Builder set(@l String s, @l String s1) {
            L.p(s, "name");
            L.p(s1, "value");
            Headers.Companion.checkName(s);
            Headers.Companion.checkValue(s1, s);
            this.removeAll(s);
            this.addLenient$okhttp(s, s1);
            return this;
        }

        @l
        public final Builder set(@l String s, @l Date date0) {
            L.p(s, "name");
            L.p(date0, "value");
            this.set(s, DatesKt.toHttpDateString(date0));
            return this;
        }
    }

    @s0({"SMAP\nHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,458:1\n1#2:459\n*E\n"})
    public static final class Companion {
        @k(level = kotlin.m.b, message = "function moved to extension", replaceWith = @c0(expression = "headers.toHeaders()", imports = {}))
        @l
        @i(name = "-deprecated_of")
        public final Headers -deprecated_of(@l Map map0) {
            L.p(map0, "headers");
            return this.of(map0);
        }

        @k(level = kotlin.m.b, message = "function name changed", replaceWith = @c0(expression = "headersOf(*namesAndValues)", imports = {}))
        @l
        @i(name = "-deprecated_of")
        public final Headers -deprecated_of(@l String[] arr_s) {
            L.p(arr_s, "namesAndValues");
            return this.of(((String[])Arrays.copyOf(arr_s, arr_s.length)));
        }

        private Companion() {
        }

        public Companion(w w0) {
        }

        private final void checkName(String s) {
            if(s.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int v = s.length();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = s.charAt(v1);
                if(33 > v2 || v2 >= 0x7F) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", new Object[]{v2, v1, s}).toString());
                }
            }
        }

        private final void checkValue(String s, String s1) {
            int v = s.length();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = s.charAt(v1);
                if(v2 != 9 && (0x20 > v2 || v2 >= 0x7F)) {
                    throw new IllegalArgumentException((Util.format("Unexpected char %#04x at %d in %s value", new Object[]{v2, v1, s1}) + (Util.isSensitiveHeader(s1) ? "" : ": " + s)).toString());
                }
            }
        }

        private final String get(String[] arr_s, String s) {
            int v = arr_s.length - 2;
            int v1 = n.c(v, 0, -2);
            if(v1 <= v) {
                while(true) {
                    if(v.O1(s, arr_s[v], true)) {
                        return arr_s[v + 1];
                    }
                    if(v == v1) {
                        break;
                    }
                    v -= 2;
                }
            }
            return null;
        }

        @l
        @i(name = "of")
        @z3.n
        public final Headers of(@l Map map0) {
            L.p(map0, "<this>");
            String[] arr_s = new String[map0.size() * 2];
            int v = 0;
            for(Object object0: map0.entrySet()) {
                String s = (String)((Map.Entry)object0).getKey();
                String s1 = (String)((Map.Entry)object0).getValue();
                String s2 = v.G5(s).toString();
                String s3 = v.G5(s1).toString();
                this.checkName(s2);
                this.checkValue(s3, s2);
                arr_s[v] = s2;
                arr_s[v + 1] = s3;
                v += 2;
            }
            return new Headers(arr_s, null);
        }

        @l
        @i(name = "of")
        @z3.n
        public final Headers of(@l String[] arr_s) {
            L.p(arr_s, "namesAndValues");
            if(arr_s.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] arr_s1 = (String[])arr_s.clone();
            for(int v1 = 0; v1 < arr_s1.length; ++v1) {
                String s = arr_s1[v1];
                if(s == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                arr_s1[v1] = v.G5(s).toString();
            }
            int v2 = n.c(0, arr_s1.length - 1, 2);
            if(v2 >= 0) {
                for(int v = 0; true; v += 2) {
                    String s1 = arr_s1[v];
                    String s2 = arr_s1[v + 1];
                    this.checkName(s1);
                    this.checkValue(s2, s1);
                    if(v == v2) {
                        break;
                    }
                }
            }
            return new Headers(arr_s1, null);
        }
    }

    @l
    public static final Companion Companion;
    @l
    private final String[] namesAndValues;

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "size", imports = {}))
    @i(name = "-deprecated_size")
    public final int -deprecated_size() {
        return this.size();
    }

    static {
        Headers.Companion = new Companion(null);
    }

    private Headers(String[] arr_s) {
        this.namesAndValues = arr_s;
    }

    public Headers(String[] arr_s, w w0) {
        this(arr_s);
    }

    public final long byteCount() {
        long v = (long)(this.namesAndValues.length * 2);
        for(int v1 = 0; v1 < this.namesAndValues.length; ++v1) {
            v += (long)this.namesAndValues[v1].length();
        }
        return v;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof Headers && Arrays.equals(this.namesAndValues, ((Headers)object0).namesAndValues);
    }

    @m
    public final String get(@l String s) {
        L.p(s, "name");
        return Headers.Companion.get(this.namesAndValues, s);
    }

    @m
    public final Date getDate(@l String s) {
        L.p(s, "name");
        String s1 = this.get(s);
        return s1 == null ? null : DatesKt.toHttpDateOrNull(s1);
    }

    @IgnoreJRERequirement
    @m
    public final Instant getInstant(@l String s) {
        L.p(s, "name");
        Date date0 = this.getDate(s);
        return date0 == null ? null : DateRetargetClass.toInstant(date0);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override
    @l
    public Iterator iterator() {
        int v = this.size();
        V[] arr_v = new V[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_v[v1] = r0.a(this.name(v1), this.value(v1));
        }
        return kotlin.jvm.internal.i.a(arr_v);
    }

    @l
    public final String name(int v) {
        return this.namesAndValues[v * 2];
    }

    @l
    public final Set names() {
        TreeSet treeSet0 = new TreeSet(v.U1(u0.a));
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            treeSet0.add(this.name(v1));
        }
        Set set0 = DesugarCollections.unmodifiableSet(treeSet0);
        L.o(set0, "unmodifiableSet(result)");
        return set0;
    }

    @l
    public final Builder newBuilder() {
        Builder headers$Builder0 = new Builder();
        u.s0(headers$Builder0.getNamesAndValues$okhttp(), this.namesAndValues);
        return headers$Builder0;
    }

    @l
    @i(name = "of")
    @z3.n
    public static final Headers of(@l Map map0) {
        return Headers.Companion.of(map0);
    }

    @l
    @i(name = "of")
    @z3.n
    public static final Headers of(@l String[] arr_s) {
        return Headers.Companion.of(arr_s);
    }

    @i(name = "size")
    public final int size() {
        return this.namesAndValues.length / 2;
    }

    @l
    public final Map toMultimap() {
        Map map0 = new TreeMap(v.U1(u0.a));
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            String s = this.name(v1);
            Locale locale0 = Locale.US;
            L.o(locale0, "US");
            String s1 = s.toLowerCase(locale0);
            L.o(s1, "this as java.lang.String).toLowerCase(locale)");
            List list0 = (List)((TreeMap)map0).get(s1);
            if(list0 == null) {
                list0 = new ArrayList(2);
                map0.put(s1, list0);
            }
            list0.add(this.value(v1));
        }
        return map0;
    }

    @Override
    @l
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            String s = this.name(v1);
            String s1 = this.value(v1);
            stringBuilder0.append(s);
            stringBuilder0.append(": ");
            if(Util.isSensitiveHeader(s)) {
                s1 = "██";
            }
            stringBuilder0.append(s1);
            stringBuilder0.append("\n");
        }
        String s2 = stringBuilder0.toString();
        L.o(s2, "StringBuilder().apply(builderAction).toString()");
        return s2;
    }

    @l
    public final String value(int v) {
        return this.namesAndValues[v * 2 + 1];
    }

    @l
    public final List values(@l String s) {
        L.p(s, "name");
        int v = this.size();
        List list0 = null;
        for(int v1 = 0; v1 < v; ++v1) {
            if(v.O1(s, this.name(v1), true)) {
                if(list0 == null) {
                    list0 = new ArrayList(2);
                }
                list0.add(this.value(v1));
            }
        }
        if(list0 != null) {
            List list1 = DesugarCollections.unmodifiableList(list0);
            L.o(list1, "{\n      Collections.unmodifiableList(result)\n    }");
            return list1;
        }
        return u.H();
    }
}

