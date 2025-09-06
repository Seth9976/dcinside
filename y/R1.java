package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class r1 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final CardView b;
    @NonNull
    public final TextView c;
    @NonNull
    public final CalendarView d;
    @NonNull
    public final ImageView e;
    @NonNull
    public final TextView f;
    @NonNull
    public final ConstraintLayout g;
    @NonNull
    public final ImageView h;
    @NonNull
    public final TextView i;
    @NonNull
    public final TextView j;
    @NonNull
    public final View k;

    private r1(@NonNull ConstraintLayout constraintLayout0, @NonNull CardView cardView0, @NonNull TextView textView0, @NonNull CalendarView calendarView0, @NonNull ImageView imageView0, @NonNull TextView textView1, @NonNull ConstraintLayout constraintLayout1, @NonNull ImageView imageView1, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull View view0) {
        this.a = constraintLayout0;
        this.b = cardView0;
        this.c = textView0;
        this.d = calendarView0;
        this.e = imageView0;
        this.f = textView1;
        this.g = constraintLayout1;
        this.h = imageView1;
        this.i = textView2;
        this.j = textView3;
        this.k = view0;
    }

    @NonNull
    public static r1 a(@NonNull View view0) {
        int v = 0x7F0B041A;  // id:dialog_post_search_calendar_wrap
        View view1 = ViewBindings.a(view0, 0x7F0B041A);  // id:dialog_post_search_calendar_wrap
        if(((CardView)view1) != null) {
            v = 0x7F0B041B;  // id:dialog_post_search_confirm
            View view2 = ViewBindings.a(view0, 0x7F0B041B);  // id:dialog_post_search_confirm
            if(((TextView)view2) != null) {
                v = 0x7F0B041C;  // id:dialog_post_search_date_calendar
                View view3 = ViewBindings.a(view0, 0x7F0B041C);  // id:dialog_post_search_date_calendar
                if(((CalendarView)view3) != null) {
                    v = 0x7F0B041D;  // id:dialog_post_search_date_close
                    View view4 = ViewBindings.a(view0, 0x7F0B041D);  // id:dialog_post_search_date_close
                    if(((ImageView)view4) != null) {
                        v = 0x7F0B041E;  // id:dialog_post_search_date_content
                        View view5 = ViewBindings.a(view0, 0x7F0B041E);  // id:dialog_post_search_date_content
                        if(((TextView)view5) != null) {
                            v = 0x7F0B041F;  // id:dialog_post_search_date_reset
                            View view6 = ViewBindings.a(view0, 0x7F0B041F);  // id:dialog_post_search_date_reset
                            if(((ConstraintLayout)view6) != null) {
                                v = 0x7F0B0420;  // id:dialog_post_search_date_reset_icon
                                View view7 = ViewBindings.a(view0, 0x7F0B0420);  // id:dialog_post_search_date_reset_icon
                                if(((ImageView)view7) != null) {
                                    v = 0x7F0B0421;  // id:dialog_post_search_date_reset_title
                                    View view8 = ViewBindings.a(view0, 0x7F0B0421);  // id:dialog_post_search_date_reset_title
                                    if(((TextView)view8) != null) {
                                        v = 0x7F0B0422;  // id:dialog_post_search_date_title
                                        View view9 = ViewBindings.a(view0, 0x7F0B0422);  // id:dialog_post_search_date_title
                                        if(((TextView)view9) != null) {
                                            v = 0x7F0B0423;  // id:dialog_post_select_year
                                            View view10 = ViewBindings.a(view0, 0x7F0B0423);  // id:dialog_post_select_year
                                            if(view10 != null) {
                                                return new r1(((ConstraintLayout)view0), ((CardView)view1), ((TextView)view2), ((CalendarView)view3), ((ImageView)view4), ((TextView)view5), ((ConstraintLayout)view6), ((ImageView)view7), ((TextView)view8), ((TextView)view9), view10);
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
    public static r1 c(@NonNull LayoutInflater layoutInflater0) {
        return r1.d(layoutInflater0, null, false);
    }

    @NonNull
    public static r1 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E00D1, viewGroup0, false);  // layout:dialog_fragment_search_calendar
        if(z) {
            viewGroup0.addView(view0);
        }
        return r1.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

