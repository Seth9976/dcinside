package com.gomfactory.adpie.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;

public class TargetingData {
    public static class Builder {
        private int age;
        private JSONObject customTargeting;
        private Gender gender;
        private int yearOfBirthday;

        public TargetingData build() {
            return new TargetingData(this, null);
        }

        public Builder setAge(int v) {
            this.age = v;
            return this;
        }

        public Builder setCustomTargeting(@NonNull JSONObject jSONObject0) {
            this.customTargeting = jSONObject0;
            return this;
        }

        public Builder setGender(@NonNull Gender targetingData$Gender0) {
            this.gender = targetingData$Gender0;
            return this;
        }

        public Builder setYearOfBirthday(int v) {
            this.yearOfBirthday = v;
            return this;
        }
    }

    public static enum Gender {
        FEMALE,
        MALE,
        UNKNOWN;

    }

    private final int age;
    private final JSONObject customTargeting;
    private final Gender gender;
    private final int yearOfBirthday;

    private TargetingData(@NonNull Builder targetingData$Builder0) {
        this.gender = targetingData$Builder0.gender;
        this.yearOfBirthday = targetingData$Builder0.yearOfBirthday;
        this.age = targetingData$Builder0.age;
        this.customTargeting = targetingData$Builder0.customTargeting;
    }

    TargetingData(Builder targetingData$Builder0, com.gomfactory.adpie.sdk.TargetingData.1 targetingData$10) {
        this(targetingData$Builder0);
    }

    public int getAge() {
        return this.age;
    }

    @Nullable
    public JSONObject getCustomTargeting() {
        return this.customTargeting;
    }

    @Nullable
    public Gender getGender() {
        return this.gender;
    }

    public int getYearOfBirthday() {
        return this.yearOfBirthday;
    }

    class com.gomfactory.adpie.sdk.TargetingData.1 {
    }

}

