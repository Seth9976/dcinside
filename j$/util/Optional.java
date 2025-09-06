package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public final class Optional {
    private final Object a;
    private static final Optional b;

    static {
        Optional.b = new Optional();
    }

    private Optional() {
        this.a = null;
    }

    private Optional(Object object0) {
        this.a = Objects.requireNonNull(object0);
    }

    public static Optional empty() {
        return Optional.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof Optional ? Objects.equals(this.a, ((Optional)object0).a) : false;
    }

    public Optional filter(Predicate predicate0) {
        Objects.requireNonNull(predicate0);
        if(!this.isPresent()) {
            return this;
        }
        return predicate0.test(this.a) ? this : Optional.empty();
    }

    public Optional flatMap(Function function0) {
        Objects.requireNonNull(function0);
        return this.isPresent() ? ((Optional)Objects.requireNonNull(((Optional)function0.apply(this.a)))) : Optional.empty();
    }

    public Object get() {
        Object object0 = this.a;
        if(object0 == null) {
            throw new NoSuchElementException("No value present");
        }
        return object0;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public void ifPresent(Consumer consumer0) {
        Object object0 = this.a;
        if(object0 != null) {
            consumer0.accept(object0);
        }
    }

    public boolean isPresent() {
        return this.a != null;
    }

    public Optional map(Function function0) {
        Objects.requireNonNull(function0);
        return this.isPresent() ? Optional.ofNullable(function0.apply(this.a)) : Optional.empty();
    }

    public static Optional of(Object object0) {
        return new Optional(object0);
    }

    public static Optional ofNullable(Object object0) {
        return object0 == null ? Optional.empty() : Optional.of(object0);
    }

    public Object orElse(Object object0) {
        return this.a == null ? object0 : this.a;
    }

    public Object orElseGet(Supplier supplier0) {
        return this.a == null ? supplier0.get() : this.a;
    }

    @Override
    public final String toString() {
        return this.a == null ? "Optional.empty" : String.format("Optional[%s]", this.a);
    }
}

