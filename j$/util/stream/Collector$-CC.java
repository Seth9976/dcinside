package j$.util.stream;

import j..util.Objects;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

public final class Collector.-CC {
    public static Collector of(Supplier supplier0, BiConsumer biConsumer0, BinaryOperator binaryOperator0, Function function0, Characteristics[] arr_collector$Characteristics) {
        Objects.requireNonNull(supplier0);
        Objects.requireNonNull(biConsumer0);
        Objects.requireNonNull(binaryOperator0);
        Objects.requireNonNull(function0);
        Objects.requireNonNull(arr_collector$Characteristics);
        Set set0 = Collectors.c;
        if(arr_collector$Characteristics.length > 0) {
            EnumSet enumSet0 = EnumSet.noneOf(Characteristics.class);
            Collections.addAll(enumSet0, arr_collector$Characteristics);
            set0 = Collections.unmodifiableSet(enumSet0);
        }
        return new o(supplier0, biConsumer0, binaryOperator0, function0, set0);
    }

    public static Collector of(Supplier supplier0, BiConsumer biConsumer0, BinaryOperator binaryOperator0, Characteristics[] arr_collector$Characteristics) {
        Objects.requireNonNull(supplier0);
        Objects.requireNonNull(biConsumer0);
        Objects.requireNonNull(binaryOperator0);
        Objects.requireNonNull(arr_collector$Characteristics);
        return arr_collector$Characteristics.length == 0 ? new o(supplier0, biConsumer0, binaryOperator0, Collectors.a) : new o(supplier0, biConsumer0, binaryOperator0, Collections.unmodifiableSet(EnumSet.of(Characteristics.IDENTITY_FINISH, arr_collector$Characteristics)));
    }
}

