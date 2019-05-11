package com.example.android.mobiledevelopment7_2;

public class President {
    private String mName;
    private String mRemarks;
    private String mPhotoURL;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getRemarks() {
        return mRemarks;
    }

    public void setRemarks(String remarks) {
        this.mRemarks = remarks;
    }

    public String getPhotoURL() {
        return mPhotoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.mPhotoURL = photoURL;
    }
}
