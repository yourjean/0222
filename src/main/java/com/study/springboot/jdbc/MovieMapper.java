package com.study.springboot.jdbc;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.study.springboot.entity.Movie;


@Mapper
public interface MovieMapper {
	@Select("SELECT * FROM movie")
	public List<Movie> selectAll();
	
	@Insert("INSERT INTO movie (title, content, idx) VALUES(#{title}, #{content}, #{idx})")
	public int insert(Movie movie);

	@Delete("delete from Movie where did=#{did}")
	public void delete(int did);
		
	@Update("UPDATE Movie SET title = #{title}, content=#{content}, idx=#{idx} where did=#{did}")
	public void update(Movie movie);

	@Select("select * from movie where did=#{did}")
	public List<Movie> getDid(int did);

}

