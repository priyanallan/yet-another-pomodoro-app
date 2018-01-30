package lilacapps.com.timeratyourwill

import android.app.Activity
import android.content.ClipData
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.Window
import android.widget.ImageView

/**
 * Created by priya on 6/11/2016.
 */
class SetTimers : Activity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.settimers)

    }

    companion object {

        private val IMAGE_BITMAP = "icon bitmap"
    }
}
