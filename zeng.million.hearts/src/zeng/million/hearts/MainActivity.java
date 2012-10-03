package zeng.million.hearts;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends Activity {

  private static final int DIALOG_ALERT = 10;

  
/** Called when the activity is first created. */


  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);

  }

  public void onClick(View view) {
    showDialog(DIALOG_ALERT);
  }

  @Override
  protected Dialog onCreateDialog(int id) {
    switch (id) {
    case DIALOG_ALERT:
      // Create out AlterDialog
      AlertDialog.Builder builder = new AlertDialog.Builder(this);
      builder.setMessage("Are you 18 years of age?");
      builder.setCancelable(true);
      builder.setPositiveButton("Yes", new CancelOnClickListener());
      builder.setNegativeButton("No", new OkOnClickListener());
      
      AlertDialog dialog = builder.create();
      dialog.show();
    }
    return super.onCreateDialog(id);
  }

  private final class CancelOnClickListener implements
      DialogInterface.OnClickListener {
    public void onClick(DialogInterface dialog, int which) {
      Toast.makeText(getApplicationContext(), "Please continue with the questionaire",
          Toast.LENGTH_LONG).show();
      setContentView(R.layout.after_age);
    }
  }
 

  private final class OkOnClickListener implements
      DialogInterface.OnClickListener {
    public void onClick(DialogInterface dialog, int which) {
              Toast.makeText(getApplicationContext(), "Sorry you are not of age!",
          Toast.LENGTH_LONG).show();
      MainActivity.this.finish();
      
    }
  } 

} 