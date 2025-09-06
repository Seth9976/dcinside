package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.jvm.internal.L;
import y4.l;

public final class EncodeHelper {
    @l
    private Parcel a;

    public EncodeHelper() {
        Parcel parcel0 = Parcel.obtain();
        L.o(parcel0, "obtain()");
        this.a = parcel0;
    }

    public final void a(byte b) {
        this.a.writeByte(b);
    }

    public final void b(float f) {
        this.a.writeFloat(f);
    }

    public final void c(int v) {
        this.a.writeInt(v);
    }

    public final void d(@l Shadow shadow0) {
        L.p(shadow0, "shadow");
        this.m(shadow0.f());
        this.b(Offset.p(shadow0.h()));
        this.b(Offset.r(shadow0.h()));
        this.b(shadow0.d());
    }

    public final void e(@l SpanStyle spanStyle0) {
        L.p(spanStyle0, "spanStyle");
        if(!Color.y(spanStyle0.o(), 16L)) {
            this.a(1);
            this.m(spanStyle0.o());
        }
        if(!TextUnit.j(spanStyle0.t(), 0x7FC00000L)) {
            this.a(2);
            this.j(spanStyle0.t());
        }
        FontWeight fontWeight0 = spanStyle0.w();
        if(fontWeight0 != null) {
            this.a(3);
            this.f(fontWeight0);
        }
        FontStyle fontStyle0 = spanStyle0.u();
        if(fontStyle0 != null) {
            this.a(4);
            this.o(fontStyle0.j());
        }
        FontSynthesis fontSynthesis0 = spanStyle0.v();
        if(fontSynthesis0 != null) {
            this.a(5);
            this.l(fontSynthesis0.m());
        }
        String s = spanStyle0.s();
        if(s != null) {
            this.a(6);
            this.i(s);
        }
        if(!TextUnit.j(spanStyle0.x(), 0x7FC00000L)) {
            this.a(7);
            this.j(spanStyle0.x());
        }
        BaselineShift baselineShift0 = spanStyle0.l();
        if(baselineShift0 != null) {
            this.a(8);
            this.k(baselineShift0.k());
        }
        TextGeometricTransform textGeometricTransform0 = spanStyle0.D();
        if(textGeometricTransform0 != null) {
            this.a(9);
            this.h(textGeometricTransform0);
        }
        if(!Color.y(spanStyle0.k(), 16L)) {
            this.a(10);
            this.m(spanStyle0.k());
        }
        TextDecoration textDecoration0 = spanStyle0.B();
        if(textDecoration0 != null) {
            this.a(11);
            this.g(textDecoration0);
        }
        Shadow shadow0 = spanStyle0.A();
        if(shadow0 != null) {
            this.a(12);
            this.d(shadow0);
        }
    }

    public final void f(@l FontWeight fontWeight0) {
        L.p(fontWeight0, "fontWeight");
        this.c(fontWeight0.w());
    }

    public final void g(@l TextDecoration textDecoration0) {
        L.p(textDecoration0, "textDecoration");
        this.c(textDecoration0.e());
    }

    public final void h(@l TextGeometricTransform textGeometricTransform0) {
        L.p(textGeometricTransform0, "textGeometricTransform");
        this.b(textGeometricTransform0.d());
        this.b(textGeometricTransform0.e());
    }

    public final void i(@l String s) {
        L.p(s, "string");
        this.a.writeString(s);
    }

    public final void j(long v) {
        long v1 = TextUnit.m(v);
        int v2 = 0;
        if(!TextUnitType.g(v1, 0L)) {
            if(TextUnitType.g(v1, 0x100000000L)) {
                v2 = 1;
            }
            else if(TextUnitType.g(v1, 0x200000000L)) {
                v2 = 2;
            }
        }
        this.a(((byte)v2));
        if(!TextUnitType.g(TextUnit.m(v), 0L)) {
            this.b(TextUnit.n(v));
        }
    }

    public final void k(float f) {
        this.b(f);
    }

    public final void l(int v) {
        int v1 = 0;
        if(!FontSynthesis.h(v, 0)) {
            if(FontSynthesis.h(v, 1)) {
                v1 = 1;
            }
            else if(FontSynthesis.h(v, 2)) {
                v1 = 2;
            }
            else if(FontSynthesis.h(v, 3)) {
                v1 = 3;
            }
        }
        this.a(((byte)v1));
    }

    public final void m(long v) {
        this.n(v);
    }

    public final void n(long v) {
        this.a.writeLong(v);
    }

    // 去混淆评级： 低(30)
    public final void o(int v) {
        this.a(((byte)(FontStyle.f(v, 0) || !FontStyle.f(v, 1) ? 0 : 1)));
    }

    @l
    public final String p() {
        String s = Base64.encodeToString(this.a.marshall(), 0);
        L.o(s, "encodeToString(bytes, Base64.DEFAULT)");
        return s;
    }

    public final void q() {
        this.a.recycle();
        Parcel parcel0 = Parcel.obtain();
        L.o(parcel0, "obtain()");
        this.a = parcel0;
    }
}

