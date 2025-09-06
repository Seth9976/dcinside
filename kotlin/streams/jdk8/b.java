package kotlin.streams.jdk8;

import j..util.Spliterator;
import j..util.Spliterators;
import j..util.stream.Collectors;
import j..util.stream.DoubleStream;
import j..util.stream.IntStream;
import j..util.stream.LongStream;
import j..util.stream.Stream;
import j..util.stream.StreamSupport;
import java.util.Iterator;
import java.util.List;
import kotlin.h0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.sequences.m;
import y4.l;
import z3.i;

@i(name = "StreamsKt")
public final class b {
    @h0(version = "1.2")
    @l
    public static final m b(@l DoubleStream doubleStream0) {
        @s0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,22:1\n55#2:23\n*E\n"})
        public static final class d implements m {
            final DoubleStream a;

            public d(DoubleStream doubleStream0) {
                this.a = doubleStream0;
                super();
            }

            @Override  // kotlin.sequences.m
            public Iterator iterator() {
                Iterator iterator0 = this.a.iterator();
                L.o(iterator0, "iterator(...)");
                return iterator0;
            }
        }

        L.p(doubleStream0, "<this>");
        return new d(doubleStream0);
    }

    @h0(version = "1.2")
    @l
    public static final m c(@l IntStream intStream0) {
        @s0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,22:1\n39#2:23\n*E\n"})
        public static final class kotlin.streams.jdk8.b.b implements m {
            final IntStream a;

            public kotlin.streams.jdk8.b.b(IntStream intStream0) {
                this.a = intStream0;
                super();
            }

            @Override  // kotlin.sequences.m
            public Iterator iterator() {
                Iterator iterator0 = this.a.iterator();
                L.o(iterator0, "iterator(...)");
                return iterator0;
            }
        }

        L.p(intStream0, "<this>");
        return new kotlin.streams.jdk8.b.b(intStream0);
    }

    @h0(version = "1.2")
    @l
    public static final m d(@l LongStream longStream0) {
        @s0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,22:1\n47#2:23\n*E\n"})
        public static final class c implements m {
            final LongStream a;

            public c(LongStream longStream0) {
                this.a = longStream0;
                super();
            }

            @Override  // kotlin.sequences.m
            public Iterator iterator() {
                Iterator iterator0 = this.a.iterator();
                L.o(iterator0, "iterator(...)");
                return iterator0;
            }
        }

        L.p(longStream0, "<this>");
        return new c(longStream0);
    }

    @h0(version = "1.2")
    @l
    public static final m e(@l Stream stream0) {
        @s0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,22:1\n31#2:23\n*E\n"})
        public static final class a implements m {
            final Stream a;

            public a(Stream stream0) {
                this.a = stream0;
                super();
            }

            @Override  // kotlin.sequences.m
            public Iterator iterator() {
                Iterator iterator0 = this.a.iterator();
                L.o(iterator0, "iterator(...)");
                return iterator0;
            }
        }

        L.p(stream0, "<this>");
        return new a(stream0);
    }

    @h0(version = "1.2")
    @l
    public static final Stream f(@l m m0) {
        L.p(m0, "<this>");
        Stream stream0 = StreamSupport.stream(() -> {
            L.p(m0, "$this_asStream");
            return Spliterators.spliteratorUnknownSize(m0.iterator(), 16);
        }, 16, false);
        L.o(stream0, "stream(...)");
        return stream0;
    }

    // 检测为 Lambda 实现
    private static final Spliterator g(m m0) [...]

    @h0(version = "1.2")
    @l
    public static final List h(@l DoubleStream doubleStream0) {
        L.p(doubleStream0, "<this>");
        double[] arr_f = doubleStream0.toArray();
        L.o(arr_f, "toArray(...)");
        return kotlin.collections.l.p(arr_f);
    }

    @h0(version = "1.2")
    @l
    public static final List i(@l IntStream intStream0) {
        L.p(intStream0, "<this>");
        int[] arr_v = intStream0.toArray();
        L.o(arr_v, "toArray(...)");
        return kotlin.collections.l.r(arr_v);
    }

    @h0(version = "1.2")
    @l
    public static final List j(@l LongStream longStream0) {
        L.p(longStream0, "<this>");
        long[] arr_v = longStream0.toArray();
        L.o(arr_v, "toArray(...)");
        return kotlin.collections.l.s(arr_v);
    }

    @h0(version = "1.2")
    @l
    public static final List k(@l Stream stream0) {
        L.p(stream0, "<this>");
        Object object0 = stream0.collect(Collectors.toList());
        L.o(object0, "collect(...)");
        return (List)object0;
    }
}

