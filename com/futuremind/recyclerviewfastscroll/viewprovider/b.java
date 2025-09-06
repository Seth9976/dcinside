package com.futuremind.recyclerviewfastscroll.viewprovider;

import android.graphics.drawable.InsetDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.futuremind.recyclerfastscroll.R.dimen;
import com.futuremind.recyclerfastscroll.R.drawable;
import com.futuremind.recyclerfastscroll.R.layout;

public class b extends c {
    protected View d;
    protected View e;

    // 去混淆评级： 低(20)
    @Override  // com.futuremind.recyclerviewfastscroll.viewprovider.c
    public int b() {
        return this.e().m() ? ((int)(((float)this.e.getHeight()) / 2.0f - ((float)this.d.getHeight()))) : ((int)(((float)this.e.getWidth()) / 2.0f - ((float)this.d.getWidth())));
    }

    @Override  // com.futuremind.recyclerviewfastscroll.viewprovider.c
    protected d j() {
        return new a(new com.futuremind.recyclerviewfastscroll.viewprovider.e.c(this.d).d(1.0f).e(1.0f).a());
    }

    @Override  // com.futuremind.recyclerviewfastscroll.viewprovider.c
    public TextView k() {
        return (TextView)this.d;
    }

    @Override  // com.futuremind.recyclerviewfastscroll.viewprovider.c
    public View l(ViewGroup viewGroup0) {
        View view0 = LayoutInflater.from(this.c()).inflate(layout.fastscroll__default_bubble, viewGroup0, false);
        this.d = view0;
        return view0;
    }

    @Override  // com.futuremind.recyclerviewfastscroll.viewprovider.c
    protected d m() {
        return null;
    }

    @Override  // com.futuremind.recyclerviewfastscroll.viewprovider.c
    public View n(ViewGroup viewGroup0) {
        this.e = new View(this.c());
        int v = this.e().m() ? 0 : this.c().getResources().getDimensionPixelSize(dimen.fastscroll__handle_inset);
        int v1 = this.e().m() ? this.c().getResources().getDimensionPixelSize(dimen.fastscroll__handle_inset) : 0;
        InsetDrawable insetDrawable0 = new InsetDrawable(ContextCompat.getDrawable(this.c(), drawable.fastscroll__default_handle), v1, v, v1, v);
        com.futuremind.recyclerviewfastscroll.c.d(this.e, insetDrawable0);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(this.c().getResources().getDimensionPixelSize((this.e().m() ? dimen.fastscroll__handle_clickable_width : dimen.fastscroll__handle_height)), this.c().getResources().getDimensionPixelSize((this.e().m() ? dimen.fastscroll__handle_height : dimen.fastscroll__handle_clickable_width)));
        this.e.setLayoutParams(viewGroup$LayoutParams0);
        return this.e;
    }
}

