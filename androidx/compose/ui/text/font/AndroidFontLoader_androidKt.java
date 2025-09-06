package androidx.compose.ui.text.font;

import A3.o;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import androidx.core.content.res.ResourcesCompat;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import y4.l;
import y4.m;

public final class AndroidFontLoader_androidKt {
    private static final Typeface c(ResourceFont resourceFont0, Context context0) {
        if(Build.VERSION.SDK_INT >= 26) {
            return ResourceFontHelper.a.a(context0, resourceFont0);
        }
        Typeface typeface0 = ResourcesCompat.j(context0, resourceFont0.i());
        L.m(typeface0);
        L.o(typeface0, "{\n        ResourcesCompa…t(context, resId)!!\n    }");
        return typeface0;
    }

    private static final Object d(ResourceFont resourceFont0, Context context0, d d0) {
        return i.h(h0.c(), new o(resourceFont0, context0, null) {
            int k;
            final ResourceFont l;
            final Context m;

            {
                this.l = resourceFont0;
                this.m = context0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new androidx.compose.ui.text.font.AndroidFontLoader_androidKt.loadAsync.2(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.ui.text.font.AndroidFontLoader_androidKt.loadAsync.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                return AndroidFontLoader_androidKt.c(this.l, this.m);
            }
        }, d0);
    }
}

