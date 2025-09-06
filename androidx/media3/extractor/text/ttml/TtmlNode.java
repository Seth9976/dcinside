package androidx.media3.extractor.text.ttml;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue.Builder;
import androidx.media3.common.util.Assertions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

final class TtmlNode {
    public static final String A = "data";
    public static final String A0 = "filled";
    public static final String B = "information";
    public static final String B0 = "open";
    public static final String C = "";
    public static final String D = "id";
    public static final String E = "origin";
    public static final String F = "extent";
    public static final String G = "displayAlign";
    public static final String H = "backgroundColor";
    public static final String I = "fontStyle";
    public static final String J = "fontSize";
    public static final String K = "fontFamily";
    public static final String L = "fontWeight";
    public static final String M = "color";
    public static final String N = "ruby";
    public static final String O = "rubyPosition";
    public static final String P = "textDecoration";
    public static final String Q = "textAlign";
    public static final String R = "textCombine";
    public static final String S = "textEmphasis";
    public static final String T = "writingMode";
    public static final String U = "shear";
    public static final String V = "multiRowAlign";
    public static final String W = "container";
    public static final String X = "base";
    public static final String Y = "baseContainer";
    public static final String Z = "text";
    @Nullable
    public final String a;
    public static final String a0 = "textContainer";
    @Nullable
    public final String b;
    public static final String b0 = "delimiter";
    public final boolean c;
    public static final String c0 = "before";
    public final long d;
    public static final String d0 = "after";
    public final long e;
    public static final String e0 = "outside";
    @Nullable
    public final TtmlStyle f;
    public static final String f0 = "linethrough";
    @Nullable
    private final String[] g;
    public static final String g0 = "nolinethrough";
    public final String h;
    public static final String h0 = "underline";
    @Nullable
    public final String i;
    public static final String i0 = "nounderline";
    @Nullable
    public final TtmlNode j;
    public static final String j0 = "italic";
    private final HashMap k;
    public static final String k0 = "bold";
    private final HashMap l;
    public static final String l0 = "left";
    private List m;
    public static final String m0 = "center";
    public static final String n = "tt";
    public static final String n0 = "right";
    public static final String o = "head";
    public static final String o0 = "start";
    public static final String p = "body";
    public static final String p0 = "end";
    public static final String q = "div";
    public static final String q0 = "none";
    public static final String r = "p";
    public static final String r0 = "all";
    public static final String s = "span";
    public static final String s0 = "tb";
    public static final String t = "br";
    public static final String t0 = "tblr";
    public static final String u = "style";
    public static final String u0 = "tbrl";
    public static final String v = "styling";
    public static final String v0 = "none";
    public static final String w = "layout";
    public static final String w0 = "auto";
    public static final String x = "region";
    public static final String x0 = "dot";
    public static final String y = "metadata";
    public static final String y0 = "sesame";
    public static final String z = "image";
    public static final String z0 = "circle";

