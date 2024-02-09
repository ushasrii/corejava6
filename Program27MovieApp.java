package ai.dv.ui;
import ai.dv.model.Movie1;
public class Program27MovieApp {
	public static void main(String[] args) {
		Movie1 movie = new Movie1();//default constructor
		System.out.println("Movie Title is: "+movie.getTitle());
		System.out.println("Hero is: "+movie.getHero());
		System.out.println("Year Release is: "+movie.getYearRelease());
		System.out.println("Box Office Colllection is: "+movie.getBoxOfficeCollection());
		System.out.println("**************************************************");
		Movie1 movie1 = new Movie1("RRR","NTR,RamCharan",2022,27431000);//Parameterized constructor 
		System.out.println("Movie Title is: "+movie1.getTitle());
		System.out.println("Hero is: "+movie1.getHero());
		System.out.println("Year Release is: "+movie1.getYearRelease());
		System.out.println("Box Office Colllection is: "+movie1.getBoxOfficeCollection());
		System.out.println("***************************************************");
		Movie1 movie2 = movie1;//diiferent onjects with same reference
		System.out.println("Movie Title is: "+movie2.getTitle());
		System.out.println("Hero is: "+movie2.getHero());
		System.out.println("Year Release is: "+movie2.getYearRelease());
		System.out.println("Box Office Colllection is: "+movie2.getBoxOfficeCollection());
		System.out.println("***************************************************");
		
		Movie1 movie3 = new Movie1(movie1);//Copy Constructor
		System.out.println("Movie Title is: "+movie3.getTitle());
		System.out.println("Hero is: "+movie3.getHero());
		System.out.println("Year Release is: "+movie3.getYearRelease());
		System.out.println("Box Office Colllection is: "+movie3.getBoxOfficeCollection());
		System.out.println("***************************************************");
		
		movie1.setTitle("Kerintha");
		movie1.setHero("Ashwin");
		movie1.setYearRelease(2015);
		movie1.setBoxOfficeCollection(1050030);
		
		System.out.println("Movie Title is: "+movie1.getTitle());
		System.out.println("Hero is: "+movie1.getHero());
		System.out.println("Year Release is: "+movie1.getYearRelease());
		System.out.println("Box Office Colllection is: "+movie1.getBoxOfficeCollection());
		System.out.println("***************************************************");
		
		System.out.println("Movie Title is: "+movie3.getTitle());
		System.out.println("Hero is: "+movie3.getHero());
		System.out.println("Year Release is: "+movie3.getYearRelease());
		System.out.println("Box Office Colllection is: "+movie3.getBoxOfficeCollection());
		System.out.println("***************************************************");
		
	}
}
