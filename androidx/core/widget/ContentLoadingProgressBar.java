package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.UiThread;

public class ContentLoadingProgressBar extends ProgressBar {
    long a;
    boolean b;
    boolean c;
    boolean d;
    private final Runnable e;
    private final Runnable f;
    private static final int g = 500;
    private static final int h = 500;

    public ContentLoadingProgressBar(Context context0) {
        this(context0, null);
    }

    public ContentLoadingProgressBar(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0, 0);
        this.a = -1L;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = () -> {
            this.b = false;
            this.a = -1L;
            this.setVisibility(8);
        };
        this.f = () -> {
            this.c = false;
            if(!this.d) {
                this.a = System.currentTimeMillis();
                this.setVisibility(0);
            }
        };
    }

    public void e() {
        this.post(() -> {
            this.d = true;
            this.removeCallbacks(this.f);
            this.c = false;
            long v = System.currentTimeMillis() - this.a;
            if(v >= 500L || this.a == -1L) {
                this.setVisibility(8);
            }
            else if(!this.b) {
                this.postDelayed(this.e, 500L - v);
                this.b = true;
            }
        });
    }

    // 检测为 Lambda 实现
    @UiThread
    private void f() [...]

    // 检测为 Lambda 实现
    private void g() [...]

    // 检测为 Lambda 实现
    private void h() [...]

    private void i() {
        this.removeCallbacks(this.e);
        this.removeCallbacks(this.f);
    }

    public void j() {
        this.post(() -> {
            this.a = -1L;
            this.d = false;
            this.removeCallbacks(this.e);
            this.b = false;
            if(!this.c) {
                this.postDelayed(this.f, 500L);
                this.c = true;
            }
        });
    }

    // 检测为 Lambda 实现
    @UiThread
    private void k() [...]

    @Override  // android.widget.ProgressBar
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i();
    }

    @Override  // android.widget.ProgressBar
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i();
    }
}

