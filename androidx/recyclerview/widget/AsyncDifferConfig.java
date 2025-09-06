package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class AsyncDifferConfig {
    public static final class Builder {
        @Nullable
        private Executor a;
        private Executor b;
        private final ItemCallback c;
        private static final Object d;
        private static Executor e;

        static {
            Builder.d = new Object();
        }

        public Builder(@NonNull ItemCallback diffUtil$ItemCallback0) {
            this.c = diffUtil$ItemCallback0;
        }

        @NonNull
        public AsyncDifferConfig a() {
            if(this.b == null) {
                Object object0 = Builder.d;
                synchronized(object0) {
                    if(Builder.e == null) {
                        Builder.e = Executors.newFixedThreadPool(2);
                    }
                }
                this.b = Builder.e;
            }
            return new AsyncDifferConfig(this.a, this.b, this.c);
        }

        @NonNull
        public Builder b(@Nullable Executor executor0) {
            this.b = executor0;
            return this;
        }

        @NonNull
        @RestrictTo({Scope.a})
        public Builder c(@Nullable Executor executor0) {
            this.a = executor0;
            return this;
        }
    }

    @Nullable
    private final Executor a;
    @NonNull
    private final Executor b;
    @NonNull
    private final ItemCallback c;

    AsyncDifferConfig(@Nullable Executor executor0, @NonNull Executor executor1, @NonNull ItemCallback diffUtil$ItemCallback0) {
        this.a = executor0;
        this.b = executor1;
        this.c = diffUtil$ItemCallback0;
    }

    @NonNull
    public Executor a() {
        return this.b;
    }

    @NonNull
    public ItemCallback b() {
        return this.c;
    }

    @Nullable
    @RestrictTo({Scope.a})
    public Executor c() {
        return this.a;
    }
}

