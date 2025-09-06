package com.karumi.dexter.listener.multi;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.listener.OnDialogButtonClickListener;

public class DialogOnAnyDeniedMultiplePermissionsListener extends BaseMultiplePermissionsListener {
    public static class Builder {
        private String buttonText;
        private final Context context;
        private Drawable icon;
        private String message;
        private OnDialogButtonClickListener onDialogButtonClickListener;
        private String title;

        private Builder(Context context0) {
            this.context = context0;
        }

        public DialogOnAnyDeniedMultiplePermissionsListener build() {
            String s = this.title == null ? "" : this.title;
            String s1 = this.message == null ? "" : this.message;
            String s2 = this.buttonText == null ? "" : this.buttonText;
            OnDialogButtonClickListener onDialogButtonClickListener0 = this.onDialogButtonClickListener;
            if(onDialogButtonClickListener0 != null) {
                return new DialogOnAnyDeniedMultiplePermissionsListener(this.context, s, s1, s2, this.icon, onDialogButtonClickListener0, null);
            }
            onDialogButtonClickListener0 = new OnDialogButtonClickListener() {
                @Override  // com.karumi.dexter.listener.OnDialogButtonClickListener
                public void onClick() {
                }
            };
            return new DialogOnAnyDeniedMultiplePermissionsListener(this.context, s, s1, s2, this.icon, onDialogButtonClickListener0, null);
        }

        public Builder withButtonText(@StringRes int v) {
            this.buttonText = this.context.getString(v);
            return this;
        }

        public Builder withButtonText(@StringRes int v, OnDialogButtonClickListener onDialogButtonClickListener0) {
            this.buttonText = this.context.getString(v);
            this.onDialogButtonClickListener = onDialogButtonClickListener0;
            return this;
        }

        public Builder withButtonText(String s) {
            this.buttonText = s;
            return this;
        }

        public Builder withButtonText(String s, OnDialogButtonClickListener onDialogButtonClickListener0) {
            this.buttonText = s;
            this.onDialogButtonClickListener = onDialogButtonClickListener0;
            return this;
        }

        public static Builder withContext(Context context0) {
            return new Builder(context0);
        }

        public Builder withIcon(@DrawableRes int v) {
            this.icon = this.context.getResources().getDrawable(v);
            return this;
        }

        public Builder withIcon(Drawable drawable0) {
            this.icon = drawable0;
            return this;
        }

        public Builder withMessage(@StringRes int v) {
            this.message = this.context.getString(v);
            return this;
        }

        public Builder withMessage(String s) {
            this.message = s;
            return this;
        }

        public Builder withTitle(@StringRes int v) {
            this.title = this.context.getString(v);
            return this;
        }

        public Builder withTitle(String s) {
            this.title = s;
            return this;
        }
    }

    private final Context context;
    private final Drawable icon;
    private final String message;
    private final OnDialogButtonClickListener onDialogButtonClickListener;
    private final String positiveButtonText;
    private final String title;

    private DialogOnAnyDeniedMultiplePermissionsListener(Context context0, String s, String s1, String s2, Drawable drawable0, OnDialogButtonClickListener onDialogButtonClickListener0) {
        this.context = context0;
        this.title = s;
        this.message = s1;
        this.positiveButtonText = s2;
        this.icon = drawable0;
        this.onDialogButtonClickListener = onDialogButtonClickListener0;
    }

    DialogOnAnyDeniedMultiplePermissionsListener(Context context0, String s, String s1, String s2, Drawable drawable0, OnDialogButtonClickListener onDialogButtonClickListener0, com.karumi.dexter.listener.multi.DialogOnAnyDeniedMultiplePermissionsListener.1 dialogOnAnyDeniedMultiplePermissionsListener$10) {
        this(context0, s, s1, s2, drawable0, onDialogButtonClickListener0);
    }

    @Override  // com.karumi.dexter.listener.multi.BaseMultiplePermissionsListener
    public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport0) {
        super.onPermissionsChecked(multiplePermissionsReport0);
        if(!multiplePermissionsReport0.areAllPermissionsGranted()) {
            this.showDialog();
        }
    }

    private void showDialog() {
        AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(this.context).setTitle(this.title).setMessage(this.message);
        com.karumi.dexter.listener.multi.DialogOnAnyDeniedMultiplePermissionsListener.1 dialogOnAnyDeniedMultiplePermissionsListener$10 = new DialogInterface.OnClickListener() {
            @Override  // android.content.DialogInterface$OnClickListener
            public void onClick(DialogInterface dialogInterface0, int v) {
                dialogInterface0.dismiss();
                DialogOnAnyDeniedMultiplePermissionsListener.this.onDialogButtonClickListener.onClick();
            }
        };
        alertDialog$Builder0.setPositiveButton(this.positiveButtonText, dialogOnAnyDeniedMultiplePermissionsListener$10).setIcon(this.icon).show();
    }
}

