package erdal.smartlibrary.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "user")
public class User {
	
	@Id
	private Long id;
	
	private String username;
	
	private String password;
	
	private String email;
	
	private String firstName;
	
	private String lastName;
	
	private String age;
	
	private String gender;
	
	private String address;
	
	private String phoneNumber;
	
	private String role;
	
	private Boolean enabled;
	
    private LocalDateTime createdDate;
	
	private LocalDateTime updatedDate;

}