    private TtmlNode(@Nullable String s, @Nullable String s1, long v, long v1, @Nullable TtmlStyle ttmlStyle0, @Nullable String[] arr_s, String s2, @Nullable String s3, @Nullable TtmlNode ttmlNode0) {
        this.a = s;
        this.b = s1;
        this.i = s3;
        this.f = ttmlStyle0;
        this.g = arr_s;
        this.c = s1 != null;
        this.d = v;
        this.e = v1;
        this.h = (String)Assertions.g(s2);
        this.j = ttmlNode0;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public void a(TtmlNode ttmlNode0) {
        if(this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(ttmlNode0);
    }

    private void b(Map map0, Builder cue$Builder0, int v, int v1, int v2) {
        TtmlStyle ttmlStyle0 = TtmlRenderUtil.f(this.f, this.g, map0);
        SpannableStringBuilder spannableStringBuilder0 = (SpannableStringBuilder)cue$Builder0.k();
        if(spannableStringBuilder0 == null) {
            spannableStringBuilder0 = new SpannableStringBuilder();
            cue$Builder0.A(spannableStringBuilder0);
        }
        if(ttmlStyle0 != null) {
            TtmlRenderUtil.a(spannableStringBuilder0, v, v1, ttmlStyle0, this.j, map0, v2);
            if("p".equals(this.a)) {
                if(ttmlStyle0.k() != 3.402823E+38f) {
                    cue$Builder0.y(ttmlStyle0.k() * -90.0f / 100.0f);
                }
                if(ttmlStyle0.m() != null) {
                    cue$Builder0.B(ttmlStyle0.m());
                }
                if(ttmlStyle0.h() != null) {
                    cue$Builder0.v(ttmlStyle0.h());
                }
            }
        }
    }

    public static TtmlNode c(@Nullable String s, long v, long v1, @Nullable TtmlStyle ttmlStyle0, @Nullable String[] arr_s, String s1, @Nullable String s2, @Nullable TtmlNode ttmlNode0) {
        return new TtmlNode(s, null, v, v1, ttmlStyle0, arr_s, s1, s2, ttmlNode0);
    }

    public static TtmlNode d(String s) {
        return new TtmlNode(null, TtmlRenderUtil.b(s), 0x8000000000000001L, 0x8000000000000001L, null, null, "", null, null);
    }

    private static void e(SpannableStringBuilder spannableStringBuilder0) {
        DeleteTextSpan[] arr_deleteTextSpan = (DeleteTextSpan[])spannableStringBuilder0.getSpans(0, spannableStringBuilder0.length(), DeleteTextSpan.class);
        for(int v1 = 0; v1 < arr_deleteTextSpan.length; ++v1) {
            DeleteTextSpan deleteTextSpan0 = arr_deleteTextSpan[v1];
            spannableStringBuilder0.replace(spannableStringBuilder0.getSpanStart(deleteTextSpan0), spannableStringBuilder0.getSpanEnd(deleteTextSpan0), "");
        }
        for(int v2 = 0; v2 < spannableStringBuilder0.length(); ++v2) {
            if(spannableStringBuilder0.charAt(v2) == 0x20) {
                int v3;
                for(v3 = v2 + 1; v3 < spannableStringBuilder0.length() && spannableStringBuilder0.charAt(v3) == 0x20; ++v3) {
                }
                int v4 = v3 - (v2 + 1);
                if(v4 > 0) {
                    spannableStringBuilder0.delete(v2, v4 + v2);
                }
            }
        }
        if(spannableStringBuilder0.length() > 0 && spannableStringBuilder0.charAt(0) == 0x20) {
            spannableStringBuilder0.delete(0, 1);
        }
        for(int v5 = 0; v5 < spannableStringBuilder0.length() - 1; ++v5) {
            if(spannableStringBuilder0.charAt(v5) == 10 && spannableStringBuilder0.charAt(v5 + 1) == 0x20) {
                spannableStringBuilder0.delete(v5 + 1, v5 + 2);
            }
        }
        if(spannableStringBuilder0.length() > 0 && spannableStringBuilder0.charAt(spannableStringBuilder0.length() - 1) == 0x20) {
            spannableStringBuilder0.delete(spannableStringBuilder0.length() - 1, spannableStringBuilder0.length());
        }
        for(int v = 0; v < spannableStringBuilder0.length() - 1; ++v) {
            if(spannableStringBuilder0.charAt(v) == 0x20 && spannableStringBuilder0.charAt(v + 1) == 10) {
                spannableStringBuilder0.delete(v, v + 1);
            }
        }
        if(spannableStringBuilder0.length() > 0 && spannableStringBuilder0.charAt(spannableStringBuilder0.length() - 1) == 10) {
            spannableStringBuilder0.delete(spannableStringBuilder0.length() - 1, spannableStringBuilder0.length());
        }
    }

    public TtmlNode f(int v) {
        List list0 = this.m;
        if(list0 == null) {
            throw new IndexOutOfBoundsException();
        }
        return (TtmlNode)list0.get(v);
    }

    public int g() {
        return this.m == null ? 0 : this.m.size();
    }

    public List h(long v, Map map0, Map map1, Map map2) {
        ArrayList arrayList0 = new ArrayList();
        this.n(v, this.h, arrayList0);
        TreeMap treeMap0 = new TreeMap();
        this.p(v, false, this.h, treeMap0);
        this.o(v, map0, map1, this.h, treeMap0);
        List list0 = new ArrayList();
        for(Object object0: arrayList0) {
            Pair pair0 = (Pair)object0;
            String s = (String)map2.get(pair0.second);
            if(s != null) {
                byte[] arr_b = Base64.decode(s, 0);
                Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
                TtmlRegion ttmlRegion0 = (TtmlRegion)Assertions.g(((TtmlRegion)map1.get(pair0.first)));
                list0.add(new Builder().r(bitmap0).w(ttmlRegion0.b).x(0).t(ttmlRegion0.c, 0).u(ttmlRegion0.e).z(ttmlRegion0.f).s(ttmlRegion0.g).D(ttmlRegion0.j).a());
            }
        }
        for(Object object1: treeMap0.entrySet()) {
            TtmlRegion ttmlRegion1 = (TtmlRegion)Assertions.g(((TtmlRegion)map1.get(((Map.Entry)object1).getKey())));
            Builder cue$Builder0 = (Builder)((Map.Entry)object1).getValue();
            TtmlNode.e(((SpannableStringBuilder)Assertions.g(cue$Builder0.k())));
            cue$Builder0.t(ttmlRegion1.c, ttmlRegion1.d);
            cue$Builder0.u(ttmlRegion1.e);
            cue$Builder0.w(ttmlRegion1.b);
            cue$Builder0.z(ttmlRegion1.f);
            cue$Builder0.C(ttmlRegion1.i, ttmlRegion1.h);
            cue$Builder0.D(ttmlRegion1.j);
            list0.add(cue$Builder0.a());
        }
        return list0;
    }

    private void i(TreeSet treeSet0, boolean z) {
        boolean z1 = "p".equals(this.a);
        if(z || z1 || "div".equals(this.a) && this.i != null) {
            long v = this.d;
            if(v != 0x8000000000000001L) {
                treeSet0.add(v);
            }
            long v1 = this.e;
            if(v1 != 0x8000000000000001L) {
                treeSet0.add(v1);
            }
        }
        if(this.m == null) {
            return;
        }
        for(int v2 = 0; v2 < this.m.size(); ++v2) {
            ((TtmlNode)this.m.get(v2)).i(treeSet0, z || z1);
        }
    }

    public long[] j() {
        TreeSet treeSet0 = new TreeSet();
        int v = 0;
        this.i(treeSet0, false);
        long[] arr_v = new long[treeSet0.size()];
        for(Object object0: treeSet0) {
            arr_v[v] = (long)(((Long)object0));
            ++v;
        }
        return arr_v;
    }

    private static SpannableStringBuilder k(String s, Map map0) {
        if(!map0.containsKey(s)) {
            Builder cue$Builder0 = new Builder();
            cue$Builder0.A(new SpannableStringBuilder());
            map0.put(s, cue$Builder0);
        }
        return (SpannableStringBuilder)Assertions.g(((Builder)map0.get(s)).k());
    }

    @Nullable
    public String[] l() {
        return this.g;
    }

    // 去混淆评级： 低(40)
    public boolean m(long v) {
        return this.d == 0x8000000000000001L && this.e == 0x8000000000000001L || this.d <= v && this.e == 0x8000000000000001L || this.d == 0x8000000000000001L && v < this.e || this.d <= v && v < this.e;
    }

    private void n(long v, String s, List list0) {
        if(!"".equals(this.h)) {
            s = this.h;
        }
        if(this.m(v) && "div".equals(this.a) && this.i != null) {
            list0.add(new Pair(s, this.i));
            return;
        }
        for(int v1 = 0; v1 < this.g(); ++v1) {
            this.f(v1).n(v, s, list0);
        }
    }

    private void o(long v, Map map0, Map map1, String s, Map map2) {
        if(!this.m(v)) {
            return;
        }
        String s1 = "".equals(this.h) ? s : this.h;
        for(Object object0: this.l.entrySet()) {
            String s2 = (String)((Map.Entry)object0).getKey();
            int v2 = this.k.containsKey(s2) ? ((int)(((Integer)this.k.get(s2)))) : 0;
            int v3 = (int)(((Integer)((Map.Entry)object0).getValue()));
            if(v2 != v3) {
                this.b(map0, ((Builder)Assertions.g(((Builder)map2.get(s2)))), v2, v3, ((TtmlRegion)Assertions.g(((TtmlRegion)map1.get(s1)))).j);
            }
        }
        for(int v1 = 0; v1 < this.g(); ++v1) {
            this.f(v1).o(v, map0, map1, s1, map2);
        }
    }

    private void p(long v, boolean z, String s, Map map0) {
        this.k.clear();
        this.l.clear();
        if("metadata".equals(this.a)) {
            return;
        }
        if(!"".equals(this.h)) {
            s = this.h;
        }
        if(this.c && z) {
            TtmlNode.k(s, map0).append(((CharSequence)Assertions.g(this.b)));
            return;
        }
        if("br".equals(this.a) && z) {
            TtmlNode.k(s, map0).append('\n');
            return;
        }
        if(this.m(v)) {
            for(Object object0: map0.entrySet()) {
                String s1 = (String)((Map.Entry)object0).getKey();
                Integer integer0 = ((CharSequence)Assertions.g(((Builder)((Map.Entry)object0).getValue()).k())).length();
                this.k.put(s1, integer0);
            }
            boolean z1 = "p".equals(this.a);
            for(int v1 = 0; v1 < this.g(); ++v1) {
                this.f(v1).p(v, z || z1, s, map0);
            }
            if(z1) {
                TtmlRenderUtil.c(TtmlNode.k(s, map0));
            }
            for(Object object1: map0.entrySet()) {
                String s2 = (String)((Map.Entry)object1).getKey();
                Integer integer1 = ((CharSequence)Assertions.g(((Builder)((Map.Entry)object1).getValue()).k())).length();
                this.l.put(s2, integer1);
            }
        }
    }
}

