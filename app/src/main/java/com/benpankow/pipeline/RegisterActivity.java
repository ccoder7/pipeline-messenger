package com.benpankow.pipeline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.benpankow.pipeline.activity.base.UnauthenticatedActivity;

/**
 * Created by Ben Pankow on 12/2/17.
 */
public class RegisterActivity extends UnauthenticatedActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
}
