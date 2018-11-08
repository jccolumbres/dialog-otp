package com.example.ayannah.jc.twofactorauthentication;

import android.os.Parcel;
import android.os.Parcelable;

public class SecurityCode implements Parcelable {
    private int codeInt;
    private String code;

    public SecurityCode() {
    }

    public SecurityCode(int codeInt, String code) {
        this.codeInt = codeInt;
        this.code = code;
    }

    public int getCodeInt() {
        return codeInt;
    }

    public void setCodeInt(int codeInt) {
        this.codeInt = codeInt;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.codeInt);
        dest.writeString(this.code);
    }

    protected SecurityCode(Parcel in) {
        this.codeInt = in.readInt();
        this.code = in.readString();
    }

    public static final Parcelable.Creator<SecurityCode> CREATOR = new Parcelable.Creator<SecurityCode>() {
        @Override
        public SecurityCode createFromParcel(Parcel source) {
            return new SecurityCode(source);
        }

        @Override
        public SecurityCode[] newArray(int size) {
            return new SecurityCode[size];
        }
    };
}
