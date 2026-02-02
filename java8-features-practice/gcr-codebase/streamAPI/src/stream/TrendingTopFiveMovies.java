package stream;
import java.util.*;
class Movie{
	String name;
	double rating;
	Movie(String name,double rating){
		this.name = name;
		this.rating = rating;
	}
	public double getRating() {
		return rating;
	}
}
public class TrendingTopFiveMovies {
	public static void main(String[] args) {
		List<Movie> movies = Arrays.asList(
				new Movie("Inception",9.0),
				new Movie("Attonement",9.5),
				new Movie("Peaky Blinders",9.0),
				new Movie("Avengers",8.5),
				new Movie("Titanic",8.0),
				new Movie("Openhiemer",7.8),
				new Movie("Interstellers",8.2),
				new Movie("Joker",8.1)
				
	   );
		movies.stream().sorted(Comparator.comparing(Movie::getRating).reversed()).limit(5).
		forEach(m->System.out.println(m.name+"   "+m.rating));
	}
}
