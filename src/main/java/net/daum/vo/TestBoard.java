package net.daum.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class TestBoard {

	private Integer bno; 
	private String bname;
	private String btitle;
	private String bcont;
	private Integer bhit;
	private Date bdate;
}
