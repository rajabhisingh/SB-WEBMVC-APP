package com.abhi.entit;





import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Book")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book {
	@Id
	@Column(name="Book_Id")
	private Integer bookId;
	
	@Column(name= "Book_Name")
	private String bookName;
	
	@Column(name="Book_Price")
	private Double bookPrice;
	
	@Column(name="Book_Author")
	private String bookAuthorName;

}
