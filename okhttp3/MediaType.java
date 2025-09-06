package okhttp3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import kotlin.text.v;
import y4.l;
import z3.i;
import z3.j;
import z3.n;

public final class MediaType {
    @s0({"SMAP\nMediaType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaType.kt\nokhttp3/MediaType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,181:1\n1#2:182\n37#3,2:183\n*S KotlinDebug\n*F\n+ 1 MediaType.kt\nokhttp3/MediaType$Companion\n*L\n148#1:183,2\n*E\n"})
    public static final class Companion {
        @k(level = m.b, message = "moved to extension function", replaceWith = @c0(expression = "mediaType.toMediaType()", imports = {"okhttp3.MediaType.Companion.toMediaType"}))
        @l
        @i(name = "-deprecated_get")
        public final MediaType -deprecated_get(@l String s) {
            L.p(s, "mediaType");
            return this.get(s);
        }

        @k(level = m.b, message = "moved to extension function", replaceWith = @c0(expression = "mediaType.toMediaTypeOrNull()", imports = {"okhttp3.MediaType.Companion.toMediaTypeOrNull"}))
        @y4.m
        @i(name = "-deprecated_parse")
        public final MediaType -deprecated_parse(@l String s) {
            L.p(s, "mediaType");
            return this.parse(s);
        }

        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        @i(name = "get")
        @n
        public final MediaType get(@l String s) {
            L.p(s, "<this>");
            Matcher matcher0 = MediaType.TYPE_SUBTYPE.matcher(s);
            if(!matcher0.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + s + '\"').toString());
            }
            String s1 = matcher0.group(1);
            L.o(s1, "typeSubtype.group(1)");
            Locale locale0 = Locale.US;
            L.o(locale0, "US");
            String s2 = s1.toLowerCase(locale0);
            L.o(s2, "this as java.lang.String).toLowerCase(locale)");
            String s3 = matcher0.group(2);
            L.o(s3, "typeSubtype.group(2)");
            L.o(locale0, "US");
            String s4 = s3.toLowerCase(locale0);
            L.o(s4, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList0 = new ArrayList();
            Matcher matcher1 = MediaType.PARAMETER.matcher(s);
            int v = matcher0.end();
            while(v < s.length()) {
                matcher1.region(v, s.length());
                if(matcher1.lookingAt()) {
                    String s5 = matcher1.group(1);
                    if(s5 == null) {
                        v = matcher1.end();
                        continue;
                    }
                    String s6 = matcher1.group(2);
                    if(s6 == null) {
                        s6 = matcher1.group(3);
                    }
                    else if(v.v2(s6, "\'", false, 2, null) && v.N1(s6, "\'", false, 2, null) && s6.length() > 2) {
                        s6 = s6.substring(1, s6.length() - 1);
                        L.o(s6, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList0.add(s5);
                    arrayList0.add(s6);
                    v = matcher1.end();
                    continue;
                }
                String s7 = s.substring(v);
                L.o(s7, "this as java.lang.String).substring(startIndex)");
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + s7 + "\" for: \"" + s + '\"').toString());
            }
            return new MediaType(s, s2, s4, ((String[])arrayList0.toArray(new String[0])), null);
        }

        @y4.m
        @i(name = "parse")
        @n
        public final MediaType parse(@l String s) {
            L.p(s, "<this>");
            try {
                return this.get(s);
            }
            catch(IllegalArgumentException unused_ex) {
                return null;
            }
        }
    }

    @l
    public static final Companion Companion = null;
    private static final Pattern PARAMETER = null;
    @l
    private static final String QUOTED = "\"([^\"]*)\"";
    @l
    private static final String TOKEN = "([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)";
    private static final Pattern TYPE_SUBTYPE;
    @l
    private final String mediaType;
    @l
    private final String[] parameterNamesAndValues;
    @l
    private final String subtype;
    @l
    private final String type;

    @k(level = m.b, message = "moved to val", replaceWith = @c0(expression = "subtype", imports = {}))
    @l
    @i(name = "-deprecated_subtype")
    public final String -deprecated_subtype() {
        return this.subtype;
    }

    @k(level = m.b, message = "moved to val", replaceWith = @c0(expression = "type", imports = {}))
    @l
    @i(name = "-deprecated_type")
    public final String -deprecated_type() {
        return this.type;
    }

    static {
        MediaType.Companion = new Companion(null);
        MediaType.TYPE_SUBTYPE = Pattern.compile("([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)");
        MediaType.PARAMETER = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    }

    private MediaType(String s, String s1, String s2, String[] arr_s) {
        this.mediaType = s;
        this.type = s1;
        this.subtype = s2;
        this.parameterNamesAndValues = arr_s;
    }

    public MediaType(String s, String s1, String s2, String[] arr_s, w w0) {
        this(s, s1, s2, arr_s);
    }

    @y4.m
    @j
    public final Charset charset() {
        return MediaType.charset$default(this, null, 1, null);
    }

    @y4.m
    @j
    public final Charset charset(@y4.m Charset charset0) {
        String s = this.parameter("charset");
        if(s == null) {
            return charset0;
        }
        try {
            return Charset.forName(s);
        }
        catch(IllegalArgumentException unused_ex) {
            return charset0;
        }
    }

    public static Charset charset$default(MediaType mediaType0, Charset charset0, int v, Object object0) {
        if((v & 1) != 0) {
            charset0 = null;
        }
        return mediaType0.charset(charset0);
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@y4.m Object object0) {
        return object0 instanceof MediaType && L.g(((MediaType)object0).mediaType, this.mediaType);
    }

    @l
    @i(name = "get")
    @n
    public static final MediaType get(@l String s) {
        return MediaType.Companion.get(s);
    }

    @Override
    public int hashCode() {
        return this.mediaType.hashCode();
    }

    @y4.m
    public final String parameter(@l String s) {
        L.p(s, "name");
        int v1 = kotlin.internal.n.c(0, this.parameterNamesAndValues.length - 1, 2);
        if(v1 >= 0) {
            for(int v = 0; true; v += 2) {
                if(v.O1(this.parameterNamesAndValues[v], s, true)) {
                    return this.parameterNamesAndValues[v + 1];
                }
                if(v == v1) {
                    break;
                }
            }
        }
        return null;
    }

    @y4.m
    @i(name = "parse")
    @n
    public static final MediaType parse(@l String s) {
        return MediaType.Companion.parse(s);
    }

    @l
    @i(name = "subtype")
    public final String subtype() {
        return this.subtype;
    }

    @Override
    @l
    public String toString() {
        return this.mediaType;
    }

    @l
    @i(name = "type")
    public final String type() {
        return this.type;
    }
}

