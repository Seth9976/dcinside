package androidx.compose.ui.input.nestedscroll;

import A3.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Velocity;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class NestedScrollDispatcher {
    @l
    private a a;
    @m
    private O b;
    @m
    private NestedScrollConnection c;
    public static final int d = 8;

    static {
    }

    public NestedScrollDispatcher() {
        this.a = new a() {
            final NestedScrollDispatcher e;

            {
                this.e = nestedScrollDispatcher0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }

            @m
            public final O invoke() {
                return this.e.g();
            }
        };
    }

    @m
    public final Object a(long v, long v1, @l d d0) {
        androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.dispatchPostFling.1 nestedScrollDispatcher$dispatchPostFling$10;
        if(d0 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.dispatchPostFling.1) {
            nestedScrollDispatcher$dispatchPostFling$10 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.dispatchPostFling.1)d0;
            int v2 = nestedScrollDispatcher$dispatchPostFling$10.m;
            if((v2 & 0x80000000) == 0) {
                nestedScrollDispatcher$dispatchPostFling$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    int m;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.k = object0;
                        this.m |= 0x80000000;
                        return d0.a(0L, 0L, this);
                    }
                };
            }
            else {
                nestedScrollDispatcher$dispatchPostFling$10.m = v2 ^ 0x80000000;
            }
        }
        else {
            nestedScrollDispatcher$dispatchPostFling$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                int m;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.k = object0;
                    this.m |= 0x80000000;
                    return d0.a(0L, 0L, this);
                }
            };
        }
        Object object0 = nestedScrollDispatcher$dispatchPostFling$10.k;
        Object object1 = b.l();
        switch(nestedScrollDispatcher$dispatchPostFling$10.m) {
            case 0: {
                f0.n(object0);
                NestedScrollConnection nestedScrollConnection0 = this.c;
                if(nestedScrollConnection0 != null) {
                    nestedScrollDispatcher$dispatchPostFling$10.m = 1;
                    object0 = nestedScrollConnection0.a(v, v1, nestedScrollDispatcher$dispatchPostFling$10);
                    return object0 == object1 ? object1 : Velocity.b(((Velocity)object0).v());
                }
                return Velocity.b(0L);
            }
            case 1: {
                f0.n(object0);
                return Velocity.b(((Velocity)object0).v());
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    // 去混淆评级： 低(20)
    public final long b(long v, long v1, int v2) {
        return this.c == null ? 0L : this.c.b(v, v1, v2);
    }

    @m
    public final Object c(long v, @l d d0) {
        androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.dispatchPreFling.1 nestedScrollDispatcher$dispatchPreFling$10;
        if(d0 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.dispatchPreFling.1) {
            nestedScrollDispatcher$dispatchPreFling$10 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.dispatchPreFling.1)d0;
            int v1 = nestedScrollDispatcher$dispatchPreFling$10.m;
            if((v1 & 0x80000000) == 0) {
                nestedScrollDispatcher$dispatchPreFling$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    int m;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.k = object0;
                        this.m |= 0x80000000;
                        return d0.c(0L, this);
                    }
                };
            }
            else {
                nestedScrollDispatcher$dispatchPreFling$10.m = v1 ^ 0x80000000;
            }
        }
        else {
            nestedScrollDispatcher$dispatchPreFling$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                int m;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.k = object0;
                    this.m |= 0x80000000;
                    return d0.c(0L, this);
                }
            };
        }
        Object object0 = nestedScrollDispatcher$dispatchPreFling$10.k;
        Object object1 = b.l();
        switch(nestedScrollDispatcher$dispatchPreFling$10.m) {
            case 0: {
                f0.n(object0);
                NestedScrollConnection nestedScrollConnection0 = this.c;
                if(nestedScrollConnection0 != null) {
                    nestedScrollDispatcher$dispatchPreFling$10.m = 1;
                    object0 = nestedScrollConnection0.d(v, nestedScrollDispatcher$dispatchPreFling$10);
                    return object0 == object1 ? object1 : Velocity.b(((Velocity)object0).v());
                }
                return Velocity.b(0L);
            }
            case 1: {
                f0.n(object0);
                return Velocity.b(((Velocity)object0).v());
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    // 去混淆评级： 低(20)
    public final long d(long v, int v1) {
        return this.c == null ? 0L : this.c.i(v, v1);
    }

    @l
    public final a e() {
        return this.a;
    }

    @l
    public final O f() {
        O o0 = (O)this.a.invoke();
        if(o0 == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return o0;
    }

    @m
    public final O g() {
        return this.b;
    }

    @m
    public final NestedScrollConnection h() {
        return this.c;
    }

    public final void i(@l a a0) {
        L.p(a0, "<set-?>");
        this.a = a0;
    }

    public final void j(@m O o0) {
        this.b = o0;
    }

    public final void k(@m NestedScrollConnection nestedScrollConnection0) {
        this.c = nestedScrollConnection0;
    }
}

