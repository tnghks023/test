package net.daum.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import net.daum.vo.TestBoard;

public interface TestMapper {

	public List<TestBoard> list();
	public TestBoard getTestBoard(@Param("bno") Integer bno);
	public void addHit(@Param("bno") Integer bno, @Param("bhit") Integer bhit);
}
