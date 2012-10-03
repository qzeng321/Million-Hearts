/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zeng.million.hearts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 *
 * @author qzeng
 */
public class DisplayMessageActivity2 extends Activity {

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the message from the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        
        //Create the text view
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);
        
        // Set the text view as the activity layout
        setContentView(textView);
        // ToDo add your GUI initialization code here        
    }
}
