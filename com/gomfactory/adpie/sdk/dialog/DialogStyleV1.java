package com.gomfactory.adpie.sdk.dialog;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.gomfactory.adpie.sdk.common.Constants;

public class DialogStyleV1 {
    public static class Builder {
        private int adSize;
        private int backgroundColor;
        private int buttonCount;
        private int buttonTextSize;
        private String defaultImageClickUrl;
        private int defaultImageResId;
        private int firstButtonColor;
        private String firstButtonText;
        private int firstButtonTextColor;
        private String messageText;
        private int messageTextColor;
        private int messageTextSize;
        private int radius;
        private int secondButtonColor;
        private String secondButtonText;
        private int secondButtonTextColor;
        private int thirdButtonColor;
        private String thirdButtonText;
        private int thirdButtonTextColor;

        public Builder() {
            this.buttonCount = 2;
            this.buttonTextSize = 15;
            this.backgroundColor = -1;
            this.messageText = "서비스를 종료하시겠습니까?";
            this.messageTextColor = 0xFF000000;
            this.messageTextSize = 15;
            this.firstButtonText = "취소";
            this.firstButtonColor = Constants.DEFAULT_DIALOG_BUTTON_COLOR;
            this.firstButtonTextColor = -1;
            this.secondButtonText = "종료";
            this.secondButtonColor = Constants.DEFAULT_DIALOG_BUTTON_COLOR;
            this.secondButtonTextColor = -1;
            this.thirdButtonText = "확인";
            this.thirdButtonColor = Constants.DEFAULT_DIALOG_BUTTON_COLOR;
            this.thirdButtonTextColor = -1;
            this.radius = 10;
        }

        public DialogStyleV1 build() {
            return new DialogStyleV1(this, null);
        }

        public Builder setAdSize(int v) {
            this.adSize = v;
            return this;
        }

        public Builder setBackgroundColor(int v) {
            this.backgroundColor = v;
            return this;
        }

        public Builder setButtonCount(int v) {
            this.buttonCount = v;
            return this;
        }

        public Builder setButtonTextSize(int v) {
            this.buttonTextSize = v;
            return this;
        }

        public Builder setDefaultImageClickUrl(String s) {
            this.defaultImageClickUrl = s;
            return this;
        }

        public Builder setDefaultImageResId(int v) {
            this.defaultImageResId = v;
            return this;
        }

        public Builder setFirstButtonColor(int v) {
            this.firstButtonColor = v;
            return this;
        }

        public Builder setFirstButtonText(String s) {
            this.firstButtonText = s;
            return this;
        }

        public Builder setFirstButtonTextColor(int v) {
            this.firstButtonTextColor = v;
            return this;
        }

        public Builder setMessageText(String s) {
            this.messageText = s;
            return this;
        }

        public Builder setMessageTextColor(int v) {
            this.messageTextColor = v;
            return this;
        }

        public Builder setMessageTextSize(int v) {
            this.messageTextSize = v;
            return this;
        }

        public Builder setRadius(int v) {
            this.radius = v;
            return this;
        }

        public Builder setSecondButtonColor(int v) {
            this.secondButtonColor = v;
            return this;
        }

        public Builder setSecondButtonText(String s) {
            this.secondButtonText = s;
            return this;
        }

        public Builder setSecondButtonTextColor(int v) {
            this.secondButtonTextColor = v;
            return this;
        }

        public Builder setThirdButtonColor(int v) {
            this.thirdButtonColor = v;
            return this;
        }

        public Builder setThirdButtonText(String s) {
            this.thirdButtonText = s;
            return this;
        }

        public Builder setThirdButtonTextColor(int v) {
            this.thirdButtonTextColor = v;
            return this;
        }
    }

    public static final int DIALOG_SIZE_250x250 = 0;
    public static final int DIALOG_SIZE_300x250 = 1;
    private final int adSize;
    private final int backgroundColor;
    private final int buttonCount;
    private final int buttonTextSize;
    private final String defaultImageClickUrl;
    private final int defaultImageResId;
    private final int firstButtonColor;
    private final String firstButtonText;
    private final int firstButtonTextColor;
    private final String messageText;
    private final int messageTextColor;
    private final int messageTextSize;
    private final int radius;
    private final int secondButtonColor;
    private final String secondButtonText;
    private final int secondButtonTextColor;
    private final int thirdButtonColor;
    private final String thirdButtonText;
    private final int thirdButtonTextColor;

