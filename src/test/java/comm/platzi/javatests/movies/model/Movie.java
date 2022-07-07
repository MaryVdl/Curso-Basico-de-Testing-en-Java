package comm.platzi.javatests.movies.model;

public class Movie {
    private Integer id;
    private String name;
    private int minutes;
    private Genre genre;

    //Constructor 1: Llama a constructor 2 con this
    public Movie(String name, int minutes, Genre genre){
        this(null, name, minutes, genre);
    }

    //Constructor 2
    public Movie(Integer id, String name, int minutes, Genre genre) {
        this.id = id;
        this.name = name;
        this.minutes = minutes;
        this.genre = genre;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMinutes() {
        return minutes;
    }

    public Genre getGenre() {
        return genre;
    }
}
