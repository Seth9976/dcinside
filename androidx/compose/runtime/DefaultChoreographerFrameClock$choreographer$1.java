package androidx.compose.runtime;

import android.view.Choreographer;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@f(c = "androidx.compose.runtime.DefaultChoreographerFrameClock$choreographer$1", f = "ActualAndroid.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class DefaultChoreographerFrameClock.choreographer.1 extends o implements A3.o {
    int k;

    DefaultChoreographerFrameClock.choreographer.1(d d0) {
        super(2, d0);
    }

    @Override  // kotlin.coroutines.jvm.internal.a
    @l
    public final d create(@m Object object0, @l d d0) {
        return new DefaultChoreographerFrameClock.choreographer.1(d0);
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.invoke(((O)object0), ((d)object1));
    }

    @m
    public final Object invoke(@l O o0, @m d d0) {
        return ((DefaultChoreographerFrameClock.choreographer.1)this.create(o0, d0)).invokeSuspend(S0.a);
    }

    @Override  // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object object0) {
        if(this.k != 0) {
            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        }
        f0.n(object0);
        return Choreographer.getInstance();
    }
}

