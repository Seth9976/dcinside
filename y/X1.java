package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class x1 implements ViewBinding {
    @NonNull
    private final LinearLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final TextView c;
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
    public final TextView i;

    private x1(@NonNull LinearLayout linearLayout0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.a = linearLayout0;
        this.b = textView0;
        this.c = textView1;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.g = textView5;
        this.h = textView6;
        this.i = textView7;
    }

    @NonNull
    public static x1 a(@NonNull View view0) {
        int v = 0x7F0B0F26;  // id:sort_type_modified_asc
        View view1 = ViewBindings.a(view0, 0x7F0B0F26);  // id:sort_type_modified_asc
        if(((TextView)view1) != null) {
            v = 0x7F0B0F27;  // id:sort_type_modified_desc
            View view2 = ViewBindings.a(view0, 0x7F0B0F27);  // id:sort_type_modified_desc
            if(((TextView)view2) != null) {
                v = 0x7F0B0F28;  // id:sort_type_name_asc
                View view3 = ViewBindings.a(view0, 0x7F0B0F28);  // id:sort_type_name_asc
                if(((TextView)view3) != null) {
                    v = 0x7F0B0F29;  // id:sort_type_name_desc
                    View view4 = ViewBindings.a(view0, 0x7F0B0F29);  // id:sort_type_name_desc
                    if(((TextView)view4) != null) {
                        v = 0x7F0B0F2A;  // id:sort_type_size_asc
                        View view5 = ViewBindings.a(view0, 0x7F0B0F2A);  // id:sort_type_size_asc
                        if(((TextView)view5) != null) {
                            v = 0x7F0B0F2B;  // id:sort_type_size_desc
                            View view6 = ViewBindings.a(view0, 0x7F0B0F2B);  // id:sort_type_size_desc
                            if(((TextView)view6) != null) {
                                v = 0x7F0B0F2C;  // id:sort_type_taken_asc
                                View view7 = ViewBindings.a(view0, 0x7F0B0F2C);  // id:sort_type_taken_asc
                                if(((TextView)view7) != null) {
                                    v = 0x7F0B0F2D;  // id:sort_type_taken_desc
                                    View view8 = ViewBindings.a(view0, 0x7F0B0F2D);  // id:sort_type_taken_desc
                                    if(((TextView)view8) != null) {
                                        return new x1(((LinearLayout)view0), ((TextView)view1), ((TextView)view2), ((TextView)view3), ((TextView)view4), ((TextView)view5), ((TextView)view6), ((TextView)view7), ((TextView)view8));
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
    public static x1 c(@NonNull LayoutInflater layoutInflater0) {
        return x1.d(layoutInflater0, null, false);
    }

    @NonNull
    public static x1 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E00D7, viewGroup0, false);  // layout:dialog_fragment_sort_types
        if(z) {
            viewGroup0.addView(view0);
        }
        return x1.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

