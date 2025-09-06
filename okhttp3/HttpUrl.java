package okhttp3;

import j..util.DesugarCollections;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.c0;
import kotlin.collections.k0;
import kotlin.collections.u;
import kotlin.internal.n;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.ranges.j;
import kotlin.ranges.s;
import kotlin.text.r;
import kotlin.text.v;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import y4.l;
import y4.m;
import z3.i;

public final class HttpUrl {
    @s0({"SMAP\nHttpUrl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpUrl.kt\nokhttp3/HttpUrl$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1869:1\n1#2:1870\n1549#3:1871\n1620#3,3:1872\n1549#3:1875\n1620#3,3:1876\n*S KotlinDebug\n*F\n+ 1 HttpUrl.kt\nokhttp3/HttpUrl$Builder\n*L\n1180#1:1871\n1180#1:1872,3\n1181#1:1875\n1181#1:1876,3\n*E\n"})
    public static final class Builder {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            private final int parsePort(String s, int v, int v1) {
                try {
                    int v2 = Integer.parseInt(okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, v, v1, "", false, false, false, false, null, 0xF8, null));
                    if(1 <= v2 && v2 < 0x10000) {
                        return v2;
                    }
                }
                catch(NumberFormatException unused_ex) {
                }
                return -1;
            }

            private final int portColonOffset(String s, int v, int v1) {
                while(v < v1) {
                    int v2 = s.charAt(v);
                    if(v2 == 91) {
                        do {
                            ++v;
                        }
                        while(v < v1 && s.charAt(v) != 93);
                    }
                    else if(v2 == 58) {
                        return v;
                    }
                    ++v;
                }
                return v1;
            }

            private final int schemeDelimiterOffset(String s, int v, int v1) {
                if(v1 - v < 2) {
                    return -1;
                }
                int v2 = s.charAt(v);
                if(L.t(v2, 97) >= 0 && L.t(v2, 0x7A) <= 0 || L.t(v2, 65) >= 0 && L.t(v2, 90) <= 0) {
                    while(true) {
                        ++v;
                        if(v >= v1) {
                            break;
                        }
                        int v3 = s.charAt(v);
                        if((97 > v3 || v3 >= 0x7B) && (65 > v3 || v3 >= 91) && (0x30 > v3 || v3 >= 58)) {
                            switch(v3) {
                                case 43: 
                                case 45: 
                                case 46: {
                                    break;
                                }
                                case 58: {
                                    return v;
                                }
                                default: {
                                    return -1;
                                }
                            }
                        }
                    }
                }
                return -1;
            }

