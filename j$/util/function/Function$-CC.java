package j$.util.function;

import j..util.Objects;
import java.util.function.Function;

public final class Function.-CC {
    public static Function $default$andThen(Function function0, Function function1) {
        Objects.requireNonNull(function1);
        return new d(function0, function1, 0);
    }

    public static Function $default$compose(Function function0, Function function1) {
        Objects.requireNonNull(function1);
        return new d(function0, function1, 1);
    }

    public static Function identity() {
        return new c();  // 初始化器: Ljava/lang/Object;-><init>()V
    }
}

