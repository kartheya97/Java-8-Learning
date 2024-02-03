package pojoclasses;

import java.util.List;

public class Course {

	private String name;
	private String category;
	private int review_score;
	private int numberOfStudents;

	public Course(String name, String category, int review_score, int numberOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.review_score = review_score;
		this.numberOfStudents = numberOfStudents;
	}

	public String toString() {
		return name + ":" + numberOfStudents + ":" + review_score;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getReview_score() {
		return review_score;
	}
	public void setReview_score(int review_score) {
		this.review_score = review_score;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}
	

}
