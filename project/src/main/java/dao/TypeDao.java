package dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import entity.Type;
@Repository
public interface TypeDao {
	@Select("select * from Type")
	public List<Type> select();
	
	public Type selectById(int id);
}
