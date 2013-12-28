package com.madmuc.jqueryfilesystem;


import android.os.Bundle;
import com.phonegap.*;

public class JQuery_filesystemActivity extends DroidGap {
    /** Called when the activity is first created. */

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}