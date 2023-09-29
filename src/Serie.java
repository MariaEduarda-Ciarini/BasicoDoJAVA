package br.com.dudinha.javinha.projetos.Movie;

public class Serie extends Title {
    private int seasons;
    private  boolean active;
    private int Episodes_per_season;
    private int minutes_per_episode;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpisodes_per_season() {
        return Episodes_per_season;
    }

    public void setEpisodes_per_season(int episodes_per_season) {
        Episodes_per_season = episodes_per_season;
    }

    public int getMinutes_per_episode() {
        return minutes_per_episode;
    }

    public void setMinutes_per_episode(int minutes_per_episode) {
        this.minutes_per_episode = minutes_per_episode;
    }

    @Override
    public int getDuration_minutes() {
        return seasons * Episodes_per_season * minutes_per_episode;
    }
}
