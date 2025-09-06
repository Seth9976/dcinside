package org.reactivestreams;

import j..util.Objects;
import j..util.concurrent.Flow.Processor;
import j..util.concurrent.Flow.Publisher;
import j..util.concurrent.Flow.Subscriber;
import j..util.concurrent.Flow.Subscription;

public final class a {
    static final class org.reactivestreams.a.a implements Flow.Publisher {
        final c a;

        public org.reactivestreams.a.a(c c0) {
            this.a = c0;
        }

        @Override  // j$.util.concurrent.Flow$Publisher
        public void subscribe(Flow.Subscriber flow$Subscriber0) {
            g a$g0 = flow$Subscriber0 == null ? null : new g(flow$Subscriber0);
            this.a.e(a$g0);
        }
    }

    static final class b implements Flow.Processor {
        final org.reactivestreams.b a;

        public b(org.reactivestreams.b b0) {
            this.a = b0;
        }

        @Override  // j$.util.concurrent.Flow$Subscriber
        public void onComplete() {
            this.a.onComplete();
        }

        @Override  // j$.util.concurrent.Flow$Subscriber
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // j$.util.concurrent.Flow$Subscriber
        public void onNext(Object object0) {
            this.a.onNext(object0);
        }

        @Override  // j$.util.concurrent.Flow$Subscriber
        public void onSubscribe(Flow.Subscription flow$Subscription0) {
            h a$h0 = flow$Subscription0 == null ? null : new h(flow$Subscription0);
            this.a.g(a$h0);
        }

        @Override  // j$.util.concurrent.Flow$Publisher
        public void subscribe(Flow.Subscriber flow$Subscriber0) {
            g a$g0 = flow$Subscriber0 == null ? null : new g(flow$Subscriber0);
            this.a.e(a$g0);
        }
    }

    static final class org.reactivestreams.a.c implements Flow.Subscriber {
        final d a;

        public org.reactivestreams.a.c(d d0) {
            this.a = d0;
        }

        @Override  // j$.util.concurrent.Flow$Subscriber
        public void onComplete() {
            this.a.onComplete();
        }

        @Override  // j$.util.concurrent.Flow$Subscriber
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // j$.util.concurrent.Flow$Subscriber
        public void onNext(Object object0) {
            this.a.onNext(object0);
        }

        @Override  // j$.util.concurrent.Flow$Subscriber
        public void onSubscribe(Flow.Subscription flow$Subscription0) {
            h a$h0 = flow$Subscription0 == null ? null : new h(flow$Subscription0);
            this.a.g(a$h0);
        }
    }

    static final class org.reactivestreams.a.d implements Flow.Subscription {
        final e a;

        public org.reactivestreams.a.d(e e0) {
            this.a = e0;
        }

        @Override  // j$.util.concurrent.Flow$Subscription
        public void cancel() {
            this.a.cancel();
        }

        @Override  // j$.util.concurrent.Flow$Subscription
        public void request(long v) {
            this.a.request(v);
        }
    }

    static final class org.reactivestreams.a.e implements c {
        final Flow.Publisher a;

        public org.reactivestreams.a.e(Flow.Publisher flow$Publisher0) {
            this.a = flow$Publisher0;
        }

        @Override  // org.reactivestreams.c
        public void e(d d0) {
            org.reactivestreams.a.c a$c0 = d0 == null ? null : new org.reactivestreams.a.c(d0);
            this.a.subscribe(a$c0);
        }
    }

    static final class f implements org.reactivestreams.b {
        final Flow.Processor a;

        public f(Flow.Processor flow$Processor0) {
            this.a = flow$Processor0;
        }

        @Override  // org.reactivestreams.c
        public void e(d d0) {
            org.reactivestreams.a.c a$c0 = d0 == null ? null : new org.reactivestreams.a.c(d0);
            this.a.subscribe(a$c0);
        }

        @Override  // org.reactivestreams.d
        public void g(e e0) {
            org.reactivestreams.a.d a$d0 = e0 == null ? null : new org.reactivestreams.a.d(e0);
            this.a.onSubscribe(a$d0);
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.a.onComplete();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            this.a.onNext(object0);
        }
    }

    static final class g implements d {
        final Flow.Subscriber a;

        public g(Flow.Subscriber flow$Subscriber0) {
            this.a = flow$Subscriber0;
        }

        @Override  // org.reactivestreams.d
        public void g(e e0) {
            org.reactivestreams.a.d a$d0 = e0 == null ? null : new org.reactivestreams.a.d(e0);
            this.a.onSubscribe(a$d0);
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.a.onComplete();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            this.a.onNext(object0);
        }
    }

    static final class h implements e {
        final Flow.Subscription a;

        public h(Flow.Subscription flow$Subscription0) {
            this.a = flow$Subscription0;
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.a.cancel();
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            this.a.request(v);
        }
    }

    private a() {
        throw new IllegalStateException("No instances!");
    }

    public static Flow.Processor a(org.reactivestreams.b b0) {
        Objects.requireNonNull(b0, "reactiveStreamsProcessor");
        if(b0 instanceof f) {
            return ((f)b0).a;
        }
        return b0 instanceof Flow.Processor ? ((Flow.Processor)b0) : new b(b0);
    }

    public static Flow.Publisher b(c c0) {
        Objects.requireNonNull(c0, "reactiveStreamsPublisher");
        if(c0 instanceof org.reactivestreams.a.e) {
            return ((org.reactivestreams.a.e)c0).a;
        }
        return c0 instanceof Flow.Publisher ? ((Flow.Publisher)c0) : new org.reactivestreams.a.a(c0);
    }

    public static Flow.Subscriber c(d d0) {
        Objects.requireNonNull(d0, "reactiveStreamsSubscriber");
        if(d0 instanceof g) {
            return ((g)d0).a;
        }
        return d0 instanceof Flow.Subscriber ? ((Flow.Subscriber)d0) : new org.reactivestreams.a.c(d0);
    }

    public static org.reactivestreams.b d(Flow.Processor flow$Processor0) {
        Objects.requireNonNull(flow$Processor0, "flowProcessor");
        if(flow$Processor0 instanceof b) {
            return ((b)flow$Processor0).a;
        }
        return flow$Processor0 instanceof org.reactivestreams.b ? ((org.reactivestreams.b)flow$Processor0) : new f(flow$Processor0);
    }

    public static c e(Flow.Publisher flow$Publisher0) {
        Objects.requireNonNull(flow$Publisher0, "flowPublisher");
        if(flow$Publisher0 instanceof org.reactivestreams.a.a) {
            return ((org.reactivestreams.a.a)flow$Publisher0).a;
        }
        return flow$Publisher0 instanceof c ? ((c)flow$Publisher0) : new org.reactivestreams.a.e(flow$Publisher0);
    }

    public static d f(Flow.Subscriber flow$Subscriber0) {
        Objects.requireNonNull(flow$Subscriber0, "flowSubscriber");
        if(flow$Subscriber0 instanceof org.reactivestreams.a.c) {
            return ((org.reactivestreams.a.c)flow$Subscriber0).a;
        }
        return flow$Subscriber0 instanceof d ? ((d)flow$Subscriber0) : new g(flow$Subscriber0);
    }
}

