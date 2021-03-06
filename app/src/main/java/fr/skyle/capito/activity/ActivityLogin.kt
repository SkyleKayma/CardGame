package fr.skyle.capito.activity

import android.os.Bundle
import android.support.v4.app.Fragment
import fr.skyle.capito.R
import fr.skyle.capito.fragment.FragmentLogin

class ActivityLogin : AbstractActivityFragment() {

    override val layoutId: Int
        get() = R.layout.container_no_toolbar

    override fun getDefaultFragment(): Fragment? {
        return FragmentLogin()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.title = getString(R.string.login_screen_title)
    }
}