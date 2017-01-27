package udacity.hamid.picassogridviewproject;

import static android.R.attr.name;

/**
 * Created by temp on 25/01/2017.
 */

public class Product {

    private String image;
    private String title;
    private String releaseDate;
    private String voteAvg;
    private String plotSynopsis;

    public Product(String image, String title, String releaseDate, String voteAvg, String plotSynopsis) {
        this.image = image;
        this.title = title;
        this.releaseDate = releaseDate;
        this.voteAvg = voteAvg;
        this.plotSynopsis = plotSynopsis;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getVoteAvg() {
        return voteAvg;
    }

    public void setVoteAvg(String voteAvg) {
        this.voteAvg = voteAvg;
    }

    public String getPlotSynopsis() {
        return plotSynopsis;
    }

    public void setPlotSynopsis(String plotSynopsis) {
        this.plotSynopsis = plotSynopsis;
    }
}
