package abd.mh.hayamuhammedfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUP extends AppCompatActivity implements  View.OnClickListener {

    private EditText etphone1;
    private  EditText etphone2;
    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        etphone1 = (EditText) findViewById(R.id.etphone1);
        etphone2 = (EditText) findViewById(R.id.etphone2);

    }

    @Override
    public void onClick(View view) {
    }
}
