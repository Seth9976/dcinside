package androidx.privacysandbox.ads.adservices.topics;

import y4.l;
import y4.m;

public final class Topic {
    private final long a;
    private final long b;
    private final int c;

    public Topic(long v, long v1, int v2) {
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof Topic ? this.a == ((Topic)object0).a && this.b == ((Topic)object0).b && this.c == ((Topic)object0).c : false;
    }

    @Override
    public int hashCode() {
        return (((int)(this.a ^ this.a >>> 0x20)) * 0x1F + ((int)(this.b ^ this.b >>> 0x20))) * 0x1F + this.c;
    }

    @Override
    @l
    public String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.a + ", ModelVersion=" + this.b + ", TopicCode=" + this.c + " }");
    }
}

