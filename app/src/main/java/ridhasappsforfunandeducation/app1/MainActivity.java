package ridhasappsforfunandeducation.app1;

import android.app.DialogFragment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private Button answer_Yes,answer_No;
    private TextView Are_you_happy;
    private EditText app_usersname,number1,number2;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answer_Yes = (Button) findViewById(R.id.answer_Yes);
        answer_No = (Button) findViewById(R.id.answer_No);
        Are_you_happy = (TextView) findViewById(R.id.Are_you_happy);
        app_usersname = (EditText) findViewById(R.id.app_usersname);

}




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            DialogFragment myFragment = new Dialog();

            myFragment.show(getFragmentManager(), "Dialog");

            return true;
        }
        else if (id == R.id.Exit){

            finish();
            return true;

        }
        return super.onOptionsItemSelected(item);
    }

    public void onNobuttonclick(View view) {
        String usersname = String.valueOf(app_usersname.getText());
        String NoResponse = "I am sorry " + usersname + " I wish I could cheer you up but im just an app";
        Toast.makeText(this, NoResponse, Toast.LENGTH_LONG).show();

    }


    public void onYesbuttonclick(View view) {
        String usersname = String.valueOf(app_usersname.getText());
        String YesResponse = "Thats wonderfull " + usersname;
        Toast.makeText(this, YesResponse, Toast.LENGTH_SHORT).show();

    }


    public void Go_calculator(MenuItem item) {
        setContentView(R.layout.calculator_activity);

    }

    public void Go_Question(MenuItem item) {
        setContentView(R.layout.activity_main);
    }


    public void add(View view) {
        EditText number1 = (EditText)findViewById(R.id.number1);
        EditText number2 = (EditText)findViewById(R.id.number2);
        TextView out = (TextView)findViewById(R.id.textView);
        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());
        int sum = num1+ num2;
        out.setText(Integer.toString(sum));

    }

    public void subtract(View view) {

        EditText number1 = (EditText)findViewById(R.id.number1);
        EditText number2 = (EditText)findViewById(R.id.number2);
        TextView out = (TextView)findViewById(R.id.textView);
        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());
        int minus_out = num1 - num2;
        out.setText(Integer.toString(minus_out));

    }

    public void multiply(View view) {

        EditText number1 = (EditText)findViewById(R.id.number1);
        EditText number2 = (EditText)findViewById(R.id.number2);
        TextView out = (TextView)findViewById(R.id.textView);
        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());
        int mult_out = num1 * num2;
        out.setText(Integer.toString(mult_out));

    }

    public void divide(View view) {

        EditText number1 = (EditText)findViewById(R.id.number1);
        EditText number2 = (EditText)findViewById(R.id.number2);
        TextView out = (TextView)findViewById(R.id.textView);
        double num1 = Integer.parseInt(number1.getText().toString());
        double num2 = Integer.parseInt(number2.getText().toString());
        double div_out = num1 / num2;
        out.setText(Double.toString(div_out));

    }
}
