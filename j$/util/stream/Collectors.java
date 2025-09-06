package j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

public final class Collectors {
    static final Set a;
    static final Set b;
    static final Set c;

    static {
        Collections.unmodifiableSet(EnumSet.of(Characteristics.CONCURRENT, Characteristics.UNORDERED, Characteristics.IDENTITY_FINISH));
        Collections.unmodifiableSet(EnumSet.of(Characteristics.CONCURRENT, Characteristics.UNORDERED));
        Collectors.a = Collections.unmodifiableSet(EnumSet.of(Characteristics.IDENTITY_FINISH));
        Collectors.b = Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED, Characteristics.IDENTITY_FINISH));
        Collectors.c = Collections.emptySet();
        Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED));
    }

    static void a(double[] arr_f, double f) {
        double f1 = f - arr_f[1];
        double f2 = arr_f[0] + f1;
        arr_f[1] = f2 - arr_f[0] - f1;
        arr_f[0] = f2;
    }

    public static Collector collectingAndThen(Collector collector0, Function function0) {
        Set set0 = collector0.characteristics();
        Characteristics collector$Characteristics0 = Characteristics.IDENTITY_FINISH;
        if(set0.contains(collector$Characteristics0)) {
            if(set0.size() == 1) {
                return new o(collector0.supplier(), collector0.accumulator(), collector0.combiner(), collector0.finisher().andThen(function0), Collectors.c);
            }
            EnumSet enumSet0 = EnumSet.copyOf(set0);
            enumSet0.remove(collector$Characteristics0);
            set0 = Collections.unmodifiableSet(enumSet0);
            return new o(collector0.supplier(), collector0.accumulator(), collector0.combiner(), collector0.finisher().andThen(function0), set0);
        }
        return new o(collector0.supplier(), collector0.accumulator(), collector0.combiner(), collector0.finisher().andThen(function0), set0);
    }

    public static Collector groupingBy(Function function0, Supplier supplier0, Collector collector0) {
        l l0 = new l(function0, collector0.supplier(), collector0.accumulator(), 1);
        a a0 = new a(3, collector0.combiner());
        return collector0.characteristics().contains(Characteristics.IDENTITY_FINISH) ? new o(supplier0, l0, a0, Collectors.a) : new o(supplier0, l0, a0, new m(collector0.finisher(), 1), Collectors.c);
    }

    public static Collector joining(CharSequence charSequence0) {
        return new o(new a(2, charSequence0), new j(29), new n(0), new n(1), Collectors.c);
    }

    public static Collector toCollection(Supplier supplier0) {
        return new o(supplier0, new j(22), new j(1), Collectors.a);
    }

    public static Collector toList() {
        return new o(new j(23), new j(24), new j(2), Collectors.a);
    }

    public static Collector toMap(Function function0, Function function1) {
        return new o(new n(2), new k(0, function0, function1), new j(0), Collectors.a);
    }

    public static Collector toMap(Function function0, Function function1, BinaryOperator binaryOperator0, Supplier supplier0) {
        return new o(supplier0, new l(function0, function1, binaryOperator0, 0), new a(3, binaryOperator0), Collectors.a);
    }

    public static Collector toSet() {
        return new o(new j(26), new j(27), new j(4), Collectors.b);
    }
}

