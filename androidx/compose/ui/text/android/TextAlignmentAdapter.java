package androidx.compose.ui.text.android;

import android.text.Layout.Alignment;
import kotlin.jvm.internal.L;
import y4.l;

public final class TextAlignmentAdapter {
    @l
    public static final TextAlignmentAdapter a;
    @l
    private static final Layout.Alignment b;
    @l
    private static final Layout.Alignment c;

    static {
        TextAlignmentAdapter.a = new TextAlignmentAdapter();
        Layout.Alignment[] arr_layout$Alignment = Layout.Alignment.values();
        Layout.Alignment layout$Alignment0 = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment layout$Alignment1 = layout$Alignment0;
        for(int v = 0; v < arr_layout$Alignment.length; ++v) {
            Layout.Alignment layout$Alignment2 = arr_layout$Alignment[v];
            if(L.g(layout$Alignment2.name(), "ALIGN_LEFT")) {
                layout$Alignment0 = layout$Alignment2;
            }
            else if(L.g(layout$Alignment2.name(), "ALIGN_RIGHT")) {
                layout$Alignment1 = layout$Alignment2;
            }
        }
        TextAlignmentAdapter.b = layout$Alignment0;
        TextAlignmentAdapter.c = layout$Alignment1;
    }

    @l
    public final Layout.Alignment a(int v) {
        switch(v) {
            case 0: {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            case 1: {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            case 2: {
                return Layout.Alignment.ALIGN_CENTER;
            }
            case 3: {
                return TextAlignmentAdapter.b;
            }
            case 4: {
                return TextAlignmentAdapter.c;
            }
            default: {
                return Layout.Alignment.ALIGN_NORMAL;
            }
        }
    }
}