    private DialogStyleV1(@NonNull Builder dialogStyleV1$Builder0) {
        this.adSize = dialogStyleV1$Builder0.adSize;
        this.defaultImageResId = dialogStyleV1$Builder0.defaultImageResId;
        this.defaultImageClickUrl = dialogStyleV1$Builder0.defaultImageClickUrl;
        this.backgroundColor = dialogStyleV1$Builder0.backgroundColor;
        this.messageText = dialogStyleV1$Builder0.messageText;
        this.messageTextColor = dialogStyleV1$Builder0.messageTextColor;
        this.messageTextSize = dialogStyleV1$Builder0.messageTextSize;
        this.buttonCount = dialogStyleV1$Builder0.buttonCount;
        this.buttonTextSize = dialogStyleV1$Builder0.buttonTextSize;
        this.firstButtonText = dialogStyleV1$Builder0.firstButtonText;
        this.firstButtonColor = dialogStyleV1$Builder0.firstButtonColor;
        this.firstButtonTextColor = dialogStyleV1$Builder0.firstButtonTextColor;
        this.secondButtonText = dialogStyleV1$Builder0.secondButtonText;
        this.secondButtonColor = dialogStyleV1$Builder0.secondButtonColor;
        this.secondButtonTextColor = dialogStyleV1$Builder0.secondButtonTextColor;
        this.thirdButtonText = dialogStyleV1$Builder0.thirdButtonText;
        this.thirdButtonColor = dialogStyleV1$Builder0.thirdButtonColor;
        this.thirdButtonTextColor = dialogStyleV1$Builder0.thirdButtonTextColor;
        this.radius = dialogStyleV1$Builder0.radius;
    }

    DialogStyleV1(Builder dialogStyleV1$Builder0, com.gomfactory.adpie.sdk.dialog.DialogStyleV1.1 dialogStyleV1$10) {
        this(dialogStyleV1$Builder0);
    }

    public int getAdSize() {
        return this.adSize;
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public int getButtonCount() {
        return this.buttonCount;
    }

    public int getButtonTextSize() {
        return this.buttonTextSize;
    }

    @Nullable
    public String getDefaultImageClickUrl() {
        return this.defaultImageClickUrl;
    }

    public int getDefaultImageResId() {
        return this.defaultImageResId;
    }

    public int getFirstButtonColor() {
        return this.firstButtonColor;
    }

    @Nullable
    public String getFirstButtonText() {
        return this.firstButtonText;
    }

    public int getFirstButtonTextColor() {
        return this.firstButtonTextColor;
    }

    @Nullable
    public String getMessageText() {
        return this.messageText;
    }

    public int getMessageTextColor() {
        return this.messageTextColor;
    }

    public int getMessageTextSize() {
        return this.messageTextSize;
    }

    public int getRadius() {
        return this.radius;
    }

    public int getSecondButtonColor() {
        return this.secondButtonColor;
    }

    @Nullable
    public String getSecondButtonText() {
        return this.secondButtonText;
    }

    public int getSecondButtonTextColor() {
        return this.secondButtonTextColor;
    }

    public int getThirdButtonColor() {
        return this.thirdButtonColor;
    }

    @Nullable
    public String getThirdButtonText() {
        return this.thirdButtonText;
    }

    public int getThirdButtonTextColor() {
        return this.thirdButtonTextColor;
    }

    @Override
    public String toString() {
        return "[" + super.toString() + "] adSize : " + this.adSize + ", defaultImageResId : " + this.defaultImageResId + ", defaultImageClickUrl : " + this.defaultImageClickUrl + ", backgroundColor : " + this.backgroundColor + ", messageText : " + this.messageText + ", messageTextColor : " + this.messageTextColor + ", messageTextSize : " + this.messageTextSize + ", buttonCount : " + this.buttonCount + ", buttonTextSize : " + this.buttonTextSize + ", firstButtonText : " + this.firstButtonText + ", firstButtonColor : " + this.firstButtonColor + ", firstButtonTextColor : " + this.firstButtonTextColor + ", secondButtonText : " + this.secondButtonText + ", secondButtonColor : " + this.secondButtonColor + ", secondButtonTextColor : " + this.secondButtonTextColor + ", thirdButtonText : " + this.thirdButtonText + ", thirdButtonColor : " + this.thirdButtonColor + ", thirdButtonTextColor : " + this.thirdButtonTextColor + ", radius : " + this.radius;
    }

    class com.gomfactory.adpie.sdk.dialog.DialogStyleV1.1 {
    }

}

