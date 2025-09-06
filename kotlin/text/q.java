package kotlin.text;

import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.collections.a;
import kotlin.collections.c;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class q implements p {
    @l
    private final Matcher a;
    @l
    private final CharSequence b;
    @l
    private final n c;
    @m
    private List d;

    public q(@l Matcher matcher0, @l CharSequence charSequence0) {
        public static final class b extends a implements o {
            final q a;

            b(q q0) {
                this.a = q0;
                super();
            }

            @Override  // kotlin.collections.a
            public int a() {
                return this.a.e().groupCount() + 1;
            }

            public boolean b(kotlin.text.m m0) {
                return super.contains(m0);
            }

            // 去混淆评级： 低(20)
            @Override  // kotlin.collections.a
            public final boolean contains(Object object0) {
                return (object0 == null ? true : object0 instanceof kotlin.text.m) ? this.b(((kotlin.text.m)object0)) : false;
            }

            @Override  // kotlin.text.n
            public kotlin.text.m get(int v) {
                kotlin.ranges.l l0 = s.j(this.a.e(), v);
                if(((int)l0.q()) >= 0) {
                    String s = this.a.e().group(v);
                    L.o(s, "group(...)");
                    return new kotlin.text.m(s, l0);
                }
                return null;
            }

            @Override  // kotlin.text.o
            public kotlin.text.m get(String s) {
                L.p(s, "name");
                MatchResult matchResult0 = this.a.e();
                return kotlin.internal.m.a.c(matchResult0, s);
            }

            @Override  // kotlin.collections.a
            public boolean isEmpty() {
                return false;
            }

            @Override  // kotlin.collections.a
            public Iterator iterator() {
                static final class kotlin.text.q.b.a extends N implements Function1 {
                    final b e;

                    kotlin.text.q.b.a(b q$b0) {
                        this.e = q$b0;
                        super(1);
                    }

                    public final kotlin.text.m a(int v) {
                        return this.e.get(v);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((Number)object0).intValue());
                    }
                }

                return kotlin.sequences.p.k1(u.A1(u.I(this)), new kotlin.text.q.b.a(this)).iterator();
            }
        }

        L.p(matcher0, "matcher");
        L.p(charSequence0, "input");
        super();
        this.a = matcher0;
        this.b = charSequence0;
        this.c = new b(this);
    }

    @Override  // kotlin.text.p
    @l
    public kotlin.ranges.l N0() {
        return s.i(this.e());
    }

    @Override  // kotlin.text.p
    @l
    public kotlin.text.p.b a() {
        return kotlin.text.p.a.a(this);
    }

    @Override  // kotlin.text.p
    @l
    public n b() {
        return this.c;
    }

    @Override  // kotlin.text.p
    @l
    public List c() {
        public static final class kotlin.text.q.a extends c {
            final q c;

            kotlin.text.q.a(q q0) {
                this.c = q0;
                super();
            }

            @Override  // kotlin.collections.c
            public int a() {
                return this.c.e().groupCount() + 1;
            }

            public String b(int v) {
                String s = this.c.e().group(v);
                return s == null ? "" : s;
            }

            public int c(String s) {
                return super.indexOf(s);
            }

            @Override  // kotlin.collections.a
            public final boolean contains(Object object0) {
                return object0 instanceof String ? this.contains(((String)object0)) : false;
            }

            public boolean contains(String s) {
                return super.contains(s);
            }

            public int d(String s) {
                return super.lastIndexOf(s);
            }

            @Override  // kotlin.collections.c
            public Object get(int v) {
                return this.b(v);
            }

            @Override  // kotlin.collections.c
            public final int indexOf(Object object0) {
                return object0 instanceof String ? this.c(((String)object0)) : -1;
            }

            @Override  // kotlin.collections.c
            public final int lastIndexOf(Object object0) {
                return object0 instanceof String ? this.d(((String)object0)) : -1;
            }
        }

        if(this.d == null) {
            this.d = new kotlin.text.q.a(this);
        }
        List list0 = this.d;
        L.m(list0);
        return list0;
    }

    private final MatchResult e() {
        return this.a;
    }

    @Override  // kotlin.text.p
    @l
    public String getValue() {
        String s = this.e().group();
        L.o(s, "group(...)");
        return s;
    }

    @Override  // kotlin.text.p
    @m
    public p next() {
        int v = this.e().end() + (this.e().end() == this.e().start() ? 1 : 0);
        if(v <= this.b.length()) {
            Matcher matcher0 = this.a.pattern().matcher(this.b);
            L.o(matcher0, "matcher(...)");
            return s.f(matcher0, v, this.b);
        }
        return null;
    }
}

