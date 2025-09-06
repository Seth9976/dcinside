package androidx.compose.ui.text.android.animation;

import android.text.Layout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import androidx.compose.ui.text.android.LayoutCompatKt;
import androidx.compose.ui.text.android.LayoutHelper;
import java.text.Bidi;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import kotlin.J;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
@s0({"SMAP\nSegmentBreaker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentBreaker.kt\nandroidx/compose/ui/text/android/animation/SegmentBreaker\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/android/TempListUtilsKt\n*L\n1#1,312:1\n34#2,6:313\n73#2,11:319\n73#2,11:330\n*S KotlinDebug\n*F\n+ 1 SegmentBreaker.kt\nandroidx/compose/ui/text/android/animation/SegmentBreaker\n*L\n66#1:313,6\n226#1:319,11\n275#1:330,11\n*E\n"})
public final class SegmentBreaker {
    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[SegmentType.values().length];
            try {
                arr_v[SegmentType.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SegmentType.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SegmentType.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SegmentType.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SegmentType.e.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
        }
    }

    @l
    public static final SegmentBreaker a;
    public static final int b;

    static {
        SegmentBreaker.a = new SegmentBreaker();
    }

    private final List a(LayoutHelper layoutHelper0) {
        CharSequence charSequence0 = layoutHelper0.d().getText();
        L.o(charSequence0, "text");
        BreakIterator breakIterator0 = BreakIterator.getLineInstance(Locale.getDefault());
        L.o(breakIterator0, "getLineInstance(Locale.getDefault())");
        List list0 = this.i(charSequence0, breakIterator0);
        TreeSet treeSet0 = new TreeSet();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            treeSet0.add(((Number)list0.get(v1)).intValue());
        }
        int v2 = layoutHelper0.e();
        for(int v3 = 0; v3 < v2; ++v3) {
            Bidi bidi0 = layoutHelper0.a(v3);
            if(bidi0 != null) {
                int v4 = layoutHelper0.i(v3);
                int v5 = bidi0.getRunCount();
                for(int v6 = 0; v6 < v5; ++v6) {
                    treeSet0.add(((int)(bidi0.getRunStart(v6) + v4)));
                }
            }
        }
        return u.V5(treeSet0);
    }

    @l
    public final List b(@l LayoutHelper layoutHelper0, @l SegmentType segmentType0) {
        int v = 0;
        L.p(layoutHelper0, "layoutHelper");
        L.p(segmentType0, "segmentType");
        Layout layout0 = layoutHelper0.d();
        CharSequence charSequence0 = layout0.getText();
        switch(segmentType0) {
            case 1: {
                return u.O(new Integer[]{0, charSequence0.length()});
            }
            case 2: {
                List list0 = u.S(new Integer[]{0});
                int v1 = layoutHelper0.e();
                while(v < v1) {
                    list0.add(layoutHelper0.f(v));
                    ++v;
                }
                return list0;
            }
            case 3: {
                List list1 = u.S(new Integer[]{0});
                int v2 = layout0.getLineCount();
                while(v < v2) {
                    list1.add(layout0.getLineEnd(v));
                    ++v;
                }
                return list1;
            }
            case 4: {
                return this.a(layoutHelper0);
            }
            case 5: {
                L.o(charSequence0, "text");
                BreakIterator breakIterator0 = BreakIterator.getCharacterInstance(Locale.getDefault());
                L.o(breakIterator0, "getCharacterInstance(Locale.getDefault())");
                return this.i(charSequence0, breakIterator0);
            }
            default: {
                throw new J();
            }
        }
    }

    private final List c(LayoutHelper layoutHelper0, boolean z) {
        List list0 = new ArrayList();
        List list1 = this.b(layoutHelper0, SegmentType.e);
        switch(list1.size()) {
            case 0: 
            case 1: {
                break;
            }
            default: {
                ArrayList arrayList0 = new ArrayList();
                Object object0 = list1.get(0);
                int v = u.J(list1);
                int v1 = 0;
                for(boolean z1 = true; v1 < v; z1 = true) {
                    ++v1;
                    Object object1 = list1.get(v1);
                    int v2 = ((Number)object1).intValue();
                    int v3 = ((Number)object0).intValue();
                    Layout layout0 = layoutHelper0.d();
                    if(!z || v2 != v3 + 1 || !layoutHelper0.j(layout0.getText().charAt(v3))) {
                        int v4 = LayoutCompatKt.a(layout0, v3, false);
                        boolean z2 = layout0.getParagraphDirection(v4) == -1;
                        boolean z3 = layout0.isRtlCharAt(v3);
                        if(z3 != z2) {
                            z1 = false;
                        }
                        int v5 = (int)(((float)Math.ceil(layoutHelper0.c(v3, z1, false))));
                        int v6 = (int)(((float)Math.ceil(layoutHelper0.c(v2, z3 == z2, true))));
                        list0.add(new Segment(v3, v2, Math.min(v5, v6), layout0.getLineTop(v4), Math.max(v5, v6), layout0.getLineBottom(v4)));
                    }
                    arrayList0.add(S0.a);
                    object0 = object1;
                }
            }
        }
        return list0;
    }

    private final List d(LayoutHelper layoutHelper0) {
        return u.k(new Segment(0, layoutHelper0.d().getText().length(), 0, 0, layoutHelper0.d().getWidth(), layoutHelper0.d().getHeight()));
    }

    private final List e(LayoutHelper layoutHelper0, boolean z) {
        List list0 = new ArrayList();
        Layout layout0 = layoutHelper0.d();
        int v = layoutHelper0.d().getLineCount();
        for(int v1 = 0; v1 < v; ++v1) {
            list0.add(new Segment(layout0.getLineStart(v1), layout0.getLineEnd(v1), (z ? ((int)(((float)Math.ceil(layout0.getLineLeft(v1))))) : 0), layout0.getLineTop(v1), (z ? ((int)(((float)Math.ceil(layout0.getLineRight(v1))))) : layout0.getWidth()), layout0.getLineBottom(v1)));
        }
        return list0;
    }

    private final List f(LayoutHelper layoutHelper0) {
        List list0 = new ArrayList();
        Layout layout0 = layoutHelper0.d();
        int v = layoutHelper0.e();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = layoutHelper0.i(v1);
            int v3 = layoutHelper0.f(v1);
            int v4 = LayoutCompatKt.a(layout0, v2, false);
            int v5 = LayoutCompatKt.a(layout0, v3, true);
            list0.add(new Segment(v2, v3, 0, layout0.getLineTop(v4), layout0.getWidth(), layout0.getLineBottom(v5)));
        }
        return list0;
    }

    private final List g(LayoutHelper layoutHelper0, boolean z) {
        int v10;
        Layout layout0 = layoutHelper0.d();
        int v = (int)(((float)Math.ceil(layout0.getPaint().measureText(" "))));
        List list0 = this.b(layoutHelper0, SegmentType.d);
        switch(list0.size()) {
            case 0: 
            case 1: {
                return u.H();
            }
            default: {
                List list1 = new ArrayList();
                Object object0 = list0.get(0);
                int v1 = u.J(list0);
                int v2 = 0;
                for(boolean z1 = true; v2 < v1; z1 = true) {
                    ++v2;
                    Object object1 = list0.get(v2);
                    int v3 = ((Number)object1).intValue();
                    int v4 = ((Number)object0).intValue();
                    int v5 = LayoutCompatKt.a(layout0, v4, false);
                    boolean z2 = layout0.getParagraphDirection(v5) == -1;
                    boolean z3 = layout0.isRtlCharAt(v4);
                    if(z3 != z2) {
                        z1 = false;
                    }
                    int v6 = (int)(((float)Math.ceil(layoutHelper0.c(v4, z1, false))));
                    int v7 = (int)(((float)Math.ceil(layoutHelper0.c(v3, z3 == z2, true))));
                    int v8 = Math.min(v6, v7);
                    int v9 = Math.max(v6, v7);
                    if(!z || v3 == 0 || layout0.getText().charAt(v3 - 1) != 0x20) {
                        v10 = v5;
                    }
                    else {
                        v10 = v5;
                        if(layout0.getLineEnd(v10) != v3) {
                            if(z3) {
                                v8 += v;
                            }
                            else {
                                v9 -= v;
                            }
                        }
                    }
                    list1.add(new Segment(v4, v3, v8, layout0.getLineTop(v10), v9, layout0.getLineBottom(v10)));
                    object0 = object1;
                }
                return list1;
            }
        }
    }

    @l
    public final List h(@l LayoutHelper layoutHelper0, @l SegmentType segmentType0, boolean z) {
        L.p(layoutHelper0, "layoutHelper");
        L.p(segmentType0, "segmentType");
        switch(WhenMappings.a[segmentType0.ordinal()]) {
            case 1: {
                return this.d(layoutHelper0);
            }
            case 2: {
                return this.f(layoutHelper0);
            }
            case 3: {
                return this.e(layoutHelper0, z);
            }
            case 4: {
                return this.g(layoutHelper0, z);
            }
            case 5: {
                return this.c(layoutHelper0, z);
            }
            default: {
                throw new J();
            }
        }
    }

    private final List i(CharSequence charSequence0, BreakIterator breakIterator0) {
        CharSequenceCharacterIterator charSequenceCharacterIterator0 = new CharSequenceCharacterIterator(charSequence0, 0, charSequence0.length());
        List list0 = u.S(new Integer[]{0});
        breakIterator0.setText(charSequenceCharacterIterator0);
        while(breakIterator0.next() != -1) {
            list0.add(breakIterator0.current());
        }
        return list0;
    }
}

