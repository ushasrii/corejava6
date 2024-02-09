package ai.dv.model;

public class Movie1 {
	private String title;
	private String hero;
	private int yearRelease;
	private int boxOfficeCollection;
	public Movie1() {
		title=null;
		hero=null;
		yearRelease=0;
		boxOfficeCollection=0;
	}
	public Movie1(String title,String hero,int yearRelease,int boxOfficeCollection) {
		this.title=title;
		this.hero=hero;
		this.yearRelease=yearRelease;
		this.boxOfficeCollection=boxOfficeCollection;
	}
	public Movie1(Movie1 existingObj) {
		this.title=existingObj.title;
		this.hero=existingObj.hero;
		this.yearRelease=existingObj.yearRelease;
		this.boxOfficeCollection=existingObj.boxOfficeCollection;
	}
	public void setTitle(String t) {
		title=t;
	}
	public void setHero(String h) {
		hero=h;
	}
	public void setYearRelease(int y) {
		yearRelease=y;
	}
	public void setBoxOfficeCollection(int b) {
		boxOfficeCollection=b;
	}
	public String getTitle() {
		return title;
	}
	public String getHero() {
		return hero;
	}
	public int getYearRelease() {
		return yearRelease;
	}
	public int getBoxOfficeCollection() {
		return boxOfficeCollection;
	}
	
}
