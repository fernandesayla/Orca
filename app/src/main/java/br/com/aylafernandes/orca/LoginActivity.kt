package br.com.aylafernandes.orca

import android.os.Bundle


import android.support.v7.app.AppCompatActivity
import com.facebook.FacebookSdk
import com.facebook.appevents.AppEventsLogger






class LoginActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);






    }

}
