package j$.time.format;

import j..time.b;
import j..time.chrono.l;
import j..time.chrono.s;
import j..time.temporal.TemporalAccessor;
import j..time.temporal.TemporalQuery;
import j..time.temporal.a;
import j..time.temporal.i;
import j..util.Objects;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;

public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter ISO_OFFSET_DATE_TIME;
    private final e a;
    private final Locale b;
    private final C c;
    private final E d;
    private final s e;
    public static final DateTimeFormatter f;

    static {
        v v0 = new v();
        v0.p(a.YEAR, 4, 10, F.EXCEEDS_PAD);
        v0.e('-');
        v0.o(a.MONTH_OF_YEAR, 2);
        v0.e('-');
        v0.o(a.DAY_OF_MONTH, 2);
        DateTimeFormatter dateTimeFormatter0 = v0.y(E.STRICT, s.d);
        DateTimeFormatter.ISO_LOCAL_DATE = dateTimeFormatter0;
        v v1 = new v();
        v1.t();
        v1.a(dateTimeFormatter0);
        v1.i();
        v1.y(E.STRICT, s.d);
        v v2 = new v();
        v2.t();
        v2.a(dateTimeFormatter0);
        v2.s();
        v2.i();
        v2.y(E.STRICT, s.d);
        v v3 = new v();
        v3.o(a.HOUR_OF_DAY, 2);
        v3.e(':');
        v3.o(a.MINUTE_OF_HOUR, 2);
        v3.s();
        v3.e(':');
        v3.o(a.SECOND_OF_MINUTE, 2);
        v3.s();
        v3.b(a.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter dateTimeFormatter1 = v3.y(E.STRICT, null);
        v v4 = new v();
        v4.t();
        v4.a(dateTimeFormatter1);
        v4.i();
        v4.y(E.STRICT, null);
        v v5 = new v();
        v5.t();
        v5.a(dateTimeFormatter1);
        v5.s();
        v5.i();
        v5.y(E.STRICT, null);
        v v6 = new v();
        v6.t();
        v6.a(dateTimeFormatter0);
        v6.e('T');
        v6.a(dateTimeFormatter1);
        DateTimeFormatter dateTimeFormatter2 = v6.y(E.STRICT, s.d);
        v v7 = new v();
        v7.t();
        v7.a(dateTimeFormatter2);
        v7.v();
        v7.i();
        v7.w();
        DateTimeFormatter dateTimeFormatter3 = v7.y(E.STRICT, s.d);
        DateTimeFormatter.ISO_OFFSET_DATE_TIME = dateTimeFormatter3;
        v v8 = new v();
        v8.a(dateTimeFormatter3);
        v8.s();
        v8.e('[');
        v8.u();
        v8.q();
        v8.e(']');
        v8.y(E.STRICT, s.d);
        v v9 = new v();
        v9.a(dateTimeFormatter2);
        v9.s();
        v9.i();
        v9.s();
        v9.e('[');
        v9.u();
        v9.q();
        v9.e(']');
        v9.y(E.STRICT, s.d);
        v v10 = new v();
        v10.t();
        v10.p(a.YEAR, 4, 10, F.EXCEEDS_PAD);
        v10.e('-');
        v10.o(a.DAY_OF_YEAR, 3);
        v10.s();
        v10.i();
        v10.y(E.STRICT, s.d);
        v v11 = new v();
        v11.t();
        v11.p(i.c, 4, 10, F.EXCEEDS_PAD);
        v11.f("-W");
        v11.o(i.b, 2);
        v11.e('-');
        v11.o(a.DAY_OF_WEEK, 1);
        v11.s();
        v11.i();
        v11.y(E.STRICT, s.d);
        v v12 = new v();
        v12.t();
        v12.c();
        DateTimeFormatter.f = v12.y(E.STRICT, null);
        v v13 = new v();
        v13.t();
        v13.o(a.YEAR, 4);
        v13.o(a.MONTH_OF_YEAR, 2);
        v13.o(a.DAY_OF_MONTH, 2);
        v13.s();
        v13.v();
        v13.h("+HHMMss", "Z");
        v13.w();
        v13.y(E.STRICT, s.d);
        HashMap hashMap0 = new HashMap();
        hashMap0.put(1L, "Mon");
        hashMap0.put(2L, "Tue");
        hashMap0.put(3L, "Wed");
        hashMap0.put(4L, "Thu");
        hashMap0.put(5L, "Fri");
        hashMap0.put(6L, "Sat");
        hashMap0.put(7L, "Sun");
        HashMap hashMap1 = new HashMap();
        hashMap1.put(1L, "Jan");
        hashMap1.put(2L, "Feb");
        hashMap1.put(3L, "Mar");
        hashMap1.put(4L, "Apr");
        hashMap1.put(5L, "May");
        hashMap1.put(6L, "Jun");
        hashMap1.put(7L, "Jul");
        hashMap1.put(8L, "Aug");
        hashMap1.put(9L, "Sep");
        hashMap1.put(10L, "Oct");
        hashMap1.put(11L, "Nov");
        hashMap1.put(12L, "Dec");
        v v14 = new v();
        v14.t();
        v14.v();
        v14.s();
        v14.k(a.DAY_OF_WEEK, hashMap0);
        v14.f(", ");
        v14.r();
        v14.p(a.DAY_OF_MONTH, 1, 2, F.NOT_NEGATIVE);
        v14.e(' ');
        v14.k(a.MONTH_OF_YEAR, hashMap1);
        v14.e(' ');
        v14.o(a.YEAR, 4);
        v14.e(' ');
        v14.o(a.HOUR_OF_DAY, 2);
        v14.e(':');
        v14.o(a.MINUTE_OF_HOUR, 2);
        v14.s();
        v14.e(':');
        v14.o(a.SECOND_OF_MINUTE, 2);
        v14.r();
        v14.e(' ');
        v14.h("+HHMM", "GMT");
        v14.y(E.SMART, s.d);
    }

    DateTimeFormatter(e e0, Locale locale0, C c0, E e1, s s0) {
        this.a = (e)Objects.requireNonNull(e0, "printerParser");
        this.b = (Locale)Objects.requireNonNull(locale0, "locale");
        this.c = (C)Objects.requireNonNull(c0, "decimalStyle");
        this.d = (E)Objects.requireNonNull(e1, "resolverStyle");
        this.e = s0;
    }

    public final String a(TemporalAccessor temporalAccessor0) {
        StringBuilder stringBuilder0 = new StringBuilder(0x20);
        Objects.requireNonNull(temporalAccessor0, "temporal");
        Objects.requireNonNull(stringBuilder0, "appendable");
        try {
            y y0 = new y(temporalAccessor0, this);
            this.a.l(y0, stringBuilder0);
            return stringBuilder0.toString();
        }
        catch(IOException iOException0) {
            throw new b(iOException0.getMessage(), iOException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
    }

    public final l b() {
        return this.e;
    }

    public final C c() {
        return this.c;
    }

    public final Locale d() {
        return this.b;
    }

    private TemporalAccessor e(CharSequence charSequence0) {
        ParsePosition parsePosition0 = new ParsePosition(0);
        Objects.requireNonNull(charSequence0, "text");
        Objects.requireNonNull(parsePosition0, "position");
        w w0 = new w(this);
        int v = parsePosition0.getIndex();
        int v1 = this.a.n(w0, charSequence0, v);
        if(v1 < 0) {
            parsePosition0.setErrorIndex(~v1);
            w0 = null;
        }
        else {
            parsePosition0.setIndex(v1);
        }
        if(w0 != null && parsePosition0.getErrorIndex() < 0 && parsePosition0.getIndex() >= charSequence0.length()) {
            return w0.t(this.d);
        }
        String s = charSequence0.length() <= 0x40 ? charSequence0.toString() : charSequence0.subSequence(0, 0x40).toString() + "...";
        if(parsePosition0.getErrorIndex() >= 0) {
            int v2 = parsePosition0.getErrorIndex();
            parsePosition0.getErrorIndex();
            throw new DateTimeParseException("Text \'" + s + "\' could not be parsed at index " + v2, charSequence0);
        }
        int v3 = parsePosition0.getIndex();
        parsePosition0.getIndex();
        throw new DateTimeParseException("Text \'" + s + "\' could not be parsed, unparsed text found at index " + v3, charSequence0);
    }

    final e f() {
        return this.a.a();
    }

    public static DateTimeFormatter ofPattern(String s) {
        v v0 = new v();
        v0.j(s);
        return v0.x();
    }

    public Object parse(CharSequence charSequence0, TemporalQuery temporalQuery0) {
        Objects.requireNonNull(charSequence0, "text");
        Objects.requireNonNull(temporalQuery0, "query");
        try {
            return ((D)this.e(charSequence0)).y(temporalQuery0);
        }
        catch(DateTimeParseException dateTimeParseException0) {
            throw dateTimeParseException0;
        }
        catch(RuntimeException runtimeException0) {
            throw new DateTimeParseException("Text \'" + (charSequence0.length() <= 0x40 ? charSequence0.toString() : charSequence0.subSequence(0, 0x40).toString() + "...") + "\' could not be parsed: " + runtimeException0.getMessage(), runtimeException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
    }

    @Override
    public final String toString() {
        String s = this.a.toString();
        return s.startsWith("[") ? s : s.substring(1, s.length() - 1);
    }

    // 去混淆评级： 低(20)
    public DateTimeFormatter withLocale(Locale locale0) {
        return this.b.equals(locale0) ? this : new DateTimeFormatter(this.a, locale0, this.c, this.d, this.e);
    }
}