            private final int slashCount(String s, int v, int v1) {
                int v2 = 0;
                while(v < v1) {
                    switch(s.charAt(v)) {
                        case 0x2F: 
                        case 92: {
                            ++v2;
                            ++v;
                            continue;
                        }
                        default: {
                            return v2;
                        }
                    }
                }
                return v2;
            }
        }

        @l
        public static final Companion Companion = null;
        @l
        public static final String INVALID_HOST = "Invalid URL host";
        @m
        private String encodedFragment;
        @l
        private String encodedPassword;
        @l
        private final List encodedPathSegments;
        @m
        private List encodedQueryNamesAndValues;
        @l
        private String encodedUsername;
        @m
        private String host;
        private int port;
        @m
        private String scheme;

        static {
            Builder.Companion = new Companion(null);
        }

        public Builder() {
            this.encodedUsername = "";
            this.encodedPassword = "";
            this.port = -1;
            ArrayList arrayList0 = new ArrayList();
            this.encodedPathSegments = arrayList0;
            arrayList0.add("");
        }

        @l
        public final Builder addEncodedPathSegment(@l String s) {
            L.p(s, "encodedPathSegment");
            this.push(s, 0, s.length(), false, true);
            return this;
        }

        @l
        public final Builder addEncodedPathSegments(@l String s) {
            L.p(s, "encodedPathSegments");
            return this.addPathSegments(s, true);
        }

        @l
        public final Builder addEncodedQueryParameter(@l String s, @m String s1) {
            L.p(s, "encodedName");
            if(this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List list0 = this.encodedQueryNamesAndValues;
            L.m(list0);
            list0.add(okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, 0, 0, " \"\'<>#&=", true, false, true, false, null, 0xD3, null));
            List list1 = this.encodedQueryNamesAndValues;
            L.m(list1);
            list1.add((s1 == null ? null : okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s1, 0, 0, " \"\'<>#&=", true, false, true, false, null, 0xD3, null)));
            return this;
        }

        @l
        public final Builder addPathSegment(@l String s) {
            L.p(s, "pathSegment");
            this.push(s, 0, s.length(), false, false);
            return this;
        }

        private final Builder addPathSegments(String s, boolean z) {
            int v = 0;
            do {
                int v1 = Util.delimiterOffset(s, "/\\", v, s.length());
                this.push(s, v, v1, v1 < s.length(), z);
                v = v1 + 1;
            }
            while(v <= s.length());
            return this;
        }

        @l
        public final Builder addPathSegments(@l String s) {
            L.p(s, "pathSegments");
            return this.addPathSegments(s, false);
        }

        @l
        public final Builder addQueryParameter(@l String s, @m String s1) {
            L.p(s, "name");
            if(this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List list0 = this.encodedQueryNamesAndValues;
            L.m(list0);
            list0.add(okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, 0, 0, " !\"#$&\'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 0xDB, null));
            List list1 = this.encodedQueryNamesAndValues;
            L.m(list1);
            list1.add((s1 == null ? null : okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s1, 0, 0, " !\"#$&\'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 0xDB, null)));
            return this;
        }

        @l
        public final HttpUrl build() {
            ArrayList arrayList1;
            String s = this.scheme;
            if(s == null) {
                throw new IllegalStateException("scheme == null");
            }
            String s1 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, this.encodedUsername, 0, 0, false, 7, null);
            String s2 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, this.encodedPassword, 0, 0, false, 7, null);
            String s3 = this.host;
            if(s3 == null) {
                throw new IllegalStateException("host == null");
            }
            int v = this.effectivePort();
            ArrayList arrayList0 = new ArrayList(u.b0(this.encodedPathSegments, 10));
            for(Object object0: this.encodedPathSegments) {
                arrayList0.add(okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, ((String)object0), 0, 0, false, 7, null));
            }
            List list0 = this.encodedQueryNamesAndValues;
            if(list0 == null) {
                arrayList1 = null;
            }
            else {
                arrayList1 = new ArrayList(u.b0(list0, 10));
                for(Object object1: list0) {
                    String s4 = (String)object1;
                    arrayList1.add((s4 == null ? null : okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, s4, 0, 0, true, 3, null)));
                }
            }
            String s5 = this.encodedFragment;
            return s5 == null ? new HttpUrl(s, s1, s2, s3, v, arrayList0, arrayList1, null, "///") : new HttpUrl(s, s1, s2, s3, v, arrayList0, arrayList1, okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, s5, 0, 0, false, 7, null), "///");
        }

        private final int effectivePort() {
            int v = this.port;
            if(v == -1) {
                String s = this.scheme;
                L.m(s);
                return HttpUrl.Companion.defaultPort(s);
            }
            return v;
        }

        @l
        public final Builder encodedFragment(@m String s) {
            this.encodedFragment = s == null ? null : okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, 0, 0, "", true, false, false, true, null, 0xB3, null);
            return this;
        }

        @l
        public final Builder encodedPassword(@l String s) {
            L.p(s, "encodedPassword");
            this.encodedPassword = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, 0, 0, " \"\':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 0xF3, null);
            return this;
        }

        @l
        public final Builder encodedPath(@l String s) {
            L.p(s, "encodedPath");
            if(!v.v2(s, "/", false, 2, null)) {
                throw new IllegalArgumentException(("unexpected encodedPath: " + s).toString());
            }
            this.resolvePath(s, 0, s.length());
            return this;
        }

        @l
        public final Builder encodedQuery(@m String s) {
            List list0;
            if(s == null) {
                list0 = null;
            }
            else {
                okhttp3.HttpUrl.Companion httpUrl$Companion0 = HttpUrl.Companion;
                String s1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(httpUrl$Companion0, s, 0, 0, " \"\'<>#", true, false, true, false, null, 0xD3, null);
                list0 = s1 == null ? null : httpUrl$Companion0.toQueryNamesAndValues$okhttp(s1);
            }
            this.encodedQueryNamesAndValues = list0;
            return this;
        }

        @l
        public final Builder encodedUsername(@l String s) {
            L.p(s, "encodedUsername");
            this.encodedUsername = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, 0, 0, " \"\':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 0xF3, null);
            return this;
        }

        @l
        public final Builder fragment(@m String s) {
            this.encodedFragment = s == null ? null : okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, 0, 0, "", false, false, false, true, null, 0xBB, null);
            return this;
        }

        @m
        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        @l
        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        @l
        public final List getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        @m
        public final List getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        @l
        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        @m
        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        @m
        public final String getScheme$okhttp() {
            return this.scheme;
        }

        @l
        public final Builder host(@l String s) {
            L.p(s, "host");
            String s1 = HostnamesKt.toCanonicalHost(okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, s, 0, 0, false, 7, null));
            if(s1 == null) {
                throw new IllegalArgumentException("unexpected host: " + s);
            }
            this.host = s1;
            return this;
        }

        // 去混淆评级： 低(20)
        private final boolean isDot(String s) {
            return L.g(s, ".") || v.O1(s, "%2e", true);
        }

        // 去混淆评级： 低(40)
        private final boolean isDotDot(String s) {
            return L.g(s, "..") || v.O1(s, "%2e.", true) || v.O1(s, ".%2e", true) || v.O1(s, "%2e%2e", true);
        }

        @l
        public final Builder parse$okhttp(@m HttpUrl httpUrl0, @l String s) {
            int v12;
            int v11;
            int v10;
            int v7;
            int v4;
            String s1 = s;
            L.p(s1, "input");
            int v = Util.indexOfFirstNonAsciiWhitespace$default(s1, 0, 0, 3, null);
            int v1 = Util.indexOfLastNonAsciiWhitespace$default(s1, v, 0, 2, null);
            Companion httpUrl$Builder$Companion0 = Builder.Companion;
            int v2 = httpUrl$Builder$Companion0.schemeDelimiterOffset(s1, v, v1);
            if(v2 != -1) {
                if(v.s2(s1, "https:", v, true)) {
                    this.scheme = "https";
                    v += 6;
                    goto label_20;
                }
                if(v.s2(s1, "http:", v, true)) {
                    this.scheme = "http";
                    v += 5;
                    goto label_20;
                }
                String s2 = s1.substring(0, v2);
                L.o(s2, "this as java.lang.String…ing(startIndex, endIndex)");
                throw new IllegalArgumentException("Expected URL scheme \'http\' or \'https\' but was \'" + s2 + '\'');
            }
            if(httpUrl0 != null) {
                this.scheme = httpUrl0.scheme();
            label_20:
                int v3 = httpUrl$Builder$Companion0.slashCount(s1, v, v1);
                if(v3 < 2 && httpUrl0 != null && L.g(httpUrl0.scheme(), this.scheme)) {
                    this.encodedUsername = httpUrl0.encodedUsername();
                    this.encodedPassword = httpUrl0.encodedPassword();
                    this.host = httpUrl0.host();
                    this.port = httpUrl0.port();
                    this.encodedPathSegments.clear();
                    Collection collection0 = httpUrl0.encodedPathSegments();
                    this.encodedPathSegments.addAll(collection0);
                    if(v == v1 || s1.charAt(v) == 35) {
                        this.encodedQuery(httpUrl0.encodedQuery());
                    }
                    v4 = v1;
                    goto label_81;
                }
                int v5 = v + v3;
                int v6 = 0;
                boolean z = false;
                while(true) {
                    v7 = Util.delimiterOffset(s1, "@/\\?#", v5, v1);
                    int v8 = v7 == v1 ? -1 : s1.charAt(v7);
                    if(v8 == -1 || v8 == 35 || v8 == 0x2F || (v8 == 0x3F || v8 == 92)) {
                        break;
                    }
                    if(v8 == 0x40) {
                        if(v6 == 0) {
                            int v9 = Util.delimiterOffset(s1, ':', v5, v7);
                            okhttp3.HttpUrl.Companion httpUrl$Companion0 = HttpUrl.Companion;
                            String s3 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(httpUrl$Companion0, s, v5, v9, " \"\':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 0xF0, null);
                            if(z) {
                                s3 = this.encodedUsername + "%40" + s3;
                            }
                            this.encodedUsername = s3;
                            if(v9 == v7) {
                                v10 = v7;
                                v11 = 0;
                            }
                            else {
                                v10 = v7;
                                this.encodedPassword = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(httpUrl$Companion0, s, v9 + 1, v7, " \"\':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 0xF0, null);
                                v11 = 1;
                            }
                            v6 = v11;
                            v12 = v1;
                            z = true;
                        }
                        else {
                            v10 = v7;
                            v12 = v1;
                            this.encodedPassword = this.encodedPassword + "%40" + okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, v5, v10, " \"\':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 0xF0, null);
                        }
                        v5 = v10 + 1;
                        v1 = v12;
                    }
                }
                v4 = v1;
                Companion httpUrl$Builder$Companion1 = Builder.Companion;
                int v13 = httpUrl$Builder$Companion1.portColonOffset(s1, v5, v7);
                if(v13 + 1 < v7) {
                    this.host = HostnamesKt.toCanonicalHost(okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, s, v5, v13, false, 4, null));
                    int v14 = httpUrl$Builder$Companion1.parsePort(s1, v13 + 1, v7);
                    this.port = v14;
                    if(v14 == -1) {
                        String s4 = s1.substring(v13 + 1, v7);
                        L.o(s4, "this as java.lang.String…ing(startIndex, endIndex)");
                        throw new IllegalArgumentException(("Invalid URL port: \"" + s4 + '\"').toString());
                    }
                }
                else {
                    this.host = HostnamesKt.toCanonicalHost(okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, s, v5, v13, false, 4, null));
                    String s5 = this.scheme;
                    L.m(s5);
                    this.port = HttpUrl.Companion.defaultPort(s5);
                }
                if(this.host != null) {
                    v = v7;
                label_81:
                    int v15 = Util.delimiterOffset(s1, "?#", v, v4);
                    this.resolvePath(s1, v, v15);
                    if(v15 < v4 && s1.charAt(v15) == 0x3F) {
                        int v16 = Util.delimiterOffset(s1, '#', v15, v4);
                        String s6 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, v15 + 1, v16, " \"\'<>#", true, false, true, false, null, 0xD0, null);
                        this.encodedQueryNamesAndValues = HttpUrl.Companion.toQueryNamesAndValues$okhttp(s6);
                        v15 = v16;
                    }
                    if(v15 < v4 && s1.charAt(v15) == 35) {
                        this.encodedFragment = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, v15 + 1, v4, "", true, false, false, true, null, 0xB0, null);
                    }
                    return this;
                }
                String s7 = s1.substring(v5, v13);
                L.o(s7, "this as java.lang.String…ing(startIndex, endIndex)");
                throw new IllegalArgumentException(("Invalid URL host: \"" + s7 + '\"').toString());
            }
            if(s.length() > 6) {
                s1 = v.Z8(s1, 6) + "...";
            }
            throw new IllegalArgumentException("Expected URL scheme \'http\' or \'https\' but no scheme was found for " + s1);
        }

        @l
        public final Builder password(@l String s) {
            L.p(s, "password");
            this.encodedPassword = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, 0, 0, " \"\':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 0xFB, null);
            return this;
        }

        private final void pop() {
            if(((String)this.encodedPathSegments.remove(this.encodedPathSegments.size() - 1)).length() == 0 && !this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.set(this.encodedPathSegments.size() - 1, "");
                return;
            }
            this.encodedPathSegments.add("");
        }

        @l
        public final Builder port(int v) {
            if(1 > v || v >= 0x10000) {
                throw new IllegalArgumentException(("unexpected port: " + v).toString());
            }
            this.port = v;
            return this;
        }

        private final void push(String s, int v, int v1, boolean z, boolean z1) {
            String s1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, v, v1, " \"<>^`{}|/\\?#", z1, false, false, false, null, 0xF0, null);
            if(this.isDot(s1)) {
                return;
            }
            if(this.isDotDot(s1)) {
                this.pop();
                return;
            }
            if(((CharSequence)this.encodedPathSegments.get(this.encodedPathSegments.size() - 1)).length() == 0) {
                this.encodedPathSegments.set(this.encodedPathSegments.size() - 1, s1);
            }
            else {
                this.encodedPathSegments.add(s1);
            }
            if(z) {
                this.encodedPathSegments.add("");
            }
        }

        @l
        public final Builder query(@m String s) {
            List list0;
            if(s == null) {
                list0 = null;
            }
            else {
                okhttp3.HttpUrl.Companion httpUrl$Companion0 = HttpUrl.Companion;
                String s1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(httpUrl$Companion0, s, 0, 0, " \"\'<>#", false, false, true, false, null, 0xDB, null);
                list0 = s1 == null ? null : httpUrl$Companion0.toQueryNamesAndValues$okhttp(s1);
            }
            this.encodedQueryNamesAndValues = list0;
            return this;
        }

        @l
        public final Builder reencodeForUri$okhttp() {
            String s = this.host;
            String s1 = null;
            this.host = s == null ? null : new r("[\"<>^`{|}]").m(s, "");
            int v = this.encodedPathSegments.size();
            for(int v2 = 0; v2 < v; ++v2) {
                String s2 = (String)this.encodedPathSegments.get(v2);
                String s3 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s2, 0, 0, "[]", true, true, false, false, null, 0xE3, null);
                this.encodedPathSegments.set(v2, s3);
            }
            List list0 = this.encodedQueryNamesAndValues;
            if(list0 != null) {
                int v3 = list0.size();
                for(int v1 = 0; v1 < v3; ++v1) {
                    String s4 = (String)list0.get(v1);
                    list0.set(v1, (s4 == null ? null : okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s4, 0, 0, "\\^`{|}", true, true, true, false, null, 0xC3, null)));
                }
            }
            String s5 = this.encodedFragment;
            if(s5 != null) {
                s1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s5, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 0xA3, null);
            }
            this.encodedFragment = s1;
            return this;
        }

        private final void removeAllCanonicalQueryParameters(String s) {
            List list0 = this.encodedQueryNamesAndValues;
            L.m(list0);
            int v = list0.size() - 2;
            int v1 = n.c(v, 0, -2);
            if(v1 <= v) {
                while(true) {
                    List list1 = this.encodedQueryNamesAndValues;
                    L.m(list1);
                    if(L.g(s, list1.get(v))) {
                        List list2 = this.encodedQueryNamesAndValues;
                        L.m(list2);
                        list2.remove(v + 1);
                        List list3 = this.encodedQueryNamesAndValues;
                        L.m(list3);
                        list3.remove(v);
                        List list4 = this.encodedQueryNamesAndValues;
                        L.m(list4);
                        if(list4.isEmpty()) {
                            this.encodedQueryNamesAndValues = null;
                            return;
                        }
                    }
                    if(v == v1) {
                        break;
                    }
                    v -= 2;
                }
            }
        }

        @l
        public final Builder removeAllEncodedQueryParameters(@l String s) {
            L.p(s, "encodedName");
            if(this.encodedQueryNamesAndValues == null) {
                return this;
            }
            this.removeAllCanonicalQueryParameters(okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, 0, 0, " \"\'<>#&=", true, false, true, false, null, 0xD3, null));
            return this;
        }

        @l
        public final Builder removeAllQueryParameters(@l String s) {
            L.p(s, "name");
            if(this.encodedQueryNamesAndValues == null) {
                return this;
            }
            this.removeAllCanonicalQueryParameters(okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, 0, 0, " !\"#$&\'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 0xDB, null));
            return this;
        }

        @l
        public final Builder removePathSegment(int v) {
            this.encodedPathSegments.remove(v);
            if(this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        private final void resolvePath(String s, int v, int v1) {
            if(v == v1) {
                return;
            }
            switch(s.charAt(v)) {
                case 0x2F: 
                case 92: {
                    this.encodedPathSegments.clear();
                    this.encodedPathSegments.add("");
                    ++v;
                    break;
                }
                default: {
                    this.encodedPathSegments.set(this.encodedPathSegments.size() - 1, "");
                }
            }
        alab1:
            while(true) {
                for(int v2 = v; true; v2 = v + 1) {
                    if(v2 >= v1) {
                        break alab1;
                    }
                    v = Util.delimiterOffset(s, "/\\", v2, v1);
                    boolean z = v < v1;
                    this.push(s, v2, v, z, true);
                    if(!z) {
                        break;
                    }
                }
            }
        }

        @l
        public final Builder scheme(@l String s) {
            L.p(s, "scheme");
            if(v.O1(s, "http", true)) {
                this.scheme = "http";
                return this;
            }
            if(!v.O1(s, "https", true)) {
                throw new IllegalArgumentException("unexpected scheme: " + s);
            }
            this.scheme = "https";
            return this;
        }

        public final void setEncodedFragment$okhttp(@m String s) {
            this.encodedFragment = s;
        }

        public final void setEncodedPassword$okhttp(@l String s) {
            L.p(s, "<set-?>");
            this.encodedPassword = s;
        }

        @l
        public final Builder setEncodedPathSegment(int v, @l String s) {
            L.p(s, "encodedPathSegment");
            String s1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, 0, 0, " \"<>^`{}|/\\?#", true, false, false, false, null, 0xF3, null);
            this.encodedPathSegments.set(v, s1);
            if(this.isDot(s1) || this.isDotDot(s1)) {
                throw new IllegalArgumentException(("unexpected path segment: " + s).toString());
            }
            return this;
        }

        public final void setEncodedQueryNamesAndValues$okhttp(@m List list0) {
            this.encodedQueryNamesAndValues = list0;
        }

        @l
        public final Builder setEncodedQueryParameter(@l String s, @m String s1) {
            L.p(s, "encodedName");
            this.removeAllEncodedQueryParameters(s);
            this.addEncodedQueryParameter(s, s1);
            return this;
        }

        public final void setEncodedUsername$okhttp(@l String s) {
            L.p(s, "<set-?>");
            this.encodedUsername = s;
        }

        public final void setHost$okhttp(@m String s) {
            this.host = s;
        }

        @l
        public final Builder setPathSegment(int v, @l String s) {
            L.p(s, "pathSegment");
            String s1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, 0, 0, " \"<>^`{}|/\\?#", false, false, false, false, null, 0xFB, null);
            if(this.isDot(s1) || this.isDotDot(s1)) {
                throw new IllegalArgumentException(("unexpected path segment: " + s).toString());
            }
            this.encodedPathSegments.set(v, s1);
            return this;
        }

        public final void setPort$okhttp(int v) {
            this.port = v;
        }

        @l
        public final Builder setQueryParameter(@l String s, @m String s1) {
            L.p(s, "name");
            this.removeAllQueryParameters(s);
            this.addQueryParameter(s, s1);
            return this;
        }

        public final void setScheme$okhttp(@m String s) {
            this.scheme = s;
        }

        @Override
        @l
        public String toString() [...] // 潜在的解密器

        @l
        public final Builder username(@l String s) {
            L.p(s, "username");
            this.encodedUsername = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, 0, 0, " \"\':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 0xFB, null);
            return this;
        }
    }

    public static final class okhttp3.HttpUrl.Companion {
        @k(level = kotlin.m.b, message = "moved to extension function", replaceWith = @c0(expression = "url.toHttpUrl()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrl"}))
        @l
        @i(name = "-deprecated_get")
        public final HttpUrl -deprecated_get(@l String s) {
            L.p(s, "url");
            return this.get(s);
        }

        @k(level = kotlin.m.b, message = "moved to extension function", replaceWith = @c0(expression = "uri.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @m
        @i(name = "-deprecated_get")
        public final HttpUrl -deprecated_get(@l URI uRI0) {
            L.p(uRI0, "uri");
            return this.get(uRI0);
        }

        @k(level = kotlin.m.b, message = "moved to extension function", replaceWith = @c0(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @m
        @i(name = "-deprecated_get")
        public final HttpUrl -deprecated_get(@l URL uRL0) {
            L.p(uRL0, "url");
            return this.get(uRL0);
        }

        @k(level = kotlin.m.b, message = "moved to extension function", replaceWith = @c0(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @m
        @i(name = "-deprecated_parse")
        public final HttpUrl -deprecated_parse(@l String s) {
            L.p(s, "url");
            return this.parse(s);
        }

        private okhttp3.HttpUrl.Companion() {
        }

        public okhttp3.HttpUrl.Companion(w w0) {
        }

        @l
        public final String canonicalize$okhttp(@l String s, int v, int v1, @l String s1, boolean z, boolean z1, boolean z2, boolean z3, @m Charset charset0) {
            L.p(s, "<this>");
            L.p(s1, "encodeSet");
            int v2 = v;
            while(v2 < v1) {
                int v3 = s.codePointAt(v2);
                if(v3 >= 0x20 && v3 != 0x7F && (v3 < 0x80 || z3) && !v.V2(s1, ((char)v3), false, 2, null) && (v3 != 37 || z && (!z1 || this.isPercentEncoded(s, v2, v1))) && (v3 != 43 || !z2)) {
                    v2 += Character.charCount(v3);
                    continue;
                }
                okio.l l0 = new okio.l();
                l0.e3(s, v, v2);
                this.writeCanonicalized(l0, s, v2, v1, s1, z, z1, z2, z3, charset0);
                return "";
            }
            String s2 = s.substring(v, v1);
            L.o(s2, "this as java.lang.String…ing(startIndex, endIndex)");
            return s2;
        }

        public static String canonicalize$okhttp$default(okhttp3.HttpUrl.Companion httpUrl$Companion0, String s, int v, int v1, String s1, boolean z, boolean z1, boolean z2, boolean z3, Charset charset0, int v2, Object object0) {
            int v3 = (v2 & 1) == 0 ? v : 0;
            int v4 = (v2 & 2) == 0 ? v1 : s.length();
            boolean z4 = (v2 & 8) == 0 ? z : false;
            boolean z5 = (v2 & 16) == 0 ? z1 : false;
            boolean z6 = (v2 & 0x20) == 0 ? z2 : false;
            boolean z7 = (v2 & 0x40) == 0 ? z3 : false;
            return (v2 & 0x80) == 0 ? httpUrl$Companion0.canonicalize$okhttp(s, v3, v4, s1, z4, z5, z6, z7, charset0) : httpUrl$Companion0.canonicalize$okhttp(s, v3, v4, s1, z4, z5, z6, z7, null);
        }

        @z3.n
        public final int defaultPort(@l String s) {
            L.p(s, "scheme");
            if(L.g(s, "http")) {
                return 80;
            }
            return L.g(s, "https") ? 443 : -1;
        }

        @l
        @i(name = "get")
        @z3.n
        public final HttpUrl get(@l String s) {
            L.p(s, "<this>");
            return new Builder().parse$okhttp(null, s).build();
        }

        @m
        @i(name = "get")
        @z3.n
        public final HttpUrl get(@l URI uRI0) {
            L.p(uRI0, "<this>");
            String s = uRI0.toString();
            L.o(s, "toString()");
            return this.parse(s);
        }

        @m
        @i(name = "get")
        @z3.n
        public final HttpUrl get(@l URL uRL0) {
            L.p(uRL0, "<this>");
            String s = uRL0.toString();
            L.o(s, "toString()");
            return this.parse(s);
        }

        private final boolean isPercentEncoded(String s, int v, int v1) {
            return v + 2 < v1 && s.charAt(v) == 37 && Util.parseHexDigit(s.charAt(v + 1)) != -1 && Util.parseHexDigit(s.charAt(v + 2)) != -1;
        }

        @m
        @i(name = "parse")
        @z3.n
        public final HttpUrl parse(@l String s) {
            L.p(s, "<this>");
            try {
                return this.get(s);
            }
            catch(IllegalArgumentException unused_ex) {
                return null;
            }
        }

        @l
        public final String percentDecode$okhttp(@l String s, int v, int v1, boolean z) {
            L.p(s, "<this>");
            int v2 = v;
            while(v2 < v1) {
                int v3 = s.charAt(v2);
                if(v3 != 37 && (v3 != 43 || !z)) {
                    ++v2;
                    continue;
                }
                okio.l l0 = new okio.l();
                l0.e3(s, v, v2);
                this.writePercentDecoded(l0, s, v2, v1, z);
                return "";
            }
            String s1 = s.substring(v, v1);
            L.o(s1, "this as java.lang.String…ing(startIndex, endIndex)");
            return s1;
        }

        public static String percentDecode$okhttp$default(okhttp3.HttpUrl.Companion httpUrl$Companion0, String s, int v, int v1, boolean z, int v2, Object object0) {
            if((v2 & 1) != 0) {
                v = 0;
            }
            if((v2 & 2) != 0) {
                v1 = s.length();
            }
            if((v2 & 4) != 0) {
                z = false;
            }
            return httpUrl$Companion0.percentDecode$okhttp(s, v, v1, z);
        }

        public final void toPathString$okhttp(@l List list0, @l StringBuilder stringBuilder0) {
            L.p(list0, "<this>");
            L.p(stringBuilder0, "out");
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                stringBuilder0.append('/');
                stringBuilder0.append(((String)list0.get(v1)));
            }
        }

        @l
        public final List toQueryNamesAndValues$okhttp(@l String s) {
            L.p(s, "<this>");
            List list0 = new ArrayList();
            for(int v = 0; v <= s.length(); v = v1 + 1) {
                int v1 = v.r3(s, '&', v, false, 4, null);
                if(v1 == -1) {
                    v1 = s.length();
                }
                int v2 = v.r3(s, '=', v, false, 4, null);
                if(v2 == -1 || v2 > v1) {
                    String s3 = s.substring(v, v1);
                    L.o(s3, "this as java.lang.String…ing(startIndex, endIndex)");
                    list0.add(s3);
                    list0.add(null);
                }
                else {
                    String s1 = s.substring(v, v2);
                    L.o(s1, "this as java.lang.String…ing(startIndex, endIndex)");
                    list0.add(s1);
                    String s2 = s.substring(v2 + 1, v1);
                    L.o(s2, "this as java.lang.String…ing(startIndex, endIndex)");
                    list0.add(s2);
                }
            }
            return list0;
        }

        public final void toQueryString$okhttp(@l List list0, @l StringBuilder stringBuilder0) {
            L.p(list0, "<this>");
            L.p(stringBuilder0, "out");
            j j0 = s.B1(s.W1(0, list0.size()), 2);
            int v = j0.g();
            int v1 = j0.h();
            int v2 = j0.i();
            if(v2 > 0 && v <= v1 || v2 < 0 && v1 <= v) {
                while(true) {
                    String s = (String)list0.get(v);
                    String s1 = (String)list0.get(v + 1);
                    if(v > 0) {
                        stringBuilder0.append('&');
                    }
                    stringBuilder0.append(s);
                    if(s1 != null) {
                        stringBuilder0.append('=');
                        stringBuilder0.append(s1);
                    }
                    if(v == v1) {
                        break;
                    }
                    v += v2;
                }
            }
        }

        private final void writeCanonicalized(okio.l l0, String s, int v, int v1, String s1, boolean z, boolean z1, boolean z2, boolean z3, Charset charset0) {
            okio.l l1 = null;
            while(v < v1) {
                int v2 = s.codePointAt(v);
                if(!z || v2 != 9 && v2 != 10 && v2 != 12 && v2 != 13) {
                    if(v2 == 43 && z2) {
                        l0.b3((z ? "+" : "%2B"));
                    }
                    else if(v2 < 0x20 || v2 == 0x7F || v2 >= 0x80 && !z3 || v.V2(s1, ((char)v2), false, 2, null) || v2 == 37 && (!z || z1 && !this.isPercentEncoded(s, v, v1))) {
                        if(l1 == null) {
                            l1 = new okio.l();
                        }
                        if(charset0 == null || L.g(charset0, StandardCharsets.UTF_8)) {
                            l1.n3(v2);
                        }
                        else {
                            l1.I2(s, v, Character.charCount(v2) + v, charset0);
                        }
                        while(!l1.j3()) {
                            int v3 = l1.readByte();
                            l0.e2(37);
                            l0.e2(((int)HttpUrl.HEX_DIGITS[(v3 & 0xFF) >> 4 & 15]));
                            l0.e2(((int)HttpUrl.HEX_DIGITS[v3 & 15]));
                        }
                    }
                    else {
                        l0.n3(v2);
                    }
                }
                v += Character.charCount(v2);
            }
        }

        private final void writePercentDecoded(okio.l l0, String s, int v, int v1, boolean z) {
            while(v < v1) {
                int v2 = s.codePointAt(v);
                if(v2 == 37 && v + 2 < v1) {
                    int v3 = Util.parseHexDigit(s.charAt(v + 1));
                    int v4 = Util.parseHexDigit(s.charAt(v + 2));
                    if(v3 != -1 && v4 != -1) {
                        l0.e2((v3 << 4) + v4);
                        v += 3;
                        continue;
                    }
                }
                else if(v2 == 43 && z) {
                    l0.e2(0x20);
                    ++v;
                    continue;
                }
                l0.n3(v2);
                v += Character.charCount(v2);
            }
        }
    }

    @l
    public static final okhttp3.HttpUrl.Companion Companion = null;
    @l
    public static final String FORM_ENCODE_SET = " \"\':;<=>@[]^`{}|/\\?#&!$(),~";
    @l
    public static final String FRAGMENT_ENCODE_SET = "";
    @l
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    @l
    private static final char[] HEX_DIGITS = null;
    @l
    public static final String PASSWORD_ENCODE_SET = " \"\':;<=>@[]^`{}|/\\?#";
    @l
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    @l
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    @l
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&\'(),/:;<=>?@[]\\^`{|}~";
    @l
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    @l
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"\'<>#&=";
    @l
    public static final String QUERY_ENCODE_SET = " \"\'<>#";
    @l
    public static final String USERNAME_ENCODE_SET = " \"\':;<=>@[]^`{}|/\\?#";
    @m
    private final String fragment;
    @l
    private final String host;
    private final boolean isHttps;
    @l
    private final String password;
    @l
    private final List pathSegments;
    private final int port;
    @m
    private final List queryNamesAndValues;
    @l
    private final String scheme;
    @l
    private final String url;
    @l
    private final String username;

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "encodedFragment", imports = {}))
    @m
    @i(name = "-deprecated_encodedFragment")
    public final String -deprecated_encodedFragment() {
        return this.encodedFragment();
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "encodedPassword", imports = {}))
    @l
    @i(name = "-deprecated_encodedPassword")
    public final String -deprecated_encodedPassword() {
        return this.encodedPassword();
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "encodedPath", imports = {}))
    @l
    @i(name = "-deprecated_encodedPath")
    public final String -deprecated_encodedPath() {
        return this.encodedPath();
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "encodedPathSegments", imports = {}))
    @l
    @i(name = "-deprecated_encodedPathSegments")
    public final List -deprecated_encodedPathSegments() {
        return this.encodedPathSegments();
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "encodedQuery", imports = {}))
    @m
    @i(name = "-deprecated_encodedQuery")
    public final String -deprecated_encodedQuery() {
        return this.encodedQuery();
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "encodedUsername", imports = {}))
    @l
    @i(name = "-deprecated_encodedUsername")
    public final String -deprecated_encodedUsername() {
        return this.encodedUsername();
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "fragment", imports = {}))
    @m
    @i(name = "-deprecated_fragment")
    public final String -deprecated_fragment() {
        return this.fragment;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "host", imports = {}))
    @l
    @i(name = "-deprecated_host")
    public final String -deprecated_host() {
        return this.host;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "password", imports = {}))
    @l
    @i(name = "-deprecated_password")
    public final String -deprecated_password() {
        return this.password;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "pathSegments", imports = {}))
    @l
    @i(name = "-deprecated_pathSegments")
    public final List -deprecated_pathSegments() {
        return this.pathSegments;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "pathSize", imports = {}))
    @i(name = "-deprecated_pathSize")
    public final int -deprecated_pathSize() {
        return this.pathSize();
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "port", imports = {}))
    @i(name = "-deprecated_port")
    public final int -deprecated_port() {
        return this.port;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "query", imports = {}))
    @m
    @i(name = "-deprecated_query")
    public final String -deprecated_query() {
        return this.query();
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "queryParameterNames", imports = {}))
    @l
    @i(name = "-deprecated_queryParameterNames")
    public final Set -deprecated_queryParameterNames() {
        return this.queryParameterNames();
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "querySize", imports = {}))
    @i(name = "-deprecated_querySize")
    public final int -deprecated_querySize() {
        return this.querySize();
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "scheme", imports = {}))
    @l
    @i(name = "-deprecated_scheme")
    public final String -deprecated_scheme() {
        return this.scheme;
    }

    @k(level = kotlin.m.b, message = "moved to toUri()", replaceWith = @c0(expression = "toUri()", imports = {}))
    @l
    @i(name = "-deprecated_uri")
    public final URI -deprecated_uri() {
        return this.uri();
    }

    @k(level = kotlin.m.b, message = "moved to toUrl()", replaceWith = @c0(expression = "toUrl()", imports = {}))
    @l
    @i(name = "-deprecated_url")
    public final URL -deprecated_url() {
        return this.url();
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "username", imports = {}))
    @l
    @i(name = "-deprecated_username")
    public final String -deprecated_username() {
        return this.username;
    }

    static {
        HttpUrl.Companion = new okhttp3.HttpUrl.Companion(null);
        HttpUrl.HEX_DIGITS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public HttpUrl(@l String s, @l String s1, @l String s2, @l String s3, int v, @l List list0, @m List list1, @m String s4, @l String s5) {
        L.p(s, "scheme");
        L.p(s1, "username");
        L.p(s2, "password");
        L.p(s3, "host");
        L.p(list0, "pathSegments");
        L.p(s5, "url");
        super();
        this.scheme = s;
        this.username = s1;
        this.password = s2;
        this.host = s3;
        this.port = v;
        this.pathSegments = list0;
        this.queryNamesAndValues = list1;
        this.fragment = s4;
        this.url = s5;
        this.isHttps = L.g(s, "https");
    }

    @z3.n
    public static final int defaultPort(@l String s) {
        return HttpUrl.Companion.defaultPort(s);
    }

    @m
    @i(name = "encodedFragment")
    public final String encodedFragment() {
        if(this.fragment == null) {
            return null;
        }
        int v = v.r3(this.url, '#', 0, false, 6, null);
        String s = this.url.substring(v + 1);
        L.o(s, "this as java.lang.String).substring(startIndex)");
        return s;
    }

    @l
    @i(name = "encodedPassword")
    public final String encodedPassword() {
        if(this.password.length() == 0) {
            return "";
        }
        int v = v.r3(this.url, ':', this.scheme.length() + 3, false, 4, null);
        int v1 = v.r3(this.url, '@', 0, false, 6, null);
        String s = this.url.substring(v + 1, v1);
        L.o(s, "this as java.lang.String…ing(startIndex, endIndex)");
        return s;
    }

    @l
    @i(name = "encodedPath")
    public final String encodedPath() {
        int v = v.r3(this.url, '/', this.scheme.length() + 3, false, 4, null);
        int v1 = Util.delimiterOffset(this.url, "?#", v, this.url.length());
        String s = this.url.substring(v, v1);
        L.o(s, "this as java.lang.String…ing(startIndex, endIndex)");
        return s;
    }

    @l
    @i(name = "encodedPathSegments")
    public final List encodedPathSegments() {
        int v = v.r3(this.url, '/', this.scheme.length() + 3, false, 4, null);
        int v1 = Util.delimiterOffset(this.url, "?#", v, this.url.length());
        List list0 = new ArrayList();
        while(v < v1) {
            int v2 = Util.delimiterOffset(this.url, '/', v + 1, v1);
            String s = this.url.substring(v + 1, v2);
            L.o(s, "this as java.lang.String…ing(startIndex, endIndex)");
            list0.add(s);
            v = v2;
        }
        return list0;
    }

    @m
    @i(name = "encodedQuery")
    public final String encodedQuery() {
        if(this.queryNamesAndValues == null) {
            return null;
        }
        int v = v.r3(this.url, '?', 0, false, 6, null);
        int v1 = Util.delimiterOffset(this.url, '#', v + 1, this.url.length());
        String s = this.url.substring(v + 1, v1);
        L.o(s, "this as java.lang.String…ing(startIndex, endIndex)");
        return s;
    }

    @l
    @i(name = "encodedUsername")
    public final String encodedUsername() {
        if(this.username.length() == 0) {
            return "";
        }
        int v = this.scheme.length();
        int v1 = Util.delimiterOffset(this.url, ":@", v + 3, this.url.length());
        String s = this.url.substring(v + 3, v1);
        L.o(s, "this as java.lang.String…ing(startIndex, endIndex)");
        return s;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof HttpUrl && L.g(((HttpUrl)object0).url, this.url);
    }

    @m
    @i(name = "fragment")
    public final String fragment() {
        return this.fragment;
    }

    @l
    @i(name = "get")
    @z3.n
    public static final HttpUrl get(@l String s) {
        return HttpUrl.Companion.get(s);
    }

    @m
    @i(name = "get")
    @z3.n
    public static final HttpUrl get(@l URI uRI0) {
        return HttpUrl.Companion.get(uRI0);
    }

    @m
    @i(name = "get")
    @z3.n
    public static final HttpUrl get(@l URL uRL0) {
        return HttpUrl.Companion.get(uRL0);
    }

    @Override
    public int hashCode() {
        return this.url.hashCode();
    }

    @l
    @i(name = "host")
    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    @l
    public final Builder newBuilder() {
        Builder httpUrl$Builder0 = new Builder();
        httpUrl$Builder0.setScheme$okhttp(this.scheme);
        httpUrl$Builder0.setEncodedUsername$okhttp(this.encodedUsername());
        httpUrl$Builder0.setEncodedPassword$okhttp(this.encodedPassword());
        httpUrl$Builder0.setHost$okhttp(this.host);
        int v = HttpUrl.Companion.defaultPort(this.scheme);
        httpUrl$Builder0.setPort$okhttp((this.port == v ? -1 : this.port));
        httpUrl$Builder0.getEncodedPathSegments$okhttp().clear();
        httpUrl$Builder0.getEncodedPathSegments$okhttp().addAll(this.encodedPathSegments());
        httpUrl$Builder0.encodedQuery(this.encodedQuery());
        httpUrl$Builder0.setEncodedFragment$okhttp(this.encodedFragment());
        return httpUrl$Builder0;
    }

    @m
    public final Builder newBuilder(@l String s) {
        L.p(s, "link");
        try {
            return new Builder().parse$okhttp(this, s);
        }
        catch(IllegalArgumentException unused_ex) {
            return null;
        }
    }

    @m
    @i(name = "parse")
    @z3.n
    public static final HttpUrl parse(@l String s) {
        return HttpUrl.Companion.parse(s);
    }

    @l
    @i(name = "password")
    public final String password() {
        return this.password;
    }

    @l
    @i(name = "pathSegments")
    public final List pathSegments() {
        return this.pathSegments;
    }

    @i(name = "pathSize")
    public final int pathSize() {
        return this.pathSegments.size();
    }

    @i(name = "port")
    public final int port() {
        return this.port;
    }

    @m
    @i(name = "query")
    public final String query() {
        if(this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        HttpUrl.Companion.toQueryString$okhttp(this.queryNamesAndValues, stringBuilder0);
        return stringBuilder0.toString();
    }

    @m
    public final String queryParameter(@l String s) {
        L.p(s, "name");
        List list0 = this.queryNamesAndValues;
        if(list0 == null) {
            return null;
        }
        j j0 = s.B1(s.W1(0, list0.size()), 2);
        int v = j0.g();
        int v1 = j0.h();
        int v2 = j0.i();
        if(v2 > 0 && v <= v1 || v2 < 0 && v1 <= v) {
            while(true) {
                if(L.g(s, this.queryNamesAndValues.get(v))) {
                    return (String)this.queryNamesAndValues.get(v + 1);
                }
                if(v == v1) {
                    break;
                }
                v += v2;
            }
        }
        return null;
    }

    @l
    public final String queryParameterName(int v) {
        List list0 = this.queryNamesAndValues;
        if(list0 == null) {
            throw new IndexOutOfBoundsException();
        }
        Object object0 = list0.get(v * 2);
        L.m(object0);
        return (String)object0;
    }

    @l
    @i(name = "queryParameterNames")
    public final Set queryParameterNames() {
        if(this.queryNamesAndValues == null) {
            return k0.k();
        }
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        j j0 = s.B1(s.W1(0, this.queryNamesAndValues.size()), 2);
        int v = j0.g();
        int v1 = j0.h();
        int v2 = j0.i();
        if(v2 > 0 && v <= v1 || v2 < 0 && v1 <= v) {
            while(true) {
                Object object0 = this.queryNamesAndValues.get(v);
                L.m(object0);
                linkedHashSet0.add(object0);
                if(v == v1) {
                    break;
                }
                v += v2;
            }
        }
        Set set0 = DesugarCollections.unmodifiableSet(linkedHashSet0);
        L.o(set0, "unmodifiableSet(result)");
        return set0;
    }

    @m
    public final String queryParameterValue(int v) {
        List list0 = this.queryNamesAndValues;
        if(list0 == null) {
            throw new IndexOutOfBoundsException();
        }
        return (String)list0.get(v * 2 + 1);
    }

    @l
    public final List queryParameterValues(@l String s) {
        L.p(s, "name");
        if(this.queryNamesAndValues == null) {
            return u.H();
        }
        ArrayList arrayList0 = new ArrayList();
        j j0 = s.B1(s.W1(0, this.queryNamesAndValues.size()), 2);
        int v = j0.g();
        int v1 = j0.h();
        int v2 = j0.i();
        if(v2 > 0 && v <= v1 || v2 < 0 && v1 <= v) {
            while(true) {
                if(L.g(s, this.queryNamesAndValues.get(v))) {
                    arrayList0.add(this.queryNamesAndValues.get(v + 1));
                }
                if(v == v1) {
                    break;
                }
                v += v2;
            }
        }
        List list0 = DesugarCollections.unmodifiableList(arrayList0);
        L.o(list0, "unmodifiableList(result)");
        return list0;
    }

    @i(name = "querySize")
    public final int querySize() {
        return this.queryNamesAndValues == null ? 0 : this.queryNamesAndValues.size() / 2;
    }

    @l
    public final String redact() {
        Builder httpUrl$Builder0 = this.newBuilder("/...");
        L.m(httpUrl$Builder0);
        return httpUrl$Builder0.username("").password("").build().toString();
    }

    @m
    public final HttpUrl resolve(@l String s) {
        L.p(s, "link");
        Builder httpUrl$Builder0 = this.newBuilder(s);
        return httpUrl$Builder0 == null ? null : httpUrl$Builder0.build();
    }

    @l
    @i(name = "scheme")
    public final String scheme() {
        return this.scheme;
    }

    @Override
    @l
    public String toString() {
        return this.url;
    }

    // 去混淆评级： 低(20)
    @m
    public final String topPrivateDomain() {
        return Util.canParseAsIpAddress(this.host) ? null : PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    @l
    @i(name = "uri")
    public final URI uri() {
        URI uRI0;
        try {
            return new URI("///");
        }
        catch(URISyntaxException uRISyntaxException0) {
            try {
                uRI0 = URI.create("///");
            }
            catch(Exception unused_ex) {
                throw new RuntimeException(uRISyntaxException0);
            }
            L.o(uRI0, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
            return uRI0;
        }
    }

    @l
    @i(name = "url")
    public final URL url() {
        try {
            return new URL(this.url);
        }
        catch(MalformedURLException malformedURLException0) {
            throw new RuntimeException(malformedURLException0);
        }
    }

    @l
    @i(name = "username")
    public final String username() {
        return this.username;
    }
}

