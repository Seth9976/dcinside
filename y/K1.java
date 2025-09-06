package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class k1 implements ViewBinding {
    @NonNull
    private final LinearLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final TextView c;
    @NonNull
    public final View d;
    @NonNull
    public final ImageView e;
    @NonNull
    public final TextView f;
    @NonNull
    public final LinearLayout g;
    @NonNull
    public final TextView h;
    @NonNull
    public final TextView i;
    @NonNull
    public final TextView j;

    private k1(@NonNull LinearLayout linearLayout0, @NonNull ImageView imageView0, @NonNull TextView textView0, @NonNull View view0, @NonNull ImageView imageView1, @NonNull TextView textView1, @NonNull LinearLayout linearLayout1, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.a = linearLayout0;
        this.b = imageView0;
        this.c = textView0;
        this.d = view0;
        this.e = imageView1;
        this.f = textView1;
        this.g = linearLayout1;
        this.h = textView2;
        this.i = textView3;
        this.j = textView4;
    }

    @NonNull
    public static k1 a(@NonNull View view0) {
        int v = 0x7F0B05D8;  // id:image_note_guide_close
        View view1 = ViewBindings.a(view0, 0x7F0B05D8);  // id:image_note_guide_close
        if(((ImageView)view1) != null) {
            v = 0x7F0B05D9;  // id:image_note_guide_desc
            View view2 = ViewBindings.a(view0, 0x7F0B05D9);  // id:image_note_guide_desc
            if(((TextView)view2) != null) {
                v = 0x7F0B05DA;  // id:image_note_guide_divider
                View view3 = ViewBindings.a(view0, 0x7F0B05DA);  // id:image_note_guide_divider
                if(view3 != null) {
                    v = 0x7F0B05DB;  // id:image_note_guide_img
                    View view4 = ViewBindings.a(view0, 0x7F0B05DB);  // id:image_note_guide_img
                    if(((ImageView)view4) != null) {
                        v = 0x7F0B05DC;  // id:image_note_guide_setting
                        View view5 = ViewBindings.a(view0, 0x7F0B05DC);  // id:image_note_guide_setting
                        if(((TextView)view5) != null) {
                            v = 0x7F0B05DD;  // id:image_note_guide_setting_content
                            View view6 = ViewBindings.a(view0, 0x7F0B05DD);  // id:image_note_guide_setting_content
                            if(((LinearLayout)view6) != null) {
                                v = 0x7F0B05DE;  // id:image_note_guide_sub_title
                                View view7 = ViewBindings.a(view0, 0x7F0B05DE);  // id:image_note_guide_sub_title
                                if(((TextView)view7) != null) {
                                    v = 0x7F0B05DF;  // id:image_note_guide_title
                                    View view8 = ViewBindings.a(view0, 0x7F0B05DF);  // id:image_note_guide_title
                                    if(((TextView)view8) != null) {
                                        v = 0x7F0B0F7D;  // id:textView
                                        View view9 = ViewBindings.a(view0, 0x7F0B0F7D);  // id:textView
                                        if(((TextView)view9) != null) {
                                            return new k1(((LinearLayout)view0), ((ImageView)view1), ((TextView)view2), view3, ((ImageView)view4), ((TextView)view5), ((LinearLayout)view6), ((TextView)view7), ((TextView)view8), ((TextView)view9));
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
    public static k1 c(@NonNull LayoutInflater layoutInflater0) {
        return k1.d(layoutInflater0, null, false);
    }

    @NonNull
    public static k1 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E00CA, viewGroup0, false);  // layout:dialog_fragment_image_note_guide
        if(z) {
            viewGroup0.addView(view0);
        }
        return k1.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

