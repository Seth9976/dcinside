package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration.Companion;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.H0;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;

public final class DecodeHelper {
    @l
    private final Parcel a;

    public DecodeHelper(@l String s) {
        L.p(s, "string");
        super();
        Parcel parcel0 = Parcel.obtain();
        L.o(parcel0, "obtain()");
        this.a = parcel0;
        byte[] arr_b = Base64.decode(s, 0);
        parcel0.unmarshall(arr_b, 0, arr_b.length);
        parcel0.setDataPosition(0);
    }

    private final int a() {
        return this.a.dataAvail();
    }

    private final float b() {
        return BaselineShift.e(this.e());
    }

    private final byte c() {
        return this.a.readByte();
    }

    public final long d() {
        return Color.t(this.p());
    }

    private final float e() {
        return this.a.readFloat();
    }

    public final int f() {
        int v = this.c();
        if(v == 0) {
            return 0;
        }
        return v == 1 ? 1 : 0;
    }

    public final int g() {
        int v = this.c();
        if(v == 0) {
            return 0;
        }
        switch(v) {
            case 1: {
                return 1;
            }
            case 2: {
                return 2;
            }
            case 3: {
                return 3;
            }
            default: {
                return 0;
            }
        }
    }

    @l
    public final FontWeight h() {
        return new FontWeight(this.i());
    }

    private final int i() {
        return this.a.readInt();
    }

    private final Shadow j() {
        return new Shadow(this.d(), OffsetKt.a(this.e(), this.e()), this.e(), null);
    }

    @l
    public final SpanStyle k() {
        MutableSpanStyle mutableSpanStyle0 = new MutableSpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 0x3FFF, null);
    label_1:
        while(this.a.dataAvail() > 1) {
            int v = this.c();
            if(v == 1) {
                if(this.a() < 8) {
                    break;
                }
                mutableSpanStyle0.q(this.d());
            }
            else {
                switch(v) {
                    case 3: {
                        if(this.a() < 4) {
                            break label_1;
                        }
                        mutableSpanStyle0.w(this.h());
                        continue;
                    }
                    case 4: {
                        if(this.a() < 1) {
                            break label_1;
                        }
                        mutableSpanStyle0.u(FontStyle.c(this.f()));
                        continue;
                    }
                    case 5: {
                        if(this.a() < 1) {
                            break label_1;
                        }
                        mutableSpanStyle0.v(FontSynthesis.e(this.g()));
                        continue;
                    }
                    case 6: {
                        mutableSpanStyle0.s(this.l());
                        continue;
                    }
                    case 7: {
                        if(this.a() < 5) {
                            break label_1;
                        }
                        mutableSpanStyle0.x(this.o());
                        continue;
                    }
                    case 8: {
                        if(this.a() < 4) {
                            break label_1;
                        }
                        mutableSpanStyle0.p(BaselineShift.d(this.b()));
                        continue;
                    }
                    case 9: {
                        if(this.a() < 8) {
                            break label_1;
                        }
                        mutableSpanStyle0.B(this.n());
                        continue;
                    }
                    case 10: {
                        if(this.a() < 8) {
                            break label_1;
                        }
                        mutableSpanStyle0.o(this.d());
                        continue;
                    }
                    case 11: {
                        if(this.a() < 4) {
                            break label_1;
                        }
                        mutableSpanStyle0.A(this.m());
                        continue;
                    }
                    case 12: {
                        if(this.a() >= 20) {
                            break;
                        }
                        break label_1;
                    }
                    default: {
                        continue;
                    }
                }
                mutableSpanStyle0.z(this.j());
            }
        }
        return mutableSpanStyle0.C();
    }

    private final String l() {
        return this.a.readString();
    }

    private final TextDecoration m() {
        int v = this.i();
        Companion textDecoration$Companion0 = TextDecoration.b;
        boolean z = (textDecoration$Companion0.b().e() & v) != 0;
        boolean z1 = (v & textDecoration$Companion0.f().e()) != 0;
        if(z && z1) {
            return textDecoration$Companion0.a(u.O(new TextDecoration[]{textDecoration$Companion0.b(), textDecoration$Companion0.f()}));
        }
        if(z) {
            return textDecoration$Companion0.b();
        }
        return z1 ? textDecoration$Companion0.f() : textDecoration$Companion0.d();
    }

    private final TextGeometricTransform n() {
        return new TextGeometricTransform(this.e(), this.e());
    }

    // 去混淆评级： 低(30)
    public final long o() {
        int v = this.c();
        if(v == 1) {
            return TextUnitKt.a(this.e(), 0x100000000L);
        }
        long v1 = v == 2 ? 0x200000000L : 0L;
        return TextUnitType.g(v1, 0L) ? 0x7FC00000L : TextUnitKt.a(this.e(), v1);
    }

    private final long p() {
        return H0.h(this.a.readLong());
    }
}

