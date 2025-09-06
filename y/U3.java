package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class u3 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final FrameLayout c;
    @NonNull
    public final TextView d;
    @NonNull
    public final TextView e;
    @NonNull
    public final TextView f;
    @NonNull
    public final View g;
    @NonNull
    public final View h;
    @NonNull
    public final TextView i;
    @NonNull
    public final AppCompatImageView j;

    private u3(@NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView0, @NonNull FrameLayout frameLayout0, @NonNull TextView textView1, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull View view0, @NonNull View view1, @NonNull TextView textView4, @NonNull AppCompatImageView appCompatImageView0) {
        this.a = constraintLayout0;
        this.b = textView0;
        this.c = frameLayout0;
        this.d = textView1;
        this.e = textView2;
        this.f = textView3;
        this.g = view0;
        this.h = view1;
        this.i = textView4;
        this.j = appCompatImageView0;
    }

    @NonNull
    public static u3 a(@NonNull View view0) {
        int v = 0x7F0B108F;  // id:voice_archive_item_date
        View view1 = ViewBindings.a(view0, 0x7F0B108F);  // id:voice_archive_item_date
        if(((TextView)view1) != null) {
            v = 0x7F0B1090;  // id:voice_archive_item_delete
            View view2 = ViewBindings.a(view0, 0x7F0B1090);  // id:voice_archive_item_delete
            if(((FrameLayout)view2) != null) {
                v = 0x7F0B1091;  // id:voice_archive_item_gallery
                View view3 = ViewBindings.a(view0, 0x7F0B1091);  // id:voice_archive_item_gallery
                if(((TextView)view3) != null) {
                    v = 0x7F0B1092;  // id:voice_archive_item_memo
                    View view4 = ViewBindings.a(view0, 0x7F0B1092);  // id:voice_archive_item_memo
                    if(((TextView)view4) != null) {
                        v = 0x7F0B1093;  // id:voice_archive_item_name
                        View view5 = ViewBindings.a(view0, 0x7F0B1093);  // id:voice_archive_item_name
                        if(((TextView)view5) != null) {
                            v = 0x7F0B1094;  // id:voice_archive_item_sub_div0
                            View view6 = ViewBindings.a(view0, 0x7F0B1094);  // id:voice_archive_item_sub_div0
                            if(view6 != null) {
                                v = 0x7F0B1095;  // id:voice_archive_item_sub_div1
                                View view7 = ViewBindings.a(view0, 0x7F0B1095);  // id:voice_archive_item_sub_div1
                                if(view7 != null) {
                                    v = 0x7F0B1096;  // id:voice_archive_item_subject
                                    View view8 = ViewBindings.a(view0, 0x7F0B1096);  // id:voice_archive_item_subject
                                    if(((TextView)view8) != null) {
                                        v = 0x7F0B1097;  // id:voice_archive_prev_play
                                        View view9 = ViewBindings.a(view0, 0x7F0B1097);  // id:voice_archive_prev_play
                                        if(((AppCompatImageView)view9) != null) {
                                            return new u3(((ConstraintLayout)view0), ((TextView)view1), ((FrameLayout)view2), ((TextView)view3), ((TextView)view4), ((TextView)view5), view6, view7, ((TextView)view8), ((AppCompatImageView)view9));
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
    public static u3 c(@NonNull LayoutInflater layoutInflater0) {
        return u3.d(layoutInflater0, null, false);
    }

    @NonNull
    public static u3 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E019C, viewGroup0, false);  // layout:view_archive_voice_item
        if(z) {
            viewGroup0.addView(view0);
        }
        return u3.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

