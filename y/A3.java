package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class a3 implements ViewBinding {
    @NonNull
    private final LinearLayout a;
    @NonNull
    public final AppCompatImageButton b;
    @NonNull
    public final LinearLayout c;
    @NonNull
    public final AppCompatImageButton d;
    @NonNull
    public final View e;
    @NonNull
    public final AppCompatImageButton f;
    @NonNull
    public final AppCompatImageButton g;
    @NonNull
    public final TextView h;
    @NonNull
    public final RelativeLayout i;
    @NonNull
    public final TextView j;

    private a3(@NonNull LinearLayout linearLayout0, @NonNull AppCompatImageButton appCompatImageButton0, @NonNull LinearLayout linearLayout1, @NonNull AppCompatImageButton appCompatImageButton1, @NonNull View view0, @NonNull AppCompatImageButton appCompatImageButton2, @NonNull AppCompatImageButton appCompatImageButton3, @NonNull TextView textView0, @NonNull RelativeLayout relativeLayout0, @NonNull TextView textView1) {
        this.a = linearLayout0;
        this.b = appCompatImageButton0;
        this.c = linearLayout1;
        this.d = appCompatImageButton1;
        this.e = view0;
        this.f = appCompatImageButton2;
        this.g = appCompatImageButton3;
        this.h = textView0;
        this.i = relativeLayout0;
        this.j = textView1;
    }

    @NonNull
    public static a3 a(@NonNull View view0) {
        int v = 0x7F0B0182;  // id:back
        View view1 = ViewBindings.a(view0, 0x7F0B0182);  // id:back
        if(((AppCompatImageButton)view1) != null) {
            v = 0x7F0B02A2;  // id:centerLayout
            View view2 = ViewBindings.a(view0, 0x7F0B02A2);  // id:centerLayout
            if(((LinearLayout)view2) != null) {
                v = 0x7F0B02BD;  // id:close
                View view3 = ViewBindings.a(view0, 0x7F0B02BD);  // id:close
                if(((AppCompatImageButton)view3) != null) {
                    v = 0x7F0B042F;  // id:divider
                    View view4 = ViewBindings.a(view0, 0x7F0B042F);  // id:divider
                    if(view4 != null) {
                        v = 0x7F0B04BF;  // id:forward
                        View view5 = ViewBindings.a(view0, 0x7F0B04BF);  // id:forward
                        if(((AppCompatImageButton)view5) != null) {
                            v = 0x7F0B087F;  // id:more
                            View view6 = ViewBindings.a(view0, 0x7F0B087F);  // id:more
                            if(((AppCompatImageButton)view6) != null) {
                                v = 0x7F0B0F8E;  // id:title
                                View view7 = ViewBindings.a(view0, 0x7F0B0F8E);  // id:title
                                if(((TextView)view7) != null) {
                                    v = 0x7F0B0F93;  // id:toolbarLayout
                                    View view8 = ViewBindings.a(view0, 0x7F0B0F93);  // id:toolbarLayout
                                    if(((RelativeLayout)view8) != null) {
                                        v = 0x7F0B0FF7;  // id:url
                                        View view9 = ViewBindings.a(view0, 0x7F0B0FF7);  // id:url
                                        if(((TextView)view9) != null) {
                                            return new a3(((LinearLayout)view0), ((AppCompatImageButton)view1), ((LinearLayout)view2), ((AppCompatImageButton)view3), view4, ((AppCompatImageButton)view5), ((AppCompatImageButton)view6), ((TextView)view7), ((RelativeLayout)view8), ((TextView)view9));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public LinearLayout b() {
        return this.a;
    }

    @NonNull
    public static a3 c(@NonNull LayoutInflater layoutInflater0) {
        return a3.d(layoutInflater0, null, false);
    }

    @NonNull
    public static a3 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0187, viewGroup0, false);  // layout:toolbar_content
        if(z) {
            viewGroup0.addView(view0);
        }
        return a3.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

