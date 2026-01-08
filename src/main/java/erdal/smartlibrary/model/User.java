package erdal.smartlibrary.model;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@Entity
	@Table(name = "users")
	public class User {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @NotBlank
	    @Size(min = 3, max = 40)
	    private String username;

	    @NotBlank
	    @Size(min = 8, max = 50)
	    private String password;

	    @NotBlank
	    @Email
	    private String email;

	    @NotBlank
	    private String fullName;

	    @Min(12)
	    @Max(120)
	    private Integer age;

	    private String gender;

	    private String address;

	    @Pattern(regexp = "^[0-9]{10,15}$")
	    private String phoneNumber;

	    @Enumerated(EnumType.STRING)
	    private UserRole role;

	    private Boolean enabled = true;

	    @CreationTimestamp
	    private LocalDateTime createTime;

	    @UpdateTimestamp
	    private LocalDateTime updateTime;

	    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	    private Set<Book> books;
	}