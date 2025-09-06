package com.apm.insight.runtime;

import androidx.annotation.Nullable;
import com.apm.insight.entity.Header;

public class e {
    private e a;
    private static final e b;

    static {
        e.b = new e() {
            private Header a;

            {
                this.a = null;
            }

            @Override  // com.apm.insight.runtime.e
            @Nullable
            public final Object b(String s) {
                if(this.a == null) {
                    this.a = Header.b(com.apm.insight.e.g());
                }
                return this.a.f().opt(s);
            }
        };
    }

    e() {
        this(e.b);
    }

    private e(e e0) {
        this.a = e0;
    }

    @Nullable
    public Object a(String s) {
        return this.a == null ? null : this.a.a(s);
    }

    @Nullable
    public Object b(String s) {
        return this.a == null ? null : this.a.b(s);
    }
}

