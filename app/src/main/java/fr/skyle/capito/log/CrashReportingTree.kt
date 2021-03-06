package fr.skyle.capito.log

import android.util.Log
import com.crashlytics.android.Crashlytics
import timber.log.Timber

/**
 * Created by Openium on 20/03/2018.
 */

class CrashReportingTree : Timber.Tree() {
    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        if (priority == Log.VERBOSE || priority == Log.DEBUG) {
            return
        }

        Crashlytics.log(priority, tag, message)

        if (t != null) {
            if (priority == Log.ERROR) {
                Crashlytics.logException(t)
            } else if (priority == Log.WARN) {
                Crashlytics.logException(t)
            }
        }
    }
}