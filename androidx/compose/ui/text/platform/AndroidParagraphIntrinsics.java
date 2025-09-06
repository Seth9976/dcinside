package androidx.compose.ui.text.platform;

import A3.q;
import android.graphics.Typeface;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.AnnotatedString.Range;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.LayoutIntrinsics;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.TypefaceResult.Immutable;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class AndroidParagraphIntrinsics implements ParagraphIntrinsics {
    @l
    private final String a;
    @l
    private final TextStyle b;
    @l
    private final List c;
    @l
    private final List d;
    @l
    private final Resolver e;
    @l
    private final Density f;
    @l
    private final AndroidTextPaint g;
    @l
    private final CharSequence h;
    @l
    private final LayoutIntrinsics i;
    @m
    private TypefaceDirtyTrackerLinkedList j;
    private final boolean k;
    private final int l;

    public AndroidParagraphIntrinsics(@l String s, @l TextStyle textStyle0, @l List list0, @l List list1, @l Resolver fontFamily$Resolver0, @l Density density0) {
        L.p(s, "text");
        L.p(textStyle0, "style");
        L.p(list0, "spanStyles");
        L.p(list1, "placeholders");
        L.p(fontFamily$Resolver0, "fontFamilyResolver");
        L.p(density0, "density");
        super();
        this.a = s;
        this.b = textStyle0;
        this.c = list0;
        this.d = list1;
        this.e = fontFamily$Resolver0;
        this.f = density0;
        AndroidTextPaint androidTextPaint0 = new AndroidTextPaint(1, density0.getDensity());
        this.g = androidTextPaint0;
        this.k = AndroidParagraphIntrinsics_androidKt.c(textStyle0) ? ((Boolean)() -> EmojiCompatStatus.b.a().a().getValue()).booleanValue() : false;
        this.l = AndroidParagraphIntrinsics_androidKt.d(textStyle0.M(), textStyle0.F());
        androidx.compose.ui.text.platform.AndroidParagraphIntrinsics.resolveTypeface.1 androidParagraphIntrinsics$resolveTypeface$10 = new q() {
            final AndroidParagraphIntrinsics e;

            {
                this.e = androidParagraphIntrinsics0;
                super(4);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((FontFamily)object0), ((FontWeight)object1), ((FontStyle)object2).j(), ((FontSynthesis)object3).m());
            }

            @l
            public final Typeface a(@m FontFamily fontFamily0, @l FontWeight fontWeight0, int v, int v1) {
                L.p(fontWeight0, "fontWeight");
                State state0 = this.e.h().b(fontFamily0, fontWeight0, v, v1);
                if(!(state0 instanceof Immutable)) {
                    TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList0 = new TypefaceDirtyTrackerLinkedList(state0, this.e.j);
                    this.e.j = typefaceDirtyTrackerLinkedList0;
                    return typefaceDirtyTrackerLinkedList0.b();
                }
                Object object0 = state0.getValue();
                L.n(object0, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface)object0;
            }
        };
        TextPaintExtensions_androidKt.f(androidTextPaint0, textStyle0.P());
        SpanStyle spanStyle0 = TextPaintExtensions_androidKt.a(androidTextPaint0, textStyle0.b0(), androidParagraphIntrinsics$resolveTypeface$10, density0, !list0.isEmpty());
        if(spanStyle0 != null) {
            int v = list0.size();
            list0 = new ArrayList(v + 1);
            for(int v1 = 0; v1 < v + 1; ++v1) {
                ((ArrayList)list0).add((v1 == 0 ? new Range(spanStyle0, 0, this.a.length()) : ((Range)this.c.get(v1 - 1))));
            }
        }
        float f = this.g.getTextSize();
        CharSequence charSequence0 = AndroidParagraphHelper_androidKt.a(this.a, f, this.b, list0, this.d, this.f, androidParagraphIntrinsics$resolveTypeface$10, this.k);
        this.h = charSequence0;
        this.i = new LayoutIntrinsics(charSequence0, this.g, this.l);
    }

    @Override  // androidx.compose.ui.text.ParagraphIntrinsics
    public float a() {
        return this.i.c();
    }

    @Override  // androidx.compose.ui.text.ParagraphIntrinsics
    public float b() {
        return this.i.b();
    }

    // 去混淆评级： 低(40)
    @Override  // androidx.compose.ui.text.ParagraphIntrinsics
    public boolean c() {
        return (this.j == null ? false : this.j.c()) || !this.k && AndroidParagraphIntrinsics_androidKt.c(this.b) && ((Boolean)() -> EmojiCompatStatus.b.a().a().getValue()).booleanValue();
    }

    @l
    public final CharSequence f() {
        return this.h;
    }

    @l
    public final Density g() {
        return this.f;
    }

    @l
    public final Resolver h() {
        return this.e;
    }

    @l
    public final LayoutIntrinsics i() {
        return this.i;
    }

    @l
    public final List j() {
        return this.d;
    }

    @l
    public final List k() {
        return this.c;
    }

    @l
    public final TextStyle l() {
        return this.b;
    }

    @l
    public final String m() {
        return this.a;
    }

    public final int n() {
        return this.l;
    }

    @l
    public final AndroidTextPaint o() {
        return this.g;
    }
}

