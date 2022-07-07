package comm.platzi.javatests.movies.data;

import comm.platzi.javatests.movies.model.Genre;
import comm.platzi.javatests.movies.model.Movie;
import org.h2.tools.Script;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class MovieRepositoryIntegrationTest {

    @Test
    public void load_all_movies() throws SQLException {
        DataSource dataSource =
                new DriverManagerDataSource("jdbc:h2_mem:test;MODE-MYSQL","usuario","");

        ScriptUtils.executeSqlScript(dataSource.getConnection(), new ClassPathResource("sql-scripts/test-data.sql"));

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        MovieRepositoryJdbc movieRepositoryJdbc= new MovieRepositoryJdbc(jdbcTemplate);
        Collection<Movie> movies = movieRepositoryJdbc.findAll();
        assertThat(movies, is(Arrays.asList(
                new Movie(1,"Dark Knight",152, Genre.ACTION),
                new Movie(2,"Memento",113,Genre.THRILLER),
                new Movie(3,"Matrix",136,Genre.ACTION)
        )));
    }
}