package com.karumi.dexter.listener.multi;

import android.view.View.OnClickListener;
import android.view.View;
import androidx.annotation.StringRes;
import com.google.android.material.snackbar.Snackbar.a;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.listener.SettingsClickListener;
import com.karumi.dexter.listener.SnackbarUtils;

public class SnackbarOnAnyPermanentlyDeniedMultiplePermissionsListener extends BaseMultiplePermissionsListener {
    public static class Builder {
        private String buttonText;
        private int duration;
        private View.OnClickListener onClickListener;
        private a snackbarCallback;
        private final String text;
        private final View view;

        private Builder(View view0, String s) {
            this.duration = 0;
            this.view = view0;
            this.text = s;
        }

        public SnackbarOnAnyPermanentlyDeniedMultiplePermissionsListener build() {
            return new SnackbarOnAnyPermanentlyDeniedMultiplePermissionsListener(this.view, this.text, this.buttonText, this.onClickListener, this.snackbarCallback, this.duration, null);
        }

        public static Builder with(View view0, @StringRes int v) {
            return Builder.with(view0, view0.getContext().getString(v));
        }

        public static Builder with(View view0, String s) {
            return new Builder(view0, s);
        }

        public Builder withButton(@StringRes int v, View.OnClickListener view$OnClickListener0) {
            return this.withButton(this.view.getContext().getString(v), view$OnClickListener0);
        }

        public Builder withButton(String s, View.OnClickListener view$OnClickListener0) {
            this.buttonText = s;
            this.onClickListener = view$OnClickListener0;
            return this;
        }

        public Builder withCallback(a snackbar$a0) {
            this.snackbarCallback = snackbar$a0;
            return this;
        }

        public Builder withDuration(int v) {
            this.duration = v;
            return this;
        }

        public Builder withOpenSettingsButton(@StringRes int v) {
            return this.withOpenSettingsButton(this.view.getContext().getString(v));
        }

        public Builder withOpenSettingsButton(String s) {
            this.buttonText = s;
            this.onClickListener = new SettingsClickListener();
            return this;
        }
    }

    private final String buttonText;
    private final int duration;
    private final View.OnClickListener onButtonClickListener;
    private final a snackbarCallback;
    private final String text;
    private final View view;

    private SnackbarOnAnyPermanentlyDeniedMultiplePermissionsListener(View view0, String s, String s1, View.OnClickListener view$OnClickListener0, a snackbar$a0, int v) {
        this.view = view0;
        this.text = s;
        this.buttonText = s1;
        this.onButtonClickListener = view$OnClickListener0;
        this.snackbarCallback = snackbar$a0;
        this.duration = v;
    }

    SnackbarOnAnyPermanentlyDeniedMultiplePermissionsListener(View view0, String s, String s1, View.OnClickListener view$OnClickListener0, a snackbar$a0, int v, com.karumi.dexter.listener.multi.SnackbarOnAnyPermanentlyDeniedMultiplePermissionsListener.1 snackbarOnAnyPermanentlyDeniedMultiplePermissionsListener$10) {
        this(view0, s, s1, view$OnClickListener0, snackbar$a0, v);
    }

    @Override  // com.karumi.dexter.listener.multi.BaseMultiplePermissionsListener
    public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport0) {
        super.onPermissionsChecked(multiplePermissionsReport0);
        if(!multiplePermissionsReport0.isAnyPermissionPermanentlyDenied()) {
            SnackbarUtils.show(this.view, this.text, this.duration, this.buttonText, this.onButtonClickListener, this.snackbarCallback);
        }
    }

    class com.karumi.dexter.listener.multi.SnackbarOnAnyPermanentlyDeniedMultiplePermissionsListener.1 {
    }

}

