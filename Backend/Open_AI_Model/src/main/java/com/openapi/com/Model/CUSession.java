package com.openapi.com.Model;

import java.time.LocalDateTime;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Table

public class CUSession {
	@Id
	@Column(unique = true)
	private Integer userId;
	private String name;
	private String uuid;
	private LocalDateTime localDateTime;

	

	

	
	

}
