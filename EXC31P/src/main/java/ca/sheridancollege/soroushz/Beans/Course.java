package ca.sheridancollege.soroushz.Beans;

import lombok.Builder;

import lombok.Data;
import lombok.NonNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor  //replaced these two wiht @Builder and added NonNull
@AllArgsConstructor
@Builder
public class Course {
	@NonNull
	private Long id;
	
	private String prefix;
	private int code;
	private String name;
	
	
	
	
	
	

}
