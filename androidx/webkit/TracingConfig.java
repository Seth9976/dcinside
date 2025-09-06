package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class TracingConfig {
    public static class Builder {
        private int a;
        private final List b;
        private int c;

        public Builder() {
            this.a = 0;
            this.b = new ArrayList();
            this.c = 1;
        }

        @NonNull
        public Builder a(@NonNull Collection collection0) {
            this.b.addAll(collection0);
            return this;
        }

        @NonNull
        public Builder b(@NonNull int[] arr_v) {
            for(int v = 0; v < arr_v.length; ++v) {
                this.a |= arr_v[v];
            }
            return this;
        }

        @NonNull
        public Builder c(@NonNull String[] arr_s) {
            List list0 = Arrays.asList(arr_s);
            this.b.addAll(list0);
            return this;
        }

        @NonNull
        public TracingConfig d() {
            return new TracingConfig(this.a, this.b, this.c);
        }

        @NonNull
        public Builder e(int v) {
            this.c = v;
            return this;
        }
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface PredefinedCategories {
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface TracingMode {
    }

    private int a;
    private final List b;
    private int c;
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 4;
    public static final int h = 8;
    public static final int i = 16;
    public static final int j = 0x20;
    public static final int k = 0x40;
    public static final int l = 0;
    public static final int m = 1;

    @RestrictTo({Scope.a})
    public TracingConfig(int v, @NonNull List list0, int v1) {
        ArrayList arrayList0 = new ArrayList();
        this.b = arrayList0;
        this.a = v;
        arrayList0.addAll(list0);
        this.c = v1;
    }

    @NonNull
    public List a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.c;
    }
}

