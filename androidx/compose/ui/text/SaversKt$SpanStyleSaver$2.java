package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.graphics.Color.Companion;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$SpanStyleSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n55#2,2:422\n55#2,2:425\n55#2,2:428\n70#2:431\n70#2:433\n70#2:435\n55#2,2:437\n55#2,2:440\n55#2,2:443\n55#2,2:446\n55#2,2:449\n55#2,2:452\n55#2,2:455\n1#3:424\n1#3:427\n1#3:430\n1#3:432\n1#3:434\n1#3:436\n1#3:439\n1#3:442\n1#3:445\n1#3:448\n1#3:451\n1#3:454\n1#3:457\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$SpanStyleSaver$2\n*L\n243#1:422,2\n244#1:425,2\n245#1:428,2\n246#1:431\n247#1:433\n249#1:435\n250#1:437,2\n251#1:440,2\n252#1:443,2\n253#1:446,2\n254#1:449,2\n255#1:452,2\n256#1:455,2\n243#1:424\n244#1:427\n245#1:430\n246#1:432\n247#1:434\n249#1:436\n250#1:439\n251#1:442\n252#1:445\n253#1:448\n254#1:451\n255#1:454\n256#1:457\n*E\n"})
final class SaversKt.SpanStyleSaver.2 extends N implements Function1 {
    public static final SaversKt.SpanStyleSaver.2 e;

    static {
        SaversKt.SpanStyleSaver.2.e = new SaversKt.SpanStyleSaver.2();
    }

    SaversKt.SpanStyleSaver.2() {
        super(1);
    }

    @m
    public final SpanStyle a(@l Object object0) {
        TextDecoration textDecoration0;
        Color color1;
        LocaleList localeList0;
        TextGeometricTransform textGeometricTransform0;
        BaselineShift baselineShift0;
        TextUnit textUnit1;
        FontWeight fontWeight0;
        TextUnit textUnit0;
        Color color0;
        L.p(object0, "it");
        Object object1 = ((List)object0).get(0);
        Companion color$Companion0 = Color.b;
        Saver saver0 = SaversKt.i(color$Companion0);
        if(L.g(object1, Boolean.FALSE)) {
            color0 = null;
        }
        else if(object1 != null) {
            color0 = (Color)saver0.b(object1);
        }
        else {
            color0 = null;
        }
        L.m(color0);
        long v = color0.M();
        Object object2 = ((List)object0).get(1);
        androidx.compose.ui.unit.TextUnit.Companion textUnit$Companion0 = TextUnit.b;
        Saver saver1 = SaversKt.s(textUnit$Companion0);
        if(L.g(object2, Boolean.FALSE)) {
            textUnit0 = null;
        }
        else if(object2 != null) {
            textUnit0 = (TextUnit)saver1.b(object2);
        }
        else {
            textUnit0 = null;
        }
        L.m(textUnit0);
        long v1 = textUnit0.w();
        Object object3 = ((List)object0).get(2);
        Saver saver2 = SaversKt.l(FontWeight.b);
        if(L.g(object3, Boolean.FALSE)) {
            fontWeight0 = null;
        }
        else if(object3 != null) {
            fontWeight0 = (FontWeight)saver2.b(object3);
        }
        else {
            fontWeight0 = null;
        }
        Object object4 = ((List)object0).get(3);
        FontStyle fontStyle0 = object4 == null ? null : ((FontStyle)object4);
        Object object5 = ((List)object0).get(4);
        FontSynthesis fontSynthesis0 = object5 == null ? null : ((FontSynthesis)object5);
        Object object6 = ((List)object0).get(6);
        String s = object6 == null ? null : ((String)object6);
        Object object7 = ((List)object0).get(7);
        Saver saver3 = SaversKt.s(textUnit$Companion0);
        if(L.g(object7, Boolean.FALSE)) {
            textUnit1 = null;
        }
        else if(object7 != null) {
            textUnit1 = (TextUnit)saver3.b(object7);
        }
        else {
            textUnit1 = null;
        }
        L.m(textUnit1);
        long v2 = textUnit1.w();
        Object object8 = ((List)object0).get(8);
        Saver saver4 = SaversKt.o(BaselineShift.b);
        if(L.g(object8, Boolean.FALSE)) {
            baselineShift0 = null;
        }
        else if(object8 != null) {
            baselineShift0 = (BaselineShift)saver4.b(object8);
        }
        else {
            baselineShift0 = null;
        }
        Object object9 = ((List)object0).get(9);
        Saver saver5 = SaversKt.q(TextGeometricTransform.c);
        if(L.g(object9, Boolean.FALSE)) {
            textGeometricTransform0 = null;
        }
        else if(object9 != null) {
            textGeometricTransform0 = (TextGeometricTransform)saver5.b(object9);
        }
        else {
            textGeometricTransform0 = null;
        }
        Object object10 = ((List)object0).get(10);
        Saver saver6 = SaversKt.n(LocaleList.c);
        if(L.g(object10, Boolean.FALSE)) {
            localeList0 = null;
        }
        else if(object10 != null) {
            localeList0 = (LocaleList)saver6.b(object10);
        }
        else {
            localeList0 = null;
        }
        Object object11 = ((List)object0).get(11);
        Saver saver7 = SaversKt.i(color$Companion0);
        if(L.g(object11, Boolean.FALSE)) {
            color1 = null;
        }
        else if(object11 != null) {
            color1 = (Color)saver7.b(object11);
        }
        else {
            color1 = null;
        }
        L.m(color1);
        long v3 = color1.M();
        Object object12 = ((List)object0).get(12);
        Saver saver8 = SaversKt.p(TextDecoration.b);
        if(L.g(object12, Boolean.FALSE)) {
            textDecoration0 = null;
        }
        else if(object12 != null) {
            textDecoration0 = (TextDecoration)saver8.b(object12);
        }
        else {
            textDecoration0 = null;
        }
        Object object13 = ((List)object0).get(13);
        Saver saver9 = SaversKt.j(Shadow.d);
        if(L.g(object13, Boolean.FALSE)) {
            return new SpanStyle(v, v1, fontWeight0, fontStyle0, fontSynthesis0, null, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, null, 0x20, null);
        }
        return object13 == null ? new SpanStyle(v, v1, fontWeight0, fontStyle0, fontSynthesis0, null, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, null, 0x20, null) : new SpanStyle(v, v1, fontWeight0, fontStyle0, fontSynthesis0, null, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, ((Shadow)saver9.b(object13)), 0x20, null);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(object0);
    }
}

