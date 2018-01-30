package lilacapps.com.timeratyourwill

import android.content.Intent
import android.os.CountDownTimer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //
        //        new CountDownTimer(30000, 1000) {
        //
        //            public void onTick(long millisUntilFinished) {
        //                mTextField.setText("seconds remaining: " + millisUntilFinished / 1000);
        //            }
        //
        //            public void onFinish() {
        //                mTextField.setText("done!");
        //            }
        //        }.start();
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu, menu)//Menu Resource, Menu
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.Settings -> {
                //                Toast.makeText(this,"Hi",Toast.LENGTH_SHORT).show();
                //                 final int REQUEST_CODE = 1239;
                val intent = Intent(this, SetTimers::class.java)
                startActivity(intent)
                return super.onOptionsItemSelected(item)
            }
        //                startActivityForResult(intent,REQUEST_CODE);
        //                return true;
            else -> return super.onOptionsItemSelected(item)
        }
    }
}
