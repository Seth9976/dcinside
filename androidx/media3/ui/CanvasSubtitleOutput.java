package androidx.media3.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue.Builder;
import androidx.media3.common.text.Cue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class CanvasSubtitleOutput extends View implements Output {
    private final List a;
    private List b;
    private int c;
    private float d;
    private CaptionStyleCompat e;
    private float f;

    public CanvasSubtitleOutput(Context context0) {
        this(context0, null);
    }

    public CanvasSubtitleOutput(Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = new ArrayList();
        this.b = Collections.emptyList();
        this.c = 0;
        this.d = 0.0533f;
        this.e = CaptionStyleCompat.m;
        this.f = 0.08f;
    }

    @Override  // androidx.media3.ui.SubtitleView$Output
    public void a(List list0, CaptionStyleCompat captionStyleCompat0, float f, int v, float f1) {
        this.b = list0;
        this.e = captionStyleCompat0;
        this.d = f;
        this.c = v;
        this.f = f1;
        while(this.a.size() < list0.size()) {
            SubtitlePainter subtitlePainter0 = new SubtitlePainter(this.getContext());
            this.a.add(subtitlePainter0);
        }
        this.invalidate();
    }

    private static Cue b(Cue cue0) {
        Builder cue$Builder0 = cue0.a().w(-3.402823E+38f).x(0x80000000).B(null);
        if(cue0.f == 0) {
            cue$Builder0.t(1.0f - cue0.e, 0);
        }
        else {
            cue$Builder0.t(-cue0.e - 1.0f, 1);
        }
        switch(cue0.g) {
            case 0: {
                cue$Builder0.u(2);
                return cue$Builder0.a();
            }
            case 2: {
                cue$Builder0.u(0);
                return cue$Builder0.a();
            }
            default: {
                return cue$Builder0.a();
            }
        }
    }

    @Override  // android.view.View
    public void dispatchDraw(Canvas canvas0) {
        List list0 = this.b;
        if(list0.isEmpty()) {
            return;
        }
        int v = this.getHeight();
        int v1 = this.getPaddingLeft();
        int v2 = this.getPaddingTop();
        int v3 = this.getWidth() - this.getPaddingRight();
        int v4 = v - this.getPaddingBottom();
        if(v4 > v2 && v3 > v1) {
            int v5 = v4 - v2;
            float f = SubtitleViewUtils.h(this.c, this.d, v, v5);
            if(f <= 0.0f) {
                return;
            }
            int v6 = list0.size();
            for(int v7 = 0; v7 < v6; ++v7) {
                Cue cue0 = (Cue)list0.get(v7);
                if(cue0.p != 0x80000000) {
                    cue0 = CanvasSubtitleOutput.b(cue0);
                }
                ((SubtitlePainter)this.a.get(v7)).b(cue0, this.e, f, SubtitleViewUtils.h(cue0.n, cue0.o, v, v5), this.f, canvas0, v1, v2, v3, v4);
            }
        }
    }
}

