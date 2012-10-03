package zeng.million.hearts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    public final static String EXTRA_MESSAGE = "hello.world.MESSAGE";
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        // We want to view some very simple text, so we need a TextView
        //TextView tv = new TextView(this);
        // Put some text to the newly created TextVIew
        //tv.setText("Hello Android. Yay! This is so exciting");
        // Tell our App to display the textView
        //this.setContentView(tv);
        setContentView(R.layout.main);
    }
    
    
        public void sendMessage(View view){
        /** Called when the user clicks the Send button */
        //Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity2.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
