package net.fellbaum.jemoji;

import com.fasterxml.jackson.annotation.z;
import j..util.Collection.-EL;
import j..util.DesugarCollections;
import j..util.Optional;
import j..util.stream.Collectors;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class f implements Comparable {
    private final String a;
    private final String b;
    private final List c;
    private final List d;
    private final List e;
    private final boolean f;
    private final boolean g;
    private final double h;
    private final M1 i;
    private final String j;
    private final d0 k;
    private final q1 l;
    private final List m;

    f(@z("emoji") String s, @z("unicode") String s1, @z("discordAliases") List list0, @z("githubAliases") List list1, @z("slackAliases") List list2, @z("hasFitzpatrick") boolean z, @z("hasHairStyle") boolean z1, @z("version") double f, @z("qualification") M1 m10, @z("description") String s2, @z("group") d0 d00, @z("subgroup") q1 q10) {
        this.a = s;
        this.b = s1;
        this.c = list0;
        this.d = list1;
        this.e = list2;
        this.f = z;
        this.g = z1;
        this.h = f;
        this.i = m10;
        this.j = s2;
        this.k = d00;
        this.l = q10;
        HashSet hashSet0 = new HashSet();
        hashSet0.addAll(this.i());
        hashSet0.addAll(this.k());
        hashSet0.addAll(this.r());
        this.m = DesugarCollections.unmodifiableList(new ArrayList(hashSet0));
    }

    private static String A(int v) [...] // Inlined contents

    // 检测为 Lambda 实现
    private static String B(int v) [...]

    // 检测为 Lambda 实现
    private static boolean C(String s, f f0) [...]

    // 检测为 Lambda 实现
    private boolean D(f f0) [...]

    @Override
    public int compareTo(Object object0) {
        return this.e(((f)object0));
    }

    // 检测为 Lambda 实现
    public static String d(int v) [...]

    public int e(f f0) {
        int v = Integer.compare(L1.c(this.j()), L1.c(f0.j()));
        return v == 0 ? this.j().compareTo(f0.j()) : v;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(f.class != class0 || this.f != ((f)object0).f) {
                return false;
            }
            if(this.g != ((f)object0).g) {
                return false;
            }
            if(Double.compare(((f)object0).h, this.h) != 0) {
                return false;
            }
            if(!this.a.equals(((f)object0).a)) {
                return false;
            }
            if(!this.b.equals(((f)object0).b)) {
                return false;
            }
            if(!this.c.equals(((f)object0).c)) {
                return false;
            }
            if(!this.d.equals(((f)object0).d)) {
                return false;
            }
            if(!this.e.equals(((f)object0).e)) {
                return false;
            }
            if(this.i != ((f)object0).i) {
                return false;
            }
            if(!this.j.equals(((f)object0).j)) {
                return false;
            }
            return this.k == ((f)object0).k ? this.l == ((f)object0).l : false;
        }
        return false;
    }

    public List f() {
        return this.m;
    }

    public String g() {
        return this.j;
    }

    public Optional h(y y0) {
        return H0.A(y0, this.a);
    }

    @Override
    public int hashCode() {
        long v = Double.doubleToLongBits(this.h);
        return ((((((((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + this.f) * 0x1F + this.g) * 0x1F + ((int)(v ^ v >>> 0x20))) * 0x1F + this.i.hashCode()) * 0x1F + this.j.hashCode()) * 0x1F + this.k.hashCode()) * 0x1F + this.l.hashCode();
    }

    public List i() {
        return this.c;
    }

    public String j() {
        return this.a;
    }

    public List k() {
        return this.d;
    }

    public d0 l() {
        return this.k;
    }

    public String m() {
        return ((String)a.a(this.j()).mapToObj((int v) -> "&#" + v).collect(Collectors.joining(";"))) + ";";
    }

    public String n() {
        return ((String)a.a(this.j()).mapToObj((int v) -> "&#x" + Integer.toHexString(v).toUpperCase()).collect(Collectors.joining(";"))) + ";";
    }

    public M1 p() {
        return this.i;
    }

    public List r() {
        return this.e;
    }

    public q1 s() {
        return this.l;
    }

    public String t() {
        try {
            return URLEncoder.encode(this.j(), "UTF-8");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException(unsupportedEncodingException0);
        }
    }

    @Override
    public String toString() {
        return "Emoji{emoji=\'" + this.a + '\'' + ", unicode=\'" + this.b + '\'' + ", discordAliases=" + this.c + ", githubAliases=" + this.d + ", slackAliases=" + this.e + ", hasFitzpatrick=" + this.f + ", hasHairStyle=" + this.g + ", version=" + this.h + ", qualification=" + this.i + ", description=\'" + this.j + '\'' + ", group=" + this.k + ", subgroup=" + this.l + '}';
    }

    public String u() {
        return this.b;
    }

    public List v() {
        String s = F1.e(D1.e(this.a));
        return (List)Collection.-EL.parallelStream(H0.q()).filter((f f0) -> F1.e(D1.e(f0.j())).equals(s)).filter((f f0) -> !f0.equals(this)).collect(Collectors.toList());
    }

    public double w() {
        return this.h;
    }

    public boolean y() {
        return this.f;
    }

    public boolean z() {
        return this.g;
    }
}

