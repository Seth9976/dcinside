package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset.Companion;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n1#2:422\n*E\n"})
public final class SaversKt {
    @l
    private static final Saver a;
    @l
    private static final Saver b;
    @l
    private static final Saver c;
    @l
    private static final Saver d;
    @l
    private static final Saver e;
    @l
    private static final Saver f;
    @l
    private static final Saver g;
    @l
    private static final Saver h;
    @l
    private static final Saver i;
    @l
    private static final Saver j;
    @l
    private static final Saver k;
    @l
    private static final Saver l;
    @l
    private static final Saver m;
    @l
    private static final Saver n;
    @l
    private static final Saver o;
    @l
    private static final Saver p;
    @l
    private static final Saver q;
    @l
    private static final Saver r;
    @l
    private static final Saver s;

    static {
        SaversKt.a = SaverKt.a(SaversKt.AnnotatedStringSaver.1.e, SaversKt.AnnotatedStringSaver.2.e);
        SaversKt.b = SaverKt.a(SaversKt.AnnotationRangeListSaver.1.e, SaversKt.AnnotationRangeListSaver.2.e);
        SaversKt.c = SaverKt.a(SaversKt.AnnotationRangeSaver.1.e, SaversKt.AnnotationRangeSaver.2.e);
        SaversKt.d = SaverKt.a(SaversKt.VerbatimTtsAnnotationSaver.1.e, SaversKt.VerbatimTtsAnnotationSaver.2.e);
        SaversKt.e = SaverKt.a(SaversKt.UrlAnnotationSaver.1.e, SaversKt.UrlAnnotationSaver.2.e);
        SaversKt.f = SaverKt.a(SaversKt.ParagraphStyleSaver.1.e, SaversKt.ParagraphStyleSaver.2.e);
        SaversKt.g = SaverKt.a(SaversKt.SpanStyleSaver.1.e, SaversKt.SpanStyleSaver.2.e);
        SaversKt.h = SaverKt.a(SaversKt.TextDecorationSaver.1.e, SaversKt.TextDecorationSaver.2.e);
        SaversKt.i = SaverKt.a(SaversKt.TextGeometricTransformSaver.1.e, SaversKt.TextGeometricTransformSaver.2.e);
        SaversKt.j = SaverKt.a(SaversKt.TextIndentSaver.1.e, SaversKt.TextIndentSaver.2.e);
        SaversKt.k = SaverKt.a(SaversKt.FontWeightSaver.1.e, SaversKt.FontWeightSaver.2.e);
        SaversKt.l = SaverKt.a(SaversKt.BaselineShiftSaver.1.e, SaversKt.BaselineShiftSaver.2.e);
        SaversKt.m = SaverKt.a(SaversKt.TextRangeSaver.1.e, SaversKt.TextRangeSaver.2.e);
        SaversKt.n = SaverKt.a(SaversKt.ShadowSaver.1.e, SaversKt.ShadowSaver.2.e);
        SaversKt.o = SaverKt.a(SaversKt.ColorSaver.1.e, SaversKt.ColorSaver.2.e);
        SaversKt.p = SaverKt.a(SaversKt.TextUnitSaver.1.e, SaversKt.TextUnitSaver.2.e);
        SaversKt.q = SaverKt.a(SaversKt.OffsetSaver.1.e, SaversKt.OffsetSaver.2.e);
        SaversKt.r = SaverKt.a(SaversKt.LocaleListSaver.1.e, SaversKt.LocaleListSaver.2.e);
        SaversKt.s = SaverKt.a(SaversKt.LocaleSaver.1.e, SaversKt.LocaleSaver.2.e);
    }

    @l
    public static final Saver e() {
        return SaversKt.a;
    }

    private static void f() {
    }

    @l
    public static final Saver g() {
        return SaversKt.f;
    }

    @l
    public static final Saver h(@l Companion offset$Companion0) {
        L.p(offset$Companion0, "<this>");
        return SaversKt.q;
    }

    @l
    public static final Saver i(@l androidx.compose.ui.graphics.Color.Companion color$Companion0) {
        L.p(color$Companion0, "<this>");
        return SaversKt.o;
    }

    @l
    public static final Saver j(@l androidx.compose.ui.graphics.Shadow.Companion shadow$Companion0) {
        L.p(shadow$Companion0, "<this>");
        return SaversKt.n;
    }

    @l
    public static final Saver k(@l androidx.compose.ui.text.TextRange.Companion textRange$Companion0) {
        L.p(textRange$Companion0, "<this>");
        return SaversKt.m;
    }

    @l
    public static final Saver l(@l androidx.compose.ui.text.font.FontWeight.Companion fontWeight$Companion0) {
        L.p(fontWeight$Companion0, "<this>");
        return SaversKt.k;
    }

    @l
    public static final Saver m(@l androidx.compose.ui.text.intl.Locale.Companion locale$Companion0) {
        L.p(locale$Companion0, "<this>");
        return SaversKt.s;
    }

    @l
    public static final Saver n(@l androidx.compose.ui.text.intl.LocaleList.Companion localeList$Companion0) {
        L.p(localeList$Companion0, "<this>");
        return SaversKt.r;
    }

    @l
    public static final Saver o(@l androidx.compose.ui.text.style.BaselineShift.Companion baselineShift$Companion0) {
        L.p(baselineShift$Companion0, "<this>");
        return SaversKt.l;
    }

    @l
    public static final Saver p(@l androidx.compose.ui.text.style.TextDecoration.Companion textDecoration$Companion0) {
        L.p(textDecoration$Companion0, "<this>");
        return SaversKt.h;
    }

    @l
    public static final Saver q(@l androidx.compose.ui.text.style.TextGeometricTransform.Companion textGeometricTransform$Companion0) {
        L.p(textGeometricTransform$Companion0, "<this>");
        return SaversKt.i;
    }

    @l
    public static final Saver r(@l androidx.compose.ui.text.style.TextIndent.Companion textIndent$Companion0) {
        L.p(textIndent$Companion0, "<this>");
        return SaversKt.j;
    }

    @l
    public static final Saver s(@l androidx.compose.ui.unit.TextUnit.Companion textUnit$Companion0) {
        L.p(textUnit$Companion0, "<this>");
        return SaversKt.p;
    }

    @l
    public static final Saver t() {
        return SaversKt.g;
    }

    private static void u() {
    }

    private static void v() {
    }

    public static final Object w(Object object0) {
        if(object0 != null) {
            L.y(1, "Result");
            return object0;
        }
        return null;
    }

    public static final Object x(Object object0, Saver saver0) {
        L.p(saver0, "saver");
        Object object1 = null;
        if(L.g(object0, Boolean.FALSE)) {
            return null;
        }
        if(object0 != null) {
            object1 = saver0.b(object0);
            L.y(1, "Result");
        }
        return object1;
    }

    @m
    public static final Object y(@m Object object0) [...] // Inlined contents

    @l
    public static final Object z(@m Object object0, @l Saver saver0, @l SaverScope saverScope0) {
        L.p(saver0, "saver");
        L.p(saverScope0, "scope");
        if(object0 != null) {
            Boolean boolean0 = saver0.a(saverScope0, object0);
            return boolean0 == null ? false : boolean0;
        }
        return false;
    }
}

