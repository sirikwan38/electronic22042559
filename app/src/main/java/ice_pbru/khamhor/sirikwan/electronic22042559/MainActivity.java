package ice_pbru.khamhor.sirikwan.electronic22042559;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private Button about;
    private ListView eletric_listview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindWidget();
        button();
        createListView();
    }

    private void createListView() {
        final int[] intIcon = {R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6,R.drawable.a7,R.drawable.a8,
                R.drawable.a9,R.drawable.a10,R.drawable.a11,R.drawable.a12,R.drawable.a13,R.drawable.a14,R.drawable.a15,R.drawable.a16,
                R.drawable.a17,R.drawable.a18,R.drawable.a19,R.drawable.a20};
        final String[] titleStrings = new String[20];
        titleStrings[0]="โฟโทบอร์ด ";
        titleStrings[1]="ไดโอด";
        titleStrings[2]="สวิตซ์แบบดิพ";
        titleStrings[3]="ออสซิลโลสโคป";
        titleStrings[4]="ฟิวส์";
        titleStrings[5]="วงจรรวม";
        titleStrings[6]="LCD";
        titleStrings[7]="LDR";
        titleStrings[8]="LED";
        titleStrings[9]="รีเลย์";
        titleStrings[10]="คาปาซิเตอร์";
        titleStrings[11]="รีซิสเตอร์";
        titleStrings[12]="ตัวต้านทานแบบปรับค่าได้";
        titleStrings[13]="7 Segment";
        titleStrings[14]="สเตปปิ้งมอเตอร์";
        titleStrings[15]="สวิตช์เลื่อน";
        titleStrings[16]="สวิตช์แบบหมุน";
        titleStrings[17]="สวิตช์แบบกด";
        titleStrings[18]="สวิชต์แบบไมโคร";
        titleStrings[19]="มัลติมิเตอร์";


        String[] detailStrings = getResources().getStringArray(R.array.detail);

        MyAdapter myAdapter = new MyAdapter(MainActivity.this, intIcon, titleStrings, detailStrings);
        eletric_listview.setAdapter(myAdapter);

        eletric_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("Title", titleStrings[i]);
                intent.putExtra("Img", intIcon[i]);
                intent.putExtra("Index", i);

                startActivity(intent);

            }
        });




    }

    private void button() {
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://sirikwanoumm.wordpress.com/2014/05/21/4/"));
                startActivity(intent);
            }
        });

    }

    private void bindWidget() {
        about = (Button) findViewById(R.id.button);
        eletric_listview = (ListView) findViewById(R.id.listView);
    }
}
