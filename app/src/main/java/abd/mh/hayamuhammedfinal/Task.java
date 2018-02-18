package abd.mh.hayamuhammedfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.widget.CheckBox;
import android.widget.EditText;

public class Task extends AppCompatActivity {
    private CardView TaskCard;
    private CheckBox checkBox;
    private EditText MyTast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
    }
}
