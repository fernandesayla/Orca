package br.com.aylafernandes.orca

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    private val SPLASH_DISPLAY_LENGTH = 3500
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        carregar()
    }
    private fun carregar(){
        val anim = AnimationUtils.loadAnimation(this,
                R.anim.splash)
        anim.reset();



        if (splash != null) {
            splash.clearAnimation()
            splash.startAnimation(anim)
        }

        Handler().postDelayed(Runnable {
            // Após o tempo definido irá executar a próxima tela
            val intent = Intent(this@SplashActivity,  LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NO_ANIMATION
            startActivity(intent)
            this@SplashActivity.finish()
        }, SPLASH_DISPLAY_LENGTH.toLong())



    }

}
