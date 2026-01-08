package erdal.smartlibrary.model;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "books")
public class Book {
	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 2, max = 200)
    private String title;

    @NotBlank
    @Size(min = 2, max = 100)
    private String author;

    @NotBlank
    @Size(max = 2000)
    private String description;

    @NotBlank
    @Size(min = 10, max = 17)
    private String isbn;

    @Min(1500)
    @Max(2100)
    private Integer publishYear;

    @NotBlank
    private String language;

    @Min(1)
    @Max(10000)
    private Integer pageCount;

    private String pdfPath;

    private String image; // kapak resmi path

    @ManyToOne(fetch = FetchType.LAZY)
    private BookCategory category;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @CreationTimestamp
    private LocalDateTime createTime;

    @UpdateTimestamp
    private LocalDateTime updateTime;


}
