package com.dcinside.rich.size;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.SeekBar;
import android.widget.TextView;
import com.dcinside.rich.R.id;
import com.dcinside.rich.R.layout;
import com.dcinside.rich.e;

public class b extends PopupWindow {
    private TextView a;
    private SeekBar b;
    private a c;
    private static final int d = 12;

    public b(Context context0, a a0) {
        this.c = a0;
        View view0 = LayoutInflater.from(context0).inflate(layout.rich_size_picker, null);
        this.setContentView(view0);
        this.a = (TextView)view0.findViewById(id.rich_size_txt);
        this.b = (SeekBar)view0.findViewById(id.rich_size_seek);
        int[] arr_v = e.c(context0);
        int v = e.b(context0, 100);
        this.setWidth(arr_v[0]);
        this.setHeight(v);
        this.setBackgroundDrawable(new ColorDrawable(0));
        this.setOutsideTouchable(true);
        this.d();
    }

    private void b(int v) {
        this.a.setTextSize(2, ((float)(v + 12)));
        this.a.setText(String.valueOf(v + 12));
        a a0 = this.c;
        if(a0 != null) {
            a0.f(v + 12);
        }
    }

    public void c(int v) {
        this.b.setProgress(v - 12);
    }

    private void d() {
        class com.dcinside.rich.size.b.a implements SeekBar.OnSeekBarChangeListener {
            final b a;

            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar0, int v, boolean z) {
                b.this.b(v);
            }

            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar0) {
            }

            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar0) {
            }
        }

        this.b.setOnSeekBarChangeListener(new com.dcinside.rich.size.b.a(this));
    }
}

