package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class z8 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final View b;
    @NonNull
    public final View c;
    @NonNull
    public final TextView d;
    @NonNull
    public final TextView e;
    @NonNull
    public final TextView f;
    @NonNull
    public final TextView g;
    @NonNull
    public final TextView h;
    @NonNull
    public final ImageView i;
    @NonNull
    public final ConstraintLayout j;
    @NonNull
    public final TextView k;
    @NonNull
    public final HorizontalScrollView l;

    private z8(@NonNull ConstraintLayout constraintLayout0, @NonNull View view0, @NonNull View view1, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull ImageView imageView0, @NonNull ConstraintLayout constraintLayout1, @NonNull TextView textView5, @NonNull HorizontalScrollView horizontalScrollView0) {
        this.a = constraintLayout0;
        this.b = view0;
        this.c = view1;
        this.d = textView0;
        this.e = textView1;
        this.f = textView2;
        this.g = textView3;
        this.h = textView4;
        this.i = imageView0;
        this.j = constraintLayout1;
        this.k = textView5;
        this.l = horizontalScrollView0;
    }

    @NonNull
    public static z8 a(@NonNull View view0) {
        int v = 0x7F0B0DD8;  // id:search_divide_bottom
        View view1 = ViewBindings.a(view0, 0x7F0B0DD8);  // id:search_divide_bottom
        if(view1 != null) {
            v = 0x7F0B0DD9;  // id:search_divide_top
            View view2 = ViewBindings.a(view0, 0x7F0B0DD9);  // id:search_divide_top
            if(view2 != null) {
                v = 0x7F0B0DF7;  // id:section_gallery_tab_major
                View view3 = ViewBindings.a(view0, 0x7F0B0DF7);  // id:section_gallery_tab_major
                if(((TextView)view3) != null) {
                    v = 0x7F0B0DF8;  // id:section_gallery_tab_mini
                    View view4 = ViewBindings.a(view0, 0x7F0B0DF8);  // id:section_gallery_tab_mini
                    if(((TextView)view4) != null) {
                        v = 0x7F0B0DF9;  // id:section_gallery_tab_minor
                        View view5 = ViewBindings.a(view0, 0x7F0B0DF9);  // id:section_gallery_tab_minor
                        if(((TextView)view5) != null) {
                            v = 0x7F0B0DFA;  // id:section_gallery_tab_person
                            View view6 = ViewBindings.a(view0, 0x7F0B0DFA);  // id:section_gallery_tab_person
                            if(((TextView)view6) != null) {
                                v = 0x7F0B0DFB;  // id:section_gallery_tab_sort
                                View view7 = ViewBindings.a(view0, 0x7F0B0DFB);  // id:section_gallery_tab_sort
                                if(((TextView)view7) != null) {
                                    v = 0x7F0B0DFC;  // id:section_gallery_tab_sort_icon
                                    View view8 = ViewBindings.a(view0, 0x7F0B0DFC);  // id:section_gallery_tab_sort_icon
                                    if(((ImageView)view8) != null) {
                                        v = 0x7F0B0DFD;  // id:section_gallery_tab_sort_wrap
                                        View view9 = ViewBindings.a(view0, 0x7F0B0DFD);  // id:section_gallery_tab_sort_wrap
                                        if(((ConstraintLayout)view9) != null) {
                                            v = 0x7F0B0DFE;  // id:section_gallery_tab_total
                                            View view10 = ViewBindings.a(view0, 0x7F0B0DFE);  // id:section_gallery_tab_total
                                            if(((TextView)view10) != null) {
                                                v = 0x7F0B0DFF;  // id:section_gallery_tab_wrap
                                                View view11 = ViewBindings.a(view0, 0x7F0B0DFF);  // id:section_gallery_tab_wrap
                                                if(((HorizontalScrollView)view11) != null) {
                                                    return new z8(((ConstraintLayout)view0), view1, view2, ((TextView)view3), ((TextView)view4), ((TextView)view5), ((TextView)view6), ((TextView)view7), ((ImageView)view8), ((ConstraintLayout)view9), ((TextView)view10), ((HorizontalScrollView)view11));
                                                }
                                            }
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
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static z8 c(@NonNull LayoutInflater layoutInflater0) {
        return z8.d(layoutInflater0, null, false);
    }

    @NonNull
    public static z8 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E02A5, viewGroup0, false);  // layout:view_total_search_gallery_tab_header
        if(z) {
            viewGroup0.addView(view0);
        }
        return z8.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

