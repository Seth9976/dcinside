package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DcToolbar;

public final class c implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final DcToolbar b;
    @NonNull
    public final RecyclerView c;
    @NonNull
    public final FrameLayout d;
    @NonNull
    public final AppCompatCheckBox e;
    @NonNull
    public final FrameLayout f;
    @NonNull
    public final FrameLayout g;

    private c(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull DcToolbar dcToolbar0, @NonNull RecyclerView recyclerView0, @NonNull FrameLayout frameLayout0, @NonNull AppCompatCheckBox appCompatCheckBox0, @NonNull FrameLayout frameLayout1, @NonNull FrameLayout frameLayout2) {
        this.a = coordinatorLayout0;
        this.b = dcToolbar0;
        this.c = recyclerView0;
        this.d = frameLayout0;
        this.e = appCompatCheckBox0;
        this.f = frameLayout1;
        this.g = frameLayout2;
    }

    @NonNull
    public static c a(@NonNull View view0) {
        int v = 0x7F0B0136;  // id:archive_edit_toolbar
        View view1 = ViewBindings.a(view0, 0x7F0B0136);  // id:archive_edit_toolbar
        if(((DcToolbar)view1) != null) {
            v = 0x7F0B0148;  // id:archive_recycler
            View view2 = ViewBindings.a(view0, 0x7F0B0148);  // id:archive_recycler
            if(((RecyclerView)view2) != null) {
                v = 0x7F0B014B;  // id:archive_select_all
                View view3 = ViewBindings.a(view0, 0x7F0B014B);  // id:archive_select_all
                if(((FrameLayout)view3) != null) {
                    v = 0x7F0B014C;  // id:archive_select_all_check
                    View view4 = ViewBindings.a(view0, 0x7F0B014C);  // id:archive_select_all_check
                    if(((AppCompatCheckBox)view4) != null) {
                        v = 0x7F0B014D;  // id:archive_select_move
                        View view5 = ViewBindings.a(view0, 0x7F0B014D);  // id:archive_select_move
                        if(((FrameLayout)view5) != null) {
                            v = 0x7F0B014E;  // id:archive_select_remove
                            View view6 = ViewBindings.a(view0, 0x7F0B014E);  // id:archive_select_remove
                            if(((FrameLayout)view6) != null) {
                                return new c(((CoordinatorLayout)view0), ((DcToolbar)view1), ((RecyclerView)view2), ((FrameLayout)view3), ((AppCompatCheckBox)view4), ((FrameLayout)view5), ((FrameLayout)view6));
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
    public static c c(@NonNull LayoutInflater layoutInflater0) {
        return c.d(layoutInflater0, null, false);
    }

    @NonNull
    public static c d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E001E, viewGroup0, false);  // layout:activity_archive_edit
        if(z) {
            viewGroup0.addView(view0);
        }
        return c.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

