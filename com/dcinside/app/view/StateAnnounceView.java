package com.dcinside.app.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import k0.d;

public class StateAnnounceView extends FrameLayout {
    public interface a {
        void a();
    }

    private ProgressBar a;
    private View b;
    private TextView c;
    private a d;

    public StateAnnounceView(Context context0) {
        super(context0);
        this.b(context0);
    }

    public StateAnnounceView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.b(context0);
    }

    public StateAnnounceView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.b(context0);
    }

    @TargetApi(21)
    public StateAnnounceView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.b(context0);
    }

    private void b(Context context0) {
        View.inflate(context0, 0x7F0E0287, this);  // layout:view_state_announce
        this.a = (ProgressBar)this.findViewById(0x7F0B0F4D);  // id:state_announce_progress
        View view0 = this.findViewById(0x7F0B0F4B);  // id:state_announce_done
        this.b = view0;
        view0.setOnClickListener((View view0) -> this.d());
        this.c = (TextView)this.findViewById(0x7F0B0F4C);  // id:state_announce_message
        this.setClickable(true);
    }

    // 检测为 Lambda 实现
    private void c(View view0) [...]

    private void d() {
        a stateAnnounceView$a0 = this.d;
        if(stateAnnounceView$a0 != null) {
            stateAnnounceView$a0.a();
        }
    }

    public void e(d d0) {
        int v = d0.d();
        if(v != 2) {
            switch(v) {
                case 4: {
                    this.setVisibility(0);
                    this.a.setVisibility(8);
                    this.b.setVisibility(0);
                    this.c.setText(d0.c().getMessage());
                    return;
                }
                case 8: {
                    this.setVisibility(8);
                    return;
                }
                default: {
                    return;
                }
            }
        }
        this.setVisibility(0);
        this.a.setVisibility(0);
        this.b.setVisibility(8);
    }

    public void setOnRetryListener(a stateAnnounceView$a0) {
        this.d = stateAnnounceView$a0;
    }
}

