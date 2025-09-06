package com.unity3d.services.core.request.metrics;

import java.util.Map;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class Metric {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion = null;
    @l
    private static final String METRIC_NAME = "n";
    @l
    private static final String METRIC_TAGS = "t";
    @l
    private static final String METRIC_VALUE = "v";
    @m
    private final String name;
    @l
    private final Map tags;
    @m
    private final Object value;

    static {
        Metric.Companion = new Companion(null);
    }

    @j
    public Metric(@m String s) {
        this(s, null, null, 6, null);
    }

    @j
    public Metric(@m String s, @m Object object0) {
        this(s, object0, null, 4, null);
    }

    @j
    public Metric(@m String s, @m Object object0, @l Map map0) {
        L.p(map0, "tags");
        super();
        this.name = s;
        this.value = object0;
        this.tags = map0;
    }

    public Metric(String s, Object object0, Map map0, int v, w w0) {
        if((v & 2) != 0) {
            object0 = null;
        }
        if((v & 4) != 0) {
            map0 = Y.z();
        }
        this(s, object0, map0);
    }

    @m
    public final String component1() {
        return this.name;
    }

    @m
    public final Object component2() {
        return this.value;
    }

    @l
    public final Map component3() {
        return this.tags;
    }

    @l
    public final Metric copy(@m String s, @m Object object0, @l Map map0) {
        L.p(map0, "tags");
        return new Metric(s, object0, map0);
    }

    public static Metric copy$default(Metric metric0, String s, Object object0, Map map0, int v, Object object1) {
        if((v & 1) != 0) {
            s = metric0.name;
        }
        if((v & 2) != 0) {
            object0 = metric0.value;
        }
        if((v & 4) != 0) {
            map0 = metric0.tags;
        }
        return metric0.copy(s, object0, map0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Metric)) {
            return false;
        }
        if(!L.g(this.name, ((Metric)object0).name)) {
            return false;
        }
        return L.g(this.value, ((Metric)object0).value) ? L.g(this.tags, ((Metric)object0).tags) : false;
    }

    @m
    public final String getName() {
        return this.name;
    }

    @l
    public final Map getTags() {
        return this.tags;
    }

    @m
    public final Object getValue() {
        return this.value;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.name == null ? 0 : this.name.hashCode();
        Object object0 = this.value;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return (v1 * 0x1F + v) * 0x1F + this.tags.hashCode();
    }

    @l
    public final Map toMap() {
        Map map0 = Y.g();
        String s = this.name;
        if(s != null) {
            map0.put("n", s);
        }
        Object object0 = this.value;
        if(object0 != null) {
            map0.put("v", object0);
        }
        if(!this.tags.isEmpty()) {
            map0.put("t", this.tags);
        }
        return Y.d(map0);
    }

    @Override
    @l
    public String toString() {
        return "Metric(name=" + this.name + ", value=" + this.value + ", tags=" + this.tags + ')';
    }
}

