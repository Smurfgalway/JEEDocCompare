package ie.gmit.sw;

import java.util.ArrayList;

public class DocumentContents {
		
	private String Title;
	private float Id;
	private String Author;
	private ArrayList<String> List = new ArrayList<String>();
	
	
	public DocumentContents(String title, Float id, String author) {
		super();
		this.Title = title;
		this.Id = id;
		this.Author = author;

	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public float getId() {
		return Id;
	}
	public void setId(float id) {
		Id = id;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public ArrayList<String> getList() {
		return List;
	}
	public void setList(ArrayList<String> list) {
		List = list;
	}
	
}
