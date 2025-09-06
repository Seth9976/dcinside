package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DcToolbar;

public final class a implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final CheckBox b;
    @NonNull
    public final TextView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final View e;
    @NonNull
    public final TextView f;
    @NonNull
    public final ConstraintLayout g;
    @NonNull
    public final TextView h;
    @NonNull
    public final RecyclerView i;
    @NonNull
    public final DcToolbar j;

    private a(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull CheckBox checkBox0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull View view0, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView3, @NonNull RecyclerView recyclerView0, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = checkBox0;
        this.c = textView0;
        this.d = textView1;
        this.e = view0;
        this.f = textView2;
        this.g = constraintLayout0;
        this.h = textView3;
        this.i = recyclerView0;
        this.j = dcToolbar0;
    }

    @NonNull
    public static a a(@NonNull View view0) {
        int v = 0x7F0B00CE;  // id:ai_image_recent_check_all
        View view1 = ViewBindings.a(view0, 0x7F0B00CE);  // id:ai_image_recent_check_all
        if(((CheckBox)view1) != null) {
            v = 0x7F0B00CF;  // id:ai_image_recent_check_all_title
            View view2 = ViewBindings.a(view0, 0x7F0B00CF);  // id:ai_image_recent_check_all_title
            if(((TextView)view2) != null) {
                v = 0x7F0B00D1;  // id:ai_image_recent_delete_all_text
                View view3 = ViewBindings.a(view0, 0x7F0B00D1);  // id:ai_image_recent_delete_all_text
                if(((TextView)view3) != null) {
                    v = 0x7F0B00D3;  // id:ai_image_recent_div
                    View view4 = ViewBindings.a(view0, 0x7F0B00D3);  // id:ai_image_recent_div
                    if(view4 != null) {
                        v = 0x7F0B00D4;  // id:ai_image_recent_edit
                        View view5 = ViewBindings.a(view0, 0x7F0B00D4);  // id:ai_image_recent_edit
                        if(((TextView)view5) != null) {
                            v = 0x7F0B00D5;  // id:ai_image_recent_edit_wrap
                            View view6 = ViewBindings.a(view0, 0x7F0B00D5);  // id:ai_image_recent_edit_wrap
                            if(((ConstraintLayout)view6) != null) {
                                v = 0x7F0B00D6;  // id:ai_image_recent_empty
                                View view7 = ViewBindings.a(view0, 0x7F0B00D6);  // id:ai_image_recent_empty
                                if(((TextView)view7) != null) {
                                    v = 0x7F0B00DD;  // id:ai_image_recent_recycler
                                    View view8 = ViewBindings.a(view0, 0x7F0B00DD);  // id:ai_image_recent_recycler
                                    if(((RecyclerView)view8) != null) {
                                        v = 0x7F0B00E0;  // id:ai_image_recent_toolbar
                                        View view9 = ViewBindings.a(view0, 0x7F0B00E0);  // id:ai_image_recent_toolbar
                                        if(((DcToolbar)view9) != null) {
                                            return new a(((CoordinatorLayout)view0), ((CheckBox)view1), ((TextView)view2), ((TextView)view3), view4, ((TextView)view5), ((ConstraintLayout)view6), ((TextView)view7), ((RecyclerView)view8), ((DcToolbar)view9));
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
    public CoordinatorLayout b() {
        return this.a;
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater0) {
        return a.d(layoutInflater0, null, false);
    }

    @NonNull
    public static a d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E001C, viewGroup0, false);  // layout:activity_ai_image_history
        if(z) {
            viewGroup0.addView(view0);
        }
        return a.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

