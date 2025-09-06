package kotlin.text;

import j..util.DesugarCollections;
import java.util.EnumSet;
import java.util.Set;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.ranges.l;

@s0({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,397:1\n1797#2,3:398\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n*L\n19#1:398,3\n*E\n"})
public final class s {
    private static final p f(Matcher matcher0, int v, CharSequence charSequence0) {
        return !matcher0.find(v) ? null : new q(matcher0, charSequence0);
    }

    private static final Set g(int v) {
        public static final class a extends N implements Function1 {
            final int e;

            public a(int v) {
                this.e = v;
                super(1);
            }

            public final Boolean a(Enum enum0) {
                int v = ((i)enum0).a();
                int v1 = ((i)enum0).getValue();
                return (this.e & v) == v1;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Enum)object0));
            }
        }

        L.y(4, "T");
        EnumSet enumSet0 = EnumSet.allOf(Enum.class);
        L.m(enumSet0);
        L.w();
        u.Q0(enumSet0, new a(v));
        Set set0 = DesugarCollections.unmodifiableSet(enumSet0);
        L.o(set0, "unmodifiableSet(...)");
        return set0;
    }

    private static final p h(Matcher matcher0, CharSequence charSequence0) {
        return !matcher0.matches() ? null : new q(matcher0, charSequence0);
    }

    private static final l i(MatchResult matchResult0) {
        return kotlin.ranges.s.W1(matchResult0.start(), matchResult0.end());
    }

    private static final l j(MatchResult matchResult0, int v) {
        return kotlin.ranges.s.W1(matchResult0.start(v), matchResult0.end(v));
    }

    private static final int k(Iterable iterable0) {
        int v = 0;
        for(Object object0: iterable0) {
            v |= ((i)object0).getValue();
        }
        return v;
    }
}

