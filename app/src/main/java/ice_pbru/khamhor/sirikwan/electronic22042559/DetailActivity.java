package ice_pbru.khamhor.sirikwan.electronic22042559;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView titleTextView, detailTextView;
    private ImageView electricImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        bindWidget();
        showview();
    }

    private void showview() {
        String strTitle = getIntent().getStringExtra("Title");
        int intIcon = getIntent().getIntExtra("Img", R.drawable.a1);
        int intIndex = getIntent().getIntExtra("Index", 0);

        titleTextView.setText(strTitle);
        electricImageView.setImageResource(intIcon);

        String[] strDetail = getResources().getStringArray(R.array.information);
        detailTextView.setText(strDetail[intIndex]);

    }

    private void bindWidget() {
        titleTextView = (TextView) findViewById(R.id.textView4);
        detailTextView = (TextView) findViewById(R.id.textView5);
        electricImageView = (ImageView) findViewById(R.id.imageView2);

    }
}
