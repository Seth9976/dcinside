package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R.attr;

public class AppCompatSeekBar extends SeekBar {
    private final AppCompatSeekBarHelper a;

    public AppCompatSeekBar(@NonNull Context context0) {
        this(context0, null);
    }

    public AppCompatSeekBar(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.seekBarStyle);
    }

    public AppCompatSeekBar(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        ThemeUtils.a(this, this.getContext());
        AppCompatSeekBarHelper appCompatSeekBarHelper0 = new AppCompatSeekBarHelper(this);
        this.a = appCompatSeekBarHelper0;
        appCompatSeekBarHelper0.c(attributeSet0, v);
    }

    @Override  // android.widget.AbsSeekBar
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.h();
    }

    @Override  // android.widget.AbsSeekBar
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.a.l();
    }

    @Override  // android.widget.AbsSeekBar
    protected void onDraw(Canvas canvas0) {
        synchronized(this) {
            super.onDraw(canvas0);
            this.a.g(canvas0);
        }
    }
}

