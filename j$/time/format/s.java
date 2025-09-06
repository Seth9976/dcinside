package j$.time.format;

import j..time.d;
import j..time.temporal.q;
import j..time.temporal.v;
import j..util.Objects;
import java.util.Calendar;
import java.util.Locale;

final class s extends j {
    private char g;
    private int h;

    s(char c, int v, int v1, int v2, int v3) {
        super(null, v1, v2, F.NOT_NEGATIVE, v3);
        this.g = c;
        this.h = v;
    }

    @Override  // j$.time.format.j
    final j e() {
        return this.e == -1 ? this : new s(this.g, this.h, this.b, this.c, -1);
    }

    @Override  // j$.time.format.j
    final j f(int v) {
        return new s(this.g, this.h, this.b, this.c, this.e + v);
    }

    private j g(Locale locale0) {
        Objects.requireNonNull(locale0, "locale");
        Calendar calendar0 = Calendar.getInstance(new Locale(locale0.getLanguage(), locale0.getCountry()));
        int v = calendar0.getFirstDayOfWeek();
        v v1 = v.g(d.SUNDAY.R(((long)(v - 1))), calendar0.getMinimalDaysInFirstWeek());
        switch(this.g) {
            case 87: {
                return new j(v1.i(), this.b, this.c, F.NOT_NEGATIVE, this.e);
            }
            case 89: {
                q q0 = v1.h();
                int v2 = this.h;
                if(v2 == 2) {
                    return new p(q0, p.h, this.e);
                }
                return v2 >= 4 ? new j(q0, v2, 19, F.EXCEEDS_PAD, this.e) : new j(q0, v2, 19, F.NORMAL, this.e);
            }
            case 99: 
            case 101: {
                return new j(v1.d(), this.b, this.c, F.NOT_NEGATIVE, this.e);
            }
            case 0x77: {
                return new j(v1.j(), this.b, this.c, F.NOT_NEGATIVE, this.e);
            }
            default: {
                throw new IllegalStateException("unreachable");
            }
        }
    }

    @Override  // j$.time.format.j
    public final boolean l(y y0, StringBuilder stringBuilder0) {
        return this.g(y0.c()).l(y0, stringBuilder0);
    }

    @Override  // j$.time.format.j
    public final int n(w w0, CharSequence charSequence0, int v) {
        return this.g(w0.i()).n(w0, charSequence0, v);
    }

    @Override  // j$.time.format.j
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(30);
        stringBuilder0.append("Localized(");
        int v = this.h;
        switch(this.g) {
            case 87: {
                stringBuilder0.append("WeekOfMonth");
                break;
            }
            case 99: 
            case 101: {
                stringBuilder0.append("DayOfWeek");
                break;
            }
            case 0x77: {
                stringBuilder0.append("WeekOfWeekBasedYear");
            }
        }
        stringBuilder0.append(",");
        stringBuilder0.append(v);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

