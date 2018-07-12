package com.anc.anti_raggingkuk;

public class Committeedetails {
    private String mName;


    private String mNumber;

    // Drawable resource ID
    private int mImageResourceId;

    /*
     * Create a new AndroidFlavor object.
     *
     * @param vName is the name of the Android version (e.g. Gingerbread)
     * @param vNumber is the corresponding Android version number (e.g. 2.3-2.7)
     * @param image is drawable reference ID that corresponds to the Android version
     * */
    public Committeedetails(String vName, String vNumber)
    {
        mName = vName;
        mNumber = vNumber;
    }


    /**
     * Get the name of the Android version
     */
    public String getVersionName() {
        return mName;
    }

    /**
     * Get the Android version number
     */
    public String getVersionNumber() {
        return mNumber;
    }

    /**
     * Get the image resource ID
     */

}
