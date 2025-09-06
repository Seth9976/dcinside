package com.gomfactory.adpie.sdk.dialog;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.gomfactory.adpie.sdk.common.Constants;

public class DialogStyleV2 {
    public static class Builder {
        private int adContentsBottomPadding;
        private int adContentsLeftPadding;
        private int adContentsRightPadding;
        private int adContentsTopPadding;
        private int backgroundColor;
        private int buttonCount;
        private int buttonTextSize;
        private String clickUrl;
        private String ctaButtonText;
        private String description;
        private int firstButtonColor;
        private String firstButtonText;
        private int firstButtonTextColor;
        private int iconImageResId;
        private int mainImageResId;
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
        private String title;

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
            this.adContentsLeftPadding = 2;
            this.adContentsTopPadding = 2;
            this.adContentsRightPadding = 2;
            this.adContentsBottomPadding = 2;
        }

        public DialogStyleV2 build() {
            return new DialogStyleV2(this, null);
        }

        public Builder setAdContentsPadding(int v, int v1, int v2, int v3) {
            this.adContentsLeftPadding = v;
            this.adContentsTopPadding = v1;
            this.adContentsRightPadding = v2;
            this.adContentsBottomPadding = v3;
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

        public Builder setClickUrl(String s) {
            this.clickUrl = s;
            return this;
        }

        public Builder setCtaButtonText(String s) {
            this.ctaButtonText = s;
            return this;
        }

        public Builder setDescription(String s) {
            this.description = s;
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

        public Builder setIconImageResId(int v) {
            this.iconImageResId = v;
            return this;
        }

        public Builder setMainImageResId(int v) {
            this.mainImageResId = v;
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

        public Builder setTitle(String s) {
            this.title = s;
            return this;
        }
    }

    private final int adContentsBottomPadding;
    private final int adContentsLeftPadding;
    private final int adContentsRightPadding;
    private final int adContentsTopPadding;
    private final int backgroundColor;
    private final int buttonCount;
    private final int buttonTextSize;
    private final String clickUrl;
    private final String ctaButtonText;
    private final String description;
    private final int firstButtonColor;
    private final String firstButtonText;
    private final int firstButtonTextColor;
    private final int iconImageResId;
    private final int mainImageResId;
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
    private final String title;

    private DialogStyleV2(@NonNull Builder dialogStyleV2$Builder0) {
        this.iconImageResId = dialogStyleV2$Builder0.iconImageResId;
        this.title = dialogStyleV2$Builder0.title;
        this.description = dialogStyleV2$Builder0.description;
        this.mainImageResId = dialogStyleV2$Builder0.mainImageResId;
        this.ctaButtonText = dialogStyleV2$Builder0.ctaButtonText;
        this.clickUrl = dialogStyleV2$Builder0.clickUrl;
        this.backgroundColor = dialogStyleV2$Builder0.backgroundColor;
        this.messageText = dialogStyleV2$Builder0.messageText;
        this.messageTextColor = dialogStyleV2$Builder0.messageTextColor;
        this.messageTextSize = dialogStyleV2$Builder0.messageTextSize;
        this.buttonCount = dialogStyleV2$Builder0.buttonCount;
        this.buttonTextSize = dialogStyleV2$Builder0.buttonTextSize;
        this.firstButtonText = dialogStyleV2$Builder0.firstButtonText;
        this.firstButtonColor = dialogStyleV2$Builder0.firstButtonColor;
        this.firstButtonTextColor = dialogStyleV2$Builder0.firstButtonTextColor;
        this.secondButtonText = dialogStyleV2$Builder0.secondButtonText;
        this.secondButtonColor = dialogStyleV2$Builder0.secondButtonColor;
        this.secondButtonTextColor = dialogStyleV2$Builder0.secondButtonTextColor;
        this.thirdButtonText = dialogStyleV2$Builder0.thirdButtonText;
        this.thirdButtonColor = dialogStyleV2$Builder0.thirdButtonColor;
        this.thirdButtonTextColor = dialogStyleV2$Builder0.thirdButtonTextColor;
        this.radius = dialogStyleV2$Builder0.radius;
        this.adContentsLeftPadding = dialogStyleV2$Builder0.adContentsLeftPadding;
        this.adContentsTopPadding = dialogStyleV2$Builder0.adContentsTopPadding;
        this.adContentsRightPadding = dialogStyleV2$Builder0.adContentsRightPadding;
        this.adContentsBottomPadding = dialogStyleV2$Builder0.adContentsBottomPadding;
    }

    DialogStyleV2(Builder dialogStyleV2$Builder0, com.gomfactory.adpie.sdk.dialog.DialogStyleV2.1 dialogStyleV2$10) {
        this(dialogStyleV2$Builder0);
    }

    public int[] getAdContentsPadding() {
        return new int[]{this.adContentsLeftPadding, this.adContentsTopPadding, this.adContentsRightPadding, this.adContentsBottomPadding};
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

    public String getClickUrl() {
        return this.clickUrl;
    }

    public String getCtaButtonText() {
        return this.ctaButtonText;
    }

    public String getDescription() {
        return this.description;
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

    public int getIconImageResId() {
        return this.iconImageResId;
    }

    public int getMainImageResId() {
        return this.mainImageResId;
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

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return "[" + super.toString() + "] , backgroundColor : " + this.backgroundColor + ", messageText : " + this.messageText + ", messageTextColor : " + this.messageTextColor + ", messageTextSize : " + this.messageTextSize + ", buttonCount : " + this.buttonCount + ", buttonTextSize : " + this.buttonTextSize + ", firstButtonText : " + this.firstButtonText + ", firstButtonColor : " + this.firstButtonColor + ", firstButtonTextColor : " + this.firstButtonTextColor + ", secondButtonText : " + this.secondButtonText + ", secondButtonColor : " + this.secondButtonColor + ", secondButtonTextColor : " + this.secondButtonTextColor + ", thirdButtonText : " + this.thirdButtonText + ", thirdButtonColor : " + this.thirdButtonColor + ", thirdButtonTextColor : " + this.thirdButtonTextColor + ", radius : " + this.radius + ", padding (" + this.adContentsLeftPadding + ", " + this.adContentsTopPadding + ", " + this.adContentsRightPadding + ", " + this.adContentsBottomPadding + ")";
    }

    class com.gomfactory.adpie.sdk.dialog.DialogStyleV2.1 {
    }

}

