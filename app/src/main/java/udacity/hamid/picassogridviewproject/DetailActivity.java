package udacity.hamid.picassogridviewproject;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView tvTitle, tvReleaseDate, tvVoteAvg, tvPlotSynopsis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageView = (ImageView) findViewById(R.id.iv_moviePoster);
        tvTitle = (TextView) findViewById(R.id.tv_title);
        tvReleaseDate = (TextView) findViewById(R.id.tv_release_date);
        tvVoteAvg = (TextView) findViewById(R.id.tv_voteAvg);
        tvPlotSynopsis = (TextView) findViewById(R.id.tv_plotSynopsis);

        Intent intent = getIntent();
        if (intent.getExtras()!=null) {
            String image = intent.getStringExtra("k_image");
            Uri imageUri=Uri.parse(image);
            String title = intent.getStringExtra("k_title");
            String releaseDate = intent.getStringExtra("k_releaseDate");
            String voteAvg = intent.getStringExtra("k_voteAvg");
            String plotSynopsis = intent.getStringExtra("k_plotSynopsis");

            //setting views
            Picasso.with(DetailActivity.this).load(imageUri).into(imageView);
            tvTitle.setText(title);
            tvReleaseDate.setText(releaseDate);
            tvVoteAvg.setText(voteAvg);
            tvPlotSynopsis.setText(plotSynopsis);
        }
    }
}
