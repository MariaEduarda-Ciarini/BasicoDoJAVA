import br.com.dudinha.javinha.projetos.Movie.Movie;
import br.com.dudinha.javinha.projetos.Movie.Serie;

public class Home {
    public static void main(String[] args) {
        Movie mMovie = new Movie();
        mMovie.setName("Breakfast at Tiffany's");
        mMovie.setRelease_year(1961);
        mMovie.setDuration_minutes(114);
        System.out.println("Film duration: " + mMovie.getDuration_minutes());

        mMovie.displaysTechnical_Sheet();
        mMovie.assessment(8);
        mMovie.assessment(10);
        mMovie.assessment(6);
        System.out.println("Total reviews: " + mMovie.getTotal_reviews());
        System.out.println(mMovie.average_rating());

        Serie tbbt = new Serie();
        tbbt.setName("The Big Bang Theory");
        tbbt.setRelease_year(2007);
        tbbt.displaysTechnical_Sheet();
        tbbt.setSeasons(12);
        tbbt.setEpisodes_per_season(24);
        tbbt.setMinutes_per_episode(22);
        System.out.println("Time for you to spend watching The Big Bang Theory: " + tbbt.getDuration_minutes());


    }
}
